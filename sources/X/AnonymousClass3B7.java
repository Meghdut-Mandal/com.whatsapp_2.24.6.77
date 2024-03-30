package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;

/* renamed from: X.3B7  reason: invalid class name */
public class AnonymousClass3B7 {
    public final int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final WaImageButton A05;
    public final WaImageButton A06;
    public final WaImageView A07;
    public final C161087m8 A08;
    public final C20810yC A09;
    public final boolean A0A;
    public final C18820ts A0B;

    public AnonymousClass3B7(View view, C161087m8 r8, C18820ts r9, C20810yC r10, int i) {
        this.A09 = r10;
        this.A0B = r9;
        this.A00 = i;
        this.A01 = C012005e.A02(view, R.id.bottom_actions);
        WaImageView A0X = C36431kI.A0X(view, R.id.switch_camera_btn);
        this.A07 = A0X;
        this.A06 = (WaImageButton) C012005e.A02(view, R.id.discard_btn);
        this.A05 = (WaImageButton) C012005e.A02(view, R.id.push_to_video_recorder_close_button);
        this.A04 = C012005e.A02(view, R.id.stop_btn);
        View A022 = C012005e.A02(view, R.id.ptv_send_btn);
        this.A03 = A022;
        A022.setScaleX(C36351kA.A1Y(r9) ? 1.0f : -1.0f);
        View A023 = C012005e.A02(view, R.id.playback_time_display);
        this.A02 = A023;
        this.A08 = r8;
        boolean z = false;
        if (this.A09.A0E(4660)) {
            boolean z2 = this.A08.getNumberOfCameras() > 1;
            Boolean bool = C18750th.A03;
            if (z2) {
                z = true;
            }
        }
        this.A0A = z;
        A0X.setVisibility(C36351kA.A00(z ? 1 : 0));
        A023.setVisibility(8);
        WaImageView waImageView = this.A07;
        AnonymousClass3UF.A0B(waImageView.getContext(), waImageView, R.drawable.ic_flip_camera, R.color.f6nameremoved);
        C36421kH.A0r(A0X);
    }
}
