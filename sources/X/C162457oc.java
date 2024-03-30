package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import com.whatsapp.R;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.7oc  reason: invalid class name and case insensitive filesystem */
public class C162457oc extends C011705b {
    public Object A00;
    public final int A01;

    public C162457oc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A01) {
            case 3:
                if (accessibilityEvent.getEventType() == 2048) {
                    return;
                }
                break;
            case 6:
                if (accessibilityEvent.getEventType() == 32768) {
                    C93124fp r1 = (C93124fp) this.A00;
                    if (r1.getContext() != null && view.getTag() != null) {
                        C33521fV.A00(r1.getContext(), r1.A07, C36391kE.A0v(r1.getContext(), AnonymousClass3UY.A0A(r1.A08, C36431kI.A09(view.getTag())), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.A0i(view, accessibilityEvent);
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A00;
                if (C90504aG.A1V(tokenizedSearchInput.A0B) && accessibilityEvent.getEventType() == 1) {
                    TokenizedSearchInput.A00(view, tokenizedSearchInput);
                    return;
                }
                return;
        }
        super.A0i(view, accessibilityEvent);
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        switch (this.A01) {
            case 0:
                return ((C97104oR) this.A00).A01.A0j(view, i, bundle);
            case 1:
                if (i == 1048576) {
                    C90704aa r1 = (C90704aa) this.A00;
                    if (r1.A0A) {
                        r1.A04(C023109s.A0G);
                        return true;
                    }
                }
                break;
            case 2:
                if (i == 16) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ClockFaceView clockFaceView = (ClockFaceView) this.A00;
                    Rect rect = clockFaceView.A07;
                    view.getHitRect(rect);
                    float centerX = (float) rect.centerX();
                    float centerY = (float) rect.centerY();
                    ClockHandView clockHandView = clockFaceView.A0B;
                    long j = uptimeMillis;
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, centerX, centerY, 0));
                    return true;
                }
                break;
        }
        return super.A0j(view, i, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cc, code lost:
        r9.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x011a, code lost:
        r9.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        r2 = new X.AnonymousClass0Yd(16, (java.lang.CharSequence) r1.getString(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(android.view.View r8, X.C07650Ys r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x011e;
                case 2: goto L_0x0047;
                case 3: goto L_0x0005;
                case 4: goto L_0x0027;
                case 5: goto L_0x0027;
                case 6: goto L_0x0115;
                case 7: goto L_0x0018;
                case 8: goto L_0x0082;
                case 9: goto L_0x00f1;
                case 10: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0k(r8, r9)
        L_0x0008:
            return
        L_0x0009:
            super.A0k(r8, r9)
            X.0Yd r0 = X.AnonymousClass0Yd.A04
            java.lang.Object r0 = r7.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            X.01I r1 = r0.A0c
            r0 = 2131895859(0x7f122633, float:1.9426563E38)
            goto L_0x003a
        L_0x0018:
            super.A0k(r8, r9)
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131886158(0x7f12004e, float:1.9406887E38)
            goto L_0x003a
        L_0x0027:
            X.C36321k7.A0w(r8, r9)
            super.A0k(r8, r9)
            X.0Yd r0 = X.AnonymousClass0Yd.A04
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888369(0x7f1208f1, float:1.9411371E38)
        L_0x003a:
            java.lang.String r1 = r1.getString(r0)
            r0 = 16
            X.0Yd r2 = new X.0Yd
            r2.<init>((int) r0, (java.lang.CharSequence) r1)
            goto L_0x00cc
        L_0x0047:
            super.A0k(r8, r9)
            r0 = 2131431450(0x7f0b101a, float:1.848463E38)
            java.lang.Object r0 = r8.getTag(r0)
            int r3 = X.AnonymousClass000.A0I(r0)
            if (r3 <= 0) goto L_0x0068
            java.lang.Object r0 = r7.A00
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            android.util.SparseArray r1 = r0.A09
            int r0 = r3 + -1
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            r9.A07(r0)
        L_0x0068:
            r2 = 1
            boolean r6 = r8.isSelected()
            r1 = 0
            r4 = 1
            r5 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            X.0SL r0 = new X.0SL
            r0.<init>(r1)
            r9.A0K(r0)
            r9.A0L(r2)
            X.0Yd r2 = X.AnonymousClass0Yd.A08
            goto L_0x00cc
        L_0x0082:
            super.A0k(r8, r9)
            java.lang.Object r2 = r7.A00
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            X.0yb r0 = r2.A0B
            boolean r0 = X.C90504aG.A1V(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x00a5
            android.content.Context r1 = r2.getContext()
            r0 = 2131886226(0x7f120092, float:1.9407025E38)
            java.lang.String r0 = r1.getString(r0)
            r9.A0G(r0)
        L_0x00a5:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r9.A0C(r0)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A02
            r0.setCheckable(r1)
            r0 = 1
            r9.A0L(r0)
            X.0Yd r0 = X.AnonymousClass0Yd.A04
            r3 = 16
            android.content.Context r1 = r2.getContext()
            r0 = 2131886159(0x7f12004f, float:1.9406889E38)
            java.lang.String r0 = r1.getString(r0)
            X.0Yd r2 = new X.0Yd
            r2.<init>((int) r3, (java.lang.CharSequence) r0)
        L_0x00cc:
            r9.A0A(r2)
            return
        L_0x00d0:
            java.lang.Object r1 = r7.A00
            X.4oR r1 = (X.C97104oR) r1
            X.05b r0 = r1.A01
            r0.A0k(r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A02
            int r2 = androidx.recyclerview.widget.RecyclerView.A00(r8)
            X.0CZ r1 = r0.A0G
            boolean r0 = r1 instanceof X.C168137zl
            if (r0 == 0) goto L_0x0008
            X.7zl r1 = (X.C168137zl) r1
            androidx.preference.Preference r0 = r1.A0L(r2)
            if (r0 == 0) goto L_0x0008
            r0.A0E(r9)
            return
        L_0x00f1:
            r2 = 0
            X.C36331k8.A1I(r8, r9)
            super.A0k(r8, r9)
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            r9.A0L(r2)
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A02
            r0.setLongClickable(r2)
            X.0Yd r0 = X.AnonymousClass0Yd.A08
            r9.A0B(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131894533(0x7f122105, float:1.9423873E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x011a
        L_0x0115:
            super.A0k(r8, r9)
            java.lang.String r0 = ""
        L_0x011a:
            r9.A0D(r0)
            return
        L_0x011e:
            super.A0k(r8, r9)
            java.lang.Object r0 = r7.A00
            X.4aa r0 = (X.C90704aa) r0
            boolean r0 = r0.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0132
            r1 = 1048576(0x100000, float:1.469368E-39)
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A02
            r0.addAction(r1)
            r1 = 1
        L_0x0132:
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.A02
            r0.setDismissable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162457oc.A0k(android.view.View, X.0Ys):void");
    }
}
