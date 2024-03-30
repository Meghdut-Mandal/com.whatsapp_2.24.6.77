package com.whatsapp.migration.export.api;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1M0;
import X.AnonymousClass5NB;
import X.AnonymousClass62D;
import X.AnonymousClass6MK;
import X.AnonymousClass6Q7;
import X.AnonymousClass6YY;
import X.C114015gV;
import X.C121775th;
import X.C123895xG;
import X.C123905xH;
import X.C124475yF;
import X.C1270466s;
import X.C128946Ef;
import X.C1499573k;
import X.C18800tq;
import X.C18830tt;
import X.C19380ur;
import X.C19700wN;
import X.C20810yC;
import X.C224114e;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90494aF;
import X.C90514aH;
import X.C90524aI;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public class ExportMigrationContentProvider extends C19380ur {
    public C124475yF A00;
    public UriMatcher A01;
    public C19700wN A02;
    public C20810yC A03;
    public AnonymousClass6Q7 A04;
    public AnonymousClass5NB A05;
    public C121775th A06;

    public synchronized void A09() {
        SecurityException securityException;
        A08();
        try {
            if (this.A03.A0E(843)) {
                AnonymousClass6Q7 r0 = this.A04;
                if (AnonymousClass000.A1O(r0.A01.getComponentEnabledSetting(r0.A00))) {
                    this.A05.A00().A00();
                    C121775th r2 = this.A06;
                    C128946Ef A002 = r2.A01.A00();
                    if (!A002.A03) {
                        A002.A00();
                    }
                    AnonymousClass62D r02 = r2.A02;
                    String str = A002.A01;
                    if (!r02.A00(str)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Caller ");
                        A0u.append(str);
                        throw new SecurityException(AnonymousClass000.A0p(" does not have a correctly declared permission ", "com.apple.movetoios.ACCESS", A0u));
                    }
                } else {
                    securityException = new SecurityException("Provider component is disabled.");
                }
            } else {
                securityException = new SecurityException("Provider access is disabled.");
            }
            throw securityException;
        } catch (SecurityException e) {
            this.A02.A0D("xpm-export-provider-security", e.toString(), e);
            throw e;
        }
    }

    public String getType(Uri uri) {
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        FileNotFoundException e;
        Cursor A09;
        C123905xH r7;
        IOException iOException;
        Cipher cipher;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        A09();
        Uri uri2 = uri;
        try {
            this.A04.A03();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ExportMigrationContentProvider/openFile/uriPath=");
            C36321k7.A1a(A0u, uri2.getPath());
            if (this.A01.match(uri2) == 2) {
                long parseLong = Long.parseLong(C90474aD.A0i(uri2.getPathSegments()));
                C124475yF r12 = this.A00;
                AnonymousClass1M0 A002 = C1270466s.A00(r12.A03);
                try {
                    C224114e r9 = A002.A02;
                    String[] A1R = C36441kJ.A1R();
                    C36401kF.A1T(A1R, 0, parseLong);
                    A09 = r9.A09("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f._id = ?", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_SINGLE", A1R);
                    if (!A09.moveToFirst()) {
                        r7 = null;
                    } else {
                        r7 = AnonymousClass6MK.A00(A09);
                    }
                    A09.close();
                    A002.close();
                    if (r7 != null) {
                        File file = r7.A02;
                        if (file.exists()) {
                            if (file.length() == 0) {
                                C36321k7.A1K(file, "Exporting EMPTY file: path=", AnonymousClass000.A0u());
                            }
                            long length = file.length();
                            long j = r7.A01;
                            if (length != j) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("Exporting MISMATCHED SIZE file: path=");
                                A0u2.append(file);
                                C90464aC.A19(file, ", on-disk=", A0u2);
                                C36321k7.A1V(", on-record=", A0u2, j);
                            }
                            if (r12.A06.getAndSet(parseLong) == parseLong) {
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                A0u3.append("RETRY DETECTED for path=");
                                A0u3.append(file);
                                C90464aC.A19(file, " with size on-disk=", A0u3);
                                C36321k7.A1V(", on-record=", A0u3, j);
                            }
                            if (cancellationSignal == null) {
                                cancellationSignal2 = new CancellationSignal();
                            }
                            try {
                                ParcelFileDescriptor[] createReliablePipe = ParcelFileDescriptor.createReliablePipe();
                                ParcelFileDescriptor parcelFileDescriptor = createReliablePipe[0];
                                ParcelFileDescriptor parcelFileDescriptor2 = createReliablePipe[1];
                                synchronized (r12) {
                                    try {
                                        Set<ParcelFileDescriptor> set = r12.A04;
                                        if (!set.isEmpty()) {
                                            r12.A00.A0E("xpm-export-api-leaked-fd", Integer.toString(set.size()), false);
                                            StringBuilder A0u4 = AnonymousClass000.A0u();
                                            A0u4.append("ExportMigrationApi/force closing pending file descriptors (");
                                            A0u4.append(set.size());
                                            C36321k7.A1Z(A0u4, ")");
                                            for (ParcelFileDescriptor closeWithError : set) {
                                                closeWithError.closeWithError("Force closing, concurrent streaming not supported.");
                                            }
                                            set.clear();
                                        }
                                        set.add(parcelFileDescriptor2);
                                    } catch (IOException e2) {
                                        Log.e("ExportMigrationApi/Failed to close the pipe after an error.", e2);
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                                String str2 = r7.A03;
                                if (TextUtils.isEmpty(str2)) {
                                    cipher = null;
                                } else {
                                    C123895xG A003 = r12.A01.A00();
                                    if (A003 != null) {
                                        byte[] decode = Base64.decode(A003.A03, 2);
                                        byte[] decode2 = Base64.decode(str2, 2);
                                        try {
                                            cipher = C90514aH.A19();
                                            cipher.init(1, C90494aF.A0m(decode), new IvParameterSpec(decode2));
                                        } catch (GeneralSecurityException e3) {
                                            iOException = new IOException("Failed to initiate encrypting cipher.", e3);
                                            throw iOException;
                                        }
                                    } else {
                                        th = C90524aI.A0X("Failed to initiate encryption, key is missing.");
                                        throw th;
                                    }
                                }
                                try {
                                    r12.A05.execute(new C1499573k(r12, file, cipher, parcelFileDescriptor2, cancellationSignal2, 2, r7.A00));
                                    return parcelFileDescriptor;
                                } catch (RejectedExecutionException e4) {
                                    parcelFileDescriptor.close();
                                    parcelFileDescriptor2.close();
                                    iOException = new IOException("Failed to initiate streaming.", e4);
                                    throw iOException;
                                }
                            } catch (FileNotFoundException e5) {
                                e = e5;
                            } catch (IOException e6) {
                                e = C90524aI.A0V(e6.toString());
                            }
                        } else {
                            r12.A00.A0E("xpm-export-missing-file-type", AnonymousClass6YY.A07(file.getAbsolutePath()), false);
                            e = C90524aI.A0V(C36381kD.A0z("File no longer exists: ", AnonymousClass000.A0u(), parseLong));
                        }
                    } else {
                        e = C90524aI.A0V(C36381kD.A0z("Unknown entry: ", AnonymousClass000.A0u(), parseLong));
                    }
                } catch (Throwable th2) {
                    e = th2;
                    try {
                        A002.close();
                    } catch (Throwable th3) {
                        e.addSuppressed(th3);
                    }
                }
            } else {
                e = C90524aI.A0V(uri2.toString());
            }
            throw e;
            throw th;
        } catch (FileNotFoundException e7) {
            if (e7.getMessage() == null || e7.getMessage().isEmpty()) {
                this.A02.A0D("xpm-export-provider-file-not-found-other", AnonymousClass000.A0q("; FileNotFoundException without message", C36381kD.A11(uri2)), e7);
                throw C90524aI.A0V(AnonymousClass000.A0l(uri2, "File not found without reason: ", AnonymousClass000.A0u()));
            }
            this.A02.A0D("xpm-export-provider-file-not-found", C36331k8.A0i(";", C36381kD.A11(uri2), e7), e7);
            throw e7;
        } catch (Exception e8) {
            this.A02.A0D("xpm-export-provider-open-file", C36331k8.A0i(";", C36381kD.A11(uri2), e8), e8);
            StringBuilder A0u5 = AnonymousClass000.A0u();
            A0u5.append("Unexplained error opening ");
            A0u5.append(uri2);
            throw C90524aI.A0V(AnonymousClass000.A0l(e8, ";", A0u5));
        }
    }

    public void A07() {
        Context context = getContext();
        if (context != null) {
            C18800tq A0P = C36371kC.A0P(context);
            this.A03 = A0P.Azp();
            this.A02 = A0P.B3m();
            C18830tt r1 = A0P.AfI.A00;
            this.A05 = (AnonymousClass5NB) r1.A1X.get();
            this.A00 = C18830tt.A77(r1);
            this.A06 = (C121775th) r1.A1Z.get();
            this.A04 = (AnonymousClass6Q7) A0P.A3B.get();
            UriMatcher uriMatcher = new UriMatcher(-1);
            String str = C114015gV.A03;
            uriMatcher.addURI(str, "files", 1);
            uriMatcher.addURI(str, "file/#", 2);
            this.A01 = uriMatcher;
            return;
        }
        throw AnonymousClass001.A09("Context is not attached.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        if ("FAILURE".equals(r7.getString("state")) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r2.putString(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r4.A02.A0E("xpm-export-provider-unsupported-method", r5, false);
        X.C36321k7.A1Z(X.C36331k8.A0k("ExportMigrationContentProvider/call/", r5), " not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        throw X.AnonymousClass001.A0E(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r4.A08()
            r4.A09()
            if (r5 == 0) goto L_0x00ad
            X.6Q7 r0 = r4.A04
            r0.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ExportMigrationContentProvider/call/"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r0 = " Arg: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " Bundle: "
            X.C36321k7.A1K(r7, r0, r1)
            int r0 = r5.hashCode()
            r3 = 0
            switch(r0) {
                case 94756344: goto L_0x0043;
                case 1139677387: goto L_0x0089;
                case 1976339394: goto L_0x009a;
                default: goto L_0x002e;
            }
        L_0x002e:
            X.0wN r1 = r4.A02
            java.lang.String r0 = "xpm-export-provider-unsupported-method"
            r1.A0E(r0, r5, r3)
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r5)
            java.lang.String r0 = " not found"
            X.C36321k7.A1Z(r1, r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r5)
            throw r0
        L_0x0043:
            java.lang.String r0 = "close"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "ExportMigrationContentProvider/close() is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5yF r2 = r4.A00
            if (r7 == 0) goto L_0x0069
            java.lang.String r1 = "state"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r0 = "FAILURE"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            X.6WX r1 = r2.A02
            if (r0 == 0) goto L_0x0076
            r1.A05()
        L_0x0071:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            return r2
        L_0x0076:
            X.6Q7 r0 = r1.A08
            r0.A02()
            X.0wN r2 = r1.A02
            java.lang.String r1 = "xpm-export-disabled-provider-with-failure"
            r0 = 0
            r2.A0E(r1, r0, r3)
            java.lang.String r0 = "ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0071
        L_0x0089:
            java.lang.String r0 = "get_label"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "name"
            java.lang.String r0 = "WhatsApp"
            goto L_0x00a9
        L_0x009a:
            java.lang.String r0 = "get_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "iconUri"
            r0 = 0
        L_0x00a9:
            r2.putString(r1, r0)
            return r2
        L_0x00ad:
            java.lang.String r0 = "method is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.api.ExportMigrationContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A08();
        A09();
        this.A02.A0E("xpm-export-provider-delete-unsupported", uri.getPath(), false);
        throw AnonymousClass001.A0D();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        A09();
        this.A02.A0E("xpm-export-provider-insert-unsupported", uri.getPath(), false);
        throw AnonymousClass001.A0D();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AnonymousClass1M0 r6;
        Cursor cursor;
        A08();
        A09();
        this.A04.A03();
        int match = this.A01.match(uri);
        if (match == 1) {
            C36321k7.A1K(uri, "ExportMigrationContentProvider/query/supported-request ", AnonymousClass000.A0u());
            String queryParameter = uri.getQueryParameter("offset");
            String queryParameter2 = uri.getQueryParameter("limit");
            if (queryParameter == null || queryParameter2 == null) {
                AnonymousClass1M0 A002 = C1270466s.A00(this.A00.A03);
                try {
                    Cursor A09 = A002.A02.A09("SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC ", "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_ALL", (String[]) null);
                    A002.close();
                    return A09;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                long parseLong = Long.parseLong(queryParameter);
                long parseLong2 = Long.parseLong(queryParameter2);
                r6 = C1270466s.A00(this.A00.A03);
                try {
                    C224114e r8 = r6.A02;
                    String[] A1S = C36441kJ.A1S();
                    C36401kF.A1T(A1S, 0, parseLong);
                    C36401kF.A1T(A1S, 1, parseLong2);
                    cursor = r8.A09("SELECT   f._id AS _id,  ('xpm-import/' ||  f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC  LIMIT ?, ?", "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_PAGED", A1S);
                } catch (Throwable th2) {
                    th = th2;
                    r6.close();
                    throw th;
                }
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            if (match == 2) {
                C36321k7.A1K(uri, "ExportMigrationContentProvider/query/ignored-request ", A0u);
                long parseLong3 = Long.parseLong(C36401kF.A0s(uri.getPathSegments(), 1));
                r6 = C1270466s.A00(this.A00.A03);
                C224114e r5 = r6.A02;
                String[] A1R = C36441kJ.A1R();
                C36401kF.A1T(A1R, 0, parseLong3);
                cursor = r5.A09("SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f WHERE f._id = ?", "XPM_EXPORT_METADATA_API_SELECT_SINGLE", A1R);
            } else {
                C36321k7.A1J(uri, "ExportMigrationContentProvider/query/unsupported-request ", A0u);
                throw C90464aC.A0P(uri, "Unsupported URI: ", AnonymousClass000.A0u());
            }
        }
        r6.close();
        return cursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        A09();
        this.A02.A0E("xpm-export-provider-update-unsupported", uri.getPath(), false);
        throw AnonymousClass001.A0D();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, new CancellationSignal());
    }
}
