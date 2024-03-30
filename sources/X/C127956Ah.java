package X;

import android.os.RemoteException;
import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.HeroPlaybackControlView;

/* renamed from: X.6Ah  reason: invalid class name and case insensitive filesystem */
public class C127956Ah {
    public final /* synthetic */ HeroPlaybackControlView A00;
    public final /* synthetic */ C204359ps A01;

    public C127956Ah(C204359ps r1, HeroPlaybackControlView heroPlaybackControlView) {
        this.A00 = heroPlaybackControlView;
        this.A01 = r1;
    }

    public Timeline A00() {
        C202979n2 r0;
        C202709mU r02;
        C203259ng r6 = this.A01.A0D;
        try {
            C204359ps r3 = r6.A0B;
            if (!AnonymousClass000.A1P((r3.A0N > 0 ? 1 : (r3.A0N == 0 ? 0 : -1)))) {
                C204359ps.A06(r3, "Before isSeekable, service player was evicted. Skip refreshing service player state", new Object[0]);
                return null;
            }
            C202289lT A002 = C203259ng.A00(r6);
            C204369pt A012 = A002.A0V.A01(r3.A0N);
            if (!(A012 == null || (r0 = A012.A12) == null || (r02 = r0.A01) == null)) {
                return r02.A07.A03;
            }
            return null;
        } catch (RemoteException e) {
            C204359ps.A05(r6.A0B, "Error occurs while getCurrentWindowIndex", e, new Object[0]);
        }
    }

    public void A01(long j) {
        C204359ps r2 = this.A01;
        C114905i1 r1 = new C114905i1();
        r1.A00 = (int) j;
        r2.A0J(new AnonymousClass60G(r1));
    }

    public boolean A02() {
        C204359ps r1 = this.A01;
        if (r1.A0A || r1.A0D.A08) {
            return true;
        }
        return false;
    }
}
