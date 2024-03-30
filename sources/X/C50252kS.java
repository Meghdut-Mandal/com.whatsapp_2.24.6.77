package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.2kS  reason: invalid class name and case insensitive filesystem */
public class C50252kS extends C132446Tt {
    public final C61913Dz A00;
    public final C20690y0 A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass3FN A03;
    public final AnonymousClass141 A04;
    public final C20810yC A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;
    public final C20060wx A09;

    public static Pair A00(AnonymousClass3NO r5) {
        int i;
        int i2 = r5.A00;
        if (i2 == 2) {
            i = 4;
        } else if (i2 == 3) {
            i = 1;
        } else if (i2 == 4) {
            i = 2;
        } else if (i2 != 1) {
            return null;
        } else {
            i = 3;
        }
        return C36441kJ.A0Q((Object) null, i);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Pair pair;
        BufferedInputStream bufferedInputStream;
        Context A0G = C36441kJ.A0G(this.A06);
        if (A0G == null) {
            return null;
        }
        boolean A0E = this.A05.A0E(7584);
        AnonymousClass141 r3 = this.A04;
        AnonymousClass11F A0G2 = C36331k8.A0G(r3);
        String A0l = C36361kB.A0l();
        if (A0E) {
            String A0H = this.A02.A0H(r3);
            String replaceAll = C36391kE.A0v(A0G, A0H, new Object[1], 0, R.string.f12nameremoved).replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
            if (!TextUtils.isEmpty(replaceAll)) {
                A0l = replaceAll;
            }
            AnonymousClass3NO A012 = this.A03.A01(A0G2, A0l, this.A08);
            pair = A00(A012);
            if (pair == null) {
                List<File> list = A012.A01;
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(this.A01.A0R(A0l))));
                    try {
                        byte[] bArr = new byte[16384];
                        for (File file : list) {
                            try {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 16384);
                                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, 16384);
                                    if (read == -1) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream.close();
                            } catch (IOException e) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Cannot zip file to share: ");
                                C36351kA.A1Q(file.getName(), A0u, e);
                                throw e;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        zipOutputStream.close();
                        return C36341k9.A0I(C36431kI.A0B().setFlags(1).setType("application/zip").putExtra("android.intent.extra.SUBJECT", C36351kA.A0w(A0G, A0H, 1, R.string.f12nameremoved)).putExtra("android.intent.extra.TEXT", C36351kA.A0w(A0G, replaceAll, 1, R.string.f12nameremoved)).putExtra("android.intent.extra.STREAM", C36401kF.A0C().appendPath("export_chat_folder").appendEncodedPath(A0G2.getRawString()).appendEncodedPath(A0l).build()), 0);
                    } catch (Throwable th2) {
                        zipOutputStream.close();
                        throw th2;
                    }
                } catch (IOException e2) {
                    Log.e("Cannot zip file to share ", e2);
                    return C36341k9.A0I((Object) null, 3);
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
        } else {
            AnonymousClass3NO A013 = this.A03.A01(A0G2, A0l, this.A08);
            pair = A00(A013);
            if (pair == null) {
                List list2 = A013.A01;
                String A0H2 = this.A02.A0H(r3);
                String replaceAll2 = C36391kE.A0v(A0G, A0H2, new Object[1], 0, R.string.f12nameremoved).replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
                ArrayList A0r = C36361kB.A0r(list2);
                A0r.add(C36401kF.A0C().appendPath("export_chat").appendEncodedPath(A0G2.getRawString()).appendEncodedPath(A0l).build());
                int i = 1;
                while (i < list2.size()) {
                    try {
                        A0r.add(AnonymousClass6YY.A01(A0G, (File) list2.get(i)));
                        i++;
                    } catch (IllegalArgumentException e3) {
                        Log.e((Throwable) e3);
                        return C36341k9.A0I((Object) null, 3);
                    }
                }
                return C36341k9.A0I(C36441kJ.A0I("android.intent.action.SEND_MULTIPLE").setFlags(1).setType("text/*").putExtra("android.intent.extra.SUBJECT", C36351kA.A0w(A0G, A0H2, 1, R.string.f12nameremoved)).putExtra("android.intent.extra.TEXT", C36351kA.A0w(A0G, replaceAll2, 1, R.string.f12nameremoved)).putParcelableArrayListExtra("android.intent.extra.STREAM", A0r), 0);
            }
        }
        return pair;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r0 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 4) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r8) {
        /*
            r7 = this;
            android.util.Pair r8 = (android.util.Pair) r8
            if (r8 == 0) goto L_0x002d
            java.lang.Object r3 = r8.first
            android.content.Intent r3 = (android.content.Intent) r3
            int r2 = X.C36381kD.A03(r8)
            if (r2 == 0) goto L_0x0073
            r0 = 1
            if (r2 == r0) goto L_0x002e
            r0 = 3
            if (r2 == r0) goto L_0x0098
            r0 = 4
            r1 = 2131889492(0x7f120d54, float:1.941365E38)
            if (r2 == r0) goto L_0x001d
        L_0x001a:
            r1 = 2131889491(0x7f120d53, float:1.9413647E38)
        L_0x001d:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r0 = r0.get()
            X.14r r0 = (X.C225014r) r0
            if (r0 == 0) goto L_0x002d
            r0.Bnv()
            r0.BO5(r1)
        L_0x002d:
            return
        L_0x002e:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r4 = r0.get()
            X.14r r4 = (X.C225014r) r4
            if (r4 == 0) goto L_0x002d
            java.lang.ref.WeakReference r0 = r7.A06
            android.content.Context r3 = X.C36441kJ.A0G(r0)
            r4.Bnv()
            if (r3 == 0) goto L_0x002d
            boolean r0 = X.C20060wx.A00()
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x0066
            r0 = 2131889493(0x7f120d55, float:1.9413651E38)
            X.C36351kA.A14(r3, r1, r0)
            r1.append(r2)
            r0 = 2131893530(0x7f121d1a, float:1.942184E38)
        L_0x005b:
            X.C36351kA.A14(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            r4.BO6(r0)
            return
        L_0x0066:
            r0 = 2131889494(0x7f120d56, float:1.9413653E38)
            X.C36351kA.A14(r3, r1, r0)
            r1.append(r2)
            r0 = 2131893531(0x7f121d1b, float:1.9421841E38)
            goto L_0x005b
        L_0x0073:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r4 = r0.get()
            X.14r r4 = (X.C225014r) r4
            java.lang.ref.WeakReference r0 = r7.A06
            android.content.Context r2 = X.C36441kJ.A0G(r0)
            if (r3 == 0) goto L_0x0098
            if (r4 == 0) goto L_0x0098
            if (r2 == 0) goto L_0x0098
            r4.Bnv()
            X.3Dz r1 = r7.A00
            r0 = 2131894002(0x7f121ef2, float:1.9422796E38)
            java.lang.String r5 = r2.getString(r0)
            r6 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0098:
            boolean r0 = r7.A08
            r1 = 2131889495(0x7f120d57, float:1.9413655E38)
            if (r0 != 0) goto L_0x001d
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50252kS.A0C(java.lang.Object):void");
    }

    public C50252kS(Context context, C225014r r3, C61913Dz r4, C20690y0 r5, AnonymousClass171 r6, C20060wx r7, AnonymousClass3FN r8, AnonymousClass141 r9, C20810yC r10, boolean z) {
        this.A05 = r10;
        this.A04 = r9;
        this.A01 = r5;
        this.A00 = r4;
        this.A08 = z;
        this.A09 = r7;
        this.A02 = r6;
        this.A03 = r8;
        this.A06 = AnonymousClass001.A0F(context);
        this.A07 = AnonymousClass001.A0F(r3);
    }
}
