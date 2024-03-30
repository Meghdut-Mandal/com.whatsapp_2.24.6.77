package X;

/* renamed from: X.8eL  reason: invalid class name and case insensitive filesystem */
public final class C177768eL extends C1900196o {
    public final C203399nx A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C177768eL) && AnonymousClass00C.A0J(this.A00, ((C177768eL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C177768eL(C203399nx r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(protocolTreeNode=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
