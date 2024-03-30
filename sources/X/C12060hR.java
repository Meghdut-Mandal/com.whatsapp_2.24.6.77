package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
public class C12060hR implements Runnable {
    public final /* synthetic */ C09140bt A00;

    public C12060hR(C09140bt r1) {
        this.A00 = r1;
    }

    public void run() {
        C09140bt r5 = this.A00;
        if (r5.A04) {
            if (r5.A06) {
                r5.A06 = false;
                C07110Wj r6 = r5.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                r6.A06 = currentAnimationTimeMillis;
                r6.A07 = -1;
                r6.A05 = currentAnimationTimeMillis;
                r6.A00 = 0.5f;
            }
            C07110Wj r8 = r5.A0F;
            if ((r8.A07 <= 0 || AnimationUtils.currentAnimationTimeMillis() <= r8.A07 + ((long) r8.A02)) && r5.A02()) {
                if (r5.A00) {
                    r5.A00 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    r5.A0C.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (r8.A05 != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float A002 = C07110Wj.A00(r8, currentAnimationTimeMillis2);
                    r8.A05 = currentAnimationTimeMillis2;
                    ListView listView = r5.A0E;
                    A00(listView, (int) (((float) (currentAnimationTimeMillis2 - r8.A05)) * ((-4.0f * A002 * A002) + (A002 * 4.0f)) * r8.A01));
                    C011504z.A07(r5.A0C, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            r5.A04 = false;
        }
    }

    public static void A00(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
