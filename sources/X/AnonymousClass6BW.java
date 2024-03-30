package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.6BW  reason: invalid class name */
public final class AnonymousClass6BW {
    public final Context A00;
    public final WaImageButton A01;
    public final C18820ts A02;

    public AnonymousClass6BW(WaImageButton waImageButton, C18820ts r3) {
        C36321k7.A0x(waImageButton, r3);
        this.A01 = waImageButton;
        this.A02 = r3;
        this.A00 = C36371kC.A0B(waImageButton);
    }

    public final void A00() {
        WaImageButton waImageButton = this.A01;
        C36321k7.A0L(waImageButton.getContext(), waImageButton, this.A02, R.drawable.input_send);
        C36331k8.A0q(waImageButton.getContext(), waImageButton, R.string.f12nameremoved);
    }

    public final void A01(boolean z) {
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        int A022 = C36361kB.A02(this.A00, i);
        WaImageButton waImageButton = this.A01;
        ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(waImageButton);
        AnonymousClass1JZ.A06(waImageButton, this.A02, A0K.leftMargin, A0K.topMargin, A0K.rightMargin, A022);
        if (z) {
            A00();
            return;
        }
        waImageButton.setImageResource(R.drawable.ic_done);
        C36331k8.A0q(waImageButton.getContext(), waImageButton, R.string.f12nameremoved);
    }
}
