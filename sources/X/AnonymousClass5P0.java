package X;

/* renamed from: X.5P0  reason: invalid class name */
public final class AnonymousClass5P0 extends C1511478k {
    public final int errorCode;
    public final String errorMessage;

    public AnonymousClass5P0(int i) {
        this.errorCode = i;
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5P0) {
                AnonymousClass5P0 r5 = (AnonymousClass5P0) obj;
                if (this.errorCode != r5.errorCode || !AnonymousClass00C.A0J(this.errorMessage, r5.errorMessage)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorCode * 31) + C36341k9.A09(this.errorMessage);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostGenericError(errorCode=");
        A0u.append(this.errorCode);
        A0u.append(", errorMessage=");
        return C36321k7.A0E(this.errorMessage, A0u);
    }

    public AnonymousClass5P0() {
        this(-1);
    }
}
