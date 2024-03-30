package X;

/* renamed from: X.3kL  reason: invalid class name and case insensitive filesystem */
public class C73653kL implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_website_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_websites_trigger", "CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0R(A00, r2, "wa_biz_profile_id", A0l, C63573Ko.A0g(A00, r2, A0l));
        A00.A02 = "websites";
        C63573Ko.A0T(A00, C52502pX.TEXT, A0l);
        r7.A0B("wa_biz_profiles_websites", A0l);
    }
}
