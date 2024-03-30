package X;

/* renamed from: X.6CM  reason: invalid class name */
public final class AnonymousClass6CM {
    public final C121585tN A00;
    public final Short A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CM) {
                AnonymousClass6CM r5 = (AnonymousClass6CM) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, ((AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass6CM(C121585tN r1, Short sh, String str, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = sh;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsMetadataGraphqlResponse(metadata=");
        A0u.append(this.A00);
        A0u.append(", errorType=");
        A0u.append(this.A02);
        A0u.append(", actionId=");
        A0u.append(this.A01);
        A0u.append(", dropQplMarker=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
