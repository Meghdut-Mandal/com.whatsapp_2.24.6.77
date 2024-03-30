package X;

/* renamed from: X.56v  reason: invalid class name and case insensitive filesystem */
public final class C1037756v extends C110805bG {
    public final AnonymousClass6PF A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1037756v) && AnonymousClass00C.A0J(this.A00, ((C1037756v) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1037756v(AnonymousClass6PF r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(flowsAssetVerification=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
