package X;

/* renamed from: X.8T8  reason: invalid class name */
public class AnonymousClass8T8 extends C200269h0 {
    public boolean A00 = true;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8T8) && !(obj instanceof AnonymousClass8TC)) {
                return false;
            }
            AnonymousClass8T8 A05 = ((C200269h0) obj).A05();
            String str = this.A01;
            String str2 = A05.A01;
            if (str == null) {
                return str2 == null;
            }
            if (!str.equals(str2)) {
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r9 > 15) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r1 = X.AnonymousClass000.A0u();
        r8 = "\\u000";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x00b2
            java.lang.String r7 = "'"
        L_0x0006:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0v(r7)
            java.lang.String r5 = r10.A01
            if (r5 != 0) goto L_0x0014
            r0 = 0
        L_0x000f:
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r6)
            return r0
        L_0x0014:
            int r4 = r5.length()
            int r0 = r4 * 2
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>(r0)
            r2 = 0
        L_0x0020:
            if (r2 >= r4) goto L_0x00ac
            char r9 = r5.charAt(r2)
            r0 = 4095(0xfff, float:5.738E-42)
            if (r9 <= r0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "\\u"
        L_0x0030:
            r1.append(r8)
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r3.write(r0)
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0045:
            r0 = 255(0xff, float:3.57E-43)
            if (r9 <= r0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "\\u0"
            goto L_0x0030
        L_0x0050:
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r8 = "\\u00"
            if (r9 > r0) goto L_0x0063
            r0 = 32
            r1 = 92
            if (r9 >= r0) goto L_0x0087
            switch(r9) {
                case 8: goto L_0x009c;
                case 9: goto L_0x007a;
                case 10: goto L_0x0074;
                case 11: goto L_0x0080;
                case 12: goto L_0x006e;
                case 13: goto L_0x0068;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 15
            if (r9 <= r0) goto L_0x0080
        L_0x0063:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            goto L_0x0030
        L_0x0068:
            r3.write(r1)
            r9 = 114(0x72, float:1.6E-43)
            goto L_0x00a1
        L_0x006e:
            r3.write(r1)
            r9 = 102(0x66, float:1.43E-43)
            goto L_0x00a1
        L_0x0074:
            r3.write(r1)
            r9 = 110(0x6e, float:1.54E-43)
            goto L_0x00a1
        L_0x007a:
            r3.write(r1)
            r9 = 116(0x74, float:1.63E-43)
            goto L_0x00a1
        L_0x0080:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "\\u000"
            goto L_0x0030
        L_0x0087:
            r0 = 34
            if (r9 == r0) goto L_0x00a5
            r0 = 39
            if (r9 == r0) goto L_0x00a5
            r0 = 47
            if (r9 == r0) goto L_0x00a5
            if (r9 != r1) goto L_0x00a1
            r3.write(r1)
            r3.write(r1)
            goto L_0x0042
        L_0x009c:
            r3.write(r1)
            r9 = 98
        L_0x00a1:
            r3.write(r9)
            goto L_0x0042
        L_0x00a5:
            r3.write(r1)
            r3.write(r0)
            goto L_0x0042
        L_0x00ac:
            java.lang.String r0 = r3.toString()
            goto L_0x000f
        L_0x00b2:
            java.lang.String r7 = "\""
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8T8.toString():java.lang.String");
    }

    public AnonymousClass8T8(CharSequence charSequence, boolean z) {
        String charSequence2;
        if (!z || charSequence.length() <= 1) {
            charSequence2 = charSequence.toString();
        } else {
            char charAt = charSequence.charAt(0);
            char charAt2 = charSequence.charAt(charSequence.length() - 1);
            if (charAt == '\'') {
                if (charAt2 == '\'') {
                    charSequence = charSequence.subSequence(1, charSequence.length() - 1);
                }
            } else if (charAt == '\"' && charAt2 == '\"') {
                charSequence = charSequence.subSequence(1, charSequence.length() - 1);
                this.A00 = false;
            }
            charSequence2 = C201749kK.A01(charSequence.toString());
        }
        this.A01 = charSequence2;
    }

    public static int A00(C200269h0 r1, C200269h0 r2) {
        return r1.A05().A01.compareTo(r2.A05().A01);
    }
}
