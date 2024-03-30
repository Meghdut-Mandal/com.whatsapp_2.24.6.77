package X;

/* renamed from: X.AAm  reason: case insensitive filesystem */
public class C21152AAm implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("biz_profile_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko r4 = new C63573Ko();
        C64563Om[] r2 = new C64563Om[37];
        r4.A02 = "_id";
        C52502pX r3 = C52502pX.INTEGER;
        r4.A00 = r3;
        r4.A0t();
        r4.A0s();
        r2[0] = r4.A0r();
        r4.A02 = "jid";
        C52502pX r7 = C52502pX.TEXT;
        r4.A00 = r7;
        r4.A04 = true;
        C63573Ko.A0e(r4, r2, 1);
        C63573Ko.A08(r4, r7, "email", r2);
        C63573Ko.A09(r4, r7, "address", r2);
        C63573Ko.A0A(r4, r7, "business_description", r2);
        r4.A02 = "latitude";
        C52502pX r5 = C52502pX.REAL;
        r4.A00 = r5;
        r2[5] = r4.A0r();
        C63573Ko.A0C(r4, r5, "longitude", r2);
        C63573Ko.A0D(r4, r7, "tag", r2);
        C63573Ko.A0E(r4, r7, "vertical", r2);
        C63573Ko.A0F(r4, r7, "time_zone", r2);
        C63573Ko.A0G(r4, r7, "hours_note", r2);
        r4.A02 = "has_catalog";
        C52502pX r52 = C52502pX.BOOLEAN;
        r4.A00 = r52;
        r4.A0u(0);
        r2[11] = r4.A0r();
        C63573Ko.A0I(r4, r7, "address_postal_code", r2);
        C63573Ko.A0J(r4, r7, "address_city_id", r2);
        C63573Ko.A0K(r4, r7, "address_city_name", r2);
        C63573Ko.A0L(r4, r7, "commerce_experience", r2);
        C63573Ko.A0M(r4, r7, "shop_url", r2);
        r2[17] = C63573Ko.A03(r4, r52, "cart_enabled", 0);
        C63573Ko.A0O(r4, r7, "commerce_manager_url", r2);
        r2[19] = C63573Ko.A03(r4, r52, "direct_connection_enabled", 0);
        r2[20] = C63573Ko.A03(r4, r52, "is_shop_banned", 0);
        r2[21] = C63573Ko.A02(r4, r7, "default_postcode");
        r2[22] = C63573Ko.A02(r4, r7, "location_name");
        r2[23] = C63573Ko.A03(r4, r52, "galaxy_business_enabled", 0);
        r2[24] = C63573Ko.A02(r4, r7, "cover_photo_url");
        r2[25] = C63573Ko.A02(r4, r7, "cover_photo_id");
        r2[26] = C63573Ko.A02(r4, r7, "custom_url");
        r2[27] = C63573Ko.A02(r4, r7, "member_since");
        r2[28] = C63573Ko.A03(r4, r52, "capi_calling_enabled", 0);
        r2[29] = C63573Ko.A03(r4, r52, "is_responsive", 0);
        r2[30] = C63573Ko.A02(r4, r7, "postcode_type");
        r2[31] = C63573Ko.A02(r4, r7, "price_tier_id");
        r2[32] = C63573Ko.A02(r4, r7, "business_blocked_status");
        r2[33] = C63573Ko.A02(r4, r3, "survey_sampling_rate");
        r2[34] = C63573Ko.A03(r4, r52, "is_offerings_eligible", 0);
        r2[35] = C63573Ko.A02(r4, r3, "automated_type");
        r2[36] = C63573Ko.A02(r4, r3, "welcome_message_protocol_mode");
        r10.A0B("wa_biz_profiles", r2);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("contact_bd_for_business_profiles", "CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        r5.A08("contact_bu_for_business_profiles", "CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
    }
}
