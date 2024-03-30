package X;

/* renamed from: X.8js  reason: invalid class name and case insensitive filesystem */
public final class C179288js extends AnonymousClass97J {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C179288js) {
                C179288js r5 = (C179288js) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A01);
    }

    public C179288js(int i, String str, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EventShowError(errorCode=");
        A0u.append(this.A00);
        A0u.append(", errorTitle=");
        A0u.append(this.A02);
        A0u.append(", errorMessage=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
