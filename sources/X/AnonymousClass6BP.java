package X;

/* renamed from: X.6BP  reason: invalid class name */
public final class AnonymousClass6BP {
    public int A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BP) {
                AnonymousClass6BP r5 = (AnonymousClass6BP) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass6BP(Integer num, String str, int i) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsEntrypointMetadata(flowEntryPoint=");
        A0u.append(this.A00);
        A0u.append(", clickSequenceNumber=");
        A0u.append(this.A01);
        A0u.append(", adContext=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
