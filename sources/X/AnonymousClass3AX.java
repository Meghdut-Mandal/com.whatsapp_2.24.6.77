package X;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.3AX  reason: invalid class name */
public class AnonymousClass3AX {
    public final LottieAnimationView A00;
    public final LottieAnimationView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final WaImageView A05;
    public final SettingsRowIconText A06;
    public final SettingsRowIconText A07;

    public AnonymousClass3AX(View view) {
        TextEmojiLabel A0P = C36401kF.A0P(view, R.id.verify_identity_status_title);
        this.A04 = A0P;
        this.A03 = C36401kF.A0P(view, R.id.verify_identity_status_subtitle);
        A0P.setText(R.string.f12nameremoved);
        this.A05 = C36421kH.A0J(view, R.id.verify_identity_tip_icon);
        this.A01 = (LottieAnimationView) view.findViewById(R.id.aiv_success_icon_animation);
        this.A00 = (LottieAnimationView) view.findViewById(R.id.aiv_spinner_animation);
        this.A07 = (SettingsRowIconText) view.findViewById(R.id.scan_qr_code);
        this.A06 = (SettingsRowIconText) view.findViewById(R.id.compare_number);
        this.A02 = C36401kF.A0P(view, R.id.aiv_learn_more);
    }
}
