package X;

/* renamed from: X.55w  reason: invalid class name and case insensitive filesystem */
public final class C1035455w extends C1266865b {
    public final C125385zp A00;
    public final String A01;
    public final String A02;

    public C1035455w(C125385zp r2, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1035455w) {
                C1035455w r5 = (C1035455w) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36381kD.A08(this.A01, C36421kH.A04(this.A02)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerPackMore(id=");
        A0u.append(this.A02);
        A0u.append(", count=");
        C1266865b.A01(A0u, this.A01);
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
