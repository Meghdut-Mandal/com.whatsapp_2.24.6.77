package X;

/* renamed from: X.6eD  reason: invalid class name and case insensitive filesystem */
public final class C136336eD implements C161407mr {
    public final int A00;
    public final AnonymousClass7dY A01;

    public /* bridge */ /* synthetic */ C160547lB BxH(C156857b4 r4) {
        return new C136446eP(this.A01, this.A00);
    }

    public /* bridge */ /* synthetic */ C161427mt BxI(C156857b4 r4) {
        return new C136446eP(this.A01, this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C136336eD)) {
            return false;
        }
        C136336eD r4 = (C136336eD) obj;
        if (r4.A00 != this.A00 || !AnonymousClass00C.A0J(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, this.A00 * 31);
    }

    public C136336eD(AnonymousClass7dY r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public C136336eD() {
        this(C113945gO.A00, 300);
    }
}
