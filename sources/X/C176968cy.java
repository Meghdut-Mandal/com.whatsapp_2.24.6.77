package X;

/* renamed from: X.8cy  reason: invalid class name and case insensitive filesystem */
public final class C176968cy extends AnonymousClass9VD {
    public C187958yo A00;
    public C199649fg A01 = C199649fg.A01;
    public C176998d1 A02;
    public C176878cp A03;
    public C176908cs A04;
    public Integer A05;
    public C019108d A06;
    public final AnonymousClass9OL A07;

    public C176968cy(AnonymousClass9OL r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A07 = r2;
    }

    public final C176908cs A08() {
        if (this.A04 == null) {
            C176908cs A022 = AnonymousClass9VD.A02(this.A07.A05);
            this.A04 = A022;
            return A022;
        }
        throw AnonymousClass9VD.A03(this, "Only one integrations{} is allowed. Multiple detected.");
    }
}
