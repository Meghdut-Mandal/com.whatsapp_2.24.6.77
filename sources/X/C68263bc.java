package X;

import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.3bc  reason: invalid class name and case insensitive filesystem */
public class C68263bc implements AnonymousClass02G {
    public final /* synthetic */ AnonymousClass2UK A00;
    public final /* synthetic */ MediaViewBaseFragment A01;

    public void BcA(int i) {
    }

    public void BcB(int i, float f, int i2) {
    }

    public C68263bc(AnonymousClass2UK r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = r1;
        this.A01 = mediaViewBaseFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcC(int r7) {
        /*
            r6 = this;
            X.2UK r0 = r6.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = r0.A00
            boolean r0 = r2 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x016a
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.2bU r4 = com.whatsapp.mediaview.MediaViewFragment.A07(r2, r7)
            X.17Y r0 = r2.A0H
            java.lang.Runnable r5 = r2.A2A
            r0.A0G(r5)
            X.3Qq r0 = r2.A1o
            if (r0 == 0) goto L_0x0053
            X.2bU r0 = r2.A1T
            if (r0 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x0025
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0055
        L_0x0025:
            X.3Qq r0 = r2.A1o
            r0.A0A()
            java.util.HashMap r3 = r2.A2B
            X.2bU r0 = r2.A1T
            X.3Qa r1 = r0.A1J
            X.3Qq r0 = r2.A1o
            int r0 = r0.A04()
            X.C36341k9.A1K(r1, r3, r0)
            X.3Qq r0 = r2.A1o
            r0.A0D()
            X.3Qq r0 = r2.A1o
            r0.A0B()
            X.3Qq r1 = r2.A1o
            r0 = 4
            r1.A0O(r0)
            X.1ST r1 = r2.A1A
            X.2bU r0 = r2.A1T
            r1.A0E(r0)
            r0 = 0
            r2.A1o = r0
        L_0x0053:
            if (r4 == 0) goto L_0x00eb
        L_0x0055:
            int r1 = r4.A1I
            r0 = 2
            if (r1 != r0) goto L_0x00eb
            X.2bU r0 = r2.A1T
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.AnonymousClass3T1.A0B(r0, r4)
            if (r0 != 0) goto L_0x0067
        L_0x0064:
            com.whatsapp.mediaview.MediaViewFragment.A0M(r2, r4)
        L_0x0067:
            int r0 = r2.A03
            if (r0 == r7) goto L_0x0087
            X.2bU r0 = r2.A1T
            if (r0 == 0) goto L_0x0087
            if (r4 == 0) goto L_0x0087
            X.3Qa r0 = r4.A1J
            com.whatsapp.mediaview.PhotoView r3 = r2.A1b(r0)
            if (r3 == 0) goto L_0x0087
            android.graphics.Matrix r1 = r3.A0A
            android.graphics.Matrix r0 = r3.A0B
            r1.set(r0)
            float r0 = r3.A06
            r3.A00 = r0
            r3.setImageMatrix(r1)
        L_0x0087:
            X.2bU r0 = r2.A1T
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0094
            r0 = 1
            r2.A1z = r0
        L_0x0094:
            com.whatsapp.mediaview.MediaViewFragment.A0F(r2)
            r2.A1T = r4
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r5 = r2.A1D
            if (r5 == 0) goto L_0x00a5
            if (r4 != 0) goto L_0x00db
            X.00s r1 = r5.A00
            r0 = 0
            r1.A0D(r0)
        L_0x00a5:
            r2.A03 = r7
            X.0yC r1 = r2.A0x
            r0 = 6649(0x19f9, float:9.317E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00d7
            X.0wU r3 = r2.A1n
            r1 = 46
            X.3wl r0 = new X.3wl
            r0.<init>((java.lang.Object) r2, (int) r7, (int) r1)
            r3.Boy(r0)
        L_0x00bd:
            X.01I r0 = r2.A0i()
            android.view.View r0 = X.C36361kB.A0C(r0)
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 & -3
            X.01I r0 = r2.A0i()
            android.view.View r0 = X.C36361kB.A0C(r0)
            r0.setSystemUiVisibility(r1)
        L_0x00d6:
            return
        L_0x00d7:
            com.whatsapp.mediaview.MediaViewFragment.A0J(r2, r7)
            goto L_0x00bd
        L_0x00db:
            X.00s r3 = r5.A00
            X.4Uq r1 = r4.A0J
            X.3IY r0 = new X.3IY
            r0.<init>(r1, r4)
            r3.A0D(r0)
            r5.A0S()
            goto L_0x00a5
        L_0x00eb:
            boolean r0 = r2.A1x
            if (r0 == 0) goto L_0x0146
            if (r4 == 0) goto L_0x0165
            int r1 = r4.A1I
            boolean r0 = X.C65703Td.A00(r1)
            if (r0 == 0) goto L_0x0127
            java.util.Map r0 = r2.A2D
            X.3Qa r3 = r4.A1J
            java.lang.Object r1 = r0.get(r3)
            X.3Qq r1 = (X.C65083Qq) r1
            r2.A1o = r1
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.A0c()
            if (r0 != 0) goto L_0x0067
            r1.A0F()
            java.util.HashMap r0 = r2.A2B
            java.lang.Number r0 = X.C36441kJ.A10(r3, r0)
            if (r0 == 0) goto L_0x0067
            X.3Qq r1 = r2.A1o
            int r0 = r0.intValue()
            r1.A0L(r0)
            goto L_0x0067
        L_0x0127:
            boolean r0 = X.C66013Ui.A0H(r1)
            if (r0 == 0) goto L_0x0165
            java.util.Map r1 = r2.A2D
            X.3Qa r0 = r4.A1J
            java.lang.Object r0 = r1.get(r0)
            X.3Qq r0 = (X.C65083Qq) r0
            r2.A1o = r0
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0067
            X.17Y r3 = r2.A0H
            r0 = 150(0x96, double:7.4E-322)
            r3.A0I(r5, r0)
            goto L_0x0067
        L_0x0146:
            if (r4 == 0) goto L_0x0165
            int r0 = r4.A1I
            boolean r0 = X.C66013Ui.A0H(r0)
            if (r0 == 0) goto L_0x0165
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0067
            java.util.Map r1 = r2.A2C
            X.3Qa r0 = r4.A1J
            java.lang.Object r0 = r1.get(r0)
            X.3Qq r0 = (X.C65083Qq) r0
            if (r0 == 0) goto L_0x0067
            r0.A0C()
            goto L_0x0067
        L_0x0165:
            com.whatsapp.mediaview.MediaViewFragment.A0H(r2)
            goto L_0x0067
        L_0x016a:
            boolean r0 = r2 instanceof com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r2 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r2
            r2.A01 = r7
            java.util.List r0 = r2.A0G
            java.lang.Object r0 = r0.get(r7)
            X.3XV r0 = (X.AnonymousClass3XV) r0
            long r0 = r0.A00
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment.A00(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68263bc.BcC(int):void");
    }
}
