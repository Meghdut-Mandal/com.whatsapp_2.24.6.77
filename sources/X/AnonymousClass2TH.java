package X;

/* renamed from: X.2TH  reason: invalid class name */
public final class AnonymousClass2TH extends C78353ry {
    public final AnonymousClass005 A00;

    public void B7J(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        super.B7J(r5);
        C25061Ev.A00((C25061Ev) this.A00.get(), (C46952bw) r5, "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_order WHERE message_row_id=?", "GET_ORDER_MESSAGE_SQL", false);
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
        ((C25061Ev) this.A00.get()).A01((C46952bw) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
        ((C25061Ev) this.A00.get()).A01((C46952bw) r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2TH(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        super(r1, r2, r3);
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
