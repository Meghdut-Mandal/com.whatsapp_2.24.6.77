package X;

/* renamed from: X.2TO  reason: invalid class name */
public final class AnonymousClass2TO extends C78353ry {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void B7J(AnonymousClass3T1 r6) {
        AnonymousClass00C.A0D(r6, 0);
        super.B7J(r6);
        AnonymousClass1F3.A09((AnonymousClass1F3) this.A00.get(), (C23043B1o) r6, "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?", r6.A1N);
        C25101Ez.A01((C25101Ez) this.A01.get(), (C46852bm) r6, "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_product WHERE message_row_id= ?", "GET_PRODUCT_MESSAGE_SQL");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
        AnonymousClass3T1.A09(r2, this.A00);
        ((C25101Ez) this.A01.get()).A02((C46852bm) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
        AnonymousClass3T1.A09(r2, this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2TO(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        super(r1, r2, r3);
        C36321k7.A1B(r1, r2, r3, r4, r5);
        this.A01 = r4;
        this.A00 = r5;
    }
}
