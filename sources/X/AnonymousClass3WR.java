package X;

import android.media.MediaPlayer;
import com.whatsapp.WaImageButton;
import com.whatsapp.registration.VerifyCaptcha;

/* renamed from: X.3WR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WR implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ VerifyCaptcha A00;

    public /* synthetic */ AnonymousClass3WR(VerifyCaptcha verifyCaptcha) {
        this.A00 = verifyCaptcha;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        VerifyCaptcha verifyCaptcha = this.A00;
        WaImageButton waImageButton = verifyCaptcha.A0C;
        if (waImageButton == null) {
            throw C36331k8.A0d("captchaAudioBtn");
        } else if (!waImageButton.isEnabled()) {
            WaImageButton waImageButton2 = verifyCaptcha.A0C;
            if (waImageButton2 == null) {
                throw C36331k8.A0d("captchaAudioBtn");
            }
            waImageButton2.setEnabled(true);
        }
    }
}
