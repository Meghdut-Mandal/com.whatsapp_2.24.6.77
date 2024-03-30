package X;

/* renamed from: X.4vA  reason: invalid class name and case insensitive filesystem */
public final class C100524vA extends C100534vB {
    public final AnonymousClass72B A00;
    public final C118825on A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100524vA) {
                C100524vA r5 = (C100524vA) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (C36421kH.A04(this.A02) + AnonymousClass000.A0H(this.A00)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100524vA(C118825on r1, AnonymousClass72B r2, String str) {
        super(r1, str);
        C36321k7.A0y(str, r1);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Resource(key=");
        A0u.append(this.A02);
        A0u.append(", resources=");
        A0u.append(this.A00);
        A0u.append(", summary=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
