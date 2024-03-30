package X;

/* renamed from: X.71R  reason: invalid class name */
public final class AnonymousClass71R implements AnonymousClass7i2 {
    public final C116115jy A00;
    public final C19770wU A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public void B7B(C128726Dj r9) {
        C124025xT r3 = (C124025xT) this.A03.get();
        AnonymousClass62G r4 = new AnonymousClass62G(r9, this);
        AnonymousClass005 r7 = r3.A01.A00;
        if (C36341k9.A0B(C36391kE.A0H(r7), "pre_consent_bloks_integrity_timestamp") > C19970wo.A00(r3.A00)) {
            int A012 = C36371kC.A01(C36391kE.A0H(r7), "pre_consent_bloks_integrity_disclosure_id");
            String string = C36391kE.A0H(r7).getString("pre_consent_bloks_integrity_df_token", "");
            AnonymousClass00C.A08(string);
            r4.A00(A012, string);
            return;
        }
        C130266Kk r2 = r3.A02;
        C130266Kk.A00(C128936Ee.A00(), new C120385rQ(r4, r3), r2);
    }

    public AnonymousClass71R(C116115jy r1, C19770wU r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r2, r3, r1, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
