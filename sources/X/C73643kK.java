package X;

/* renamed from: X.3kK  reason: invalid class name and case insensitive filesystem */
public class C73643kK implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_index ON wa_biz_profiles_direct_connection_allowed_country_codes(wa_biz_profile_id);");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger", "CREATE TRIGGER wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = old._id; END");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0R(A00, r2, "wa_biz_profile_id", A0l, C63573Ko.A0g(A00, r2, A0l));
        A00.A02 = "country_code";
        C63573Ko.A0T(A00, C52502pX.TEXT, A0l);
        r7.A0B("wa_biz_profiles_direct_connection_allowed_country_codes", A0l);
    }
}
