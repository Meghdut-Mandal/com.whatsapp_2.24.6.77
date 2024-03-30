package X;

/* renamed from: X.1JS  reason: invalid class name */
public final class AnonymousClass1JS extends C007303d {
    public final C21860zv A00;
    public final AnonymousClass1JR A01;

    public AnonymousClass1JS(C21860zv r2, AnonymousClass1JR r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void A03(AnonymousClass02E r5, AnonymousClass01z r6) {
        if (r5.A0l) {
            this.A00.A02(r5.getClass().getSimpleName(), "resumed visible");
            this.A01.A00(r5, 1);
        }
    }

    public void A02(AnonymousClass02E r4, AnonymousClass01z r5) {
        if (r4.A0l) {
            this.A00.A02(r4.getClass().getSimpleName(), "Pause");
            this.A01.A00(r4, 2);
        }
    }
}
