package X;

import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.6XF  reason: invalid class name */
public abstract class AnonymousClass6XF {
    public static final InputFilter[] A00 = new InputFilter[0];

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0205, code lost:
        if (r0 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C125115zL A00(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r12, X.C118625oT r13, X.C1271967i r14, X.C140456lc r15, java.lang.Object r16) {
        /*
            r10 = r14
            r11 = r15
            java.lang.Object r9 = X.C133266Xn.A04(r14, r15)
            X.5zL r9 = (X.C125115zL) r9
            r1 = r16
            r5 = r1
            X.5o7 r5 = (X.AnonymousClass5o7) r5
            java.lang.Object r0 = r9.A0E
            if (r0 == r1) goto L_0x0017
            int r0 = r5.A00
            r9.A02 = r0
            r9.A0E = r1
        L_0x0017:
            r8 = r12
            r9.A0L = r12
            float r0 = r12.getTextSize()
            r9.A00 = r0
            android.text.TextUtils$TruncateAt r0 = r12.getEllipsize()
            r9.A09 = r0
            android.os.Parcelable r0 = r9.A08
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r12.onRestoreInstanceState(r0)
            r9.A08 = r2
        L_0x0030:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x003a
            int r0 = r12.getInputType()
            r9.A01 = r0
        L_0x003a:
            android.graphics.Rect r6 = r9.A05
            int r4 = r12.getPaddingLeft()
            int r3 = r12.getPaddingTop()
            int r1 = r12.getPaddingRight()
            int r0 = r12.getPaddingBottom()
            r6.set(r4, r3, r1, r0)
            android.text.method.KeyListener r0 = r9.A0K
            if (r0 != 0) goto L_0x0059
            android.text.method.KeyListener r0 = r12.getKeyListener()
            r9.A0K = r0
        L_0x0059:
            android.text.method.KeyListener r1 = r12.getKeyListener()
            android.text.Editable r0 = r9.A0J
            java.lang.String r12 = r0.toString()
            android.graphics.Typeface r7 = r5.A01
            A02(r7, r8, r9, r10, r11, r12)
            android.text.method.KeyListener r0 = r8.getKeyListener()
            r4 = 0
            r6 = 1
            boolean r7 = X.C36371kC.A1W(r1, r0)
            int r1 = r9.A0I
            r3 = -1
            if (r1 != r3) goto L_0x025a
            android.text.Editable r0 = r8.getText()
            if (r0 == 0) goto L_0x0084
            int r0 = X.C36381kD.A06(r8)
            r8.setSelection(r0)
        L_0x0084:
            r0 = 74
            boolean r5 = r15.A0f(r0, r6)
            r0 = 83
            java.lang.Object r0 = X.C140456lc.A0I(r15, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r5 == 0) goto L_0x0250
            if (r0 == 0) goto L_0x023e
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r0)
            android.text.method.KeyListener r0 = r8.getKeyListener()
            if (r0 == r1) goto L_0x00a3
            r8.setKeyListener(r1)
        L_0x00a3:
            r9.A0O = r6
        L_0x00a5:
            boolean r0 = r8.isEnabled()
            if (r5 == r0) goto L_0x00ae
            r8.setEnabled(r5)
        L_0x00ae:
            boolean r6 = X.AnonymousClass6X8.A06(r8)
            if (r6 == 0) goto L_0x00b9
            android.text.TextUtils$TruncateAt r0 = r9.A0A
            X.AnonymousClass6X8.A00(r0, r8, r9)
        L_0x00b9:
            r0 = 84
            boolean r0 = r15.A0f(r0, r4)
            if (r0 == 0) goto L_0x00cc
            r8.setShowSoftInputOnFocus(r4)
            X.6d2 r0 = new X.6d2
            r0.<init>()
            r8.setOnKeyListener(r0)
        L_0x00cc:
            X.6cJ r0 = r9.A0M
            if (r0 != 0) goto L_0x00d7
            X.6cJ r0 = new X.6cJ
            r0.<init>(r13, r14, r15)
            r9.A0M = r0
        L_0x00d7:
            X.7bz r0 = r9.A0D
            if (r0 != 0) goto L_0x00e2
            X.6jG r0 = new X.6jG
            r0.<init>(r14, r15)
            r9.A0D = r0
        L_0x00e2:
            r8.A00 = r0
            X.6cJ r0 = r9.A0M
            r8.removeTextChangedListener(r0)
            X.6cJ r0 = r9.A0M
            r8.addTextChangedListener(r0)
            java.lang.String r0 = X.C140456lc.A0N(r15)
            if (r0 == 0) goto L_0x010f
            android.text.TextWatcher r1 = r9.A0B
            if (r1 != 0) goto L_0x00ff
            X.6cM r1 = new X.6cM
            r1.<init>(r8, r0)
            r9.A0B = r1
        L_0x00ff:
            X.6cJ r0 = r9.A0M
            java.util.List r0 = r0.A01
            r0.remove(r1)
            X.6cJ r0 = r9.A0M
            android.text.TextWatcher r1 = r9.A0B
            java.util.List r0 = r0.A01
            r0.add(r1)
        L_0x010f:
            r0 = 42
            X.7ku r5 = r15.A0X(r0)
            r0 = 45
            X.7ku r1 = r15.A0X(r0)
            if (r5 != 0) goto L_0x0237
            if (r1 != 0) goto L_0x0237
            if (r6 == 0) goto L_0x0129
            X.6d0 r0 = new X.6d0
            r0.<init>(r14, r15, r2, r2)
        L_0x0126:
            r8.setOnFocusChangeListener(r0)
        L_0x0129:
            r0 = 55
            X.6lc r1 = r15.A0W(r0)
            android.content.res.ColorStateList r0 = r8.getTextColors()
            r9.A04 = r0
            if (r1 == 0) goto L_0x021a
            int r0 = X.AnonymousClass5Z8.A01(r14, r1, r4)
            r8.setTextColor(r0)
        L_0x013e:
            r0 = 65
            X.6lc r2 = r15.A0W(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x014d
            X.AnonymousClass6X8.A03(r8, r9, r14, r2)
        L_0x014d:
            android.content.res.ColorStateList r0 = r8.getHintTextColors()
            r9.A03 = r0
            r0 = 38
            X.6lc r0 = r15.A0W(r0)
            if (r0 == 0) goto L_0x0162
            int r0 = X.AnonymousClass5Z8.A01(r14, r0, r4)
            r8.setHintTextColor(r0)
        L_0x0162:
            android.graphics.drawable.Drawable r0 = r8.getBackground()
            r9.A06 = r0
            r0 = 140(0x8c, float:1.96E-43)
            X.6lc r0 = r15.A0W(r0)
            if (r0 == 0) goto L_0x017c
            int r1 = X.AnonymousClass5Z8.A01(r14, r0, r4)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r8.setBackground(r0)
        L_0x017c:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            r0 = 40
            int r1 = r15.A0T(r0, r3)
            if (r1 <= r3) goto L_0x0190
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r2.add(r0)
        L_0x0190:
            r0 = 62
            X.7ku r1 = r15.A0X(r0)
            if (r1 == 0) goto L_0x01a0
            X.6cH r0 = new X.6cH
            r0.<init>(r14, r15, r1)
            r2.add(r0)
        L_0x01a0:
            int r0 = r2.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r8.setFilters(r0)
            r0 = 70
            java.lang.Object r4 = X.C140456lc.A0I(r15, r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0214
            int r0 = r4.hashCode()
            r3 = 4
            r2 = 3
            r1 = 2
            switch(r0) {
                case -906336856: goto L_0x01e3;
                case 3304: goto L_0x01ef;
                case 3089282: goto L_0x01f6;
                case 3377907: goto L_0x01fe;
                case 3526536: goto L_0x0208;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r0 = 46
            X.7ku r1 = r15.A0X(r0)
            X.6dv r0 = new X.6dv
            r0.<init>(r14, r15, r1)
            r8.setOnEditorActionListener(r0)
            r0 = 75
            java.lang.Object r2 = X.C140456lc.A0I(r15, r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x01e2
            X.AnonymousClass6X8.A04(r8, r14, r2)
        L_0x01e2:
            return r9
        L_0x01e3:
            java.lang.String r0 = "search"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01c3
            r8.setImeOptions(r2)
            goto L_0x01c3
        L_0x01ef:
            java.lang.String r0 = "go"
            boolean r0 = r4.equals(r0)
            goto L_0x0205
        L_0x01f6:
            java.lang.String r0 = "done"
            boolean r0 = r4.equals(r0)
            r1 = 6
            goto L_0x0205
        L_0x01fe:
            java.lang.String r0 = "next"
            boolean r0 = r4.equals(r0)
            r1 = 5
        L_0x0205:
            if (r0 != 0) goto L_0x0216
            goto L_0x01c3
        L_0x0208:
            java.lang.String r0 = "send"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01c3
            r8.setImeOptions(r3)
            goto L_0x01c3
        L_0x0214:
            int r1 = r8.A06
        L_0x0216:
            r8.setImeOptions(r1)
            goto L_0x01c3
        L_0x021a:
            r0 = 52
            java.lang.Object r0 = X.C140456lc.A0I(r15, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x013e
            int r0 = X.AnonymousClass6Y7.A04(r0)     // Catch:{ 5R5 -> 0x022d }
            r8.setTextColor(r0)     // Catch:{ 5R5 -> 0x022d }
            goto L_0x013e
        L_0x022d:
            r2 = move-exception
            java.lang.String r1 = "TextInputBinderUtils"
            java.lang.String r0 = "Error parsing text color for Text input"
            X.AnonymousClass6RS.A00(r14, r1, r0, r2)
            goto L_0x013e
        L_0x0237:
            X.6d0 r0 = new X.6d0
            r0.<init>(r14, r15, r5, r1)
            goto L_0x0126
        L_0x023e:
            if (r7 != 0) goto L_0x0256
            boolean r0 = r9.A0O
            if (r0 != 0) goto L_0x024a
            android.text.method.KeyListener r0 = r8.getKeyListener()
            if (r0 != 0) goto L_0x0256
        L_0x024a:
            android.text.method.KeyListener r0 = r9.A0K
            r8.setKeyListener(r0)
            goto L_0x0256
        L_0x0250:
            r8.setKeyListener(r2)
            A03(r8, r9, r4)
        L_0x0256:
            r9.A0O = r4
            goto L_0x00a5
        L_0x025a:
            int r0 = r9.A0H
            r8.setSelection(r1, r0)
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XF.A00(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.5oT, X.67i, X.6lc, java.lang.Object):X.5zL");
    }

    public static C125115zL A01(C1271967i r3, C140456lc r4) {
        float f;
        String str = (String) C140456lc.A0I(r4, 53);
        if (str != null) {
            try {
                f = AnonymousClass6Y7.A01(str);
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r3, "TextInputBinderUtils", "Error parsing text input size", e);
            }
            return new C125115zL(r4.A0a(50, ""), f);
        }
        f = 0.0f;
        return new C125115zL(r4.A0a(50, ""), f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        if (X.AnonymousClass6X8.A05(r8.getInputType()) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010a A[SYNTHETIC, Splitter:B:72:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0147 A[Catch:{ 5R5 -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0148 A[Catch:{ 5R5 -> 0x015f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Typeface r7, com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r8, X.C125115zL r9, X.C1271967i r10, X.C140456lc r11, java.lang.String r12) {
        /*
            r0 = 59
            r5 = 0
            boolean r0 = r11.A0f(r0, r5)
            if (r0 == 0) goto L_0x000c
            r8.setPadding(r5, r5, r5, r5)
        L_0x000c:
            r0 = 90
            X.6lc r6 = r11.A0W(r0)
            java.lang.String r2 = "TextInputBinderUtils"
            if (r6 == 0) goto L_0x0054
            r0 = 35
            X.6lc r1 = r6.A0W(r0)     // Catch:{ 5R5 -> 0x004e }
            int r0 = r8.A07     // Catch:{ 5R5 -> 0x004e }
            int r4 = X.AnonymousClass5Z8.A01(r10, r1, r0)     // Catch:{ 5R5 -> 0x004e }
            java.lang.String r0 = X.C140456lc.A0M(r6)     // Catch:{ 5R5 -> 0x004e }
            if (r0 != 0) goto L_0x002a
            r3 = 0
            goto L_0x002e
        L_0x002a:
            float r3 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x004e }
        L_0x002e:
            r0 = 36
            java.lang.Object r0 = X.C140456lc.A0I(r6, r0)     // Catch:{ 5R5 -> 0x004e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x004e }
            if (r0 != 0) goto L_0x003a
            r1 = 0
            goto L_0x003e
        L_0x003a:
            float r1 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x004e }
        L_0x003e:
            java.lang.String r0 = X.C140456lc.A0L(r6)     // Catch:{ 5R5 -> 0x004e }
            if (r0 != 0) goto L_0x0046
            r0 = 0
            goto L_0x004a
        L_0x0046:
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x004e }
        L_0x004a:
            r8.setShadowLayer(r3, r1, r0, r4)     // Catch:{ 5R5 -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text shadow"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
        L_0x0054:
            if (r12 == 0) goto L_0x0063
            java.lang.String r0 = X.C36361kB.A0n(r8)
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0063
            r8.setText(r12)
        L_0x0063:
            r0 = 36
            java.lang.Object r0 = X.C140456lc.A0I(r11, r0)
            java.lang.String r0 = (java.lang.String) r0
            r8.setHint(r0)
            r0 = 51
            java.lang.Object r0 = X.C140456lc.A0I(r11, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0080
            int r0 = X.AnonymousClass6Y7.A06(r0)     // Catch:{ 5R5 -> 0x0086 }
            r8.setGravity(r0)     // Catch:{ 5R5 -> 0x0086 }
            goto L_0x008c
        L_0x0080:
            int r0 = r8.A05
            r8.setGravity(r0)
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
        L_0x008c:
            r0 = 56
            java.lang.Object r0 = X.C140456lc.A0I(r11, r0)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            if (r0 == 0) goto L_0x00a8
            int r6 = X.AnonymousClass6Y7.A07(r0)     // Catch:{ 5R5 -> 0x00a2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 5R5 -> 0x00a2 }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
        L_0x00a8:
            if (r9 == 0) goto L_0x0105
            int r6 = r9.A0G
            if (r6 == 0) goto L_0x0105
        L_0x00ae:
            r0 = r6 & 15
            r4 = 2
            r1 = 1
            if (r0 != r1) goto L_0x00c0
            r0 = 73
            int r0 = r11.A0T(r0, r5)
            if (r0 != r1) goto L_0x00fe
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            r6 = r6 & r0
        L_0x00c0:
            r0 = 49
            boolean r1 = r11.A0f(r0, r5)
            if (r1 == 0) goto L_0x00cc
            r0 = -131073(0xfffffffffffdffff, float:NaN)
            r6 = r6 & r0
        L_0x00cc:
            int r0 = r8.getInputType()
            if (r6 == r0) goto L_0x00d5
            A03(r8, r9, r6)
        L_0x00d5:
            if (r1 == 0) goto L_0x00e2
            int r0 = r8.getInputType()
            boolean r0 = X.AnonymousClass6X8.A05(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            if (r9 == 0) goto L_0x00ea
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x00ea
            r5 = 1
        L_0x00ea:
            if (r1 == r5) goto L_0x00f3
            r8.setSingleLine(r1)
            if (r9 == 0) goto L_0x00f3
            r9.A0P = r1
        L_0x00f3:
            r0 = 53
            java.lang.Object r0 = X.C140456lc.A0I(r11, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0118
            goto L_0x010a
        L_0x00fe:
            if (r0 != r4) goto L_0x00c0
            r0 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r0
            goto L_0x00c0
        L_0x0105:
            int r6 = r8.getInputType()
            goto L_0x00ae
        L_0x010a:
            float r0 = X.AnonymousClass6Y7.A02(r0)     // Catch:{ 5R5 -> 0x0112 }
            r8.setTextSize(r4, r0)     // Catch:{ 5R5 -> 0x0112 }
            goto L_0x0118
        L_0x0112:
            r1 = move-exception
            java.lang.String r0 = "Error parsing scaled text size for text input"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
        L_0x0118:
            if (r7 == 0) goto L_0x0120
            r8.setTypeface(r7)
        L_0x011d:
            float r4 = r8.A03
            goto L_0x013d
        L_0x0120:
            r0 = 54
            java.lang.Object r1 = X.C140456lc.A0I(r11, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x011d
            android.content.Context r0 = r8.getContext()     // Catch:{ 5R5 -> 0x0136 }
            android.graphics.Typeface r0 = X.C109545Xz.A00(r0, r3, r1, r3)     // Catch:{ 5R5 -> 0x0136 }
            r8.setTypeface(r0)     // Catch:{ 5R5 -> 0x0136 }
            goto L_0x011d
        L_0x0136:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text style for text input"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
            goto L_0x011d
        L_0x013d:
            r0 = 91
            java.lang.Object r0 = X.C140456lc.A0I(r11, r0)     // Catch:{ 5R5 -> 0x015f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x015f }
            if (r0 != 0) goto L_0x0148
            goto L_0x014d
        L_0x0148:
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x015f }
            goto L_0x014f
        L_0x014d:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x014f:
            int r1 = (int) r0     // Catch:{ 5R5 -> 0x015f }
            if (r1 < 0) goto L_0x0169
            android.text.TextPaint r0 = r8.getPaint()     // Catch:{ 5R5 -> 0x015f }
            int r0 = r0.getFontMetricsInt(r3)     // Catch:{ 5R5 -> 0x015f }
            if (r1 == r0) goto L_0x0169
            int r1 = r1 - r0
            float r4 = (float) r1     // Catch:{ 5R5 -> 0x015f }
            goto L_0x0169
        L_0x015f:
            r1 = move-exception
            float r4 = r8.getLineSpacingExtra()
            java.lang.String r0 = "Error parsing lineHeight for text input"
            X.AnonymousClass6RS.A00(r10, r2, r0, r1)
        L_0x0169:
            float r0 = r8.A04
            r8.setLineSpacing(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XF.A02(android.graphics.Typeface, com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.5zL, X.67i, X.6lc, java.lang.String):void");
    }

    public static void A03(BloksEditText bloksEditText, C125115zL r4, int i) {
        if (AnonymousClass6X8.A05(i) || (r4 != null && AnonymousClass6X8.A05(r4.A0G))) {
            bloksEditText.setInputType(i);
            AnonymousClass6X8.A00((TextUtils.TruncateAt) null, bloksEditText, r4);
        } else if ((i & 131087) != 131073 && (r4 == null || (r4.A0G & 131087) != 131073)) {
            bloksEditText.setRawInputType(i);
            InputMethodManager inputMethodManager = (InputMethodManager) bloksEditText.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.restartInput(bloksEditText);
            }
            if (r4 == null) {
                return;
            }
            r4.A0G = i;
        } else if (i == 0) {
            bloksEditText.setRawInputType(0);
            InputMethodManager inputMethodManager2 = (InputMethodManager) bloksEditText.getContext().getSystemService("input_method");
            if (inputMethodManager2 != null) {
                inputMethodManager2.restartInput(bloksEditText);
            }
        } else {
            bloksEditText.setInputType(i);
        }
        if (r4 != null) {
            r4.A0P = false;
            r4.A0G = i;
        }
    }

    public static void A04(BloksEditText bloksEditText, C1271967i r5, C140456lc r6) {
        C125115zL r3 = (C125115zL) C133266Xn.A04(r5, r6);
        r3.A08 = bloksEditText.onSaveInstanceState();
        bloksEditText.setEnabled(true);
        bloksEditText.setKeyListener(r3.A0K);
        C36391kE.A1K(bloksEditText);
        A03(bloksEditText, r3, r3.A01);
        bloksEditText.setImeOptions(bloksEditText.A06);
        bloksEditText.setSingleLine(false);
        bloksEditText.setGravity(bloksEditText.A05);
        bloksEditText.setLineSpacing(bloksEditText.A03, bloksEditText.A04);
        r3.A0P = false;
    }

    public static void A05(BloksEditText bloksEditText, C1271967i r5, C140456lc r6) {
        C125115zL r3 = (C125115zL) C133266Xn.A04(r5, r6);
        r3.A0J = bloksEditText.getText();
        bloksEditText.removeTextChangedListener(r3.A0M);
        TextWatcher textWatcher = r3.A0B;
        if (textWatcher != null) {
            bloksEditText.removeTextChangedListener(textWatcher);
        }
        bloksEditText.setFocusable(true);
        bloksEditText.A00 = null;
        bloksEditText.setFilters(A00);
        bloksEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        bloksEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        bloksEditText.setTypeface(Typeface.DEFAULT);
        bloksEditText.setHint("");
        bloksEditText.setMaxLines(Integer.MAX_VALUE);
        bloksEditText.setTextColor(r3.A04);
        bloksEditText.setHintTextColor(r3.A03);
        bloksEditText.setBackground(r3.A06);
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass6X8.A02(bloksEditText, r3);
        }
        bloksEditText.setShowSoftInputOnFocus(true);
        bloksEditText.setOnKeyListener((View.OnKeyListener) null);
        bloksEditText.setTextSize(0, r3.A00);
        C90504aG.A14(r3.A05, bloksEditText);
        r3.A0L = null;
        bloksEditText.setEllipsize(r3.A09);
        bloksEditText.setShadowLayer(0.0f, 0.0f, 0.0f, bloksEditText.A07);
    }
}
