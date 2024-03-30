package X;

/* renamed from: X.6r6  reason: invalid class name and case insensitive filesystem */
public final class C143776r6 implements C16220oo {
    public final C61243Bc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143776r6) && AnonymousClass00C.A0J(this.A00, ((C143776r6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C143776r6(C61243Bc r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoadingState(title=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
