package X;

/* renamed from: X.9Vf  reason: invalid class name */
public final class AnonymousClass9Vf {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9Vf) {
                AnonymousClass9Vf r5 = (AnonymousClass9Vf) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, this.A00 * 31);
    }

    public AnonymousClass9Vf(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CtwaConversionData(ctwaConversionSource=");
        A0u.append(this.A00);
        A0u.append(", ctwaConversionData=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
