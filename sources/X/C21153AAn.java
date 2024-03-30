package X;

/* renamed from: X.AAn  reason: case insensitive filesystem */
public class C21153AAn implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_category_id_service_offerings_index", " CREATE UNIQUE INDEX IF NOT EXISTS biz_category_id_service_offerings_index ON wa_biz_category_service_offerings(_id, category_id);");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko r5 = new C63573Ko();
        C64563Om[] r4 = new C64563Om[4];
        r5.A02 = "_id";
        C52502pX r3 = C52502pX.TEXT;
        r5.A00 = r3;
        r5.A0t();
        r5.A04 = true;
        r4[0] = r5.A0r();
        r4[1] = C63573Ko.A05(r5, r3, "category_id", true);
        r5.A02 = "category_name";
        C63573Ko.A0Y(r5, r3, r4, true);
        r5.A02 = "offering_name";
        C63573Ko.A0Z(r5, r3, r4, true);
        r8.A0B("wa_biz_category_service_offerings", r4);
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
