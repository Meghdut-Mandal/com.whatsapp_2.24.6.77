package X;

/* renamed from: X.69S  reason: invalid class name */
public final class AnonymousClass69S {
    public final Object A00;
    public final String A01;

    public AnonymousClass69S(String str, Object obj) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69S) {
                AnonymousClass69S r5 = (AnonymousClass69S) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksTreeManagerVariableUpdate(variableIdentifier=");
        A0u.append(this.A01);
        A0u.append(", value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
