package X;

import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;

/* renamed from: X.AnK  reason: case insensitive filesystem */
public final class C22481AnK extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ TextInputLayout $pixKeyNameInputLayout;
    public final /* synthetic */ BrazilPaymentMethodAddPixBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22481AnK(TextInputLayout textInputLayout, BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet) {
        super(1);
        this.this$0 = brazilPaymentMethodAddPixBottomSheet;
        this.$pixKeyNameInputLayout = textInputLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0n;
        Number number = (Number) obj;
        BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = this.this$0;
        TextInputLayout textInputLayout = this.$pixKeyNameInputLayout;
        if (number == null) {
            A0n = null;
        } else {
            A0n = brazilPaymentMethodAddPixBottomSheet.A0n(number.intValue());
        }
        textInputLayout.setError(A0n);
        return AnonymousClass0AJ.A00;
    }
}
