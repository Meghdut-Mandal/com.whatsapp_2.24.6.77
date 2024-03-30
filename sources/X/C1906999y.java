package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.99y  reason: invalid class name and case insensitive filesystem */
public abstract class C1906999y {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass1M2.A01("wa_biz_profiles_price_tiers", new String[]{"_id", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "symbol"}));
        A00 = AnonymousClass000.A0q(" FROM wa_biz_profiles_price_tiers INNER JOIN wa_biz_profiles ON wa_biz_profiles._id = ? AND wa_biz_profiles.price_tier_id = wa_biz_profiles_price_tiers._id", A0z);
    }
}
