package X;

/* renamed from: X.99z  reason: invalid class name and case insensitive filesystem */
public abstract class C1907099z {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass14B.A08(", ", "area_description", "radius", "center_latitude", "center_longitude"));
        A0z.append(" FROM ");
        C36381kD.A1O(A0z, "wa_biz_profiles_service_areas");
        A0z.append("wa_biz_profile_id");
        A00 = AnonymousClass000.A0q(" = ?", A0z);
    }
}
