package X;

/* renamed from: X.6QC  reason: invalid class name */
public final class AnonymousClass6QC {
    public static final AnonymousClass6QC A04 = new AnonymousClass6QC(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6QC) {
                AnonymousClass6QC r5 = (AnonymousClass6QC) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long A00() {
        float f = this.A01;
        float f2 = this.A03;
        long A0B = C90464aC.A0B(f + ((this.A02 - f) / 2.0f), f2 + ((this.A00 - f2) / 2.0f));
        long j = C133206Xf.A03;
        return A0B;
    }

    public final AnonymousClass6QC A01(float f, float f2) {
        return new AnonymousClass6QC(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final AnonymousClass6QC A02(long j) {
        return new AnonymousClass6QC(this.A01 + C133206Xf.A00(j), this.A03 + C133206Xf.A01(j), this.A02 + C133206Xf.A00(j), this.A00 + C133206Xf.A01(j));
    }

    public final AnonymousClass6QC A03(AnonymousClass6QC r6) {
        return new AnonymousClass6QC(Math.max(this.A01, r6.A01), Math.max(this.A03, r6.A03), Math.min(this.A02, r6.A02), Math.min(this.A00, r6.A00));
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A01), this.A03), this.A02), this.A00);
    }

    public AnonymousClass6QC(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Rect.fromLTRB(");
        AnonymousClass5WR.A01(A0u, this.A01);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A03);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A02);
        A0u.append(", ");
        return C36321k7.A0E(AnonymousClass5WR.A00(this.A00), A0u);
    }
}
