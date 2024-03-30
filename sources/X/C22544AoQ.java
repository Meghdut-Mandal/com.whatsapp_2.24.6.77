package X;

/* renamed from: X.AoQ  reason: case insensitive filesystem */
public final class C22544AoQ extends AnonymousClass00R implements C006302t {
    public static final C22544AoQ A00 = new C22544AoQ();

    public C22544AoQ() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C176948cw r4 = (C176948cw) obj;
        AnonymousClass00C.A0D(r4, 0);
        r4.A04 = C36441kJ.A1A(AnonymousClass17K.class);
        r4.A00 = C187958yo.FULLY_INTEGRATED;
        C22543AoP aoP = C22543AoP.A00;
        AnonymousClass00C.A0D(aoP, 0);
        if (r4.A03 == null) {
            Object obj2 = r4.A05.A02.get();
            AnonymousClass00C.A08(obj2);
            C176938cv r0 = (C176938cv) obj2;
            AnonymousClass00C.A0D(r0, 0);
            r4.A03 = r0;
            r0.A06();
            aoP.invoke(r0);
            AnonymousClass9VD.A04(r0);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass9VD.A03(r4, "Only one integrationPoint{} is allowed. Multiple detected.");
    }
}
