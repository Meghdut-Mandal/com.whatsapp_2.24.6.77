package X;

/* renamed from: X.6CL  reason: invalid class name */
public final class AnonymousClass6CL {
    public final Short A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CL) {
                AnonymousClass6CL r5 = (AnonymousClass6CL) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, ((C36341k9.A01(this.A02 ? 1 : 0) * 31) + C36341k9.A09(this.A01)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass6CL(Short sh, String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = sh;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsMetadataAssetsGraphqlResponse(isSuccess=");
        A0u.append(this.A02);
        A0u.append(", errorType=");
        A0u.append(this.A01);
        A0u.append(", actionId=");
        A0u.append(this.A00);
        A0u.append(", dropQplMarker=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
