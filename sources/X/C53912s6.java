package X;

import android.view.View;

/* renamed from: X.2s6  reason: invalid class name and case insensitive filesystem */
public class C53912s6 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public C53912s6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnTouchListener(new C53912s6(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013a, code lost:
        if (r5.A0E.A00 == 1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0148, code lost:
        if (r5.A0a.A0C(r1) != false) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 1: goto L_0x0195;
                case 2: goto L_0x0231;
                case 3: goto L_0x011f;
                case 4: goto L_0x0162;
                case 5: goto L_0x0063;
                case 6: goto L_0x0005;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01d5;
                case 9: goto L_0x01b5;
                case 10: goto L_0x01ce;
                case 11: goto L_0x01be;
                case 12: goto L_0x0032;
                case 13: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r13.A00
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r1 = r15.getX()
            float r0 = r15.getY()
            r2.set(r1, r0)
        L_0x0014:
            r0 = 0
            return r0
        L_0x0016:
            java.lang.Object r0 = r13.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            com.whatsapp.text.ReadMoreTextView r2 = r0.A0q
            boolean r0 = r2.A05
            r1 = 0
            if (r0 == 0) goto L_0x0014
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0014
            boolean r0 = r2.A0K()
            if (r0 == 0) goto L_0x0014
            r2.setExpanded(r1)
            goto L_0x0241
        L_0x0032:
            java.lang.Object r3 = r13.A00
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = (com.whatsapp.status.playback.StatusPlaybackActivity) r3
            int r0 = r15.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r2 == r1) goto L_0x0042
            r0 = 3
            if (r2 != r0) goto L_0x0014
        L_0x0042:
            int r0 = r15.getPointerCount()
            if (r0 != r1) goto L_0x0014
            androidx.viewpager.widget.ViewPager r0 = r3.A08
            int r0 = r0.getCurrentItem()
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r3.A3i(r0)
            if (r2 == 0) goto L_0x0014
            r1 = r2
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.A0r
            if (r0 != 0) goto L_0x0014
            r2.A1a()
            goto L_0x0014
        L_0x0063:
            java.lang.Object r3 = r13.A00
            X.22t r3 = (X.AnonymousClass22t) r3
            int r1 = r15.getActionMasked()
            r0 = 2
            if (r1 == r0) goto L_0x009f
            int r1 = r15.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x009f
            android.graphics.Point r2 = X.C36361kB.A0A(r15, r14)
            com.whatsapp.WaEditText r1 = r3.A0L
            if (r1 == 0) goto L_0x0094
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0094
            boolean r0 = X.C38871qM.A02(r2, r1)
            if (r0 == 0) goto L_0x0094
            boolean r0 = r1.A0D(r2)
            if (r0 == 0) goto L_0x0094
            r3.A0B(r1)
            goto L_0x0241
        L_0x0094:
            float r1 = r15.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009f
            goto L_0x0241
        L_0x009f:
            X.3Tz r1 = r3.A07
            X.1qK r0 = r1.A04
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0014
            X.1qK r4 = r1.A04
            float r0 = r15.getX()
            int r10 = (int) r0
            float r0 = r15.getY()
            int r9 = (int) r0
            android.view.View r8 = r4.getContentView()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int[] r7 = r4.A01
            r14.getLocationOnScreen(r7)
            r6 = 0
            r0 = r7[r6]
            int r10 = r10 + r0
            r5 = 1
            r0 = r7[r5]
            int r9 = r9 + r0
            int r11 = r8.getChildCount()
            android.view.View r3 = r4.A00
            r0 = 0
            r4.A00 = r0
            r2 = 0
        L_0x00d4:
            if (r2 >= r11) goto L_0x011d
            android.view.View r1 = r8.getChildAt(r2)
            r1.getLocationOnScreen(r7)
            r12 = r7[r6]
            if (r10 <= r12) goto L_0x011a
            int r0 = r1.getWidth()
            int r12 = r12 + r0
            if (r10 >= r12) goto L_0x011a
            r0 = r7[r5]
            if (r9 <= r0) goto L_0x011a
            int r0 = X.C36431kI.A04(r1, r0)
            if (r9 >= r0) goto L_0x011a
            r1.setPressed(r5)
            r4.A00 = r1
        L_0x00f7:
            if (r3 == 0) goto L_0x0100
            android.view.View r0 = r4.A00
            if (r3 == r0) goto L_0x0100
            r3.setPressed(r6)
        L_0x0100:
            int r0 = r15.getAction()
            if (r0 != r5) goto L_0x0014
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0014
            int[][] r0 = r4.A04
            r1 = r0[r2]
            X.4QU r0 = r4.A03
            if (r0 == 0) goto L_0x0115
            r0.Bgo(r1)
        L_0x0115:
            r4.dismiss()
            goto L_0x0014
        L_0x011a:
            int r2 = r2 + 1
            goto L_0x00d4
        L_0x011d:
            r2 = 0
            goto L_0x00f7
        L_0x011f:
            java.lang.Object r5 = r13.A00
            com.whatsapp.community.CommunityHomeActivity r5 = (com.whatsapp.community.CommunityHomeActivity) r5
            X.4fQ r14 = (X.C93024fQ) r14
            X.6DR r0 = r14.A07
            if (r0 == 0) goto L_0x0160
            int r2 = r0.A00
        L_0x012b:
            int r1 = r15.getAction()
            r0 = 1
            if (r1 != 0) goto L_0x013c
            if (r2 != r0) goto L_0x013c
            androidx.viewpager2.widget.ViewPager2 r0 = r5.A0E
            int r1 = r0.A00
            r0 = 1
            r2 = 1
            if (r1 != r0) goto L_0x013d
        L_0x013c:
            r2 = 0
        L_0x013d:
            X.147 r1 = r5.A0k
            if (r1 == 0) goto L_0x014a
            X.17X r0 = r5.A0a
            boolean r1 = r0.A0C(r1)
            r0 = 1
            if (r1 == 0) goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            if (r2 == 0) goto L_0x0014
            if (r0 == 0) goto L_0x0014
            X.1Sq r4 = r5.A0R
            r0 = 0
            X.4Wu r3 = new X.4Wu
            r3.<init>(r5, r0)
            X.147 r2 = r5.A0k
            r1 = 3
            r0 = 0
            r4.Bl4(r2, r3, r0, r1)
            goto L_0x0241
        L_0x0160:
            r2 = -1
            goto L_0x012b
        L_0x0162:
            java.lang.Object r5 = r13.A00
            X.3FA r5 = (X.AnonymousClass3FA) r5
            r2 = 0
            int r0 = X.C36361kB.A04(r5, r15, r2)
            int[] r1 = new int[r0]
            android.view.View r4 = r5.A06
            r4.getLocationOnScreen(r1)
            r3 = r1[r2]
            r0 = 1
            r2 = r1[r0]
            int r1 = r4.getWidth()
            int r1 = r1 + r3
            float r0 = r15.getX()
            int r0 = (int) r0
            if (r3 > r0) goto L_0x0229
            if (r0 > r1) goto L_0x0229
            int r1 = r4.getHeight()
            int r1 = r1 + r2
            float r0 = r15.getY()
            int r0 = (int) r0
            if (r2 > r0) goto L_0x0229
            if (r0 > r1) goto L_0x0229
            goto L_0x0014
        L_0x0195:
            java.lang.Object r1 = r13.A00
            X.2DY r1 = (X.AnonymousClass2DY) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            int r0 = r15.getActionMasked()
            if (r0 != 0) goto L_0x0014
            X.4Nk r0 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r0 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r0
            X.0I4 r0 = r0.A00
            if (r0 != 0) goto L_0x01b0
            java.lang.String r0 = "favoriteListItemTouchHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b0:
            r0.A0A(r1)
            goto L_0x0014
        L_0x01b5:
            java.lang.Object r0 = r13.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            boolean r0 = com.whatsapp.notification.PopupNotification.A0O(r0)
            return r0
        L_0x01be:
            java.lang.Object r2 = r13.A00
            com.whatsapp.quickcontact.QuickContactActivity r2 = (com.whatsapp.quickcontact.QuickContactActivity) r2
            com.whatsapp.util.FloatingChildLayout r0 = r2.A0p
            int r1 = r0.A03
            r0 = 2
            if (r1 != r0) goto L_0x0241
            r0 = 1
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r2, r0)
            goto L_0x0241
        L_0x01ce:
            java.lang.Object r0 = r13.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            X.6cV r1 = r0.A03
            goto L_0x0237
        L_0x01d5:
            java.lang.Object r1 = r13.A00
            X.3AZ r1 = (X.AnonymousClass3AZ) r1
            r0 = 0
            X.C36331k8.A1I(r1, r14)
            r14.performClick()
            r1.A00 = r0
            android.widget.PopupWindow r1 = r1.A03
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0241
            r1.dismiss()
            goto L_0x0241
        L_0x01ee:
            java.lang.Object r3 = r13.A00
            X.1qJ r3 = (X.C38841qJ) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            android.graphics.Rect r2 = X.AnonymousClass001.A06()
            android.view.View r0 = r3.getContentView()
            r0.getGlobalVisibleRect(r2)
            float r0 = r15.getX()
            int r1 = (int) r0
            float r0 = r15.getY()
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x021a
            android.view.View r0 = r3.getContentView()
            r0.onTouchEvent(r15)
            goto L_0x0241
        L_0x021a:
            int r0 = r15.getAction()
            if (r0 != r1) goto L_0x0241
            java.lang.Runnable r0 = r3.A01
            r0.run()
            r3.dismiss()
            goto L_0x0241
        L_0x0229:
            X.0cQ r0 = r5.A00
            if (r0 == 0) goto L_0x0241
            r0.dismiss()
            goto L_0x0241
        L_0x0231:
            java.lang.Object r0 = r13.A00
            X.6YT r0 = (X.AnonymousClass6YT) r0
            X.6cV r1 = r0.A0B
        L_0x0237:
            X.0Th r0 = r1.A03
            r0.A00(r15)
            android.view.ScaleGestureDetector r0 = r1.A02
            r0.onTouchEvent(r15)
        L_0x0241:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53912s6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
