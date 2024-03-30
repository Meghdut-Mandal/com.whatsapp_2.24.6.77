package X;

/* renamed from: X.8oD  reason: invalid class name and case insensitive filesystem */
public final class C181898oD extends C200259gz {
    public final C202029kv A00;

    public C181898oD(C202029kv r1, C207219uk r2, AnonymousClass9IS r3) {
        super(r2, r3);
        this.A00 = r1;
    }

    public String A09() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C200259gz.A02(super.A09(), "\n", A0u);
        for (C206689to r1 : this.A02.A0C) {
            String str = r1.A01;
            A0u.append(str);
            C200259gz.A02(str, "\n", A0u);
            for (C206729ts r2 : r1.A02) {
                C200259gz.A02(r2.A03, " ", A0u);
                C200259gz.A02(r2.A00, "\n", A0u);
            }
        }
        return C36381kD.A0y(A0u);
    }

    public void A0F(C196159Xy r2, AnonymousClass3T1 r3) {
        C36321k7.A0w(r2, r3);
        C203369nr.A06(this.A00, r2, r3);
    }
}
