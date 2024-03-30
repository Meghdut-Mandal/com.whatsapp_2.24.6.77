package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.15h  reason: invalid class name and case insensitive filesystem */
public class C226615h extends AnonymousClass02H {
    public final /* synthetic */ HomeActivity A00;

    public C226615h(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcC(int r10) {
        /*
            r9 = this;
            com.whatsapp.HomeActivity r4 = r9.A00
            X.0V9 r0 = r4.A0K
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            r3 = 1
            com.whatsapp.HomeActivity.A15(r4, r3)
            com.whatsapp.HomeActivity.A0z(r4)
            int r1 = com.whatsapp.HomeActivity.A0J(r4, r10)
            r4.A03 = r1
            X.1EM r0 = r4.A18
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x002e
            r0 = 600(0x258, float:8.41E-43)
            r2 = 3
            if (r1 != r0) goto L_0x0024
            r2 = 0
        L_0x0024:
            X.0wU r1 = r4.A04
            X.1iJ r0 = new X.1iJ
            r0.<init>(r9, r2, r3)
            r1.Boy(r0)
        L_0x002e:
            r4.A3q()
            int r5 = r4.A03
            int r0 = com.whatsapp.HomeActivity.A0G(r5)
            X.1ce r2 = com.whatsapp.HomeActivity.A0M(r4, r0)
            X.1JL r1 = r4.A07
            if (r2 == 0) goto L_0x0105
            boolean r0 = r2.B7g()
            if (r0 == 0) goto L_0x0105
            boolean r0 = r2.BYO()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0105
        L_0x0051:
            r0 = 1
        L_0x0052:
            r1.A03(r5, r0)
            r4.A3r()
            int r6 = r4.A03
            r0 = 400(0x190, float:5.6E-43)
            r5 = 300(0x12c, float:4.2E-43)
            r1 = 500(0x1f4, double:2.47E-321)
            if (r6 != r0) goto L_0x00e9
            X.17Y r0 = r4.A05
            java.lang.Runnable r5 = r4.A2P
        L_0x0066:
            r0.A0G(r5)
            X.17Y r0 = r4.A05
            r0.A0I(r5, r1)
        L_0x006e:
            r7 = 0
            com.whatsapp.HomeActivity.A12(r4, r7)
            r4.invalidateOptionsMenu()
            com.whatsapp.HomeActivity.A0x(r4)
            X.02E r0 = com.whatsapp.HomeActivity.A0L(r4)
            if (r0 == 0) goto L_0x0108
            android.view.View r1 = r0.A0F
            if (r1 == 0) goto L_0x0108
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r5 = r1.findViewById(r0)
            com.whatsapp.collections.observablelistview.ObservableListView r5 = (com.whatsapp.collections.observablelistview.ObservableListView) r5
            if (r5 == 0) goto L_0x0108
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x0108
            com.whatsapp.PagerSlidingTabStrip r0 = r4.A04
            if (r0 == 0) goto L_0x00e7
            int r8 = r0.getHeight()
        L_0x009b:
            int r0 = r5.getFirstVisiblePosition()
            if (r0 <= 0) goto L_0x00dd
            r6 = r8
        L_0x00a2:
            int r0 = r5.getChildCount()
            int r0 = r0 - r3
            android.view.View r2 = r5.getChildAt(r0)
            int r1 = r2.getBottom()
            int r0 = r5.getBottom()
            if (r1 <= r0) goto L_0x00db
            int r1 = r2.getBottom()
            int r0 = r5.getBottom()
            int r1 = r1 - r0
        L_0x00be:
            int r6 = r6 + r1
            if (r6 < r8) goto L_0x0108
            int r0 = r4.A01
            if (r0 != 0) goto L_0x00cd
            int r0 = r5.A04
            if (r0 <= 0) goto L_0x00cc
            r5.setSelection(r7)
        L_0x00cc:
            return
        L_0x00cd:
            int r1 = r5.A04
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x00cc
            r5.setSelection(r3)
            return
        L_0x00db:
            r1 = 0
            goto L_0x00be
        L_0x00dd:
            android.view.View r0 = r5.getChildAt(r7)
            int r0 = r0.getTop()
            int r6 = -r0
            goto L_0x00a2
        L_0x00e7:
            r8 = 0
            goto L_0x009b
        L_0x00e9:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x00f3
            X.17Y r0 = r4.A05
            java.lang.Runnable r5 = r4.A2O
            goto L_0x0066
        L_0x00f3:
            if (r6 != r5) goto L_0x00fb
            X.17Y r0 = r4.A05
            java.lang.Runnable r5 = r4.A2Q
            goto L_0x0066
        L_0x00fb:
            r0 = 600(0x258, float:8.41E-43)
            if (r6 != r0) goto L_0x006e
            X.17Y r0 = r4.A05
            java.lang.Runnable r5 = r4.A2N
            goto L_0x0066
        L_0x0105:
            r0 = 0
            goto L_0x0052
        L_0x0108:
            com.whatsapp.HomeActivity.A0z(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226615h.BcC(int):void");
    }
}
