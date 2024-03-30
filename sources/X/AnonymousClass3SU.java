package X;

import android.widget.ProgressBar;

/* renamed from: X.3SU  reason: invalid class name */
public abstract class AnonymousClass3SU {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r8 < 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.ViewGroup r16, android.widget.TextView r17, X.AnonymousClass36P r18, X.C18820ts r19, X.AnonymousClass1Y4 r20, X.AnonymousClass2bU r21) {
        /*
            r4 = r21
            X.3Qj r3 = X.AnonymousClass2bU.A00(r4)
            long r1 = r3.A0E
            int r0 = (int) r1
            r1 = r20
            int r0 = A00(r1, r4, r0)
            long r6 = (long) r0
            boolean r0 = A03(r1, r4, r6)
            r21 = r16
            r15 = r17
            r14 = r18
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r3.A0d
            if (r0 != 0) goto L_0x00fa
            long r8 = android.os.SystemClock.elapsedRealtime()
            r2 = r19
            if (r19 == 0) goto L_0x00f6
            long r0 = r4.A00
            java.lang.String r20 = X.AnonymousClass3TF.A02(r2, r0)
        L_0x0032:
            r4 = 100
            r18 = 0
            r2 = 0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            boolean r13 = r14.A00
            r0 = 8
            if (r13 != 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            r15.setVisibility(r0)
            if (r16 == 0) goto L_0x0057
            r0 = r21
            r0.setVisibility(r2)
        L_0x0057:
            return
        L_0x0058:
            long r4 = r4 - r6
            X.36O r10 = r14.A01
            long r0 = r10.A02
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x006c
            long r2 = r10.A01
            int r11 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r11 >= 0) goto L_0x006c
            r10.A02 = r8
            r0 = r8
            r10.A01 = r4
        L_0x006c:
            long r11 = r8 - r0
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0057
            int r2 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0057
            r16 = 100
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0057
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0057
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0057
            long r2 = r10.A01
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            r16 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            long r2 = r2 - r4
            double r0 = (double) r2
            double r2 = (double) r11
            double r0 = r0 / r2
            double r2 = r10.A00
            r16 = 0
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00a9
            r11 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r0 = r0 * r11
            r11 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r2 = r2 * r11
            double r0 = r0 + r2
        L_0x00a9:
            r10.A00 = r0
            double r2 = (double) r4
            double r2 = r2 / r0
            long r0 = (long) r2
            r10.A02 = r8
            r10.A01 = r4
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0057
            r3 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r2 = X.C36401kF.A1U(r2)
            r13 = r13 | r2
            r14.A00 = r13
            if (r13 == 0) goto L_0x0057
            X.3Oh r2 = r14.A02
            android.text.SpannableStringBuilder r0 = r2.A00(r6, r0)
            r15.setText(r0)
            if (r20 == 0) goto L_0x00ee
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = " "
            r3.append(r2)
            android.content.Context r1 = r15.getContext()
            r0 = 2131896446(0x7f12287e, float:1.9427753E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r3)
            r15.append(r0)
            r0 = r20
            r15.append(r0)
        L_0x00ee:
            r0 = 0
            r15.setVisibility(r0)
            X.C36341k9.A0y(r21)
            return
        L_0x00f6:
            r20 = 0
            goto L_0x0032
        L_0x00fa:
            r1 = 0
            r14.A00 = r1
            r0 = 8
            r15.setVisibility(r0)
            if (r16 == 0) goto L_0x0109
            r0 = r21
            r0.setVisibility(r1)
        L_0x0109:
            X.36O r2 = r14.A01
            r0 = -9223372036854775808
            r2.A02 = r0
            r2.A01 = r0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SU.A02(android.view.ViewGroup, android.widget.TextView, X.36P, X.0ts, X.1Y4, X.2bU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r1.A09(r2) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass1Y4 r1, X.AnonymousClass2bU r2, int r3) {
        /*
            X.3SC r0 = X.AnonymousClass1Y4.A00(r1, r2)
            X.6vi r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0032
            X.65P r0 = r0.A03()
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0032
            X.3SC r0 = X.AnonymousClass1Y4.A00(r1, r2)
            X.6vi r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x002b
            X.65P r0 = r0.A03()
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x002b
            boolean r1 = r1.A09(r2)
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r3 = r3 / 2
            if (r0 != 0) goto L_0x0032
            int r3 = r3 + 50
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SU.A00(X.1Y4, X.2bU, int):int");
    }

    public static int A01(AnonymousClass1Y4 r4, AnonymousClass2bU r5, AnonymousClass1RJ r6) {
        C65013Qj A00 = AnonymousClass2bU.A00(r5);
        if (!A00.A0f || A00.A0d) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ConversationRowMediaUtils");
            r6.A08(C79453tk.A00, AnonymousClass000.A0q("#updateProgress", A0u));
            return 0;
        }
        ProgressBar progressBar = (ProgressBar) r6.A01();
        progressBar.setVisibility(0);
        int A002 = A00(r4, r5, (int) A00.A0E);
        boolean A03 = A03(r4, r5, (long) A002);
        if (A002 > 0 && (A002 < 100 || A03)) {
            progressBar.setProgress(A002);
            progressBar.setIndeterminate(A03);
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A03().A0M == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass1Y4 r4, X.AnonymousClass2bU r5, long r6) {
        /*
            X.3SC r0 = X.AnonymousClass1Y4.A00(r4, r5)
            X.6vi r0 = r4.A04(r0)
            if (r0 == 0) goto L_0x0013
            X.65P r0 = r0.A03()
            boolean r0 = r0.A0M
            r3 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r0 = r4.A09(r5)
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SU.A03(X.1Y4, X.2bU, long):boolean");
    }
}
