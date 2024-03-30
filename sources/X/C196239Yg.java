package X;

/* renamed from: X.9Yg  reason: invalid class name and case insensitive filesystem */
public class C196239Yg {
    public int A00;
    public int A01 = 0;
    public final CharSequence A02;

    public boolean A08(char c, int i) {
        do {
            i++;
            if ((!A09(i)) || this.A02.charAt(i) != ' ') {
            }
            i++;
            break;
        } while (this.A02.charAt(i) != ' ');
        return !(A09(i) ^ true) && this.A02.charAt(i) == c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:0:0x0000, B:3:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char A00(int r3) {
        /*
            r2 = this;
        L_0x0000:
            int r3 = r3 + 1
            boolean r0 = r2.A09(r3)
            r0 = r0 ^ 1
            r1 = 32
            if (r0 != 0) goto L_0x0015
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r3)
            if (r0 != r1) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            boolean r0 = r2.A09(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0024
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r3)
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196239Yg.A00(int):char");
    }

    public int A01(char c, char c2, int i, boolean z) {
        CharSequence charSequence = this.A02;
        if (charSequence.charAt(i) == c) {
            int i2 = 1;
            while (true) {
                i++;
                if (!A09(i)) {
                    return -1;
                }
                char charAt = charSequence.charAt(i);
                if (charAt == '\'' || charAt == '\"') {
                    int A03 = A03(charAt, i);
                    if (A03 != -1) {
                        i = A03 + 1;
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Could not find matching close quote for ");
                        A0u.append(charAt);
                        throw C173738Sv.A00(AnonymousClass000.A0l(charSequence, " when parsing : ", A0u));
                    }
                }
                if (z && charSequence.charAt(i) == '/') {
                    int A032 = A03('/', i);
                    if (A032 != -1) {
                        i = A032 + 1;
                    } else {
                        throw C173738Sv.A00(AnonymousClass000.A0l(charSequence, "Could not find matching close for / when parsing regex in : ", AnonymousClass000.A0u()));
                    }
                }
                if (charSequence.charAt(i) == c) {
                    i2++;
                }
                if (charSequence.charAt(i) == c2 && i2 - 1 == 0) {
                    return i;
                }
            }
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Expected ");
            A0u2.append(c);
            A0u2.append(" but found ");
            throw C173738Sv.A00(AnonymousClass000.A0t(A0u2, charSequence.charAt(i)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:0:0x0000, B:3:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(char r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            int r4 = r4 + 1
            boolean r0 = r2.A09(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0015
            java.lang.CharSequence r0 = r2.A02
            char r1 = r0.charAt(r4)
            r0 = 32
            if (r1 != r0) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r4)
            if (r0 == r3) goto L_0x001e
            r4 = -1
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196239Yg.A02(char, int):int");
    }

    public int A03(char c, int i) {
        boolean z = false;
        for (int i2 = i + 1; !(!A09(i2)); i2++) {
            if (z) {
                z = false;
            } else {
                CharSequence charSequence = this.A02;
                if ('\\' == charSequence.charAt(i2)) {
                    z = true;
                } else if (c == charSequence.charAt(i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public void A04() {
        while (true) {
            int i = this.A01;
            if (A09(i) && i < this.A00 && this.A02.charAt(i) == ' ') {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public boolean A07(char c) {
        return AnonymousClass000.A1S(this.A02.charAt(this.A01), c);
    }

    public boolean A09(int i) {
        if (i < 0 || i > this.A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A02.toString();
    }

    public C196239Yg(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A00 = charSequence.length() - 1;
    }

    public void A05() {
        int i;
        A04();
        while (true) {
            int i2 = this.A01;
            if (A09(i2) && i2 < (i = this.A00) && this.A02.charAt(i) == ' ') {
                this.A00--;
            } else {
                return;
            }
        }
    }

    public void A06(char c) {
        A04();
        if (this.A02.charAt(this.A01) == c) {
            this.A01++;
        } else {
            throw C173738Sv.A00(String.format("Expected character: %c", new Object[]{Character.valueOf(c)}));
        }
    }

    public boolean A0A(CharSequence charSequence) {
        A04();
        if (A09((this.A01 + charSequence.length()) - 1)) {
            int i = this.A01;
            if (this.A02.subSequence(i, charSequence.length() + i).equals(charSequence)) {
                this.A01 += charSequence.length();
                return true;
            }
        }
        return false;
    }
}
