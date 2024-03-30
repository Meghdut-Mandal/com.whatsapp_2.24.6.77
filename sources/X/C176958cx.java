package X;

/* renamed from: X.8cx  reason: invalid class name and case insensitive filesystem */
public final class C176958cx extends AnonymousClass9VD {
    public C187958yo A00;
    public C199649fg A01 = C199649fg.A01;
    public C176988d0 A02;
    public C176918ct A03;
    public C019108d A04;
    public final AnonymousClass9OL A05;

    public C176958cx(AnonymousClass9OL r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A05 = r2;
    }

    public static void A00(C176958cx r1, Class cls) {
        r1.A04 = new C019308f(cls);
        r1.A00 = C187958yo.IN_DEVELOPMENT;
    }

    public static void A01(C176958cx r1, Class cls) {
        r1.A04 = new C019308f(cls);
        r1.A00 = C187958yo.FULLY_INTEGRATED;
    }

    public final void A08(C006302t r2) {
        if (this.A03 == null) {
            Object obj = this.A05.A03.get();
            AnonymousClass00C.A08(obj);
            C176918ct A0O = C165597tg.A0O(obj);
            this.A03 = A0O;
            A0O.A06();
            r2.invoke(A0O);
            AnonymousClass9VD.A04(A0O);
            return;
        }
        throw AnonymousClass9VD.A03(this, "Only one integrationPoint{} is allowed. Multiple detected.");
    }
}
