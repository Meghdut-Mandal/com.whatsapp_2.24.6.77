package X;

public class A20 implements C23064B2n, C22788Avz {
    public int A00;
    public int A01;
    public AnonymousClass9ST A02;
    public C160697lR A03;
    public boolean A04;
    public final AnonymousClass6NG A05 = new AnonymousClass6NG();
    public final C192429Gy A06 = new C192429Gy();
    public final C98564rd A07 = new C98564rd(true);

    public void BKM(C201589jv r1) {
    }

    public void release() {
    }

    public void B1T(AnonymousClass9ST r3) {
        this.A02 = r3;
        C160697lR r1 = this.A03;
        if (r1 != null) {
            r1.Bik(r3.A04);
        }
        this.A07.A00 = r3.A04;
    }

    public void B5N() {
        C160697lR r0 = this.A03;
        if (r0 != null) {
            r0.Bil();
        }
        this.A07.Bil();
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C160697lR r1 = this.A03;
        C160697lR r0 = ((A20) obj).A03;
        if (r1 == r0) {
            return true;
        }
        if (r1 == null || !r1.equals(r0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0J(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GlLegacyRenderer(");
        A0u.append(this.A03);
        return C90474aD.A0f(A0u);
    }
}
