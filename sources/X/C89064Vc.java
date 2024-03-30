package X;

import android.view.View;

/* renamed from: X.4Vc  reason: invalid class name and case insensitive filesystem */
public class C89064Vc extends C011705b {
    public Object A00;
    public final int A01;

    public C89064Vc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0d(View view, int i) {
        if (13 - this.A01 != 0 || i != 4) {
            super.A0d(view, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0 = (X.AnonymousClass2gA) r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 9: goto L_0x0009;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0i(r3, r4)
        L_0x0008:
            return
        L_0x0009:
            super.A0i(r3, r4)
            java.lang.Object r0 = r2.A00
            X.3fk r0 = (X.C70803fk) r0
            X.4V6 r0 = r0.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0008
            r0 = -1
            r4.setFromIndex(r0)
            r4.setToIndex(r0)
            r4.setItemCount(r0)
            return
        L_0x0027:
            super.A0i(r3, r4)
            int r1 = r4.getEventType()
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r0) goto L_0x0008
            java.lang.Object r0 = r2.A00
            X.2gA r0 = (X.AnonymousClass2gA) r0
            java.lang.Runnable r1 = r0.A01
            if (r1 == 0) goto L_0x0008
            android.widget.TextView r0 = r0.A04
            r0.removeCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89064Vc.A0i(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r1 = new X.AnonymousClass0Yd(16, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f2, code lost:
        r7.A0A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0135, code lost:
        r0 = X.AnonymousClass0Yd.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0137, code lost:
        r7.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(android.view.View r6, X.C07650Ys r7) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00d4;
                case 2: goto L_0x0124;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00b7;
                case 6: goto L_0x0112;
                case 7: goto L_0x0093;
                case 8: goto L_0x0040;
                case 9: goto L_0x0005;
                case 10: goto L_0x0086;
                case 11: goto L_0x0077;
                case 12: goto L_0x0005;
                case 13: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0k(r6, r7)
        L_0x0008:
            return
        L_0x0009:
            super.A0k(r6, r7)
            r1 = 0
            r7.A0L(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setSelected(r1)
            java.util.List r0 = r7.A06()
            java.util.Iterator r4 = r0.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r3 = r4.next()
            X.0Yd r3 = (X.AnonymousClass0Yd) r3
            java.lang.Object r2 = r3.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            int r1 = r2.getId()
            r0 = 16
            if (r1 == r0) goto L_0x003c
            int r1 = r2.getId()
            r0 = 4
            if (r1 != r0) goto L_0x001d
        L_0x003c:
            r7.A0B(r3)
            goto L_0x001d
        L_0x0040:
            super.A0k(r6, r7)
            r0 = 0
            r7.A0L(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            boolean r0 = r0.isLongClickable()
            if (r0 == 0) goto L_0x0008
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            r2 = 32
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131886166(0x7f120056, float:1.9406903E38)
            java.lang.String r1 = r1.getString(r0)
            X.0Yd r0 = new X.0Yd
            r0.<init>((int) r2, (java.lang.CharSequence) r1)
            r7.A0A(r0)
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.hasOnClickListeners()
            r7.A0L(r0)
            if (r0 != 0) goto L_0x0008
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            goto L_0x0137
        L_0x0077:
            super.A0k(r6, r7)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131893993(0x7f121ee9, float:1.9422778E38)
            java.lang.CharSequence r2 = r1.getText(r0)
            goto L_0x00eb
        L_0x0086:
            super.A0k(r6, r7)
            r0 = 0
            r7.A0M(r0)
            java.lang.String r0 = "Button"
            r7.A0G(r0)
            return
        L_0x0093:
            super.A0k(r6, r7)
            r1 = 0
            r7.A0L(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setLongClickable(r1)
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            r7.A0B(r0)
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131893376(0x7f121c80, float:1.9421527E38)
            java.lang.String r0 = r1.getString(r0)
            r7.A0D(r0)
            return
        L_0x00b7:
            super.A0k(r6, r7)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setLongClickable(r1)
            X.0Yd r0 = X.AnonymousClass0Yd.A0L
            r7.A0B(r0)
            r0 = 1
            r7.A0L(r0)
            X.0Yd r1 = X.AnonymousClass0Yd.A08
            goto L_0x00f2
        L_0x00cc:
            super.A0k(r6, r7)
            r0 = 1
            r7.A0M(r0)
            return
        L_0x00d4:
            X.C36321k7.A0w(r6, r7)
            super.A0k(r6, r7)
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888369(0x7f1208f1, float:1.9411371E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x00eb:
            r0 = 16
            X.0Yd r1 = new X.0Yd
            r1.<init>((int) r0, (java.lang.CharSequence) r2)
        L_0x00f2:
            r7.A0A(r1)
            return
        L_0x00f6:
            super.A0k(r6, r7)
            java.lang.Object r0 = r5.A00
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            java.util.ArrayList r0 = r0.A0h
            int r2 = r0.size()
            r1 = 1
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r0)
            X.0SK r0 = new X.0SK
            r0.<init>(r1)
            r7.A0J(r0)
            return
        L_0x0112:
            super.A0k(r6, r7)
            r1 = 0
            r7.A0L(r1)
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            r7.A0B(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setLongClickable(r1)
            goto L_0x0135
        L_0x0124:
            super.A0k(r6, r7)
            r1 = 0
            r7.A0L(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setLongClickable(r1)
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            r7.A0B(r0)
        L_0x0135:
            X.0Yd r0 = X.AnonymousClass0Yd.A0L
        L_0x0137:
            r7.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89064Vc.A0k(android.view.View, X.0Ys):void");
    }
}
