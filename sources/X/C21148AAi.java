package X;

/* renamed from: X.AAi  reason: case insensitive filesystem */
public class C21148AAi implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("wa_biz_profiles_linked_accounts_index", " CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko r6 = new C63573Ko();
        C64563Om[] r3 = new C64563Om[7];
        r6.A02 = "_id";
        C52502pX r5 = C52502pX.INTEGER;
        r6.A00 = r5;
        r6.A0t();
        r6.A0s();
        r3[0] = r6.A0r();
        r6.A02 = "wa_biz_profile_id";
        r6.A00 = r5;
        r6.A04 = true;
        C63573Ko.A0e(r6, r3, 1);
        r6.A02 = "account_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0Y(r6, r1, r3, true);
        r6.A02 = "account_type";
        C63573Ko.A0Z(r6, r5, r3, true);
        r3[4] = C63573Ko.A05(r6, r1, "account_display_name", true);
        r3[5] = C63573Ko.A05(r6, r5, "account_fan_count", true);
        r3[6] = C63573Ko.A04(r6, r5, "account_has_media_post", 0, true);
        r9.A0B("wa_biz_profiles_linked_accounts_table", r3);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("business_profiles_bd_for_linked_accounts_trigger", "CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END");
    }
}
