package X;

/* renamed from: X.99x  reason: invalid class name and case insensitive filesystem */
public abstract class C1906899x {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass14B.A08(", ", "account_id", "account_type", "account_display_name", "account_fan_count", "account_has_media_post"));
        A0z.append(" FROM ");
        C36381kD.A1O(A0z, "wa_biz_profiles_linked_accounts_table");
        A0z.append("wa_biz_profile_id");
        A00 = AnonymousClass000.A0q(" = ?", A0z);
    }
}
