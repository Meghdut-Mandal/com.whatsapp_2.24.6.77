package X;

import org.json.JSONObject;

/* renamed from: X.4HR  reason: invalid class name */
public final class AnonymousClass4HR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass695 $fbUserEntity;
    public final /* synthetic */ AnonymousClass1UK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HR(AnonymousClass695 r2, AnonymousClass1UK r3) {
        super(0);
        this.this$0 = r3;
        this.$fbUserEntity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$fbUserEntity.A00.A00("XFAM_CROSSPOSTING_FB_ACCOUNT_CACHE");
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("access_token", A00);
        String A01 = this.this$0.A02.A01(C36381kD.A0y(A1B));
        this.this$0.A00.set(this.$fbUserEntity);
        C36341k9.A0x(AnonymousClass1UI.A00(this.this$0.A03).edit(), "pref_xfamily_fb_account_info", A01);
        AnonymousClass1UK r0 = this.this$0;
        AnonymousClass1UI r1 = r0.A03;
        C36341k9.A0w(AnonymousClass1UI.A00(r1).edit(), "pref_xfamily_fb_account_update_time", C19970wo.A00(r0.A01));
        return AnonymousClass0AJ.A00;
    }
}
