package X;

/* renamed from: X.6PW  reason: invalid class name */
public final class AnonymousClass6PW {
    public static final AnonymousClass6PW A08;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PW) {
                AnonymousClass6PW r9 = (AnonymousClass6PW) obj;
                if (Float.compare(this.A01, r9.A01) == 0 && Float.compare(this.A03, r9.A03) == 0 && Float.compare(this.A02, r9.A02) == 0 && Float.compare(this.A00, r9.A00) == 0) {
                    long j = this.A06;
                    long j2 = r9.A06;
                    long j3 = AnonymousClass6RD.A00;
                    if (!(j == j2 && this.A07 == r9.A07 && this.A05 == r9.A05 && this.A04 == r9.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        long j = AnonymousClass6RD.A00;
        long A0B = C90464aC.A0B(C90464aC.A01(j), C90464aC.A00(j));
        A08 = new AnonymousClass6PW(0.0f, 0.0f, 0.0f, 0.0f, A0B, A0B, A0B, A0B);
    }

    public int hashCode() {
        int A022 = C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A01), this.A03), this.A02), this.A00);
        long j = this.A06;
        long j2 = AnonymousClass6RD.A00;
        return C36341k9.A02(this.A04, C36321k7.A00(this.A05, C36321k7.A00(this.A07, C36321k7.A00(j, A022))));
    }

    public String toString() {
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass5WR.A01(A0u, this.A01);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A03);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A02);
        A0u.append(", ");
        String A0q = AnonymousClass000.A0q(AnonymousClass5WR.A00(this.A00), A0u);
        long j5 = AnonymousClass6RD.A00;
        if (AnonymousClass000.A1Q((j > j2 ? 1 : (j == j2 ? 0 : -1))) && j2 == j3 && j3 == j4) {
            float A012 = C90464aC.A01(j);
            float A002 = C90464aC.A00(j);
            int i = (A012 > A002 ? 1 : (A012 == A002 ? 0 : -1));
            StringBuilder A0v = AnonymousClass000.A0v("RoundRect(rect=");
            if (i == 0) {
                A0v.append(A0q);
                A0v.append(", radius=");
            } else {
                A0v.append(A0q);
                A0v.append(", x=");
                AnonymousClass5WR.A01(A0v, A012);
                A0v.append(", y=");
                A012 = A002;
            }
            AnonymousClass5WR.A01(A0v, A012);
            return AnonymousClass000.A0t(A0v, ')');
        }
        StringBuilder A0k = C36331k8.A0k("RoundRect(rect=", A0q);
        A0k.append(", topLeft=");
        A0k.append(AnonymousClass6RD.A00(j));
        A0k.append(", topRight=");
        A0k.append(AnonymousClass6RD.A00(j2));
        A0k.append(", bottomRight=");
        A0k.append(AnonymousClass6RD.A00(j3));
        A0k.append(", bottomLeft=");
        A0k.append(AnonymousClass6RD.A00(j4));
        return AnonymousClass000.A0t(A0k, ')');
    }

    public AnonymousClass6PW(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }
}
