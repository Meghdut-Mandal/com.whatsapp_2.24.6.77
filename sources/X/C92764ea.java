package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;

/* renamed from: X.4ea  reason: invalid class name and case insensitive filesystem */
public class C92764ea extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public AnonymousClass7eG A05;
    public AnonymousClass7eH A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public RootHostView A0A;
    public AnonymousClass6PY A0B;
    public boolean A0C;
    public final Animator.AnimatorListener A0D = new C162337oQ(this, 2);
    public final Animator.AnimatorListener A0E = new C162337oQ(this, 1);
    public final GestureDetector.OnGestureListener A0F;
    public final GestureDetector A0G;
    public final Runnable A0H = new AnonymousClass759((Object) this, 32);

    public C92764ea(Context context, Integer num, boolean z) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener r1 = new C164527rx(this, 0);
        this.A0F = r1;
        this.A09 = z;
        this.A07 = num;
        this.A0G = new GestureDetector(context, !z ? new C92064d4(this) : r1);
    }

    public static void A00(C92764ea r3) {
        if (r3.A00 != 0 && !r3.A0C) {
            Runnable runnable = r3.A0H;
            r3.removeCallbacks(runnable);
            r3.postDelayed(runnable, (long) r3.A00);
        }
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() > C36441kJ.A02(this) / 2.0f) {
                A02(this.A01);
            } else {
                A03((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public void A02(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0H);
        this.A0C = true;
        if (getContext() == null || !C011304x.A02(this)) {
            AnonymousClass7eG r0 = this.A05;
            if (r0 != null) {
                r0.BVw();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A09) {
            clearAnimation();
            alpha = C90514aH.A0R(animate().setDuration((long) i).setInterpolator(this.A03).alpha(0.0f), 1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A07.equals(C023109s.A00);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i).translationY((float) height).setInterpolator(this.A03).alpha(0.0f);
        }
        alpha.setListener(this.A0D);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A08 = false;
            return true;
        } else if (action == 1 || action == 3) {
            A00(this);
            return A01();
        } else if (onTouchEvent || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void setBloksContentViewFromParseResult(C1271967i r4, AnonymousClass6XK r5) {
        AnonymousClass6PY r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
            this.A0B = null;
        }
        RootHostView rootHostView = this.A0A;
        if (rootHostView != null) {
            removeView(rootHostView);
        }
        Context context = r4.A00;
        if (!context.equals(getContext())) {
            AnonymousClass6RS.A01("bk.action.toast.ShowToastV2", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A0A = new RootHostView(context, (AttributeSet) null);
        AnonymousClass6PY A002 = new AnonymousClass64D(context, r5, r4.A02).A00();
        this.A0B = A002;
        A002.A03(this.A0A);
        setContentView(this.A0B.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            AnonymousClass6RS.A01("bk.action.toast.ShowToastV2", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    public void A03(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration((long) i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass6PY r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
            this.A0B = null;
            this.A0A = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0H);
        } else if (action == 1 || action == 3) {
            A00(this);
            A01();
        }
        return this.A0G.onTouchEvent(motionEvent);
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(AnonymousClass7eG r1) {
        this.A05 = r1;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(AnonymousClass7eH r1) {
        this.A06 = r1;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
