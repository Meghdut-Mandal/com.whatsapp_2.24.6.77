package X;

/* renamed from: X.4v9  reason: invalid class name and case insensitive filesystem */
public final class C100514v9 extends C100534vB {
    public final AnonymousClass69R A00;
    public final C118825on A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100514v9) {
                C100514v9 r5 = (C100514v9) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36421kH.A04(this.A02)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100514v9(AnonymousClass69R r1, C118825on r2, String str) {
        super(r2, str);
        C36321k7.A0y(str, r2);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParseResult(key=");
        A0u.append(this.A02);
        A0u.append(", result=");
        A0u.append(this.A00);
        A0u.append(", summary=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
