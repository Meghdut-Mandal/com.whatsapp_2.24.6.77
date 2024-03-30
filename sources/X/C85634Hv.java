package X;

/* renamed from: X.4Hv  reason: invalid class name and case insensitive filesystem */
public final class C85634Hv extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C88424Sq $listener;
    public final /* synthetic */ String $purpose = "XFAM_WFS";
    public final /* synthetic */ int $purposePolicyId;
    public final /* synthetic */ C62753Hk $userEntityForNativeAuth;
    public final /* synthetic */ AnonymousClass3OD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85634Hv(C88424Sq r3, AnonymousClass3OD r4, C62753Hk r5) {
        super(0);
        this.this$0 = r4;
        this.$userEntityForNativeAuth = r5;
        this.$listener = r3;
        this.$purposePolicyId = 3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A05;
        C608039k r0 = (C608039k) this.$userEntityForNativeAuth.A01.A00(this.$purpose);
        String str = null;
        if (r0 != null) {
            str = r0.A05;
        }
        C203559oI A00 = C203559oI.A00();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('+');
        if (str == null) {
            str = "";
        }
        AUN A0F = A00.A0F(AnonymousClass000.A0q(str, A0u), (String) null);
        AnonymousClass011 A19 = C36441kJ.A19(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_));
        if (!this.this$0.A01.A0A() || (A05 = this.this$0.A01.A05((String) A19.first, (String) A19.second)) == null || A05.length() == 0) {
            Object A0r = C36371kC.A0r(this.this$0.A0C, 551495536);
            if (A0r != null) {
                AnonymousClass1UN r4 = (AnonymousClass1UN) A0r;
                r4.A04("PRECHAT_START");
                C64363Nr A0D = this.this$0.A09.A0D((String) A19.first, (String) A19.second);
                if (A0D != null) {
                    String str2 = A0D.A03;
                    String str3 = A0D.A04;
                    if (str2 != null) {
                        if (str3 != null) {
                            C36341k9.A0x(C36331k8.A05(this.this$0.A06), "pref_pre_chatd_ab_hash", str2);
                            this.this$0.A08.A05(str3);
                        }
                    }
                    this.this$0.A00.Bp3(new C81263wj(this.$listener, this.$userEntityForNativeAuth, A19, this.$purpose, this.$purposePolicyId, 1));
                }
                r4.A04("PRECHAT_ERROR");
                AnonymousClass3OD.A00(this.$listener, this.this$0, AnonymousClass001.A09("Could not retrieve prechatd abprops"));
            } else {
                throw C36381kD.A0l();
            }
        } else {
            AnonymousClass3OD.A00(this.$listener, this.this$0, AnonymousClass001.A09("Phone number already registered"));
        }
        return AnonymousClass0AJ.A00;
    }
}
