package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4aL  reason: invalid class name and case insensitive filesystem */
public final class C90554aL extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public C90554aL(Animator animator, C1271967i r4, int i) {
        AnonymousClass00C.A0D(animator, 2);
        C133266Xn.A06(animator, r4);
        this.A05 = animator;
        this.A04 = AnonymousClass6Xo.A01(animator);
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new C90664aW(this, i));
        }
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        AnonymousClass00C.A0D(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    public void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            AnonymousClass6Xo.A03(this.A05, j);
        }
        this.A05.start();
    }

    public void cancel() {
        this.A05.cancel();
    }

    public void end() {
        this.A05.end();
    }

    public long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return j * ((long) i);
        }
        return -1;
    }

    public long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * ((long) i)) + this.A02;
        }
        return -1;
    }

    public boolean isPaused() {
        return this.A05.isPaused();
    }

    public boolean isRunning() {
        return this.A05.isRunning();
    }

    public void pause() {
        this.A05.pause();
    }

    public void resume() {
        this.A05.resume();
    }

    public static final void A00(C90554aL r1, C006302t r2) {
        ArrayList<Animator.AnimatorListener> listeners = r1.getListeners();
        if (listeners != null) {
            Iterator A12 = C90514aH.A12(listeners);
            while (A12.hasNext()) {
                Object next = A12.next();
                AnonymousClass00C.A0B(next);
                r2.invoke(next);
            }
        }
    }

    public long getStartDelay() {
        return this.A02;
    }

    public Animator setDuration(long j) {
        return this;
    }

    public void setStartDelay(long j) {
        this.A02 = j;
    }
}
