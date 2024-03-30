package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Xo  reason: invalid class name */
public final class AnonymousClass6Xo {
    public static final long A00 = C90484aE.A0K(TimeUnit.SECONDS);
    public static final AnonymousClass6Xo A01 = new AnonymousClass6Xo();

    public static final long A00(Animator animator) {
        Comparable comparable;
        AnonymousClass00C.A0D(animator, 0);
        if (animator instanceof C90554aL) {
            C90554aL r6 = (C90554aL) animator;
            return (r6.A04 * ((long) r6.A00)) + A00(r6.A05);
        } else if (animator instanceof C90544aK) {
            List<Animator> list = ((C90544aK) animator).A02;
            ArrayList A0J = C36321k7.A0J(list);
            for (Animator A002 : list) {
                C36391kE.A1W(A0J, A00(A002));
            }
            Iterator it = A0J.iterator();
            if (!it.hasNext()) {
                comparable = null;
            } else {
                comparable = (Comparable) it.next();
                while (it.hasNext()) {
                    Comparable comparable2 = (Comparable) it.next();
                    if (comparable.compareTo(comparable2) < 0) {
                        comparable = comparable2;
                    }
                }
            }
            Number number = (Number) comparable;
            if (number != null) {
                return number.longValue();
            }
            return 0;
        } else if (animator instanceof C90684aY) {
            return ((ValueAnimator) animator).getCurrentPlayTime();
        } else {
            return 0;
        }
    }

    public static final long A01(Animator animator) {
        AnonymousClass00C.A0D(animator, 0);
        if (animator instanceof C90554aL) {
            return ((C90554aL) animator).getTotalDuration();
        }
        if (animator instanceof C90544aK) {
            return ((C90544aK) animator).getTotalDuration();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return animator.getTotalDuration();
        }
        return animator.getStartDelay() + animator.getDuration();
    }

    public static final Animator A02(C1271967i r1, String str) {
        AnonymousClass00C.A0D(str, 1);
        return (Animator) ((AbstractMap) r1.A01(R.id.bk_context_key_animations)).get(str);
    }

    public static final void A03(Animator animator, long j) {
        AnonymousClass00C.A0D(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A04(Animator animator, long j) {
        AnonymousClass00C.A0D(animator, 0);
        long j2 = j;
        if (animator instanceof C90554aL) {
            C90554aL r8 = (C90554aL) animator;
            long A04 = C15040mb.A04(j2, 0, r8.getDuration());
            long j3 = r8.A04;
            r8.A00 = (int) (A04 / j3);
            A04(r8.A05, A04 % j3);
        } else if (animator instanceof C90544aK) {
            for (Animator A042 : ((C90544aK) animator).A02) {
                A04(A042, j);
            }
        } else if (animator instanceof C90684aY) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public static final void A05(Animator animator, C1271967i r3, String str) {
        C36321k7.A0v(animator, 1, str);
        Animator animator2 = (Animator) ((AbstractMap) r3.A01(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            AnonymousClass6RS.A01("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", C36431kI.A1Z(str, 1)));
        }
    }

    public final void A06(C1271967i r3, String str, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        Animator animator = (Animator) ((AbstractMap) r3.A01(R.id.bk_context_key_animations)).get(str);
        if (animator != null) {
            animator.addListener(new C90604aQ(r3, str, z));
            animator.start();
        }
    }
}
