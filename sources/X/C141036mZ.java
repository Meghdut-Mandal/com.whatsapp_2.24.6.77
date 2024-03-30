package X;

import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.util.Log;

/* renamed from: X.6mZ  reason: invalid class name and case insensitive filesystem */
public class C141036mZ implements B3J {
    public final /* synthetic */ AnonymousClass5LW A00;

    public void Bcl() {
    }

    public void Bct(int i, boolean z, boolean z2) {
    }

    public void Bcy(int i) {
    }

    public void Bj7(Timeline timeline, Object obj, int i) {
    }

    public void BjP(C206419tN r1, C195269Tk r2) {
    }

    public C141036mZ(AnonymousClass5LW r1) {
        this.A00 = r1;
    }

    public void Bkc(AnonymousClass902 r5, String str) {
        if (AnonymousClass902.A03 == r5) {
            C19700wN r3 = this.A00.A01;
            if (r3 != null) {
                r3.A0E("exoaudioplayer/audio-track-not-playable", (String) null, false);
            }
            Log.e("exoaudioplayer/onTracksChanged: Media includes audio tracks, but none are playable by this device");
        }
    }

    public void Bcr(AnonymousClass927 r3, AnonymousClass902 r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1Z(A0u, C90494aF.A0c(r3, "exoaudioplayer/onPlayerError: ", A0u));
    }
}
