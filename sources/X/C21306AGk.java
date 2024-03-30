package X;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AGk  reason: case insensitive filesystem */
public final /* synthetic */ class C21306AGk implements C22984Aza {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C21306AGk(BrazilPaymentActivity brazilPaymentActivity, String str, String str2, String str3, boolean z) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = z;
    }

    public final void Bda(BottomSheetDialogFragment bottomSheetDialogFragment) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        boolean z = this.A04;
        bottomSheetDialogFragment.A1b();
        if (!brazilPaymentActivity.A0O.A02.A0E(2928) || !"p2m_context".equals(str) || (!"brpay_p_add_card".equals(str2) && !"brpay_p_compliance_kyc_next_screen_router".equals(str2))) {
            Intent A0F = C165597tg.A0F(brazilPaymentActivity);
            A0F.putExtra("screen_name", str2);
            A0F.putExtra("hide_send_payment_cta", true);
            C1025050g.A01(A0F, "referral_screen", str3);
            C1025050g.A01(A0F, "onboarding_context", str);
            C1025050g.A01(A0F, "request_flow", C165617ti.A0Y(z ? 1 : 0));
            brazilPaymentActivity.startActivity(A0F);
            return;
        }
        brazilPaymentActivity.Bu1(R.string.f12nameremoved);
        AnonymousClass9UG r5 = brazilPaymentActivity.A0W;
        if (TextUtils.isEmpty(str3)) {
            str3 = "get_started";
        }
        r5.A00(new C203519oD(brazilPaymentActivity, 0), new C23218BAa(brazilPaymentActivity, 1), new AHZ(brazilPaymentActivity, str), str3);
    }
}
