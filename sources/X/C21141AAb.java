package X;

/* renamed from: X.AAb  reason: case insensitive filesystem */
public class C21141AAb implements AnonymousClass15z {
    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko r3 = new C63573Ko();
        C64563Om[] r2 = new C64563Om[13];
        C52502pX A0C = C165567td.A0C(r3, "message_row_id", r2);
        r2[1] = C63573Ko.A02(r3, A0C, "business_owner_jid");
        r3.A02 = "product_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0T(r3, r1, r2);
        C63573Ko.A09(r3, r1, "title", r2);
        C63573Ko.A0A(r3, r1, "description", r2);
        C63573Ko.A0B(r3, r1, "currency_code", r2);
        C63573Ko.A0C(r3, A0C, "amount_1000", r2);
        C63573Ko.A0D(r3, r1, "retailer_id", r2);
        C63573Ko.A0E(r3, r1, "url", r2);
        C63573Ko.A0F(r3, A0C, "product_image_count", r2);
        C63573Ko.A0G(r3, A0C, "sale_amount_1000", r2);
        C63573Ko.A0H(r3, r1, "body", r2);
        C63573Ko.A0I(r3, r1, "footer", r2);
        r7.A0B("message_quoted_product", r2);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A01(C63843Lq.A00("message_quoted", "message_quoted_product", "message_row_id=old.message_row_id"));
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
