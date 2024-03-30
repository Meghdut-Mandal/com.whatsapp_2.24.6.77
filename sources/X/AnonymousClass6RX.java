package X;

import android.text.InputFilter;

/* renamed from: X.6RX  reason: invalid class name */
public abstract class AnonymousClass6RX {
    public static final InputFilter[] A00 = new InputFilter[0];

    public static int A00(C1271967i r4, String str) {
        if (str.equals("text_no_suggestion")) {
            return 655361;
        }
        if (!str.equals("numbers_and_punctuation")) {
            try {
                return AnonymousClass6Y7.A07(str);
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r4, "WaRcFormInputComponentBinderUtils", "Error parsing text input type", e);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016d, code lost:
        if ((r8 & 128) == 128) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.view.View r10, X.C1271967i r11, X.C140456lc r12, java.lang.String r13) {
        /*
            r0 = 36
            r5 = 0
            boolean r9 = r12.A0f(r0, r5)
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.ViewGroup r6 = X.C36411kG.A0O(r10, r0)
            int r0 = r6.getChildCount()
            r2 = 0
            java.lang.String r4 = "WaRcFormInputComponentBinderUtils"
            if (r0 != 0) goto L_0x006a
            r0 = 52
            java.lang.Object r0 = X.C140456lc.A0I(r12, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0030
            float r0 = X.AnonymousClass6Y7.A02(r0)     // Catch:{ 5R5 -> 0x002a }
            java.lang.Float r8 = java.lang.Float.valueOf(r0)     // Catch:{ 5R5 -> 0x002a }
            goto L_0x0031
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "PAY: WaFormInputBinder/bindView cannot parse text size"
            X.AnonymousClass6RS.A00(r11, r4, r0, r1)
        L_0x0030:
            r8 = r2
        L_0x0031:
            android.content.Context r7 = r11.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131626545(0x7f0e0a31, float:1.888033E38)
            if (r9 == 0) goto L_0x003f
            r0 = 2131626546(0x7f0e0a32, float:1.8880331E38)
        L_0x003f:
            android.view.View r3 = r1.inflate(r0, r2, r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131626543(0x7f0e0a2f, float:1.8880325E38)
            if (r9 == 0) goto L_0x0051
            r0 = 2131626544(0x7f0e0a30, float:1.8880327E38)
        L_0x0051:
            android.view.View r1 = r1.inflate(r0, r2, r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r8 == 0) goto L_0x0060
            float r0 = r8.floatValue()
            r1.setTextSize(r0)
        L_0x0060:
            android.widget.LinearLayout$LayoutParams r0 = X.C36381kD.A0N()
            r3.addView(r1, r5, r0)
            r6.addView(r3)
        L_0x006a:
            r0 = 2131429449(0x7f0b0849, float:1.8480571E38)
            android.view.View r6 = X.C012005e.A02(r10, r0)
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            r0 = 2131434629(0x7f0b1c85, float:1.8491077E38)
            android.view.View r3 = X.C012005e.A02(r6, r0)
            android.widget.EditText r3 = (android.widget.EditText) r3
            if (r13 == 0) goto L_0x008b
            java.lang.String r0 = X.C36361kB.A0n(r3)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x008b
            r3.setText(r13)
        L_0x008b:
            r0 = 57
            java.lang.Object r1 = X.C140456lc.A0I(r12, r0)
            java.lang.String r1 = (java.lang.String) r1
            r7 = 1
            if (r1 != 0) goto L_0x00c5
            r6.setError(r2)
            r6.setErrorEnabled(r5)
            r0 = 2132083201(0x7f150201, float:1.9806538E38)
            r6.setErrorTextAppearance(r0)
            r0 = 2132083282(0x7f150252, float:1.9806702E38)
            if (r9 == 0) goto L_0x00aa
            r0 = 2132083283(0x7f150253, float:1.9806704E38)
        L_0x00aa:
            r6.setHintTextAppearance(r0)
            r0 = 43
            java.lang.Object r0 = X.C140456lc.A0I(r12, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00ba
            r6.setHint((java.lang.CharSequence) r0)
        L_0x00ba:
            r0 = 51
            java.lang.Object r0 = X.C140456lc.A0I(r12, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00fd
            goto L_0x00ef
        L_0x00c5:
            r6.setErrorEnabled(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = " "
        L_0x00d0:
            r6.setError(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00e6
            int r0 = r6.getChildCount()
            if (r0 <= r7) goto L_0x00e6
            android.view.View r0 = r6.getChildAt(r7)
            X.C36341k9.A0y(r0)
        L_0x00e6:
            r0 = 2132083201(0x7f150201, float:1.9806538E38)
            r6.setErrorTextAppearance(r0)
            goto L_0x00aa
        L_0x00ed:
            r0 = r1
            goto L_0x00d0
        L_0x00ef:
            int r0 = X.AnonymousClass6Y7.A06(r0)     // Catch:{ 5R5 -> 0x00f7 }
            r3.setGravity(r0)     // Catch:{ 5R5 -> 0x00f7 }
            goto L_0x00fd
        L_0x00f7:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.AnonymousClass6RS.A00(r11, r4, r0, r1)
        L_0x00fd:
            java.lang.String r0 = X.C140456lc.A0O(r12)
            if (r0 == 0) goto L_0x010a
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r3.setTypeface(r0)
        L_0x010a:
            r0 = 59
            java.lang.Object r1 = X.C140456lc.A0I(r12, r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 53
            java.lang.Object r0 = X.C140456lc.A0I(r12, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0150
            int r0 = A00(r11, r1)
            if (r0 == 0) goto L_0x0125
            r3.setInputType(r0)
        L_0x0125:
            r0 = 35
            boolean r0 = r12.A0f(r0, r5)
            r0 = r0 ^ 1
            r3.setSingleLine(r0)
            r0 = 40
            boolean r0 = r12.A0f(r0, r5)
            if (r0 == 0) goto L_0x013b
            r6.setPasswordVisibilityToggleEnabled(r7)
        L_0x013b:
            r0 = 38
            boolean r0 = r12.A0f(r0, r5)
            if (r0 == 0) goto L_0x014b
            android.text.method.PasswordTransformationMethod r0 = new android.text.method.PasswordTransformationMethod
            r0.<init>()
            r3.setTransformationMethod(r0)
        L_0x014b:
            android.util.Pair r0 = X.C36441kJ.A0Q(r6, r3)
            return r0
        L_0x0150:
            if (r0 == 0) goto L_0x0125
            int r8 = X.AnonymousClass6Y7.A07(r0)     // Catch:{ 5R5 -> 0x0178 }
            r1 = 32
            r0 = r8 & 32
            if (r0 == r1) goto L_0x016f
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x016f
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x016f
            r1 = 128(0x80, float:1.794E-43)
            r0 = r8 & r1
            r2 = 0
            if (r0 != r1) goto L_0x0170
        L_0x016f:
            r2 = 1
        L_0x0170:
            if (r2 != 0) goto L_0x0174
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0174:
            r3.setInputType(r8)     // Catch:{ 5R5 -> 0x0178 }
            goto L_0x0125
        L_0x0178:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.AnonymousClass6RS.A00(r11, r4, r0, r1)
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RX.A01(android.view.View, X.67i, X.6lc, java.lang.String):android.util.Pair");
    }
}
