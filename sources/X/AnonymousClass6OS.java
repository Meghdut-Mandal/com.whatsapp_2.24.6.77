package X;

/* renamed from: X.6OS  reason: invalid class name */
public final class AnonymousClass6OS {
    public static int A09;
    public static final C109095Wg A0A = new C109095Wg();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final C94674ib A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OS) {
                AnonymousClass6OS r9 = (AnonymousClass6OS) obj;
                if (AnonymousClass000.A1Q(Float.compare(this.A01, r9.A01)) && AnonymousClass000.A1Q(Float.compare(this.A00, r9.A00)) && this.A03 == r9.A03 && this.A02 == r9.A02 && AnonymousClass00C.A0J(this.A07, r9.A07)) {
                    long j = this.A06;
                    long j2 = r9.A06;
                    long j3 = C133336Xx.A01;
                    if (!(j == j2 && this.A05 == r9.A05 && this.A08 == r9.A08)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A07, C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(0, this.A01), this.A00), this.A03), this.A02));
        long j = this.A06;
        long j2 = C133336Xx.A01;
        return ((C36321k7.A00(j, A052) + this.A05) * 31) + C36341k9.A01(this.A08 ? 1 : 0);
    }

    public /* synthetic */ AnonymousClass6OS(C94674ib r4, float f, float f2, float f3, float f4, int i, long j, boolean z) {
        int i2;
        synchronized (A0A) {
            i2 = A09;
            A09 = i2 + 1;
        }
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = r4;
        this.A06 = j;
        this.A05 = i;
        this.A08 = z;
        this.A04 = i2;
    }
}
