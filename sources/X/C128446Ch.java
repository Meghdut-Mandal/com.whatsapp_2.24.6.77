package X;

/* renamed from: X.6Ch  reason: invalid class name and case insensitive filesystem */
public final class C128446Ch {
    public final C134976bv A00;
    public final C134976bv A01;
    public final C134976bv A02;
    public final C134976bv A03;
    public final C135076c5 A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128446Ch)) {
            return false;
        }
        C128446Ch r4 = (C128446Ch) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A04.equals(r4.A04);
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, C36351kA.A05(this.A01, C36351kA.A05(this.A00, C36351kA.A05(this.A03, (527 + this.A02.hashCode()) * 31))));
    }

    public C128446Ch(C134976bv r1, C134976bv r2, C134976bv r3, C134976bv r4, C135076c5 r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{nearLeft=");
        A0u.append(this.A02);
        A0u.append(", nearRight=");
        A0u.append(this.A03);
        A0u.append(", farLeft=");
        A0u.append(this.A00);
        A0u.append(", farRight=");
        A0u.append(this.A01);
        A0u.append(", latLngBounds=");
        A0u.append(this.A04);
        return AnonymousClass000.A0q("}", A0u);
    }
}
