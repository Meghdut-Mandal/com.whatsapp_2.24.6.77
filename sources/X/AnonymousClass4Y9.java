package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.widget.AudioVolumeView;

/* renamed from: X.4Y9  reason: invalid class name */
public class AnonymousClass4Y9 implements C88584Tg {
    public Object A00;
    public final int A01;

    public AnonymousClass4Y9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRU(boolean z) {
        if (this.A01 == 0) {
            ((C47522eu) this.A00).A0K(false);
        }
    }

    public void BRW(int i, int i2, int i3) {
        AudioVolumeView audioVolumeView;
        if (this.A01 != 0) {
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this.A00;
            if (statusPlaybackBaseFragment.A00 && i3 != 0) {
                int i4 = i2 + 1;
                if (i2 == 0) {
                    i4 = 0;
                }
                float f = (((float) i4) * 1.0f) / ((float) (i3 + 1));
                AnonymousClass3BI r0 = statusPlaybackBaseFragment.A04;
                if (r0 != null && (audioVolumeView = r0.A0E) != null) {
                    audioVolumeView.setVolume(f);
                    audioVolumeView.setVisibility(0);
                    Runnable runnable = statusPlaybackBaseFragment.A07;
                    audioVolumeView.removeCallbacks(runnable);
                    audioVolumeView.postDelayed(runnable, 1500);
                }
            }
        }
    }
}
