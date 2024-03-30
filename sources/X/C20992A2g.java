package X;

import java.util.List;

/* renamed from: X.A2g  reason: case insensitive filesystem */
public class C20992A2g implements C23081B3o {
    public final C204369pt A00;
    public volatile C23081B3o A01;

    public void BWs(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.A01.BWs(str, str2, str3, str4, str5, str6);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onError(errorCode = %s) callback", e, AnonymousClass000.A1b(str2));
        }
    }

    public void BcK(C207179ug r13, String str, String str2, String str3, long j, boolean z) {
        try {
            this.A01.BcK(r13, str, str2, str3, j, z);
        } catch (IllegalStateException e) {
            C204369pt r3 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r13.A0R);
            C200599hh.A01(r3, "Failed to send onPaused(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BhK(C207179ug r15, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        try {
            this.A01.BhK(r15, str, (String) null, str3, str4, str5, j, false, false);
        } catch (IllegalStateException e) {
            C204369pt r2 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r15.A0R);
            C200599hh.A01(r2, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BSK(C207179ug r6, C207019uQ r7, boolean z) {
        try {
            this.A01.BSK(r6, r7, z);
        } catch (IllegalStateException e) {
            C204369pt r3 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r6.A0R);
            C200599hh.A01(r3, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BSL(C207179ug r6, boolean z) {
        try {
            this.A01.BSL(r6, z);
        } catch (IllegalStateException e) {
            C204369pt r3 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r6.A0R);
            C200599hh.A01(r3, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BT6(C207179ug r10, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.BT6(r10, str, str2, str3, str4, j, z);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed send onCancelled() callback", e, C90524aI.A0w());
        }
    }

    public void BU8(C207179ug r6, String str, boolean z) {
        try {
            this.A01.BU8(r6, str, z);
        } catch (IllegalStateException e) {
            C204369pt r3 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r6.A0R);
            C200599hh.A01(r3, "Failed to send onCompletion(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BV0(List list) {
        try {
            this.A01.BV0(list);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed send onCues(list = %s) callback", e, AnonymousClass000.A1b(list));
        }
    }

    public void BVF(long j, String str, boolean z) {
        try {
            this.A01.BVF(j, str, z);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send decoder initialized callback", e, C90524aI.A0w());
        }
    }

    public void BWF() {
        try {
            this.A01.BWF();
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onDrawnToSurface callback", e, C90524aI.A0w());
        }
    }

    public void BWR(String str, String str2) {
        try {
            this.A01.BWR(str, str2);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed send onEncodedFrameDataReceived() callback", e, C90524aI.A0w());
        }
    }

    public void BX3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.BX3(str, str2, str3, str4, str5, str6, str7);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed send onErrorRecoveryAttempt() callback", e, C90524aI.A0w());
        }
    }

    public void BZm(boolean z) {
        try {
            this.A01.BZm(z);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onLiveInterrupt callback", e, C90524aI.A0w());
        }
    }

    public void BZn(C207019uQ r5) {
        try {
            this.A01.BZn(r5);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send live state update", e, C90524aI.A0w());
        }
    }

    public void BbV(byte[] bArr) {
        try {
            this.A01.BbV(bArr);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onNewPCMBuffer callback", e, C90524aI.A0w());
        }
    }

    public void Bcl() {
        try {
            this.A01.Bcl();
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onPlaybackAboutToFinish callback", e, C90524aI.A0w());
        }
    }

    public void Bco(float f) {
        try {
            this.A01.Bco(f);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, C90524aI.A0w());
        }
    }

    public void Bcu(C207179ug r6) {
        try {
            this.A01.Bcu(r6);
        } catch (IllegalStateException e) {
            C204369pt r3 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, r6.A0R);
            C200599hh.A01(r3, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BdP(C207179ug r5, String str) {
        try {
            this.A01.BdP(r5, str);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onPrepared callback", e, C90524aI.A0w());
        }
    }

    public void BeV(boolean z) {
        try {
            this.A01.BeV(z);
        } catch (IllegalStateException e) {
            C204369pt r2 = this.A00;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1N(A0L, 0, z);
            C200599hh.A01(r2, "Failed to send onRelease(isEvicted = %s) callback", e, A0L);
        }
    }

    public void Bg5(C207179ug r5, long j) {
        try {
            this.A01.Bg5(r5, j);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onSeeking callback", e, C90524aI.A0w());
        }
    }

    public void BgN(long j) {
        try {
            this.A01.BgN(j);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed send onServicePlayerListenerDetached() callback", e, C90524aI.A0w());
        }
    }

    public void Bhv() {
        this.A01.Bhv();
    }

    public void BjB(List list) {
        try {
            this.A01.BjB(list);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send gaps changed callback", e, C90524aI.A0w());
        }
    }

    public void BkL(float f, int i, int i2, int i3) {
        try {
            this.A01.BkL(f, i, i2, i3);
        } catch (IllegalStateException e) {
            C204369pt r2 = this.A00;
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1W(A0M, i);
            AnonymousClass000.A1L(A0M, i2, 1);
            C200599hh.A01(r2, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, A0M);
        }
    }

    public void Bkb(String str, String str2, String str3) {
        try {
            this.A01.Bkb(str, str2, str3);
        } catch (IllegalStateException e) {
            C200599hh.A01(this.A00, "Failed to send onWarn callback", e, C90524aI.A0w());
        }
    }

    public C20992A2g(C23081B3o b3o, C204369pt r3) {
        if (b3o != null) {
            this.A00 = r3;
            this.A01 = b3o;
            return;
        }
        throw AnonymousClass001.A08("HeroServicePlayerListener cannot be null");
    }
}
