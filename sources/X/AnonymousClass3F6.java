package X;

/* renamed from: X.3F6  reason: invalid class name */
public final class AnonymousClass3F6 {
    public C50152kI A00;
    public final AnonymousClass1N4 A01;
    public final C19730wQ A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final C21159AAt A05;
    public final C20810yC A06;
    public final AnonymousClass19A A07;
    public final C19770wU A08;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r3 != null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass4UY r11, java.lang.String r12) {
        /*
            r10 = this;
            r4 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0011
            java.lang.String r0 = "[\\s()+.#-]"
            java.lang.String r9 = X.C36411kG.A0y(r12, r0)
            boolean r0 = android.text.TextUtils.isDigitsOnly(r9)
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            X.0wQ r0 = r10.A02
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x00f4
            X.11F r0 = r0.A0H
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = X.AnonymousClass3U8.A06(r0)
            if (r1 == 0) goto L_0x0010
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = X.AnonymousClass3SI.A02(r1)
            if (r3 == 0) goto L_0x0036
            int r0 = r3.length()
            if (r0 != 0) goto L_0x007f
        L_0x0036:
            if (r12 == 0) goto L_0x0050
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "\\D"
            java.lang.String r2 = X.C36411kG.A0y(r12, r0)
            int r1 = r2.length()
            r0 = 5
            if (r1 >= r0) goto L_0x005a
            java.lang.String r0 = "contactpicker/isvalidnumber/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0050:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contactpicker/fetchContactUsingPhoneNumber/invalidnumber "
            X.C36321k7.A1Q(r0, r12, r1)
            return
        L_0x005a:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0050
            java.lang.String r5 = r1.group(r4)
            java.lang.String r1 = X.C36431kI.A1B(r5, r2)
            X.AnonymousClass00C.A08(r1)
            X.1N4 r0 = r10.A01
            int r0 = X.AnonymousClass3U2.A01(r0, r5, r1)
            if (r0 != r4) goto L_0x0050
            if (r3 == 0) goto L_0x00f4
        L_0x007f:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00f4
            int r8 = java.lang.Integer.parseInt(r3)
            X.9oI r5 = X.C203559oI.A00()
            java.lang.String r3 = "phonenumberutil/isValidNumber"
            java.lang.String r7 = "+"
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "\\D"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.replaceAll(r0, r2)
            java.lang.String r0 = "^0+(?!$)"
            java.lang.String r6 = r1.replaceFirst(r0, r2)
            int r1 = r6.length()
            r0 = 5
            if (r1 >= r0) goto L_0x00b2
            java.lang.String r0 = "phonenumberutil/formatEnteredNumber/too-short-number"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00b2:
            boolean r0 = r6.startsWith(r7)     // Catch:{ 172 | RuntimeException -> 0x011c }
            java.lang.String r2 = "ZZ"
            if (r0 == 0) goto L_0x00bb
            goto L_0x00e4
        L_0x00bb:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r7)     // Catch:{ 172 | RuntimeException -> 0x011c }
            r0.append(r8)     // Catch:{ 172 | RuntimeException -> 0x011c }
            java.lang.String r1 = X.AnonymousClass000.A0q(r6, r0)     // Catch:{ 172 | RuntimeException -> 0x011c }
            java.lang.String r0 = r5.A0I(r8)     // Catch:{ 172 | RuntimeException -> 0x011c }
            X.AUN r1 = r5.A0F(r1, r0)     // Catch:{ 172 | RuntimeException -> 0x011c }
            boolean r0 = r5.A0N(r1)     // Catch:{ 172 | RuntimeException -> 0x011c }
            if (r0 == 0) goto L_0x00db
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ 172 | RuntimeException -> 0x011c }
            java.lang.String r9 = r5.A0J(r1, r0)     // Catch:{ 172 | RuntimeException -> 0x011c }
            goto L_0x00f4
        L_0x00db:
            java.lang.String r0 = X.C36321k7.A0D(r7, r6)     // Catch:{ 172 | RuntimeException -> 0x011c }
            X.AUN r1 = r5.A0F(r0, r2)     // Catch:{ 172 | RuntimeException -> 0x011c }
            goto L_0x00e8
        L_0x00e4:
            X.AUN r1 = r5.A0F(r6, r2)     // Catch:{ 172 | RuntimeException -> 0x011c }
        L_0x00e8:
            boolean r0 = r5.A0N(r1)     // Catch:{ 172 | RuntimeException -> 0x011c }
            if (r0 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ 172 | RuntimeException -> 0x011c }
            java.lang.String r9 = r5.A0J(r1, r0)     // Catch:{ 172 | RuntimeException -> 0x011c }
        L_0x00f4:
            r2 = 0
            if (r9 == 0) goto L_0x0010
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0010
            X.2kI r0 = r10.A00
            if (r0 == 0) goto L_0x0104
            r0.A0D(r4)
        L_0x0104:
            X.19A r8 = r10.A07
            X.AAt r7 = r10.A05
            X.16D r5 = r10.A04
            X.0wD r4 = r10.A03
            X.2kI r3 = new X.2kI
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.0wU r1 = r10.A08
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r1.Bp0(r3, r0)
            r10.A00 = r3
            return
        L_0x011c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F6.A00(X.4UY, java.lang.String):void");
    }

    public AnonymousClass3F6(AnonymousClass1N4 r1, C19730wQ r2, C19600wD r3, AnonymousClass16D r4, C21159AAt aAt, C20810yC r6, AnonymousClass19A r7, C19770wU r8) {
        C36321k7.A1B(r6, r2, r8, r7, r4);
        C36321k7.A13(r1, aAt, r3);
        this.A06 = r6;
        this.A02 = r2;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A01 = r1;
        this.A05 = aAt;
        this.A03 = r3;
    }
}
