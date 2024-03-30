package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.AEj  reason: case insensitive filesystem */
public class C21253AEj implements B2v {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C207079uW A01;
    public final /* synthetic */ AnonymousClass16X A02;
    public final /* synthetic */ C207249un A03;
    public final /* synthetic */ C146506vi A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C21253AEj(FingerprintBottomSheet fingerprintBottomSheet, C207079uW r2, AnonymousClass16X r3, C207249un r4, C146506vi r5, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = fingerprintBottomSheet;
    }

    public void BOa(C202059ky r3, Integer num) {
        this.A05.A0M.A02.A01(r3, num, "pay-precheck");
    }

    public Integer BOe() {
        return this.A05.A0M.A02.A00("pay-precheck");
    }

    public void BOr(C202059ky r3, Integer num) {
        this.A05.A0M.A02.A01(r3, num, "get-provider-key");
    }

    public void BOs(Integer num) {
        this.A05.A0M.A04(num, "get-provider-key");
    }
}
