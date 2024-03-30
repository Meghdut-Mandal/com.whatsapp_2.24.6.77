package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.ADw  reason: case insensitive filesystem */
public class C21240ADw implements AnonymousClass1XD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C180348lc A03;
    public final /* synthetic */ String A04;

    public C21240ADw(AnonymousClass155 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C180348lc r3, String str, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = str;
    }

    public void Bf1(AnonymousClass9KX r7) {
        C180348lc r4 = this.A03;
        int i = this.A00;
        AnonymousClass155 r1 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (i != 1) {
            r1.Bnv();
        } else if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1c();
        }
        if (this.A04.equals("FB") && C165617ti.A0O(r4.A03).A09().size() < 1) {
            AnonymousClass1EZ r12 = r4.A01;
            r12.A09(r12.A04("add_card"));
        }
        C36341k9.A17(r4.A02, 0);
    }

    public void Bes(C202059ky r3) {
        C36321k7.A1K(r3, "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u());
        C165587tf.A11(this.A03.A01, C36381kD.A0m(), r3);
    }

    public void Bf0(C202059ky r6) {
        C36321k7.A1K(r6, "PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
        C180348lc r4 = this.A03;
        String str = this.A04;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (!r4.A0U(r6, pinBottomSheetDialogFragment, str)) {
            int i = this.A00;
            AnonymousClass155 r1 = this.A01;
            if (i != 1) {
                r1.Bnv();
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1p();
                pinBottomSheetDialogFragment.A1c();
            }
            C165587tf.A11(r4.A01, C36381kD.A0m(), r6);
        }
    }
}
