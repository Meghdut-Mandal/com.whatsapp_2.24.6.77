package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.util.Log;

/* renamed from: X.3Z9  reason: invalid class name */
public class AnonymousClass3Z9 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public final /* synthetic */ RecyclerFastScroller A03;

    public AnonymousClass3Z9(RecyclerFastScroller recyclerFastScroller) {
        this.A03 = recyclerFastScroller;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int totalScrollRange;
        int i;
        int i2;
        AppBarLayout appBarLayout;
        if (motionEvent.getActionMasked() == 0) {
            RecyclerFastScroller recyclerFastScroller = this.A03;
            recyclerFastScroller.A02.setPressed(true);
            C88084Ri r0 = recyclerFastScroller.A06;
            if (r0 != null) {
                r0.Bwb();
            }
            View view2 = recyclerFastScroller.A01;
            if (!(view2 == null || view2.getVisibility() == 0)) {
                recyclerFastScroller.A01.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                recyclerFastScroller.A01.startAnimation(alphaAnimation);
            }
            recyclerFastScroller.A04.A0e();
            recyclerFastScroller.A04.startNestedScroll(2);
            this.A00 = (float) recyclerFastScroller.getVisibleHeight();
            this.A01 = motionEvent.getY() + ((float) recyclerFastScroller.A02.getTop());
            i = recyclerFastScroller.A00;
        } else if (motionEvent.getActionMasked() == 2) {
            RecyclerFastScroller recyclerFastScroller2 = this.A03;
            View view3 = recyclerFastScroller2.A01;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            int A002 = recyclerFastScroller2.getVisibleHeight();
            float f = this.A00;
            float f2 = (float) A002;
            float y = (f - f2) + motionEvent.getY() + ((float) recyclerFastScroller2.A02.getTop());
            float f3 = (y - this.A01) / f;
            int computeVerticalScrollRange = recyclerFastScroller2.A04.computeVerticalScrollRange();
            AppBarLayout appBarLayout2 = recyclerFastScroller2.A05;
            if (appBarLayout2 == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout2.getTotalScrollRange();
            }
            int i3 = (int) (f3 * ((float) (computeVerticalScrollRange + totalScrollRange)));
            if (!(recyclerFastScroller2.A03 == null || (appBarLayout = recyclerFastScroller2.A05) == null)) {
                appBarLayout.getLayoutParams();
            }
            if (!(recyclerFastScroller2.A04 == null || recyclerFastScroller2.A02 == null)) {
                int abs = Math.abs(i3);
                if (abs > recyclerFastScroller2.getVisibleHeight()) {
                    int A0J = (int) ((((float) recyclerFastScroller2.A04.A0G.A0J()) * Math.min(Math.max(0.0f, y), f2)) / f2);
                    recyclerFastScroller2.A04.A0h(A0J);
                    if (A0J != 0) {
                        i2 = abs % A002;
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = (i3 + this.A02) - recyclerFastScroller2.A00;
                }
                try {
                    recyclerFastScroller2.A04.scrollBy(0, i2);
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            this.A01 = y;
            i = recyclerFastScroller2.A00;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                this.A01 = -1.0f;
                RecyclerFastScroller recyclerFastScroller3 = this.A03;
                recyclerFastScroller3.A04.stopNestedScroll();
                recyclerFastScroller3.A02.setPressed(false);
                recyclerFastScroller3.A02();
                View view4 = recyclerFastScroller3.A01;
                if (!(view4 == null || view4.getVisibility() == 4)) {
                    recyclerFastScroller3.A01.setVisibility(4);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(300);
                    recyclerFastScroller3.A01.startAnimation(alphaAnimation2);
                    return true;
                }
            }
            return true;
        }
        this.A02 = i;
        return true;
    }
}
