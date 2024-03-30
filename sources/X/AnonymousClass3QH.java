package X;

import android.media.AudioManager;
import com.whatsapp.R;

/* renamed from: X.3QH  reason: invalid class name */
public class AnonymousClass3QH {
    public long A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public final AnonymousClass17Y A02;
    public final C21060yb A03;

    public static boolean A00(AnonymousClass3QH r5, int i) {
        AudioManager A0D = r5.A03.A0D();
        if (A0D == null || A0D.getStreamVolume(3) != 0) {
            return true;
        }
        if (System.currentTimeMillis() - r5.A00 <= 2000) {
            return false;
        }
        r5.A00 = System.currentTimeMillis();
        r5.A02.A06(i, 0);
        return false;
    }

    public void A01() {
        AudioManager A0D = this.A03.A0D();
        if (A0D != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = AnonymousClass3WP.A00;
                this.A01 = onAudioFocusChangeListener;
            }
            A0D.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public void A02() {
        AudioManager A0D = this.A03.A0D();
        if (A0D != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = AnonymousClass3WP.A00;
                this.A01 = onAudioFocusChangeListener;
            }
            A0D.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public AnonymousClass3QH(AnonymousClass17Y r1, C21060yb r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public boolean A03() {
        return A00(this, R.string.f12nameremoved);
    }
}
