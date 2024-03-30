package X;

/* renamed from: X.7SN  reason: invalid class name */
public final class AnonymousClass7SN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SN(AnonymousClass6YD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        AnonymousClass6YD r3 = this.this$0;
        if (number != null) {
            r3.A01 = number.intValue();
        }
        if (AnonymousClass6YD.A08(r3)) {
            Object A04 = r3.A06.A04();
            if (AnonymousClass6YD.A0P.A03(r3.A0C)) {
                C1502474n.A00(r3.A0E, r3, A04, number, 24);
            }
        }
        Number A0z = C36441kJ.A0z(r3.A05);
        if (A0z != null && A0z.intValue() == 98) {
            C1502474n.A00(r3.A0E, r3, number, r3.A06.A04(), 23);
        }
        return AnonymousClass0AJ.A00;
    }
}
