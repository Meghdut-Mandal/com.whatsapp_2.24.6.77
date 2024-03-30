package X;

/* renamed from: X.69M  reason: invalid class name */
public final class AnonymousClass69M {
    public Integer A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69M) {
                AnonymousClass69M r5 = (AnonymousClass69M) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A04 = C36421kH.A04(this.A01);
        Integer num = this.A00;
        return C90494aF.A0B(num, AnonymousClass6GL.A00(num), A04);
    }

    public AnonymousClass69M(String str, Integer num) {
        C36321k7.A0x(str, num);
        this.A01 = str;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IdAndState(id=");
        A0u.append(this.A01);
        A0u.append(", state=");
        return C36321k7.A0E(AnonymousClass6GL.A00(this.A00), A0u);
    }
}
