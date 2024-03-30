package com.whatsapp.registration.directmigration;

import X.AnonymousClass00C;
import X.AnonymousClass00I;
import X.AnonymousClass12P;
import X.AnonymousClass179;
import X.AnonymousClass1CR;
import X.AnonymousClass1Q9;
import X.AnonymousClass3T0;
import X.AnonymousClass54Q;
import X.AnonymousClass54W;
import X.AnonymousClass5U6;
import X.AnonymousClass6PN;
import X.AnonymousClass7fT;
import X.C121215sm;
import X.C132936Vw;
import X.C18740tg;
import X.C19380ur;
import X.C19420v0;
import X.C19700wN;
import X.C19730wQ;
import X.C19900wh;
import X.C20690y0;
import X.C20830yE;
import X.C21100yf;
import X.C24391Cg;
import X.C24411Ci;
import X.C24431Ck;
import X.C25751Hn;
import X.C29301Wc;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MigrationContentProvider extends C19380ur {
    public static UriMatcher A0F;
    public static final List A0G;
    public C19700wN A00;
    public C20690y0 A01;
    public C19730wQ A02;
    public C21100yf A03;
    public C29301Wc A04;
    public C24411Ci A05;
    public C24431Ck A06;
    public AnonymousClass54Q A07;
    public AnonymousClass179 A08;
    public C20830yE A09;
    public C19420v0 A0A;
    public C19900wh A0B;
    public AnonymousClass1CR A0C;
    public AnonymousClass3T0 A0D;
    public AnonymousClass54W A0E;

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new AnonymousClass00I[]{new AnonymousClass00I("push_name", 2), new AnonymousClass00I("interface_gdrive_backup_frequency", 2), new AnonymousClass00I("interface_gdrive_backup_network_setting", 2), new AnonymousClass00I("gdrive_include_videos_in_backup", 1)}));
        arrayList.addAll(C19420v0.A02());
        A0G = Collections.unmodifiableList(arrayList);
    }

    private int A00(Uri uri, int i) {
        return A01(uri.getQueryParameter("query_param_country_code"), uri.getQueryParameter("query_param_phone_number"), i);
    }

    public static synchronized UriMatcher A02() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0F == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0F = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "media", 7);
                A0F.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_lock_passcode", 8);
            }
            uriMatcher = A0F;
        }
        return uriMatcher;
    }

    private void A04(MatrixCursor matrixCursor, File file, int i) {
        int length;
        if (i != 0) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (length = listFiles.length) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("MigrationContentProvider/fillMediaCursor/skipping folder ");
                sb.append(file);
                Log.i(sb.toString());
                return;
            }
            int i2 = 0;
            do {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A04(matrixCursor, file2, i - 1);
                } else {
                    matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(this.A08.A04().getAbsolutePath(), "")});
                }
                i2++;
            } while (i2 < length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r3 < r1) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        if (r13 == 268435456) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            android.content.Context r3 = r10.getContext()
            if (r3 != 0) goto L_0x0008
            r0 = 7
        L_0x0007:
            return r0
        L_0x0008:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r2 = r1.getNameForUid(r0)
            r9 = 0
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x002a }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()     // Catch:{ RuntimeException -> 0x002a }
            int r1 = r0.uid     // Catch:{ RuntimeException -> 0x002a }
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x002a }
            int r0 = r4.checkSignatures(r1, r0)     // Catch:{ RuntimeException -> 0x002a }
            if (r0 != 0) goto L_0x0041
            goto L_0x0040
        L_0x002a:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FileSharingHelper/checkSameSignatureCaller. Error is : "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0041
        L_0x0040:
            r9 = 1
        L_0x0041:
            X.0wQ r0 = r10.A02
            r0.A0G()
            com.whatsapp.Me r7 = r0.A00
            r8 = 0
            r4 = 1
            r0 = 42
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
            if (r7 != 0) goto L_0x0092
            X.0wN r5 = r10.A00
            java.lang.String r1 = X.AnonymousClass14B.A09(r6, r12)
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/me is null"
        L_0x005a:
            r5.A0E(r0, r1, r4)
        L_0x005d:
            java.lang.String r0 = "com.whatsapp.w4b"
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r0.equals(r2)
            if (r1 != 0) goto L_0x006e
            r5 = 0
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r5 = 1
        L_0x006f:
            if (r2 == 0) goto L_0x007e
            long r3 = X.AnonymousClass1L0.A00(r3, r2)
            if (r1 == 0) goto L_0x008c
            r1 = 597(0x255, double:2.95E-321)
        L_0x0079:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            r0 = -1
            if (r13 == r0) goto L_0x0087
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r13 != r1) goto L_0x0088
        L_0x0087:
            r0 = 1
        L_0x0088:
            if (r9 != 0) goto L_0x00c2
            r0 = 2
            return r0
        L_0x008c:
            if (r0 == 0) goto L_0x007e
            r1 = 452962(0x6e962, double:2.23793E-318)
            goto L_0x0079
        L_0x0092:
            java.lang.String r0 = r7.cc
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r7.number
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00a4
            r8 = 1
            goto L_0x005d
        L_0x00a4:
            X.0wN r5 = r10.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.number
            java.lang.String r0 = X.AnonymousClass14B.A09(r6, r0)
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass14B.A09(r6, r12)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/phone-number-mismatch"
            goto L_0x005a
        L_0x00c2:
            if (r5 != 0) goto L_0x00c6
            r0 = 3
            return r0
        L_0x00c6:
            if (r2 != 0) goto L_0x00ca
            r0 = 4
            return r0
        L_0x00ca:
            if (r0 != 0) goto L_0x00ce
            r0 = 5
            return r0
        L_0x00ce:
            r0 = 0
            if (r8 != 0) goto L_0x0007
            r0 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.A01(java.lang.String, java.lang.String, int):int");
    }

    private File A03(String str) {
        if (!TextUtils.isEmpty(str) && this.A09.A0D()) {
            File file = new File(this.A08.A04(), str);
            try {
                if (!this.A01.A0h(file) || !file.exists()) {
                    return null;
                }
                return file;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2;
        String obj;
        String str3;
        String str4;
        A08();
        if (bundle == null) {
            Log.e("MigrationContentProvider/call no params passed");
            obj = "No params passed";
        } else {
            int A012 = A01(bundle.getString("query_param_country_code"), bundle.getString("query_param_phone_number"), -1);
            if (A012 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("MigrationContentProvider/call denied ");
                sb.append(A012);
                Log.w(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("call denied (");
                sb2.append(A012);
                sb2.append(")");
                throw new SecurityException(sb2.toString());
            } else if (!"retrieve_rk".equals(str)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("MigrationContentProvider/call failed/unsupported method ");
                sb3.append(str);
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unsupported method (");
                sb4.append(str);
                sb4.append(")");
                obj = sb4.toString();
            } else {
                if (!this.A06.A03.A2I()) {
                    str4 = "MigrationContentProvider/retrieveRK/encryption disabled";
                } else {
                    byte[] byteArray = bundle.getByteArray("pk");
                    if (byteArray == null) {
                        Log.e("MigrationContentProvider/retrieveRK/no public key");
                        obj = "No key provided";
                    } else {
                        byte[] A032 = this.A05.A03();
                        if (A032 == null) {
                            str4 = "MigrationContentProvider/retrieveRK/no root key";
                        } else {
                            try {
                                bundle2 = new Bundle(1);
                                bundle2.putByteArray("erk", C132936Vw.A03(A032, byteArray));
                                C121215sm A002 = this.A05.A00();
                                if (!this.A0A.A2J() && A002 != null) {
                                    bundle2.putByteArray("ph", C132936Vw.A03(A002.A01, byteArray));
                                    bundle2.putByteArray("ps", C132936Vw.A03(A002.A02, byteArray));
                                    bundle2.putInt("ic", A002.A00);
                                    return bundle2;
                                }
                            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                                Log.w("MigrationContentProvider/call encryption failed", e);
                                bundle2 = new Bundle();
                                bundle2.putString("error", "MigrationContentProvider/call encryption failed");
                                StringWriter stringWriter = new StringWriter();
                                e.printStackTrace(new PrintWriter(stringWriter));
                                obj = stringWriter.toString();
                                str3 = "exception";
                            }
                            return bundle2;
                        }
                    }
                }
                Log.e(str4);
                return null;
            }
        }
        bundle2 = new Bundle();
        str3 = "error";
        bundle2.putString(str3, obj);
        return bundle2;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        File A032;
        A08();
        if (A00(uri, -1) != 0 || A02().match(uri) != 7 || (A032 = A03(uri.getQueryParameter("path"))) == null || !A032.delete()) {
            return 0;
        }
        return 1;
    }

    public String getType(Uri uri) {
        A08();
        if (A00(uri, -1) == 0) {
            if (1 == A02().match(uri)) {
                try {
                    Log.i("MigrationContentProvider/getType");
                    File A0I = C29301Wc.A00(this.A04).A09.A0I();
                    if (A0I != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MigrationContentProvider/getType/msgstore-file-name = ");
                        sb.append(A0I.getName());
                        Log.i(sb.toString());
                        return A0I.getName();
                    }
                } catch (Exception e) {
                    Log.i("MigrationContentProvider/getType/exception = ", e);
                    return null;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("This operation is not supported ");
                sb2.append(uri);
                throw new UnsupportedOperationException(sb2.toString());
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        int i2;
        String obj;
        File A0I;
        A08();
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        int A002 = A00(uri, i);
        if (A002 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MigrationContentProvider/openFile/");
            sb2.append(uri.getPath());
            Log.i(sb2.toString());
            int match = A02().match(uri);
            if (match == 1) {
                AnonymousClass1Q9 r6 = C29301Wc.A00(this.A04).A09;
                C24391Cg r3 = r6.A0W;
                boolean z = true;
                synchronized (r3) {
                    r3.A00 = true;
                }
                AnonymousClass12P r0 = r6.A0K;
                r0.A06();
                if (r0.A03.exists()) {
                    Log.i("MessageStoreBackup/getFileForMigration/backup-db");
                    int A0D2 = r6.A0D((AnonymousClass7fT) null, (Runnable) null, 1, 0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MessageStoreBackup/finish-backup-db-successful? = ");
                    if (A0D2 != 0) {
                        z = false;
                    }
                    sb3.append(z);
                    Log.i(sb3.toString());
                    if (A0D2 == 0) {
                        try {
                            A0I = r6.A0I();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("MessageStoreBackup/getFileForMigration/latest-backup-file");
                            sb4.append(A0I);
                            Log.i(sb4.toString());
                        } catch (IOException e) {
                            Log.e("MessageStoreBackup/getFileForMigration/exception = ", e);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("MessageStoreBackup/failed-to-get-backup-file");
                            sb5.append(e);
                            throw new FileNotFoundException(sb5.toString());
                        }
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("MessageStoreBackup/getFileForMigration/backup-failed/backup-result = ");
                        sb6.append(A0D2);
                        sb6.append(" log = ");
                        synchronized (r3) {
                            obj = r3.A01.toString();
                            AnonymousClass00C.A08(obj);
                        }
                        sb6.append(obj);
                        throw new FileNotFoundException(sb6.toString());
                    }
                } else {
                    throw new FileNotFoundException(String.valueOf(14));
                }
            } else if (match == 2) {
                A0I = this.A0D.A0C();
            } else if (match == 3) {
                AnonymousClass1CR r32 = this.A0C;
                ReentrantReadWriteLock.WriteLock writeLock = r32.A0P().A02.writeLock();
                C18740tg.A06(writeLock);
                writeLock.lock();
                try {
                    A0I = r32.A07.A00.getDatabasePath("chatsettings.db");
                    if (A0I.exists()) {
                        r32.A0P().close();
                    } else {
                        A0I = null;
                    }
                } finally {
                    writeLock.unlock();
                }
            } else if (match == 4) {
                AnonymousClass6PN A0P = this.A0E.A0P(AnonymousClass5U6.UNENCRYPTED);
                if (A0P != null) {
                    A0I = A0P.A01;
                } else {
                    A0I = null;
                }
            } else if (match == 7) {
                A0I = A03(uri.getQueryParameter("path"));
            } else if (match == 8) {
                A0I = ((C25751Hn) this.A07.A01.get()).A01();
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Unknown URI ");
                sb7.append(uri);
                throw new IllegalArgumentException(sb7.toString());
            }
            if (A0I != null) {
                return ParcelFileDescriptor.open(A0I, i);
            }
            return null;
        }
        switch (A002) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 9;
                break;
            case 3:
                i2 = 10;
                break;
            case 4:
                i2 = 11;
                break;
            case 5:
                i2 = 12;
                break;
            case 6:
                i2 = 13;
                break;
            default:
                i2 = 0;
                break;
        }
        throw new FileNotFoundException(String.valueOf(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13) {
        /*
            r8 = this;
            r8.A08()
            r0 = -1
            int r2 = r8.A00(r9, r0)
            if (r2 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MigrationContentProvider/query denied "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5 = 0
        L_0x001f:
            return r5
        L_0x0020:
            android.content.UriMatcher r0 = A02()
            int r1 = r0.match(r9)
            r0 = 5
            if (r1 == r0) goto L_0x0052
            r0 = 7
            if (r1 != r0) goto L_0x0118
            X.179 r0 = r8.A08
            java.io.File r1 = r0.A04()
            java.lang.String r0 = "path"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.database.MatrixCursor r5 = new android.database.MatrixCursor
            r5.<init>(r0)
            X.0yE r0 = r8.A09
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x001f
            r0 = 4
            r8.A04(r5, r1, r0)
            return r5
        L_0x0052:
            java.lang.String r2 = "key"
            java.lang.String r1 = "value"
            java.lang.String r0 = "valueType"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            android.database.MatrixCursor r5 = new android.database.MatrixCursor
            r5.<init>(r0)
            java.util.List r0 = A0G
            java.util.Iterator r7 = r0.iterator()
        L_0x0067:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r7.next()
            X.00I r0 = (X.AnonymousClass00I) r0
            android.database.MatrixCursor$RowBuilder r4 = r5.newRow()
            java.lang.Object r6 = r0.A00
            r4.add(r6)
            java.lang.Object r0 = r0.A01
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.C18740tg.A06(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 == 0) goto L_0x010c
            r0 = 1
            if (r3 == r0) goto L_0x0101
            r0 = 2
            if (r3 == r0) goto L_0x00e1
            r0 = 3
            if (r3 == r0) goto L_0x00d1
            r0 = 4
            if (r3 != r0) goto L_0x00b9
            X.0v0 r0 = r8.A0A
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r0 = 0
            long r0 = r2.getLong(r6, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x00ae:
            r4.add(r0)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r0 = "int"
        L_0x00b5:
            r4.add(r0)
            goto L_0x0067
        L_0x00b9:
            r0 = 1
            if (r3 == r0) goto L_0x00ce
            r0 = 2
            if (r3 == r0) goto L_0x00cb
            r0 = 3
            if (r3 == r0) goto L_0x00c8
            r0 = 4
            if (r3 != r0) goto L_0x012f
            java.lang.String r0 = "long"
            goto L_0x00b5
        L_0x00c8:
            java.lang.String r0 = "string_set"
            goto L_0x00b5
        L_0x00cb:
            java.lang.String r0 = "string"
            goto L_0x00b5
        L_0x00ce:
            java.lang.String r0 = "boolean"
            goto L_0x00b5
        L_0x00d1:
            X.0v0 r0 = r8.A0A
            java.util.Set r1 = r0.A0p(r6)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x00ae
        L_0x00e1:
            java.lang.String r0 = "push_name"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00f0
            X.0wh r0 = r8.A0B
            java.lang.String r0 = r0.A02()
            goto L_0x00ae
        L_0x00f0:
            X.0v0 r0 = r8.A0A
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r6, r0)
            goto L_0x00ae
        L_0x0101:
            X.0v0 r0 = r8.A0A
            boolean r0 = r0.A2S(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00ae
        L_0x010c:
            X.0v0 r1 = r8.A0A
            r0 = 0
            int r0 = r1.A0O(r6, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00ae
        L_0x0118:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x012f:
            java.lang.String r1 = "unexpected type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        return 0;
    }

    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        A08();
        if (!"com.whatsapp.provider.MigrationContentProvider".equals(str)) {
            return null;
        }
        return call(str2, str3, bundle);
    }
}
