package X;

import android.view.animation.Animation;
import com.whatsapp.QrImageView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

/* renamed from: X.6dY  reason: invalid class name and case insensitive filesystem */
public class C135966dY implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass7cW A00;
    public final /* synthetic */ QrImageView A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public C135966dY(AnonymousClass7cW r1, QrImageView qrImageView) {
        this.A01 = qrImageView;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animation animation) {
        C142416oq r1 = (C142416oq) this.A00;
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = r1.A01;
        int i = r1.A00;
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = indiaUpiDisplaySecureQrCodeView.A0G;
        indiaUpiSecureQrCodeViewModel.A01.A0D(new AnonymousClass9IM(3, i));
    }
}
