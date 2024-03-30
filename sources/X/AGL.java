package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

public class AGL implements B1Z {
    public final /* synthetic */ C207079uW A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ C207249un A02;
    public final /* synthetic */ C146506vi A03;
    public final /* synthetic */ PinBottomSheetDialogFragment A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ BrazilPaymentActivity A07;

    public AGL(C207079uW r1, AnonymousClass16X r2, C207249un r3, C146506vi r4, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A07 = brazilPaymentActivity;
        this.A04 = pinBottomSheetDialogFragment;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A00 = r1;
        this.A05 = str2;
        this.A03 = r4;
    }

    public void BU3(String str) {
        this.A04.A1q();
        BrazilPaymentActivity brazilPaymentActivity = this.A07;
        int intValue = this.A01.A00.scaleByPowerOfTen(3).intValue();
        AnonymousClass16U r3 = AnonymousClass16W.A04;
        C199449fK r2 = new C199449fK();
        r2.A01 = (long) intValue;
        r2.A00 = 1000;
        r2.A02 = r3;
        C207119ua A012 = r2.A01();
        C201009id A3u = brazilPaymentActivity.A3u(this.A00, this.A02, A012, this.A06, "payment_pin", brazilPaymentActivity.A0c);
        C21252AEi aEi = new C21252AEi(this);
        AVX.A00(A3u.A0Q, A3u, 5);
        AF3 A013 = A3u.A0H.A01("FB", "PIN");
        String str2 = str;
        if (A013 != null) {
            C194449Pt r5 = new C194449Pt(A013);
            A3u.A0F.A00(new C203589oM(aEi, A3u, r5, (Object) null, 1), r5, str);
            return;
        }
        A3u.A0G.A00(new C23193B9b(aEi, A3u, aEi.A00.A07.A0M.A02.A00("get-provider-key"), str2, 1), "FB");
    }

    public void BYJ(View view) {
        BrazilPaymentActivity brazilPaymentActivity = this.A07;
        C191919Ez r3 = new C191919Ez(brazilPaymentActivity);
        C36331k8.A1F(new C183478qr(r3, brazilPaymentActivity.A0P), brazilPaymentActivity.A04);
    }
}
