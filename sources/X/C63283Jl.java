package X;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
public final class C63283Jl {
    public int A00;
    public AnonymousClass3KJ A01;
    public AnonymousClass3KE A02;
    public final int A03;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C63283Jl) && this.A03 == ((C63283Jl) obj).A03);
    }

    public int hashCode() {
        return this.A03;
    }

    public C63283Jl(int i) {
        this.A03 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AutoconfVerifierResult(status=");
        return C36321k7.A0G(A0u, this.A03);
    }
}
