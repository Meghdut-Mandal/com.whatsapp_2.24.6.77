package X;

/* renamed from: X.AAl  reason: case insensitive filesystem */
public class C21151AAl implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_service_offerings_index", " CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_id_service_offerings_index ON wa_biz_profile_to_service_offerings (wa_biz_profile_id, wa_biz_category_service_offerings_id);");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko r3 = new C63573Ko();
        C64563Om[] r2 = new C64563Om[4];
        C52502pX A0R = C165577te.A0R(r3, r2);
        r3.A02 = "wa_biz_profile_id";
        r3.A00 = A0R;
        r3.A04 = true;
        C63573Ko.A0e(r3, r2, 1);
        r3.A02 = "wa_biz_category_service_offerings_id";
        C63573Ko.A0Y(r3, C52502pX.TEXT, r2, true);
        r3.A02 = "is_offered";
        C63573Ko.A0Z(r3, C52502pX.BOOLEAN, r2, true);
        r6.A0B("wa_biz_profile_to_service_offerings", r2);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_biz_profile_to_service_offerings_trigger", "CREATE TRIGGER business_profiles_bd_for_biz_profile_to_service_offerings_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profile_to_service_offerings WHERE wa_biz_profile_id = old._id; END");
    }
}
