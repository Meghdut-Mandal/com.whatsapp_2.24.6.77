package X;

/* renamed from: X.3oN  reason: invalid class name and case insensitive filesystem */
public final class C76133oN implements AnonymousClass4RP {
    public final AnonymousClass16D A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final AnonymousClass1EL A03;

    public boolean BMi(AnonymousClass3T1 r6) {
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 A032 = C65533Sl.A03(r6.A1J.A00);
        if (A032 == null) {
            return true;
        }
        int A05 = this.A01.A05(A032);
        if (A05 == 0 || A05 == 6 || A05 == 2) {
            AnonymousClass141 A08 = this.A00.A08(A032);
            if (!(A08 == null || A08.A0r || A08.A03 == 1)) {
                AnonymousClass17X r02 = this.A02;
                boolean A0C = r02.A0C(A032);
                boolean A0D = r02.A0D(A032);
                if (!A0C) {
                    return false;
                }
                if (A0D || !A08.A13) {
                    return true;
                }
                return false;
            }
        } else if (A05 != 3) {
            C36321k7.A1T("GroupPinInChatRestriction/isPinnable Unhandled group type ", AnonymousClass000.A0u(), A05);
        } else {
            AnonymousClass1EL r1 = this.A03;
            if (!r1.A00(r1.A00.A0D(A032))) {
                return this.A02.A0D(A032);
            }
        }
        return false;
    }

    public C76133oN(AnonymousClass16D r1, C220412q r2, AnonymousClass17X r3, AnonymousClass1EL r4) {
        C36321k7.A18(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
