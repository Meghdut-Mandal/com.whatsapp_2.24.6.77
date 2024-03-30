package X;

import android.text.TextUtils;

/* renamed from: X.3kt  reason: invalid class name and case insensitive filesystem */
public class C73993kt implements AnonymousClass15z {
    public static final String A00;
    public static final String[] A01;

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    static {
        String[] strArr = {"wa_contacts._id", "wa_contacts.jid", "is_whatsapp_user", "status", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "status_timestamp", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported", "is_sidelist_synced", "is_business_synced", "disappearing_mode_duration", "disappearing_mode_timestamp", "history_sync_initial_phash", "is_starred", "is_wa_created_contact", "sync_policy", "status_emoji", "is_contact_synced", "verified_name", "expires", "verified_level", "issuer", "identity_unconfirmed_since", "serial", "host_storage", "actual_actors", "privacy_mode_ts", "description", "description_id_string", "description_time", "description_setter_jid", "restrict_mode", "announcement_group", "no_frequently_forwarded", "ephemeral_duration", "creator_jid", "in_app_support", "is_suspended", "require_membership_approval", "member_add_mode", "incognito", "group_state", "is_pending_requests_banner_acknowledged", "addressing_mode", "is_report_to_admin_enabled", "allow_non_admin_subgroup_creation", "is_pending_suggestions_banner_acknowledged", "is_name_group_banner_dismissed", "history_enabled", "auto_add_disabled", "automated_type"};
        A01 = strArr;
        A00 = TextUtils.join(", ", strArr);
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("is_wa_index", " CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        r5.A07("jid_index", " CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[34];
        C52502pX A012 = C52502pX.A01(A002);
        A002.A00 = A012;
        boolean A0k = C63573Ko.A0k(A002, r2);
        A002.A02 = "jid";
        C52502pX r5 = C52502pX.TEXT;
        C63573Ko.A0W(A002, r5, r2, true);
        A002.A02 = "is_whatsapp_user";
        C52502pX r6 = C52502pX.BOOLEAN;
        C63573Ko.A0Y(A002, r6, r2, true);
        C63573Ko.A09(A002, r5, "status", r2);
        C63573Ko.A0A(A002, A012, "status_timestamp", r2);
        C63573Ko.A0B(A002, r5, "number", r2);
        C63573Ko.A0C(A002, A012, "raw_contact_id", r2);
        C63573Ko.A0D(A002, r5, "display_name", r2);
        C63573Ko.A0E(A002, A012, "phone_type", r2);
        C63573Ko.A0F(A002, r5, "phone_label", r2);
        C63573Ko.A0G(A002, A012, "unseen_msg_count", r2);
        C63573Ko.A0H(A002, A012, "photo_ts", r2);
        C63573Ko.A0I(A002, A012, "thumb_ts", r2);
        C63573Ko.A0J(A002, A012, "photo_id_timestamp", r2);
        C63573Ko.A0K(A002, r5, "given_name", r2);
        C63573Ko.A0L(A002, r5, "family_name", r2);
        C63573Ko.A0M(A002, r5, "wa_name", r2);
        C63573Ko.A0N(A002, r5, "sort_name", r2);
        C63573Ko.A0O(A002, r5, "nickname", r2);
        C63573Ko.A0P(A002, r5, "company", r2);
        r2[20] = C63573Ko.A02(A002, r5, "title");
        r2[21] = C63573Ko.A02(A002, A012, "status_autodownload_disabled");
        r2[22] = C63573Ko.A02(A002, A012, "keep_timestamp");
        r2[23] = C63573Ko.A02(A002, A012, "is_spam_reported");
        r2[24] = C63573Ko.A03(A002, r6, "is_sidelist_synced", A0k ? 1 : 0);
        r2[25] = C63573Ko.A03(A002, r6, "is_business_synced", A0k);
        r2[26] = C63573Ko.A02(A002, A012, "disappearing_mode_duration");
        A002.A02 = "disappearing_mode_timestamp";
        A002.A00 = C52502pX.LONG;
        r2[27] = A002.A0r();
        r2[28] = C63573Ko.A02(A002, r5, "history_sync_initial_phash");
        r2[29] = C63573Ko.A02(A002, r6, "is_starred");
        r2[30] = C63573Ko.A02(A002, r6, "is_wa_created_contact");
        r2[31] = C63573Ko.A02(A002, A012, "sync_policy");
        r2[32] = C63573Ko.A02(A002, r5, "status_emoji");
        r2[33] = C63573Ko.A02(A002, A012, "is_contact_synced");
        r10.A0B("wa_contacts", r2);
    }
}
