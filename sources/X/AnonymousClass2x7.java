package X;

/* renamed from: X.2x7  reason: invalid class name */
public abstract class AnonymousClass2x7 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String str = C73993kt.A00;
        A0u.append(str);
        A0u.append(" FROM ");
        String A1C = C36431kI.A1C("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A0u);
        A0u.append("is_whatsapp_user");
        A0u.append("= 1 AND ");
        A0u.append("raw_contact_id");
        A0u.append("=");
        A0u.append(-4);
        A0u.append(" ORDER BY ");
        A0u.append("display_name");
        A0u.append(", ");
        A0u.append("wa_contacts.jid");
        A0u.append(", ");
        A0u.append("phone_type");
        A0B = AnonymousClass000.A0q(" ASC", A0u);
        A05 = AnonymousClass000.A0q("wa_contacts.jid LIKE ?", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        A06 = AnonymousClass000.A0q("wa_contacts.number = ?", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        A04 = AnonymousClass000.A0q("wa_contacts.jid = ?", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        A07 = AnonymousClass000.A0q("wa_contacts._id = ?", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        A08 = AnonymousClass000.A0q("raw_contact_id = ? AND number = ?", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        StringBuilder A0I = C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C);
        A0I.append("wa_contacts.jid LIKE '%@g.us'");
        A0I.append(" OR ");
        A01 = AnonymousClass000.A0q("wa_contacts.jid LIKE '%@temp'", A0I);
        A03 = AnonymousClass000.A0q("wa_contacts.jid LIKE '%lid'", C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C));
        StringBuilder A0I2 = C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C);
        String A0r = C36401kF.A0r("is_whatsapp_user = 1", A0I2);
        A0I2.append("wa_contacts.jid != 'broadcast'");
        A0I2.append(A0r);
        A0I2.append("wa_contacts.jid NOT LIKE '%@broadcast'");
        A0I2.append(A0r);
        A0I2.append("wa_contacts.jid NOT LIKE '%@g.us'");
        A0I2.append(A0r);
        A0I2.append("wa_contacts.jid NOT LIKE '%@temp'");
        A0I2.append(A0r);
        A0I2.append("wa_contacts.jid NOT LIKE '%@newsletter'");
        A0I2.append(A0r);
        A02 = AnonymousClass000.A0q("wa_contacts.jid != ?", A0I2);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36321k7.A1O("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A0u2);
        A00 = A0u2.toString();
        StringBuilder A0I3 = C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C);
        A0I3.append("wa_contacts.is_wa_created_contact = 1");
        A0I3.append(A0r);
        A09 = AnonymousClass000.A0q("wa_contacts.sync_policy != 0", A0I3);
        StringBuilder A0I4 = C36321k7.A0I("SELECT ", str, " FROM ", "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)", A1C);
        A0I4.append("wa_contacts.is_wa_created_contact = 1");
        A0I4.append(A0r);
        A0A = AnonymousClass000.A0q("wa_contacts.sync_policy = 1", A0I4);
    }
}
