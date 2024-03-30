package X;

/* renamed from: X.99w  reason: invalid class name and case insensitive filesystem */
public abstract class C1906799w {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass14B.A08(", ", "category_id", "category_name"));
        A0z.append(" FROM ");
        C36381kD.A1O(A0z, "wa_biz_profiles_categories");
        A0z.append("wa_biz_profile_id");
        A0z.append(" = ? ORDER BY ");
        A0z.append("_id");
        A00 = AnonymousClass000.A0q(" ASC", A0z);
    }
}
