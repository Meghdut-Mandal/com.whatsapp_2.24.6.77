package X;

import android.media.AudioManager;

/* renamed from: X.6Zg  reason: invalid class name and case insensitive filesystem */
public class C133606Zg implements AudioManager.OnAudioFocusChangeListener {
    public final AnonymousClass1V6 A00;

    public void onAudioFocusChange(int i) {
        C148826zU A002 = this.A00.A00();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("messageaudioplayer/onaudiofocuschanged ");
        A0u.append(i);
        A0u.append(" current player:");
        C36331k8.A1S(A0u, AnonymousClass000.A1V(A002));
        if (C224714l.A02() && A002 != null) {
            if (i == -2 || i == -1) {
                if (A002.A0I()) {
                    A002.A0E(false);
                }
            } else if (i == 1) {
                int i2 = C148826zU.A12;
                if (A002.A0Q) {
                    A002.A0C(C148826zU.A12, true, false);
                }
            }
        }
    }

    public C133606Zg(AnonymousClass1V6 r1) {
        this.A00 = r1;
    }
}
