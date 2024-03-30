package X;

/* renamed from: X.8cz  reason: invalid class name and case insensitive filesystem */
public final class C176978cz extends AnonymousClass9VD {
    public int A00 = -1;
    public C187958yo A01;
    public C199649fg A02 = C199649fg.A01;
    public C176998d1 A03;
    public C176878cp A04;
    public C176908cs A05;
    public C176888cq A06;
    public C019108d A07;
    public final AnonymousClass9O4 A08;

    public final C176908cs A08() {
        if (this.A05 == null) {
            C176908cs A022 = AnonymousClass9VD.A02(this.A08.A04);
            this.A05 = A022;
            return A022;
        }
        throw AnonymousClass9VD.A03(this, "Only one integrations{} is allowed. Multiple detected.");
    }

    public final C176888cq A09() {
        if (this.A06 == null) {
            Object obj = this.A08.A07.get();
            AnonymousClass00C.A08(obj);
            C176888cq r1 = (C176888cq) obj;
            AnonymousClass00C.A0D(r1, 0);
            this.A06 = r1;
            return r1;
        }
        throw AnonymousClass9VD.A03(this, "Only one systemActionsBuilder{} is allowed. Multiple detected.");
    }

    public C176978cz(AnonymousClass9O4 r2) {
        this.A08 = r2;
    }
}
