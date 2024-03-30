package X;

/* renamed from: X.3Jo  reason: invalid class name and case insensitive filesystem */
public final class C63313Jo {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63313Jo) {
                C63313Jo r5 = (C63313Jo) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36421kH.A04(this.A03) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02)) * 31) + this.A00;
    }

    public C63313Jo(Integer num, Integer num2, String str, int i) {
        this.A03 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ThunderstormContactItem(text=");
        A0u.append(this.A03);
        A0u.append(", icon=");
        A0u.append(this.A01);
        A0u.append(", subtitle=");
        A0u.append(this.A02);
        A0u.append(", viewType=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
