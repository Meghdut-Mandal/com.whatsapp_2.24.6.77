package X;

import android.widget.EditText;

/* renamed from: X.2g8  reason: invalid class name */
public final class AnonymousClass2g8 extends C66803Xj {
    public boolean A00;
    public final C18820ts A01;
    public final EditText A02;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r1 == 10) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r11, r1)
            android.widget.EditText r8 = r10.A02
            android.text.Layout r0 = r8.getLayout()
            if (r0 == 0) goto L_0x011b
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x011b
            r10.A00 = r1
            r8.removeTextChangedListener(r10)
            int r7 = r8.getSelectionStart()
            java.lang.String r3 = r11.toString()
            android.text.Layout r0 = r8.getLayout()
            int r2 = r0.getLineForOffset(r7)
            if (r2 <= 0) goto L_0x00d4
            int r0 = r3.length()
            r1 = 1
            if (r0 <= r1) goto L_0x00d4
            if (r7 <= 0) goto L_0x00d4
            android.text.Layout r0 = r8.getLayout()
            int r2 = r2 - r1
            int r6 = r0.getLineEnd(r2)
            int r5 = r6 + -2
            if (r5 < 0) goto L_0x00d4
        L_0x003d:
            char r1 = r3.charAt(r5)
            r0 = 10
            if (r5 <= 0) goto L_0x004a
            if (r1 == r0) goto L_0x004c
            int r5 = r5 + -1
            goto L_0x003d
        L_0x004a:
            if (r1 != r0) goto L_0x004e
        L_0x004c:
            int r5 = r5 + 1
        L_0x004e:
            if (r5 < 0) goto L_0x00d4
            java.lang.CharSequence r0 = r11.subSequence(r5, r6)
            java.lang.String r4 = r0.toString()
            int r3 = r4.length()
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1Q(r3)
            r1 = 0
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "* "
            boolean r0 = X.AnonymousClass098.A07(r4, r0, r2)
            if (r0 == 0) goto L_0x00fd
            X.2oD r1 = X.C51682oD.BULLET_LIST_STAR_PATTERN
        L_0x006e:
            X.2oD r9 = X.C51682oD.BULLET_LIST_DASH_PATTERN
            if (r1 == r9) goto L_0x00dd
            X.2oD r0 = X.C51682oD.BULLET_LIST_STAR_PATTERN
            if (r1 == r0) goto L_0x00dd
            X.2oD r0 = X.C51682oD.NUMBERED_LIST
            if (r1 != r0) goto L_0x00d4
            r1 = 0
        L_0x007b:
            if (r1 >= r3) goto L_0x00db
            char r0 = r4.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = X.C36431kI.A16(r2, r1, r4)
        L_0x008b:
            java.lang.Integer r9 = X.AnonymousClass097.A03(r0)
            X.0ts r0 = r10.A01
            java.text.NumberFormat r3 = r0.A0M()
            X.AnonymousClass00C.A08(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r3.format(r9)
            r1.append(r0)
            java.lang.String r2 = ". "
            java.lang.String r0 = X.AnonymousClass000.A0q(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            r0 = 10
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 != 0) goto L_0x00f9
            if (r9 == 0) goto L_0x00d4
            int r1 = r9.intValue()
            r0 = 99
            if (r1 >= r0) goto L_0x00d4
            int r0 = r1 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r3.format(r0)
            java.lang.String r0 = X.C36321k7.A0D(r0, r2)
        L_0x00d1:
            r11.insert(r7, r0)
        L_0x00d4:
            r8.addTextChangedListener(r10)
            return
        L_0x00d8:
            int r1 = r1 + 1
            goto L_0x007b
        L_0x00db:
            r0 = r4
            goto L_0x008b
        L_0x00dd:
            java.lang.String r0 = "* \n"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "- \n"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00f9
            X.2oD r0 = X.C51682oD.BULLET_LIST_STAR_PATTERN
            if (r1 != r0) goto L_0x00f4
            java.lang.String r0 = "* "
            goto L_0x00d1
        L_0x00f4:
            if (r1 != r9) goto L_0x00d4
            java.lang.String r0 = "- "
            goto L_0x00d1
        L_0x00f9:
            r11.delete(r5, r6)
            goto L_0x00d4
        L_0x00fd:
            java.lang.String r0 = "- "
            boolean r0 = X.AnonymousClass098.A07(r4, r0, r2)
            if (r0 == 0) goto L_0x0109
            X.2oD r1 = X.C51682oD.BULLET_LIST_DASH_PATTERN
            goto L_0x006e
        L_0x0109:
            char r0 = r4.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            int r0 = X.AnonymousClass6YV.A00(r4, r0, r2)
            if (r0 <= 0) goto L_0x006e
            X.2oD r1 = X.C51682oD.NUMBERED_LIST
            goto L_0x006e
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2g8.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence subSequence;
        if (charSequence != null && (subSequence = charSequence.subSequence(i, i3 + i)) != null && subSequence.length() > 0 && subSequence.charAt(subSequence.length() - 1) == 10) {
            this.A00 = true;
        }
    }

    public AnonymousClass2g8(EditText editText, C18820ts r2) {
        C36321k7.A0x(r2, editText);
        this.A01 = r2;
        this.A02 = editText;
    }
}
