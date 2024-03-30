package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.4kA  reason: invalid class name and case insensitive filesystem */
public class C95174kA extends C011705b {
    public final TextInputLayout A00;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e8, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(android.view.View r16, X.C07650Ys r17) {
        /*
            r15 = this;
            r1 = r17
            r0 = r16
            super.A0k(r0, r1)
            com.google.android.material.textfield.TextInputLayout r3 = r15.A00
            android.widget.EditText r0 = r3.A0B
            if (r0 == 0) goto L_0x00f6
            android.text.Editable r6 = r0.getText()
        L_0x0011:
            java.lang.CharSequence r8 = r3.getHint()
            java.lang.CharSequence r5 = r3.getError()
            java.lang.CharSequence r2 = r3.getPlaceholderText()
            int r4 = r3.A07
            java.lang.CharSequence r14 = r3.getCounterOverflowDescription()
            boolean r13 = X.C36421kH.A1a(r6)
            boolean r7 = X.C36421kH.A1a(r8)
            boolean r0 = r3.A0P
            r12 = r0 ^ 1
            boolean r11 = X.C36421kH.A1a(r5)
            if (r11 != 0) goto L_0x003c
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r10 = 0
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r10 = 1
        L_0x003d:
            if (r7 == 0) goto L_0x00f2
            java.lang.String r7 = r8.toString()
        L_0x0043:
            X.4fL r9 = r3.A17
            android.widget.TextView r8 = r9.A07
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L_0x00eb
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.A02
            r0.setLabelFor(r8)
            r1.A07(r8)
        L_0x0055:
            java.lang.String r8 = ", "
            if (r13 == 0) goto L_0x00ca
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.A02
            r0.setText(r6)
        L_0x005e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0072
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x00ba
            r1.A0E(r7)
        L_0x006d:
            r0 = r13 ^ 1
            r1.A0P(r0)
        L_0x0072:
            if (r6 == 0) goto L_0x00b8
            int r0 = r6.length()
            if (r0 != r4) goto L_0x00b8
        L_0x007a:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.A02
            r2.setMaxTextLength(r4)
            if (r10 == 0) goto L_0x0087
            if (r11 != 0) goto L_0x0084
            r5 = r14
        L_0x0084:
            r2.setError(r5)
        L_0x0087:
            X.6VJ r0 = r3.A16
            android.widget.TextView r0 = r0.A0B
            if (r0 == 0) goto L_0x0090
            r2.setLabelFor(r0)
        L_0x0090:
            X.4fP r0 = r3.A15
            X.6Fq r2 = r0.A03()
            boolean r0 = r2 instanceof X.C99384tC
            if (r0 == 0) goto L_0x00b7
            X.4tC r2 = (X.C99384tC) r2
            android.widget.AutoCompleteTextView r0 = r2.A04
            int r0 = r0.getInputType()
            if (r0 != 0) goto L_0x00ad
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r0 = r0.getName()
            r1.A0C(r0)
        L_0x00ad:
            boolean r0 = r1.A0Q()
            if (r0 == 0) goto L_0x00b7
            r0 = 0
            r1.A0E(r0)
        L_0x00b7:
            return
        L_0x00b8:
            r4 = -1
            goto L_0x007a
        L_0x00ba:
            if (r13 == 0) goto L_0x00c4
            java.lang.StringBuilder r0 = X.C36381kD.A11(r6)
            java.lang.String r7 = X.AnonymousClass000.A0p(r8, r7, r0)
        L_0x00c4:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.A02
            r0.setText(r7)
            goto L_0x006d
        L_0x00ca:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00e8
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.A02
            r0.setText(r7)
            if (r12 == 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r7, r8)
            java.lang.String r2 = X.AnonymousClass000.A0o(r2, r0)
        L_0x00e1:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.A02
            r0.setText(r2)
            goto L_0x005e
        L_0x00e8:
            if (r2 == 0) goto L_0x005e
            goto L_0x00e1
        L_0x00eb:
            com.google.android.material.internal.CheckableImageButton r0 = r9.A08
            r1.A07(r0)
            goto L_0x0055
        L_0x00f2:
            java.lang.String r7 = ""
            goto L_0x0043
        L_0x00f6:
            r6 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95174kA.A0k(android.view.View, X.0Ys):void");
    }

    public C95174kA(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        super.A0e(view, accessibilityEvent);
        C129176Fq A03 = this.A00.A15.A03();
        if (A03 instanceof C99384tC) {
            C99384tC r2 = (C99384tC) A03;
            if (accessibilityEvent.getEventType() == 1 && r2.A03.isEnabled() && r2.A04.getInputType() == 0) {
                C99384tC.A00(r2);
                r2.A05 = true;
                r2.A00 = System.currentTimeMillis();
            }
        }
    }
}
