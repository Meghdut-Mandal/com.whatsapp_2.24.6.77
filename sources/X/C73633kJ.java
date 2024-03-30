package X;

/* renamed from: X.3kJ  reason: invalid class name and case insensitive filesystem */
public final class C73633kJ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("dc_enabled_features_biz_profile_id_index", "CREATE INDEX IF NOT EXISTS dc_enabled_features_biz_profile_id_index ON wa_biz_profiles_dc_enabled_features(wa_biz_profile_id);");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A08("before_delete_dc_enabled_features_trigger", "CREATE TRIGGER before_delete_dc_enabled_features_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = old._id; END");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0l = C63573Ko.A0l(A01);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0R(A01, r2, "wa_biz_profile_id", A0l, C63573Ko.A0f(A01, r2, A0l));
        A01.A02 = "catalog_feature_type";
        C63573Ko.A0T(A01, C52502pX.TEXT, A0l);
        r7.A0B("wa_biz_profiles_dc_enabled_features", A0l);
    }
}
