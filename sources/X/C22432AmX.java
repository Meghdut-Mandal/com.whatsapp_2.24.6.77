package X;

import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;

/* renamed from: X.AmX  reason: case insensitive filesystem */
public final class C22432AmX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22432AmX(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(1);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BrazilPixKeySettingActivity brazilPixKeySettingActivity;
        AnonymousClass17Y r2;
        int i;
        int A0I = AnonymousClass000.A0I(obj);
        if (A0I != 0) {
            if (A0I == 1) {
                brazilPixKeySettingActivity = this.this$0;
                r2 = brazilPixKeySettingActivity.A05;
                i = 26;
            } else if (A0I == 2) {
                brazilPixKeySettingActivity = this.this$0;
                r2 = brazilPixKeySettingActivity.A05;
                i = 27;
            } else if (A0I == 3) {
                this.this$0.finish();
            }
            r2.A0H(new AVX(brazilPixKeySettingActivity, i));
        } else {
            brazilPixKeySettingActivity = this.this$0;
            r2 = brazilPixKeySettingActivity.A05;
            i = 25;
            r2.A0H(new AVX(brazilPixKeySettingActivity, i));
        }
        return AnonymousClass0AJ.A00;
    }
}
