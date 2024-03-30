package X;

import android.widget.AbsListView;

/* renamed from: X.1k5  reason: invalid class name and case insensitive filesystem */
public class C36301k5 implements AbsListView.OnScrollListener {
    public Object A00;
    public final int A01;

    public C36301k5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (r4 == 0) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            int r0 = r10.A01
            if (r0 != 0) goto L_0x0184
            java.lang.Object r2 = r10.A00
            com.whatsapp.collections.observablelistview.ObservableListView r2 = (com.whatsapp.collections.observablelistview.ObservableListView) r2
            android.widget.AbsListView$OnScrollListener r0 = r2.A06
            if (r0 == 0) goto L_0x000f
            r0.onScroll(r11, r12, r13, r14)
        L_0x000f:
            X.15S r0 = r2.A07
            if (r0 == 0) goto L_0x0184
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L_0x0184
            int r4 = r2.getFirstVisiblePosition()
            int r6 = r2.getFirstVisiblePosition()
            r3 = 0
            r5 = 0
        L_0x0023:
            int r0 = r2.getLastVisiblePosition()
            if (r6 > r0) goto L_0x0053
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 < 0) goto L_0x0041
            android.view.View r0 = r2.getChildAt(r5)
            int r1 = r0.getHeight()
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r6)
            if (r1 == r0) goto L_0x004e
        L_0x0041:
            android.util.SparseIntArray r1 = r2.A05
            android.view.View r0 = r2.getChildAt(r5)
            int r0 = r0.getHeight()
            r1.put(r6, r0)
        L_0x004e:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0053:
            android.view.View r7 = r2.getChildAt(r3)
            if (r7 == 0) goto L_0x0184
            int r6 = r2.A01
            r5 = 1
            if (r6 >= r4) goto L_0x0087
            int r0 = r4 - r6
            r6 = 0
            if (r0 == r5) goto L_0x0080
            int r1 = r4 + -1
        L_0x0065:
            int r0 = r2.A01
            if (r1 <= r0) goto L_0x0080
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r1)
            if (r0 <= 0) goto L_0x007b
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r1)
        L_0x0077:
            int r6 = r6 + r0
            int r1 = r1 + -1
            goto L_0x0065
        L_0x007b:
            int r0 = r7.getHeight()
            goto L_0x0077
        L_0x0080:
            int r5 = r2.A03
            int r0 = r2.A00
            int r0 = r0 + r6
            int r5 = r5 + r0
            goto L_0x00b3
        L_0x0087:
            if (r4 >= r6) goto L_0x00a8
            int r0 = r6 - r4
            r1 = 0
            if (r0 == r5) goto L_0x00ab
            int r6 = r6 - r5
        L_0x008f:
            if (r6 <= r4) goto L_0x00ab
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 <= 0) goto L_0x00a3
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r6)
        L_0x009f:
            int r1 = r1 + r0
            int r6 = r6 + -1
            goto L_0x008f
        L_0x00a3:
            int r0 = r7.getHeight()
            goto L_0x009f
        L_0x00a8:
            if (r4 != 0) goto L_0x00bb
            goto L_0x00b5
        L_0x00ab:
            int r5 = r2.A03
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            int r5 = r5 - r0
        L_0x00b3:
            r2.A03 = r5
        L_0x00b5:
            int r0 = r7.getHeight()
            r2.A00 = r0
        L_0x00bb:
            int r0 = r2.A00
            if (r0 >= 0) goto L_0x00c1
            r2.A00 = r3
        L_0x00c1:
            int r6 = r2.A03
            int r0 = r7.getTop()
            int r6 = r6 - r0
            r2.A04 = r6
            r2.A01 = r4
            X.15S r4 = r2.A07
            boolean r8 = r2.A0C
            boolean r9 = r2.A0B
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.02E r0 = com.whatsapp.HomeActivity.A0L(r4)
            if (r0 == 0) goto L_0x011d
            android.view.View r1 = r0.A0F
            if (r1 == 0) goto L_0x011d
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r1.findViewById(r0)
            if (r2 != r0) goto L_0x011d
            boolean r0 = com.whatsapp.HomeActivity.A1F(r4)
            r7 = 1
            if (r0 == 0) goto L_0x0128
            android.view.View r1 = r4.getCurrentFocus()
            X.0yb r0 = r4.A08
            android.view.inputmethod.InputMethodManager r5 = r0.A0N()
            if (r8 != 0) goto L_0x011d
            if (r9 == 0) goto L_0x011d
            if (r1 == 0) goto L_0x0108
            if (r5 == 0) goto L_0x0108
            android.os.IBinder r1 = r1.getWindowToken()
            r0 = 2
            r5.hideSoftInputFromWindow(r1, r0)
        L_0x0108:
            boolean r0 = com.whatsapp.HomeActivity.A1E(r4)
            if (r0 == 0) goto L_0x011d
            X.01z r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "search_fragment"
            X.02E r0 = r1.A0N(r0)
            if (r0 == 0) goto L_0x011d
            com.whatsapp.HomeActivity.A15(r4, r7)
        L_0x011d:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x0123
            r2.A0C = r3
        L_0x0123:
            int r0 = r2.A04
            r2.A02 = r0
            return
        L_0x0128:
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            int r5 = r0.getHeight()
            int r0 = r4.A02
            if (r0 < r6) goto L_0x0133
            r7 = 0
        L_0x0133:
            r4.A02 = r6
            if (r8 != 0) goto L_0x013b
            boolean r0 = r4.A27
            if (r0 == r7) goto L_0x0159
        L_0x013b:
            r4.A27 = r7
            int r0 = r4.A01
            int r0 = r0 + r6
            r4.A00 = r0
            int r1 = r4.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0159
            android.view.View r0 = r4.A0D
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r4.A0D
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0159:
            int r1 = r4.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x011d
            int r0 = r4.A00
            int r6 = r6 - r0
            int r0 = -r6
            int r1 = -r5
            int r0 = java.lang.Math.min(r0, r3)
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r4.A01
            if (r1 == r0) goto L_0x011d
            r4.A01 = r1
            android.view.View r0 = r4.A0D
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r4.A0D
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            goto L_0x011d
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36301k5.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = (com.whatsapp.conversationslist.ConversationsFragment) r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x0046
            r0 = 1
            if (r8 == 0) goto L_0x0029
            if (r8 != r0) goto L_0x001d
            java.lang.Object r1 = r6.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            X.01I r0 = r1.A0h()
            if (r0 == 0) goto L_0x001d
            X.1JI r2 = r1.A2Z
            r1 = 2
            android.view.Window r0 = r0.getWindow()
            r2.A03(r0, r1)
        L_0x001d:
            java.lang.Object r0 = r6.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            X.3ZU r0 = r0.A2g
            if (r0 == 0) goto L_0x0028
            r0.A01()
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r2 = r6.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.01I r0 = r2.A0h()
            if (r0 == 0) goto L_0x003c
            X.1JI r1 = r2.A2Z
            android.view.Window r0 = r0.getWindow()
            r1.A02(r0)
        L_0x003c:
            boolean r0 = com.whatsapp.conversationslist.ConversationsFragment.A0Y(r2)
            if (r0 == 0) goto L_0x0028
            com.whatsapp.conversationslist.ConversationsFragment.A0G(r2)
            return
        L_0x0046:
            java.lang.Object r1 = r6.A00
            com.whatsapp.collections.observablelistview.ObservableListView r1 = (com.whatsapp.collections.observablelistview.ObservableListView) r1
            android.widget.AbsListView$OnScrollListener r0 = r1.A06
            if (r0 == 0) goto L_0x0051
            r0.onScrollStateChanged(r7, r8)
        L_0x0051:
            X.15S r4 = r1.A07
            if (r4 == 0) goto L_0x0028
            if (r8 != 0) goto L_0x0028
            int r2 = r1.A04
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            int r0 = r4.A01
            int r1 = -r0
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            if (r1 <= r0) goto L_0x00af
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            int r0 = r0.getHeight()
            if (r2 < r0) goto L_0x00af
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            int r1 = r0.getHeight()
            int r0 = r4.A03
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x00a6
            android.view.View r0 = r4.A0D
            float r0 = r0.getTranslationY()
            int r3 = -r1
            float r1 = (float) r3
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = r4.A0D
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r4.A0D
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r2 = r0.translationY(r1)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            r4.A01 = r3
        L_0x00a6:
            int r0 = r4.A03
            if (r0 != r5) goto L_0x0028
            r0 = 0
            com.whatsapp.HomeActivity.A16(r4, r0)
            return
        L_0x00af:
            com.whatsapp.HomeActivity.A0z(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36301k5.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
