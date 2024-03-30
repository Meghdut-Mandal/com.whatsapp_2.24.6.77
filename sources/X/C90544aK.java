package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.4aK  reason: invalid class name and case insensitive filesystem */
public final class C90544aK extends Animator {
    public long A00;
    public long A01;
    public final List A02;
    public final Integer A03;

    public void cancel() {
        for (Animator cancel : this.A02) {
            cancel.cancel();
        }
        A00(this, new C154237Rk(this));
    }

    public void end() {
        for (Animator end : this.A02) {
            end.end();
        }
    }

    public long getTotalDuration() {
        long j = this.A00;
        if (!AnonymousClass000.A1Q((j > -1 ? 1 : (j == -1 ? 0 : -1)))) {
            return j + this.A01;
        }
        return j;
    }

    public boolean isRunning() {
        for (Animator isRunning : this.A02) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public boolean isStarted() {
        for (Animator isStarted : this.A02) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        for (Animator interpolator : this.A02) {
            interpolator.setInterpolator(timeInterpolator);
        }
    }

    public void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A02) {
            if (animator instanceof C90544aK) {
                animator.setStartDelay(j);
            } else {
                AnonymousClass6Xo.A03(animator, j);
            }
        }
    }

    public void start() {
        List<Animator> list = this.A02;
        for (Animator start : list) {
            start.start();
        }
        A00(this, new C154247Rl(this));
        if (list.isEmpty()) {
            A00(this, new C154257Rm(this));
        }
    }

    public C90544aK(Integer num, List list) {
        Object next;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long A012 = AnonymousClass6Xo.A01((Animator) it.next());
            if (A012 == -1) {
                this.A00 = -1;
                break;
            }
            this.A00 = Math.max(this.A00, A012);
        }
        if (this.A00 != -1 && (!this.A02.isEmpty())) {
            int intValue = this.A03.intValue();
            if (intValue == 0 || intValue == 2) {
                Iterator it2 = this.A02.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long A013 = AnonymousClass6Xo.A01((Animator) next);
                        do {
                            Object next2 = it2.next();
                            long A014 = AnonymousClass6Xo.A01((Animator) next2);
                            if (A013 < A014) {
                                next = next2;
                                A013 = A014;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else if (intValue == 1) {
                next = C007103b.A0N(this.A02);
            } else {
                throw C36441kJ.A18();
            }
            C162337oQ.A00((Animator) next, this, 3);
        }
    }

    public static final void A00(C90544aK r1, C006302t r2) {
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

    public long getDuration() {
        return this.A00;
    }

    public long getStartDelay() {
        return this.A01;
    }

    public void pause() {
        super.pause();
        if (isPaused()) {
            for (Animator pause : this.A02) {
                pause.pause();
            }
        }
    }

    public void resume() {
        super.resume();
        if (!isPaused()) {
            for (Animator resume : this.A02) {
                resume.resume();
            }
        }
    }

    public Animator setDuration(long j) {
        return this;
    }
}
