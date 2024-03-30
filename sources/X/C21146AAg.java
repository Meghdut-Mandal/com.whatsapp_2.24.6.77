package X;

/* renamed from: X.AAg  reason: case insensitive filesystem */
public class C21146AAg implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_category_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko r4 = new C63573Ko();
        C64563Om[] r3 = new C64563Om[4];
        C52502pX A0R = C165577te.A0R(r4, r3);
        r4.A02 = "wa_biz_profile_id";
        r4.A00 = A0R;
        r4.A04 = true;
        C63573Ko.A0e(r4, r3, 1);
        r4.A02 = "category_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0Y(r4, r1, r3, true);
        r4.A02 = "category_name";
        C63573Ko.A0Z(r4, r1, r3, true);
        r7.A0B("wa_biz_profiles_categories", r3);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_categories_trigger", "CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
    }
}
