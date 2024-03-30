package X;

/* renamed from: X.69l  reason: invalid class name and case insensitive filesystem */
public final class C1277369l {
    public int A00;
    public final String A01;

    public final void A04() {
        int i = this.A00;
        int i2 = i + 1;
        int length = this.A01.length();
        if (i2 <= length) {
            this.A00 = i2;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("remaining data length is ");
        A0u.append(length - i);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", which is shorter than requested ", A0u, 1));
    }

    public static int A00(C1277369l r2) {
        return r2.A01.length() - r2.A00;
    }

    public final char A03(int i) {
        int i2 = this.A00;
        int i3 = i2 + i;
        String str = this.A01;
        int length = str.length();
        if (i3 < length) {
            return str.charAt(i3);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("remaining data length is ");
        A0u.append(length - i2);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", which is shorter than requested ", A0u, i));
    }

    public C1277369l(String str) {
        this.A01 = str;
    }

    public static void A01(C1277369l r0, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A00);
        sb.append(" in ");
        sb.append(str2);
    }

    public final char A02() {
        while (!AnonymousClass000.A1Q(A00(this))) {
            if (A03(0) != ' ') {
                return A03(0);
            }
            A04();
        }
        return 0;
    }
}
