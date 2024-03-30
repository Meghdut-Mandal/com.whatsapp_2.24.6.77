package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.AAj  reason: case insensitive filesystem */
public final class C21149AAj implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("biz_profile_id_price_tier_index", "CREATE INDEX IF NOT EXISTS biz_profile_id_price_tier_index ON wa_biz_profiles_price_tiers(_id);");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "_id";
        C52502pX r2 = C52502pX.TEXT;
        A01.A00 = r2;
        A01.A0t();
        C63573Ko.A0e(A01, r3, 0);
        r3[1] = C63573Ko.A02(A01, r2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C63573Ko.A08(A01, r2, "symbol", r3);
        r7.A0B("wa_biz_profiles_price_tiers", r3);
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
