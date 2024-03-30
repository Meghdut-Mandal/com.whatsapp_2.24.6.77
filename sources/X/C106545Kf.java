package X;

/* renamed from: X.5Kf  reason: invalid class name and case insensitive filesystem */
public final class C106545Kf extends C1268665y {
    public final AnonymousClass68B A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106545Kf) {
                C106545Kf r5 = (C106545Kf) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C106545Kf(AnonymousClass68B r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Preview(packId=");
        A0u.append(this.A01);
        A0u.append(", pack=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
