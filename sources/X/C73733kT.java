package X;

/* renamed from: X.3kT  reason: invalid class name and case insensitive filesystem */
public class C73733kT implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_admin_settings_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A08("group_admin_settings_deletion_trigger", "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END");
    }

    public void B7q(AnonymousClass38H r10, C65063Qo r11) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[20];
        A00.A02 = "jid";
        C52502pX r7 = C52502pX.TEXT;
        A00.A00 = r7;
        A00.A04 = true;
        r3[0] = A00.A0r();
        A00.A02 = "restrict_mode";
        C52502pX r2 = C52502pX.BOOLEAN;
        C63573Ko.A0W(A00, r2, r3, true);
        r3[2] = C63573Ko.A04(A00, r2, "announcement_group", 0, true);
        r3[3] = C63573Ko.A04(A00, r2, "no_frequently_forwarded", 0, true);
        A00.A02 = "ephemeral_duration";
        C52502pX r8 = C52502pX.INTEGER;
        A00.A00 = r8;
        A00.A01 = "NULL";
        C63573Ko.A0c(A00, r3);
        C63573Ko.A0B(A00, r7, "creator_jid", r3);
        r3[6] = C63573Ko.A04(A00, r2, "in_app_support", 0, true);
        C63573Ko.A0D(A00, r2, "is_suspended", r3);
        r3[8] = C63573Ko.A04(A00, r8, "group_state", 0, true);
        r3[9] = C63573Ko.A04(A00, r2, "require_membership_approval", 0, true);
        r3[10] = C63573Ko.A04(A00, r8, "member_add_mode", 0, true);
        C63573Ko.A0H(A00, r2, "incognito", r3);
        r3[12] = C63573Ko.A04(A00, r2, "is_pending_requests_banner_acknowledged", 0, true);
        C63573Ko.A0J(A00, r2, "is_report_to_admin_enabled", r3);
        C63573Ko.A06(A00, r7, "addressing_mode", true);
        A00.A01 = "'pn'";
        r3[14] = A00.A0r();
        C63573Ko.A0L(A00, r2, "allow_non_admin_subgroup_creation", r3);
        r3[16] = C63573Ko.A04(A00, r2, "is_pending_suggestions_banner_acknowledged", 0, true);
        r3[17] = C63573Ko.A04(A00, r2, "is_name_group_banner_dismissed", 0, true);
        C63573Ko.A0O(A00, r2, "history_enabled", r3);
        C63573Ko.A0P(A00, r2, "auto_add_disabled", r3);
        r11.A0B("wa_group_admin_settings", r3);
    }
}
