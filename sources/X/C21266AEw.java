package X;

import android.widget.ProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AEw  reason: case insensitive filesystem */
public final class C21266AEw implements B1S {
    public final /* synthetic */ P2mLiteConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ AnonymousClass2bZ A03;
    public final /* synthetic */ String A04;

    public void BWg(C202059ky r11) {
        AnonymousClass00C.A0D(r11, 0);
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = this.A00;
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A1Z().setVisibility(0);
        TextEmojiLabel textEmojiLabel = p2mLiteConfirmDateOfBirthBottomSheetFragment.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(0);
            ProgressBar progressBar = p2mLiteConfirmDateOfBirthBottomSheetFragment.A00;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                int i = r11.A00;
                P2mLiteOrderDetailsActivity.A01(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A02, (PaymentBottomSheet) null, this.A03, this.A04, "enter_dob", i);
                return;
            }
            throw C36331k8.A0d("progressBar");
        }
        throw C36331k8.A0d("descText");
    }

    public C21266AEw(P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass2bZ r4, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A04 = str;
        this.A00 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }

    public void BVz(boolean z) {
        this.A01.A3l(this.A04, "COMPLETED", "enter_dob");
    }
}
