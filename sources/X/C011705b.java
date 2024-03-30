package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.05b  reason: invalid class name and case insensitive filesystem */
public class C011705b {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public void A0d(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0f(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean A0g(View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0k(View view, C07650Ys r4) {
        this.A01.onInitializeAccessibilityNodeInfo(view, r4.A02);
    }

    public AnonymousClass0X7 A0l(View view) {
        AccessibilityNodeProvider A002 = A00(this.A01, view);
        if (A002 != null) {
            return new AnonymousClass0X7(A002);
        }
        return null;
    }

    public C011705b(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new C011905d(this);
    }

    public static AccessibilityNodeProvider A00(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public static boolean A01(Bundle bundle, View.AccessibilityDelegate accessibilityDelegate, View view, int i) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0j(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131434556(0x7f0b1c3c, float:1.849093E38)
            java.lang.Object r3 = r7.getTag(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x000f
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x000f:
            r2 = 0
        L_0x0010:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x006a
            java.lang.Object r1 = r3.get(r2)
            X.0Yd r1 = (X.AnonymousClass0Yd) r1
            java.lang.Object r0 = r1.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            int r0 = r0.getId()
            if (r0 != r8) goto L_0x0031
            X.0px r5 = r1.A01
            r3 = 0
            if (r5 == 0) goto L_0x006a
            r4 = 0
            java.lang.Class r2 = r1.A02
            if (r2 == 0) goto L_0x0064
            goto L_0x0034
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0049 }
            X.0SM r0 = (X.AnonymousClass0SM) r0     // Catch:{ Exception -> 0x0049 }
            r0.A00 = r9     // Catch:{ Exception -> 0x0046 }
            r4 = r0
            goto L_0x0064
        L_0x0046:
            r3 = move-exception
            r4 = r0
            goto L_0x004a
        L_0x0049:
            r3 = move-exception
        L_0x004a:
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to execute command with argument class ViewCommandArgument: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "A11yActionCompat"
            android.util.Log.e(r0, r1, r3)
        L_0x0064:
            boolean r1 = r5.BlR(r7, r4)
            if (r1 != 0) goto L_0x00c9
        L_0x006a:
            android.view.View$AccessibilityDelegate r0 = r6.A01
            boolean r1 = A01(r9, r0, r7, r8)
            if (r1 != 0) goto L_0x00c9
            r0 = 2131427376(0x7f0b0030, float:1.8476366E38)
            if (r8 != r0) goto L_0x00c9
            if (r9 == 0) goto L_0x00c9
            r1 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r9.getInt(r0, r1)
            r0 = 2131434557(0x7f0b1c3d, float:1.8490931E38)
            java.lang.Object r0 = r7.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r4 = r0.get()
            android.text.style.ClickableSpan r4 = (android.text.style.ClickableSpan) r4
            r3 = 0
            if (r4 == 0) goto L_0x00cd
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00cd
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r3, r1, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            r1 = 0
            if (r2 == 0) goto L_0x00cd
        L_0x00ba:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x00cd
            r0 = r2[r1]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r4.onClick(r7)
            r1 = 1
        L_0x00c9:
            return r1
        L_0x00ca:
            int r1 = r1 + 1
            goto L_0x00ba
        L_0x00cd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011705b.A0j(android.view.View, int, android.os.Bundle):boolean");
    }

    public C011705b() {
        this(A02);
    }
}
