package X;

/* renamed from: X.9gy  reason: invalid class name and case insensitive filesystem */
public class C200249gy {
    public int A00;
    public int A01 = 0;
    public C198619ds A02 = new C198619ds();
    public String A03;

    public static boolean A02(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public float A04() {
        C198619ds r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public int A06() {
        int i = this.A01;
        int i2 = this.A00;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.A01 = i3;
        if (i3 < i2) {
            return this.A03.charAt(i3);
        }
        return -1;
    }

    public Boolean A08(Object obj) {
        if (obj == null) {
            return null;
        }
        A0E();
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        char charAt = this.A03.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z = true;
        this.A01++;
        if (charAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Integer A09() {
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        String str = this.A03;
        this.A01 = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public Integer A0A() {
        if (!AnonymousClass000.A1S(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            int i = this.A01;
            if (charAt == '%') {
                this.A01 = i + 1;
                return C023109s.A0X;
            } else if (i <= this.A00 - 2) {
                try {
                    Integer A002 = AnonymousClass93Z.A00(C90514aH.A0y(str.substring(i, i + 2)));
                    this.A01 += 2;
                    return A002;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r6.A01;
        r3 = r6.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B() {
        /*
            r6 = this;
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x001b
            int r4 = r6.A01
            java.lang.String r3 = r6.A03
            char r2 = r3.charAt(r4)
            r0 = 39
            if (r2 == r0) goto L_0x001c
            r0 = 34
            if (r2 == r0) goto L_0x001c
        L_0x001b:
            return r5
        L_0x001c:
            int r1 = r6.A06()
            r0 = -1
            if (r1 == r0) goto L_0x0034
            if (r1 != r2) goto L_0x001c
            int r0 = r6.A01
            int r0 = r0 + 1
            r6.A01 = r0
            int r1 = r4 + 1
            int r0 = r0 + -1
            java.lang.String r0 = r3.substring(r1, r0)
            return r0
        L_0x0034:
            r6.A01 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200249gy.A0B():java.lang.String");
    }

    public String A0C(char c, boolean z) {
        if (!AnonymousClass000.A1S(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            if ((z || !A02(charAt)) && charAt != c) {
                int i = this.A01;
                while (true) {
                    int A06 = A06();
                    if (A06 == -1 || A06 == c || (!z && A02(A06))) {
                    }
                }
                return str.substring(i, this.A01);
            }
        }
        return null;
    }

    public void A0D() {
        while (true) {
            int i = this.A01;
            if (i < this.A00 && A02(this.A03.charAt(i))) {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public boolean A0F(char c) {
        int i = this.A01;
        if (i >= this.A00 || this.A03.charAt(i) != c) {
            return false;
        }
        this.A01++;
        return true;
    }

    public C200249gy(String str) {
        String trim = str.trim();
        this.A03 = trim;
        this.A00 = trim.length();
    }

    public float A03() {
        A0E();
        C198619ds r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public float A05(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        A0E();
        return A04();
    }

    public AUX A07() {
        float A04 = A04();
        if (Float.isNaN(A04)) {
            return null;
        }
        Integer A0A = A0A();
        if (A0A == null) {
            A0A = C023109s.A00;
        }
        return new AUX(A0A, A04);
    }

    public boolean A0E() {
        A0D();
        int i = this.A01;
        if (i == this.A00 || this.A03.charAt(i) != ',') {
            return false;
        }
        this.A01++;
        A0D();
        return true;
    }

    public boolean A0G(String str) {
        int length = str.length();
        int i = this.A01;
        if (i > this.A00 - length || !this.A03.substring(i, i + length).equals(str)) {
            return false;
        }
        this.A01 += length;
        return true;
    }
}
