package X;

/* renamed from: X.54J  reason: invalid class name */
public final class AnonymousClass54J extends C110495al {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass54J) {
                AnonymousClass54J r5 = (AnonymousClass54J) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A00, C36421kH.A04(this.A01));
    }

    public AnonymousClass54J(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StaticFilter(filterType=");
        A0u.append(this.A01);
        A0u.append(", filterName=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
