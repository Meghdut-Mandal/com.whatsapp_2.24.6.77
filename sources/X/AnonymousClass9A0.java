package X;

/* renamed from: X.9A0  reason: invalid class name */
public abstract class AnonymousClass9A0 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass1M2.A01("wa_biz_profile_to_service_offerings", new String[]{"wa_biz_category_service_offerings_id", "wa_biz_profile_id", "is_offered"}));
        A0z.append(",");
        A0z.append(AnonymousClass1M2.A01("wa_biz_category_service_offerings", new String[]{"_id", "category_id", "category_name", "offering_name"}));
        A0z.append(" FROM ");
        A0z.append("wa_biz_profile_to_service_offerings");
        A0z.append(" INNER JOIN ");
        A0z.append("wa_biz_category_service_offerings");
        A0z.append(" ON ");
        A0z.append("wa_biz_profile_to_service_offerings.wa_biz_profile_id");
        A0z.append(" = ? AND ");
        A0z.append("wa_biz_category_service_offerings._id");
        A0z.append(" = ");
        A00 = AnonymousClass000.A0q("wa_biz_profile_to_service_offerings.wa_biz_category_service_offerings_id", A0z);
    }
}
