package X;

/* renamed from: X.6uu  reason: invalid class name and case insensitive filesystem */
public final class C146026uu implements C159497jS {
    public final AnonymousClass7hN A00;
    public final AnonymousClass1UG A01;
    public final AnonymousClass39Q A02;
    public final C23871Ae A03;

    public void Blp(C160087kR r6) {
        if (((AnonymousClass1XW) this.A02.A04.get()).A00() != null) {
            AnonymousClass1UG r3 = this.A01;
            AnonymousClass6P0 r2 = C113335fN.A00;
            AnonymousClass6GB r1 = new AnonymousClass6GB(this, 0);
            AnonymousClass00C.A0D(r2, 1);
            r3.B4Z(r2, (C110925bS) null, r1, (Long) null).Blp(r6);
            return;
        }
        Exception exc = new Exception("Trying to send Avatar GQL request without existing user.");
        this.A03.A02(0, "GQL request without user acount", (String) null);
        r6.BWk(exc);
    }

    public C146026uu(AnonymousClass1UG r1, AnonymousClass39Q r2, AnonymousClass7hN r3, C23871Ae r4) {
        C36321k7.A18(r4, r2, r1, r3);
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }
}
