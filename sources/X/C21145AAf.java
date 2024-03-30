package X;

/* renamed from: X.AAf  reason: case insensitive filesystem */
public final class C21145AAf implements AnonymousClass15z {
    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[6];
        A01.A02 = "wa_biz_profile_id";
        A01.A00 = C52502pX.INTEGER;
        A01.A0t();
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 0);
        A01.A02 = "sub_description";
        C52502pX r1 = C52502pX.TEXT;
        A01.A00 = r1;
        C63573Ko.A0e(A01, r3, 1);
        C63573Ko.A08(A01, r1, "commands", r3);
        C63573Ko.A09(A01, r1, "prompts", r3);
        C63573Ko.A0A(A01, r1, "commands_description", r3);
        C63573Ko.A0B(A01, r1, "bot_description", r3);
        r7.A0B("wa_biz_profiles_bot_attributes", r3);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A08("business_profiles_bd_for_bot_attributes_trigger", "CREATE TRIGGER business_profiles_bd_for_bot_attributes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = old._id; END");
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
