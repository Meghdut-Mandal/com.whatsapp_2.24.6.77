package X;

/* renamed from: X.6B3  reason: invalid class name */
public final class AnonymousClass6B3 {
    public final String A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B3) {
                AnonymousClass6B3 r5 = (AnonymousClass6B3) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36381kD.A08(this.A00, AnonymousClass000.A0H(this.A01) * 31));
    }

    public AnonymousClass6B3(Integer num, String str, String str2) {
        this.A01 = num;
        this.A00 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModelAssetMetadata(bytecodeVersion=");
        A0u.append(this.A01);
        A0u.append(", fileName=");
        A0u.append(this.A00);
        A0u.append(", operators=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
