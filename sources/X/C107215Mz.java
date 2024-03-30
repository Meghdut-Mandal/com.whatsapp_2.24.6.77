package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import com.whatsapp.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5Mz  reason: invalid class name and case insensitive filesystem */
public class C107215Mz extends C132446Tt {
    public final C21390zA A00;
    public final C20690y0 A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass179 A03;
    public final C21060yb A04;
    public final C19630wG A05;
    public final C21350z4 A06;
    public final WeakReference A07;
    public final AtomicLong A08 = new AtomicLong();
    public final C19970wo A09;
    public final C19770wU A0A;

    public static String A00(Context context, Uri uri, String str) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                String string = cursor.getString(0);
                AnonymousClass0QB.A00(cursor);
                return string;
            }
        } catch (Exception e) {
            Log.w("DocumentFile", AnonymousClass000.A0l(e, "Failed query: ", AnonymousClass000.A0u()));
        } catch (Throwable th) {
            AnonymousClass0QB.A00((AutoCloseable) null);
            throw th;
        }
        AnonymousClass0QB.A00(cursor);
        return null;
    }

    private boolean A02(AnonymousClass0UN r17, C21050ya r18, File file, List list, AtomicLong atomicLong) {
        String str;
        FileOutputStream A0W;
        boolean z = true;
        AnonymousClass0UN r6 = r17;
        if (r17 == null || r6.A00()) {
            str = "externaldirmigration/manual/doc file either null or virtual";
        } else {
            Context context = r6.A00;
            Uri uri = r6.A01;
            String A002 = A00(context, uri, "_display_name");
            if (A002 == null) {
                str = "externaldirmigration/manual/file name is null";
            } else {
                File A0w = C36441kJ.A0w(file, A002);
                C21050ya r12 = r18;
                List list2 = list;
                AtomicLong atomicLong2 = atomicLong;
                if (!"vnd.android.document/directory".equals(A00(context, uri, "mime_type"))) {
                    if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(A00(context, uri, "mime_type"))) {
                        C36321k7.A1R("externaldirmigration/manual/cannot read file ", A002, AnonymousClass000.A0u());
                        atomicLong2.incrementAndGet();
                        return false;
                    } else if (A0w.exists()) {
                        str = AnonymousClass000.A0l(A0w, "externaldirmigration/manual/target file already exists ", AnonymousClass000.A0u());
                    } else {
                        try {
                            InputStream A062 = r12.A06(uri);
                            try {
                                A0W = C90524aI.A0W(A0w);
                                AnonymousClass6YY.A0J(A062, A0W);
                                list2.add(A0w);
                                if (!A01(r6, r12)) {
                                    C36321k7.A1L(A0w, "externaldirmigration/manual/failed to delete source file for ", AnonymousClass000.A0u());
                                }
                                A0W.close();
                                if (A062 != null) {
                                    A062.close();
                                    return true;
                                }
                                return z;
                            } catch (Throwable th) {
                                if (A062 != null) {
                                    A062.close();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            com.whatsapp.util.Log.e("externaldirmigration/manual//failed to copy file", e);
                            atomicLong2.incrementAndGet();
                            return false;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } else if (A0w.exists() || A0w.mkdirs()) {
                    for (AnonymousClass0UN A022 : r6.A01()) {
                        if (!A02(A022, r12, A0w, list2, atomicLong2)) {
                            z = false;
                        }
                    }
                    if (z && !A01(r6, r12)) {
                        str = AnonymousClass000.A0l(A0w, "externaldirmigration/manual/failed to delete source file for ", AnonymousClass000.A0u());
                    }
                    return z;
                } else {
                    C36321k7.A1J(A0w, "externaldirmigration/manual/failed to create target directory ", AnonymousClass000.A0u());
                    return false;
                }
            }
        }
        com.whatsapp.util.Log.w(str);
        return z;
        throw th;
    }

    private boolean A01(AnonymousClass0UN r14, C21050ya r15) {
        Uri uri = r14.A01;
        Cursor A032 = r15.A03(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
        boolean z = false;
        if (A032 != null) {
            try {
                if (A032.moveToFirst()) {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("flags");
                    if (!A032.isNull(columnIndexOrThrow) && (A032.getLong(columnIndexOrThrow) & 4) != 0) {
                        z = true;
                    }
                }
                A032.close();
                if (z) {
                    try {
                        return DocumentsContract.deleteDocument(r15.A00, uri);
                    } catch (FileNotFoundException e) {
                        com.whatsapp.util.Log.e("externaldirmigration/manual/", e);
                        return false;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        com.whatsapp.util.Log.w("externaldirmigration/manual/file deletion is not supported");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r3 = r17
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r15.<init>(r0)
            if (r3 == 0) goto L_0x00fe
            int r2 = r3.length
            r5 = 1
            if (r2 != r5) goto L_0x00fe
            r2 = 0
            r6 = r3[r2]
            if (r6 == 0) goto L_0x00fe
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            r10 = r16
            X.0wG r2 = r10.A05
            android.content.Context r4 = r2.A00
            r3 = 0
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r6)
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r6, r2)
            X.0UN r9 = new X.0UN
            r9.<init>(r4, r2, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "externaldirmigration/manual/going to migrate "
            X.C36321k7.A1K(r9, r2, r3)
            boolean r2 = r9.A00()
            if (r2 != 0) goto L_0x00c8
            android.content.Context r4 = r9.A00
            android.net.Uri r3 = r9.A01
            java.lang.String r2 = "_display_name"
            java.lang.String r2 = A00(r4, r3, r2)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = "mime_type"
            java.lang.String r3 = A00(r4, r3, r2)
            java.lang.String r2 = "vnd.android.document/directory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c8
            X.0yb r4 = r10.A04
            X.0ya r12 = r4.A0O()
            if (r12 != 0) goto L_0x007f
            java.lang.String r2 = "externaldirmigration/manual/no content resolver"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0064:
            r15.incrementAndGet()
        L_0x0067:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x00e4
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r5)
            X.0y0 r4 = r10.A01
            r3 = 16
            X.72n r2 = new X.72n
            r2.<init>(r6, r3)
            r4.A0g(r2, r14)
            goto L_0x00da
        L_0x007f:
            X.179 r2 = r10.A03
            java.io.File r13 = r2.A05()
            X.C18740tg.A06(r13)
            X.0UN[] r8 = r9.A01()
            int r7 = r8.length
            r6 = 1
            r3 = 0
        L_0x008f:
            if (r3 >= r7) goto L_0x009d
            r11 = r8[r3]
            boolean r2 = r10.A02(r11, r12, r13, r14, r15)
            if (r2 != 0) goto L_0x009a
            r6 = 0
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x009d:
            if (r6 == 0) goto L_0x00a3
            boolean r6 = r10.A01(r9, r12)
        L_0x00a3:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "externaldirmigration/manual/succeeded: "
            X.C36321k7.A1X(r2, r3, r6)
            if (r6 == 0) goto L_0x0067
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = "WhatsApp"
            java.io.File r3 = X.C36441kJ.A0w(r3, r2)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.C133116Wv.A02(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            X.C133116Wv.A02(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            X.C133116Wv.A02(r2, r4, r3)
            goto L_0x0067
        L_0x00c8:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "externaldirmigration/manual/not a suitable tree to migrate ("
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = ")"
            X.C36341k9.A1O(r3, r2)
            goto L_0x0064
        L_0x00da:
            r6.await()     // Catch:{ InterruptedException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r3 = move-exception
            java.lang.String r2 = "WhatsAppscan interrupted"
            com.whatsapp.util.Log.w(r2, r3)
        L_0x00e4:
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r2 = r10.A08
            long r2 = r2.get()
            long r4 = r4 - r2
            long r6 = r6 - r4
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f9
            android.os.SystemClock.sleep(r6)
        L_0x00f9:
            int r0 = r14.size()
            long r0 = (long) r0
        L_0x00fe:
            long r3 = r15.get()
            X.5r7 r2 = new X.5r7
            r2.<init>(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107215Mz.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        this.A08.set(System.currentTimeMillis());
        this.A02.A05(0, R.string.f12nameremoved);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C39001qm A002;
        int i;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        C120195r7 r10 = (C120195r7) obj;
        this.A02.A02();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("externaldirmigration/manual/migration results: moved ");
        A0u.append(r10.A01);
        A0u.append(" failed ");
        long j = r10.A00;
        C36351kA.A1S(A0u, j);
        AnonymousClass179 r2 = this.A03;
        boolean z = !r2.A0A();
        if (!z) {
            r2.A09("scoped");
        }
        Activity activity = (Activity) this.A07.get();
        if (activity != null && !AnonymousClass3SJ.A04(activity) && this.A00.A00) {
            if (z) {
                A002 = AnonymousClass3LW.A00(activity);
                A002.A0d(R.string.f12nameremoved);
                A002.A0p(C36341k9.A0e(activity, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
                A002.A0r(false);
                i = R.string.f12nameremoved;
                i2 = 14;
            } else {
                int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                A002 = AnonymousClass3LW.A00(activity);
                if (i3 == 0) {
                    A002.A0d(R.string.f12nameremoved);
                    A002.A0c(R.string.f12nameremoved);
                    A002.A0r(false);
                    i = R.string.f12nameremoved;
                    onClickListener = AnonymousClass6Z8.A00;
                    A002.A0h(onClickListener, i);
                    C36341k9.A11(A002);
                }
                A002.A0d(R.string.f12nameremoved);
                A002.A0c(R.string.f12nameremoved);
                A002.A0r(false);
                A002.A0f(AnonymousClass6Z9.A00, R.string.f12nameremoved);
                i = R.string.f12nameremoved;
                i2 = 15;
            }
            onClickListener = new C163437qC(activity, this, i2);
            A002.A0h(onClickListener, i);
            C36341k9.A11(A002);
        } else if (z) {
            this.A06.A03("ManualExternalDirMigration");
        }
    }

    public /* synthetic */ void A0H(Activity activity) {
        C19770wU r11 = this.A0A;
        C19630wG r9 = this.A05;
        C19970wo r8 = this.A09;
        AnonymousClass17Y r5 = this.A02;
        Activity activity2 = activity;
        r11.Box(new C107215Mz(activity2, this.A00, this.A01, r5, this.A03, this.A04, r8, r9, this.A06, r11), new Uri[0]);
    }

    public C107215Mz(Activity activity, C21390zA r3, C20690y0 r4, AnonymousClass17Y r5, AnonymousClass179 r6, C21060yb r7, C19970wo r8, C19630wG r9, C21350z4 r10, C19770wU r11) {
        this.A07 = AnonymousClass001.A0F(activity);
        this.A05 = r9;
        this.A09 = r8;
        this.A02 = r5;
        this.A0A = r11;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r10;
        this.A00 = r3;
    }

    public /* synthetic */ void A0G(Activity activity) {
        activity.startActivity(AnonymousClass190.A09(activity));
        this.A06.A03("ManualExternalDirMigration");
    }
}
