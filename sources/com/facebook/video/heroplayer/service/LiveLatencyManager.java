package com.facebook.video.heroplayer.service;

import X.AUR;
import X.AnonymousClass00C;
import X.AnonymousClass7cI;
import X.AnonymousClass92k;
import X.AnonymousClass9OD;
import X.B2E;
import X.C114925i3;
import X.C123675wt;
import X.C1895694i;
import X.C1895894k;
import X.C195979Xa;
import X.C202979n2;
import X.C207019uQ;
import X.C207099uY;
import X.C207179ug;
import X.C20992A2g;
import X.C22774Avk;
import X.C22792Aw3;
import X.C36321k7;

public final class LiveLatencyManager {
    public static final C1895894k Companion = new C1895894k();
    public final C22792Aw3 debugEventLogger;
    public final C202979n2 exoPlayer;
    public final AnonymousClass9OD heroDependencies;
    public final AUR heroPlayerSetting;
    public final C114925i3 liveJumpRateLimiter;
    public final AnonymousClass92k liveLatencySelector;
    public final C123675wt liveLowLatencyDecisions;
    public final C195979Xa request;
    public final C1895694i rewindableVideoMode;
    public final AnonymousClass7cI traceLogger;

    public final String getCurrentLatencyConfigName() {
        return null;
    }

    public final String getLiveVideoCommentQuality() {
        return null;
    }

    public final int getStreamLatencyToggleState() {
        return -1;
    }

    public final B2E getTransferListener() {
        return null;
    }

    public final boolean isBufferingStartedBySeek() {
        return false;
    }

    public final boolean isBufferingStoppedBySeekAndClear() {
        return false;
    }

    public final void maybeChangePlaybackSpeed(long j) {
    }

    public final boolean maybeSetDynamicLoadCursorPosition() {
        return false;
    }

    public final void maybeUpdateStreamLatencyModePIDValues() {
    }

    public final void notifyBufferingStarted(C207179ug r1, C207019uQ r2, boolean z) {
    }

    public final void notifyBufferingStopped(C207179ug r1, C207019uQ r2, boolean z) {
    }

    public final void notifyLiveStateChanged(C207019uQ r1) {
    }

    public final void notifyPaused(C207179ug r1) {
    }

    public final void onDownstreamFormatChange(C207099uY r1) {
    }

    public final void refreshPlayerState(C207179ug r1) {
    }

    public final void setBandwidthMeter(C22774Avk avk) {
    }

    public final void setLiveLowLatencyOptimization(boolean z) {
    }

    public final void setPlaybackSpeed(float f) {
    }

    public final void setStreamLatencyMode(int i) {
    }

    public final boolean useToggleOverride() {
        return false;
    }

    public LiveLatencyManager(AUR aur, C202979n2 r3, C1895694i r4, C195979Xa r5, C123675wt r6, C114925i3 r7, AnonymousClass9OD r8, C20992A2g a2g, AnonymousClass92k r10, AnonymousClass7cI r11, C22792Aw3 aw3) {
        C36321k7.A1B(aur, r3, r4, r5, r6);
        C36321k7.A10(r7, r8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(aw3, 11);
        this.heroPlayerSetting = aur;
        this.exoPlayer = r3;
        this.rewindableVideoMode = r4;
        this.request = r5;
        this.liveLowLatencyDecisions = r6;
        this.liveJumpRateLimiter = r7;
        this.heroDependencies = r8;
        this.liveLatencySelector = r10;
        this.traceLogger = r11;
        this.debugEventLogger = aw3;
    }
}
