package X;

import android.view.MenuItem;

/* renamed from: X.4Xk  reason: invalid class name and case insensitive filesystem */
public class C89664Xk implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public final int A01;

    public C89664Xk(C43132Eh r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        X.C81323wp.A00(r2.A0t, r2, 41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        r4.Boy(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0046;
                case 2: goto L_0x005f;
                case 3: goto L_0x0070;
                case 4: goto L_0x0089;
                case 5: goto L_0x00c1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.11F r1 = r0.A0b
            if (r1 == 0) goto L_0x00d9
            X.1fI r0 = r0.A0O
            boolean r0 = r0.A01(r1)
            return r0
        L_0x0016:
            java.lang.Object r2 = r12.A00
            X.2Eh r2 = (X.C43132Eh) r2
            com.whatsapp.community.CommunityNavigationActivity r3 = r2.A00
            X.11F r1 = r3.A0b
            if (r1 == 0) goto L_0x00d9
            X.1CR r0 = r3.A0f
            boolean r0 = r0.A0j(r1)
            if (r0 == 0) goto L_0x0033
            X.0wU r4 = r3.A04
            r0 = 33
            X.3wp r3 = new X.3wp
            r3.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x00d6
        L_0x0033:
            X.11F r1 = r3.A0b
            X.2oi r0 = X.C51992oi.COMMUNITY_NAVIGATION
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass3RD.A01(r1, r0)
            X.01z r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A1f(r1, r0)
            goto L_0x00d9
        L_0x0046:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.11F r2 = r0.A0b
            r4 = 1
            if (r2 == 0) goto L_0x00d9
            X.1Y3 r1 = r0.A0L
            r3 = 3
            r5 = 1
            r6 = 1
            r1.A02(r2, r3, r4, r5, r6)
            X.1Si r0 = r0.A0e
            r0.A09()
            goto L_0x00d9
        L_0x005f:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.11F r2 = r0.A0b
            r1 = 1
            if (r2 == 0) goto L_0x00d9
            X.1Y3 r0 = r0.A0L
            r0.A03(r2, r1)
            goto L_0x00d9
        L_0x0070:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r4 = r0.A00
            X.11F r3 = r4.A0b
            if (r3 == 0) goto L_0x00d9
            X.1fH r0 = r4.A0P
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.12t r0 = r0.A05
            r0.A08(r3, r1, r2)
            X.1uf r2 = r4.A0D
            goto L_0x00b7
        L_0x0089:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r5 = r0.A00
            X.11F r4 = r5.A0b
            r9 = 1
            if (r4 == 0) goto L_0x00d9
            X.1fH r3 = r5.A0P
            java.lang.Integer r2 = X.C36371kC.A0n()
            X.12t r0 = r3.A05
            r0.A08(r4, r2, r9)
            X.0wU r1 = r3.A08
            r0 = 47
            X.C36371kC.A1Q(r1, r3, r4, r2, r0)
            X.1Y3 r6 = r5.A0L
            X.11F r7 = r5.A0b
            r8 = 0
            r10 = 1
            r11 = 1
            r6.A02(r7, r8, r9, r10, r11)
            X.1Si r0 = r5.A0e
            r0.A09()
            X.1uf r2 = r5.A0D
        L_0x00b7:
            if (r2 == 0) goto L_0x00d9
            X.0wk r1 = r2.A0t
            r0 = 41
            X.C81323wp.A00(r1, r2, r0)
            goto L_0x00d9
        L_0x00c1:
            java.lang.Object r0 = r12.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.11F r2 = r0.A0b
            if (r2 == 0) goto L_0x00d9
            X.1fI r1 = r0.A0O
            X.0wU r4 = r1.A05
            r0 = 14
            X.1j5 r3 = new X.1j5
            r3.<init>(r1, r2, r0)
        L_0x00d6:
            r4.Boy(r3)
        L_0x00d9:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89664Xk.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
