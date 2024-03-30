package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.9ly  reason: invalid class name and case insensitive filesystem */
public class C202469ly {
    public C196239Yg A00;

    public static boolean A03(char c) {
        return c == '<' || c == '>' || c == '=' || c == '~' || c == '!';
    }

    private C21077A7o A00() {
        AnonymousClass8T6 r0;
        C196239Yg r7 = this.A00;
        r7.A04();
        int i = r7.A01;
        r7.A04();
        if (r7.A07('!')) {
            r7.A06('!');
            r7.A04();
            char charAt = r7.A02.charAt(r7.A01);
            if (charAt != '$' && charAt != '@') {
                return new AnonymousClass8T2(A00(), C023109s.A01);
            }
            r7.A01 = i;
        }
        r7.A04();
        if (r7.A07('(')) {
            r7.A06('(');
            C21077A7o A01 = A01(this);
            r7.A06(')');
            return A01;
        }
        C200269h0 A02 = A02();
        try {
            r7.A04();
            int i2 = r7.A01;
            CharSequence charSequence = r7.A02;
            if (!A03(charSequence.charAt(i2))) {
                while (true) {
                    int i3 = r7.A01;
                    if (!r7.A09(i3) || charSequence.charAt(i3) == ' ') {
                        break;
                    }
                    r7.A01++;
                }
            } else {
                while (true) {
                    int i4 = r7.A01;
                    if (!r7.A09(i4) || !A03(charSequence.charAt(i4))) {
                        break;
                    }
                    r7.A01++;
                }
            }
            String A0t = C165607th.A0t(charSequence, i2, r7.A01);
            String upperCase = A0t.toUpperCase(Locale.ROOT);
            for (C188628zx r1 : C188628zx.values()) {
                if (r1.operatorString.equals(upperCase)) {
                    return new AnonymousClass8T1(r1, A02, A02());
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Filter operator ");
            A0u.append(A0t);
            throw C173738Sv.A00(AnonymousClass000.A0q(" is not supported!", A0u));
        } catch (C173738Sv unused) {
            r7.A01 = r7.A01;
            if (A02 instanceof AnonymousClass8T7) {
                AnonymousClass8T7 r5 = (AnonymousClass8T7) A02;
                AnonymousClass8T7 r2 = new AnonymousClass8T7(r5.A00, true, r5.A02);
                C188628zx r12 = C188628zx.EXISTS;
                if (r2.A02) {
                    r0 = B4C.A01;
                } else {
                    r0 = B4C.A00;
                }
                return new AnonymousClass8T1(r12, r2, r0);
            }
            throw C173738Sv.A00("Expected path node");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0287, code lost:
        if (r1 != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != '{') goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0171, code lost:
        if ((0 | X.C200389hK.A01(r1)) <= 0) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0173, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C200269h0 A02() {
        /*
            r14 = this;
            X.9Yg r3 = r14.A00
            r3.A04()
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            r5 = 64
            r2 = 36
            r8 = 33
            if (r0 == r8) goto L_0x01d0
            if (r0 == r2) goto L_0x01f8
            if (r0 == r5) goto L_0x01f8
            r3.A04()
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r6 = 34
            if (r2 == r6) goto L_0x01a1
            r6 = 39
            if (r2 == r6) goto L_0x01a1
            r0 = 45
            if (r2 == r0) goto L_0x0046
            r0 = 47
            if (r2 == r0) goto L_0x0139
            r0 = 91
            if (r2 == r0) goto L_0x0104
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L_0x00b3
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x007c
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L_0x00b3
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x0104
        L_0x0046:
            int r2 = r3.A01
            r1 = r2
        L_0x0049:
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x0070
            char r1 = r4.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0069
            r0 = 45
            if (r1 == r0) goto L_0x0069
            r0 = 46
            if (r1 == r0) goto L_0x0069
            r0 = 69
            if (r1 == r0) goto L_0x0069
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x0070
        L_0x0069:
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            goto L_0x0049
        L_0x0070:
            int r0 = r3.A01
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            X.8TC r2 = new X.8TC
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x007c:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r1) goto L_0x00ac
            int r1 = r3.A01
            int r0 = r1 + 3
            boolean r0 = r3.A09(r0)
            if (r0 == 0) goto L_0x00ac
            int r0 = r1 + 4
            java.lang.CharSequence r2 = r4.subSequence(r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            int r1 = r2.length()
            int r0 = r3.A01
            int r0 = r0 + r1
            r3.A01 = r0
            X.8T3 r2 = X.B4C.A02
            return r2
        L_0x00ac:
            java.lang.String r0 = "Expected <null> value"
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x00b3:
            int r6 = r3.A01
            char r5 = r4.charAt(r6)
            int r1 = r3.A01
            r0 = 116(0x74, float:1.63E-43)
            int r2 = r1 + 4
            if (r5 != r0) goto L_0x00c3
            int r2 = r1 + 3
        L_0x00c3:
            boolean r0 = r3.A09(r2)
            java.lang.String r1 = "Expected boolean literal"
            if (r0 == 0) goto L_0x00ff
            int r0 = r2 + 1
            java.lang.CharSequence r2 = r4.subSequence(r6, r0)
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00e6
            X.8Sv r0 = X.C173738Sv.A00(r1)
            throw r0
        L_0x00e6:
            int r1 = r2.length()
            int r0 = r3.A01
            int r0 = r0 + r1
            r3.A01 = r0
            java.lang.String r0 = r2.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00fc
            X.8T6 r2 = X.B4C.A01
            return r2
        L_0x00fc:
            X.8T6 r2 = X.B4C.A00
            return r2
        L_0x00ff:
            X.8Sv r0 = X.C173738Sv.A00(r1)
            throw r0
        L_0x0104:
            int r6 = r3.A01
            char r5 = r4.charAt(r6)
            r0 = 91
            r2 = 125(0x7d, float:1.75E-43)
            if (r5 != r0) goto L_0x0112
            r2 = 93
        L_0x0112:
            int r1 = r3.A01
            r0 = 0
            int r1 = r3.A01(r5, r2, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x012a
            int r0 = r1 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r6, r0)
            X.8TB r2 = new X.8TB
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "String not closed. Expected ' in "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0139:
            int r9 = r3.A01
            int r10 = r3.A03(r0, r9)
            r0 = -1
            if (r10 == r0) goto L_0x0192
            int r12 = r10 + 1
            boolean r0 = r3.A09(r12)
            if (r0 == 0) goto L_0x0184
            r11 = r12
            r0 = 1
            char[] r8 = new char[r0]
        L_0x014e:
            boolean r0 = r3.A09(r11)
            if (r0 == 0) goto L_0x0179
            r13 = 0
            char r7 = r4.charAt(r11)
            r8[r13] = r7
            r0 = 7
            java.lang.Integer[] r6 = X.C023109s.A00(r0)
            int r5 = r6.length
            r2 = 0
        L_0x0162:
            if (r2 >= r5) goto L_0x0179
            r1 = r6[r2]
            char r0 = X.C200389hK.A00(r1)
            if (r0 != r7) goto L_0x0176
            int r0 = X.C200389hK.A01(r1)
            r13 = r13 | r0
            if (r13 <= 0) goto L_0x0179
            int r11 = r11 + 1
            goto L_0x014e
        L_0x0176:
            int r2 = r2 + 1
            goto L_0x0162
        L_0x0179:
            if (r11 <= r10) goto L_0x0184
            java.lang.CharSequence r0 = r4.subSequence(r12, r11)
            int r0 = r0.length()
            int r10 = r10 + r0
        L_0x0184:
            int r0 = r10 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r9, r0)
            X.8TA r2 = new X.8TA
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x0192:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Pattern not closed. Expected / in "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01a1:
            int r5 = r3.A01
            int r2 = r3.A03(r6, r5)
            r0 = -1
            if (r2 == r0) goto L_0x01b9
            r1 = 1
            int r0 = r2 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r5, r0)
            X.8T8 r2 = new X.8T8
            r2.<init>(r0, r1)
            return r2
        L_0x01b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "String literal does not have matching quotes. Expected "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " in "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01d0:
            r1 = 1
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A04()
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 == r2) goto L_0x01f8
            if (r0 == r5) goto L_0x01f8
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r8)
            r2[r1] = r0
            java.lang.String r0 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01f8:
            int r2 = r3.A01
        L_0x01fa:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x020d
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x020d
            goto L_0x01fa
        L_0x020d:
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02d1
            r0 = -1
            if (r2 == r0) goto L_0x02d1
            char r10 = r4.charAt(r2)
        L_0x021c:
            int r9 = r3.A01
            r7 = 1
        L_0x021f:
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            boolean r0 = r3.A09(r1)
            r6 = 0
            if (r0 == 0) goto L_0x02a8
            char r0 = r4.charAt(r1)
            r2 = 91
            if (r0 != r2) goto L_0x0243
            int r1 = r3.A01
            r0 = 93
            int r1 = r3.A01(r2, r0, r1, r6)
            r0 = -1
            if (r1 == r0) goto L_0x02d5
            int r0 = r1 + 1
            r3.A01 = r0
        L_0x0243:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            r5 = 41
            if (r0 != r5) goto L_0x027d
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r5) goto L_0x027d
            int r2 = r3.A01
        L_0x0257:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x026a
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x026a
            goto L_0x0257
        L_0x026a:
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x027d
            r0 = -1
            if (r2 == r0) goto L_0x027d
            char r1 = r4.charAt(r2)
            r0 = 40
            if (r1 == r0) goto L_0x02bd
        L_0x027d:
            r1 = 0
        L_0x027e:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r5) goto L_0x0289
            r2 = 1
            if (r1 == 0) goto L_0x028a
        L_0x0289:
            r2 = 0
        L_0x028a:
            int r1 = r3.A01
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x02a8
            char r0 = r4.charAt(r1)
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x02a8
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 32
            if (r1 == r0) goto L_0x02a8
            if (r2 == 0) goto L_0x021f
        L_0x02a8:
            if (r10 != r8) goto L_0x02ab
            r7 = 0
        L_0x02ab:
            int r0 = r3.A01
            java.lang.String r1 = X.C165607th.A0t(r4, r9, r0)
            X.AyE[] r0 = new X.C22902AyE[r6]
            X.9Tr r0 = X.C202479lz.A01(r1, r0)
            X.8T7 r2 = new X.8T7
            r2.<init>(r0, r6, r7)
            return r2
        L_0x02bd:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            if (r0 == 0) goto L_0x027d
            if (r2 <= r9) goto L_0x027d
            char r1 = r4.charAt(r2)
            r0 = 46
            if (r1 != r0) goto L_0x02bd
            r1 = 1
            goto L_0x027e
        L_0x02d1:
            r10 = 32
            goto L_0x021c
        L_0x02d5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Square brackets does not match in filter "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202469ly.A02():X.9h0");
    }

    public C202469ly(String str) {
        C196239Yg r0 = new C196239Yg(str);
        this.A00 = r0;
        r0.A05();
        if (this.A00.A07('[')) {
            C196239Yg r02 = this.A00;
            if (r02.A02.charAt(r02.A00) == ']') {
                C196239Yg r2 = this.A00;
                r2.A01++;
                r2.A00--;
                r2.A05();
                if (this.A00.A07('?')) {
                    C196239Yg r1 = this.A00;
                    r1.A01++;
                    r1.A05();
                    if (this.A00.A07('(')) {
                        C196239Yg r03 = this.A00;
                        if (r03.A02.charAt(r03.A00) == ')') {
                            return;
                        }
                    }
                    throw C173738Sv.A00(AnonymousClass000.A0p("Filter must start with '[?(' and end with ')]'. ", str, AnonymousClass000.A0u()));
                }
                throw C173738Sv.A00(AnonymousClass000.A0p("Filter must start with '[?' and end with ']'. ", str, AnonymousClass000.A0u()));
            }
        }
        throw C173738Sv.A00(AnonymousClass000.A0p("Filter must start with '[' and end with ']'. ", str, AnonymousClass000.A0u()));
    }

    public static C21077A7o A01(C202469ly r6) {
        C196239Yg r4;
        int i;
        Integer num;
        Object r0;
        int i2;
        Integer num2;
        ArrayList A0I = AnonymousClass001.A0I();
        do {
            ArrayList A0I2 = AnonymousClass001.A0I();
            do {
                A0I2.add(r6.A00());
                r4 = r6.A00;
                i = r4.A01;
                num = C023109s.A00;
            } while (r4.A0A("&&"));
            r4.A01 = i;
            if (1 == A0I2.size()) {
                r0 = C36441kJ.A12(A0I2);
            } else {
                r0 = new AnonymousClass8T2(num, (Collection) A0I2);
            }
            A0I.add(r0);
            i2 = r4.A01;
            num2 = C023109s.A0C;
        } while (r4.A0A("||"));
        r4.A01 = i2;
        if (1 == A0I.size()) {
            return (C21077A7o) C36441kJ.A12(A0I);
        }
        return new AnonymousClass8T2(num2, (Collection) A0I);
    }
}
