package X;

/* renamed from: X.AAh  reason: case insensitive filesystem */
public class C21147AAh implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_id_hours_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko r3 = new C63573Ko();
        C64563Om[] r2 = new C64563Om[6];
        C52502pX A0R = C165577te.A0R(r3, r2);
        r3.A02 = "wa_biz_profile_id";
        r3.A00 = A0R;
        r3.A04 = true;
        C63573Ko.A0e(r3, r2, 1);
        C63573Ko.A08(r3, A0R, "day_of_week", r2);
        C63573Ko.A09(r3, A0R, "mode", r2);
        C63573Ko.A0A(r3, A0R, "open_time", r2);
        C63573Ko.A0B(r3, A0R, "close_time", r2);
        r6.A0B("wa_biz_profiles_hours", r2);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_hours_trigger", "CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
    }
}
