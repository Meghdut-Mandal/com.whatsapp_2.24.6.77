package X;

import java.io.File;

/* renamed from: X.5Bz  reason: invalid class name and case insensitive filesystem */
public final class C104925Bz extends AnonymousClass5C2 implements C160107kT {
    public File A00;
    public boolean A01;
    public C1042858z A02;
    public final long A03;
    public final C19630wG A04;
    public final C20810yC A05;
    public final AnonymousClass7hC A06;
    public final AnonymousClass1O9 A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104925Bz(X.C20050ww r11, X.C19970wo r12, X.C19630wG r13, X.C20060wx r14, X.C20810yC r15, X.AnonymousClass1BV r16, X.AnonymousClass7hC r17, X.AnonymousClass1O9 r18, X.AnonymousClass1BS r19, java.lang.String r20, long r21) {
        /*
            r10 = this;
            r3 = r11
            r4 = r12
            r5 = r14
            r8 = r19
            X.C36321k7.A18(r12, r11, r14, r8)
            r6 = r15
            X.C36321k7.A10(r15, r13)
            r9 = 0
            r2 = r10
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A05 = r15
            r10.A04 = r13
            r0 = r18
            r10.A07 = r0
            r0 = r21
            r10.A03 = r0
            r0 = r20
            r10.A08 = r0
            r0 = r17
            r10.A06 = r0
            r10.B0M(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104925Bz.<init>(X.0ww, X.0wo, X.0wG, X.0wx, X.0yC, X.1BV, X.7hC, X.1O9, X.1BS, java.lang.String, long):void");
    }

    public C117395mC A02() {
        this.A01 = true;
        C117395mC A022 = super.A02();
        C1042858z r1 = A022.A00.A00;
        if (r1 != null) {
            r1.A0I = 1;
            r1.A0J = 15;
            r1.A0H = C36391kE.A0r();
            r1.A0G = C36371kC.A0p();
        } else {
            r1 = null;
        }
        this.A02 = r1;
        return A022;
    }

    public /* synthetic */ void BW4(long j) {
    }

    public void BW6(boolean z) {
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BW7(X.C133136Wx r11, X.C129166Fp r12) {
        /*
            r10 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r11, r2)
            boolean r0 = r11.A03()
            r7 = 1
            if (r0 == 0) goto L_0x0068
            java.io.File r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            if (r0 == 0) goto L_0x001d
            long r0 = r0.length()     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            int r5 = (int) r0     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
        L_0x0014:
            byte[] r1 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            java.io.File r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            java.io.FileInputStream r4 = X.C90524aI.A0U(r0)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0014
        L_0x001f:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0048 }
            r3.<init>(r4)     // Catch:{ all -> 0x0048 }
            r3.read(r1, r2, r5)     // Catch:{ all -> 0x0041 }
            r3.close()     // Catch:{ all -> 0x0048 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            X.7hC r0 = r10.A06     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            r0.BiK(r1)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            java.lang.String r0 = "AnonymousProfilePicDownload: Downloaded successfully: "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            java.lang.String r0 = r10.A08     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            X.C36341k9.A1O(r1, r0)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            goto L_0x0072
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
            throw r0     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x004f }
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: IO Exception while reading the picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x005d }
            goto L_0x0072
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: Could not find picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x005d }
            goto L_0x0072
        L_0x005d:
            r1 = move-exception
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x0065
            r0.delete()
        L_0x0065:
            r10.A01 = r2
            throw r1
        L_0x0068:
            int r0 = r11.A01
            boolean r0 = X.C133136Wx.A02(r0)
            r7 = 6
            if (r0 == 0) goto L_0x0072
            r7 = 4
        L_0x0072:
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x0079
            r0.delete()
        L_0x0079:
            r10.A01 = r2
            X.58z r0 = r11.A00
            if (r0 == 0) goto L_0x00a7
            java.lang.Long r0 = r0.A0N
            if (r0 == 0) goto L_0x00a7
            long r0 = r0.longValue()
            int r9 = (int) r0
        L_0x0088:
            X.1O9 r4 = r10.A07
            r8 = 1
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A03
            java.lang.Long r6 = X.C90504aG.A0h(r2, r0)
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x00a5
            long r0 = r0.length()
            java.lang.Double r5 = X.C90524aI.A0Z(r0)
        L_0x00a1:
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x00a5:
            r5 = 0
            goto L_0x00a1
        L_0x00a7:
            r9 = -1
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104925Bz.BW7(X.6Wx, X.6Fp):void");
    }
}
