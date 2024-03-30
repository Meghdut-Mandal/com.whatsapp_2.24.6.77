package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.92N  reason: invalid class name */
public final class AnonymousClass92N extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public AnonymousClass92N(Timeline timeline2, int i, long j) {
        this.timeline = timeline2;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
