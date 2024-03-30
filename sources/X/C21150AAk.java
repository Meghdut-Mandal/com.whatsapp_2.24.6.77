package X;

/* renamed from: X.AAk  reason: case insensitive filesystem */
public class C21150AAk implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_service_area_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko r5 = new C63573Ko();
        C64563Om[] r4 = new C64563Om[6];
        C52502pX A0R = C165577te.A0R(r5, r4);
        r5.A02 = "wa_biz_profile_id";
        r5.A00 = A0R;
        r5.A04 = true;
        C63573Ko.A0e(r5, r4, 1);
        r5.A02 = "area_description";
        C63573Ko.A0T(r5, C52502pX.TEXT, r4);
        r5.A02 = "radius";
        C63573Ko.A0Z(r5, A0R, r4, true);
        r5.A02 = "center_latitude";
        C52502pX r2 = C52502pX.REAL;
        r5.A00 = r2;
        r5.A04 = true;
        r4[4] = r5.A0r();
        r4[5] = C63573Ko.A05(r5, r2, "center_longitude", true);
        r8.A0B("wa_biz_profiles_service_areas", r4);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_service_areas_trigger", "CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END");
    }
}
