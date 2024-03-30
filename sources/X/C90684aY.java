package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

/* renamed from: X.4aY  reason: invalid class name and case insensitive filesystem */
public class C90684aY extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02 = -1;
    public long A03;
    public long A04 = -1;
    public long A05;
    public long A06 = -1;
    public final C162337oQ A07;

    public static final void A01(C90684aY r4) {
        r4.A06 = -1;
        r4.A04 = -1;
        r4.A05 = 0;
        r4.A02 = -1;
        r4.A00 = 0;
        super.setStartDelay(r4.A03);
        r4.A01 = 0;
    }

    public long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A05;
            if (j2 != -1) {
                return j2;
            }
            return 0;
        } else if (isPaused() && this.A04 > this.A02) {
            return this.A05;
        } else {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = this.A01;
            if (j3 == 0) {
                long j4 = (this.A05 + currentAnimationTimeMillis) - this.A06;
                boolean isPaused = isPaused();
                long j5 = this.A00;
                if (isPaused) {
                    j5 = (j5 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
                }
                j = j4 - j5;
            } else {
                j = this.A03 + j3;
            }
            long duration = this.A03 + getDuration();
            if (j > duration) {
                return duration;
            }
            return j;
        }
    }

    public long getTotalDuration() {
        return this.A03 + getDuration();
    }

    public void setCurrentPlayTime(long j) {
        long A042 = C15040mb.A04(j, 0, this.A03 + getDuration());
        this.A04 = AnimationUtils.currentAnimationTimeMillis();
        this.A05 = A042;
        long j2 = this.A03;
        if (A042 < j2) {
            super.setStartDelay(j2 - A042);
            if (isPaused()) {
                super.setCurrentPlayTime(0);
            } else if (this.A01 > 0) {
                start();
            }
        } else {
            super.setStartDelay(0);
            super.setCurrentPlayTime(A042 - j2);
        }
    }

    public C90684aY() {
        C162337oQ r2 = new C162337oQ(this, 4);
        this.A07 = r2;
        super.addListener(r2);
        super.addUpdateListener(new C111565cU(this, 2));
    }

    public long getStartDelay() {
        return this.A03;
    }

    public void pause() {
        boolean isPaused = isPaused();
        super.pause();
        if (!isPaused && isPaused()) {
            this.A02 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void resume() {
        boolean isPaused = isPaused();
        super.resume();
        if (isPaused && !isPaused()) {
            this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
            this.A02 = -1;
        }
    }

    public void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A03 = j;
    }

    public void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
    }
}
