package X;

/* renamed from: X.2TG  reason: invalid class name */
public final class AnonymousClass2TG extends C78353ry {
    public final AnonymousClass005 A00;

    public void B7J(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        super.B7J(r4);
        C25101Ez.A01((C25101Ez) this.A00.get(), (C46852bm) r4, "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_product WHERE message_row_id= ?", "GET_PRODUCT_MESSAGE_SQL");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
        ((C25101Ez) this.A00.get()).A02((C46852bm) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2TG(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        super(r1, r2, r3);
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
