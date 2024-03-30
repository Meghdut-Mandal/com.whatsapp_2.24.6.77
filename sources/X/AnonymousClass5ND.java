package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5ND  reason: invalid class name */
public class AnonymousClass5ND extends C92884ev implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07 = 1;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public KeyboardPopupLayout A0F;
    public AnonymousClass1N2 A0G;
    public AnonymousClass7dA A0H;
    public AnonymousClass7dB A0I;
    public AnonymousClass7dC A0J;
    public C92754eZ A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P = false;
    public boolean A0Q = true;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T = false;
    public int[] A0U;
    public int A0V;
    public int A0W;
    public Rect A0X;
    public boolean A0Y = true;
    public final AnonymousClass0Z5 A0Z;
    public final ScaleGestureDetector A0a;
    public final View A0b;
    public final ArrayList A0c = C36441kJ.A14(4);

    public static int A07(AnonymousClass5ND r1, int i) {
        return (int) (((1.0f - r1.A00) * ((float) i)) / 2.0f);
    }

    public static void A08(AnonymousClass5ND r8, float f) {
        if (r8.A0C != null) {
            Iterator it = r8.A0c.iterator();
            while (it.hasNext()) {
                View A0K2 = C36431kI.A0K(it);
                try {
                    int i = ((FrameLayout.LayoutParams) A0K2.getLayoutParams()).gravity;
                    if ((i & 48) == 48) {
                        A0K2.setPivotY(0.0f);
                        C36341k9.A0z(A0K2, A0K2.getPaddingLeft(), (int) (((float) r8.A06) * f));
                    }
                    if ((i & 80) == 80) {
                        A0K2.setPivotY((float) A0K2.getMeasuredHeight());
                        A0K2.setPadding(A0K2.getPaddingLeft(), A0K2.getPaddingTop(), A0K2.getPaddingRight(), (int) (((float) r8.A06) * f));
                    }
                    if ((i & 8388611) == 8388611) {
                        A0K2.setPivotX(0.0f);
                        C36341k9.A0z(A0K2, (int) (((float) r8.A06) * f), A0K2.getPaddingTop());
                    }
                    if ((i & 8388613) == 8388613) {
                        A0K2.setPivotX((float) A0K2.getMeasuredWidth());
                        A0K2.setPadding(A0K2.getPaddingLeft(), A0K2.getPaddingTop(), (int) (((float) r8.A06) * f), A0K2.getPaddingBottom());
                    }
                } catch (Exception unused) {
                }
                float f2 = 1.0f / f;
                A0K2.setScaleX(f2);
                A0K2.setScaleY(f2);
            }
        }
    }

    public int A0A(int i) {
        if (this.A04 > (getLeftOfDraggableArea() - A07(this, i)) + (((getRightOfDraggableArea() - i) + A07(this, i)) / 2)) {
            return (getRightOfDraggableArea() - i) + A07(this, i);
        }
        return getLeftOfDraggableArea() - A07(this, i);
    }

    public int A0B(int i) {
        if (this instanceof AnonymousClass5NC) {
            AnonymousClass5NC r0 = (AnonymousClass5NC) this;
            int A0C2 = r0.A0C(i);
            int A0D2 = r0.A0D(i);
            if (!r0.A06) {
                return A0D2;
            }
            return A0C2;
        }
        int A0C3 = A0C(i);
        int A0D3 = A0D(i);
        int i2 = this.A05;
        if (AnonymousClass000.A05(i2, A0C3) >= AnonymousClass000.A05(i2, A0D3)) {
            return A0D3;
        }
        return A0C3;
    }

    public void A0E() {
        View view;
        if (this instanceof AnonymousClass5NC) {
            AnonymousClass5NC r3 = (AnonymousClass5NC) this;
            int i = 8;
            if ((r3.A07 != 2 || !AnonymousClass1N2.A00(r3)) && !r3.A0T && r3.getBonsaiUiUtil().BLC(r3.A03)) {
                view = r3.A0C;
                if (view != null) {
                    i = 0;
                } else {
                    return;
                }
            } else {
                view = r3.A0C;
                if (view == null) {
                    return;
                }
            }
            view.setVisibility(i);
        }
    }

    public void A0G(View view, View view2, int i, int i2, int i3, int i4) {
        if (this.A0R) {
            this.A04 = this.A08;
            this.A05 = this.A09;
            this.A0R = false;
        }
        this.A00 = 1.0f;
        this.A03 = i;
        this.A02 = i2;
        this.A0W = i3;
        this.A0V = i4;
        if (this.A07 == 2) {
            i = i3;
            i2 = i4;
        }
        this.A04 = A0A(i);
        this.A05 = A0B(i2);
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            view.setTranslationX((float) (iArr[0] - this.A04));
            view.setTranslationY((float) (iArr[1] - this.A05));
            view.setPivotY(0.0f);
            view.setPivotX(0.0f);
            view.setScaleX(C36441kJ.A01(view2) / ((float) i));
            view.setScaleY(C36441kJ.A02(view2) / ((float) i2));
        }
        this.A0L = true;
        addView(view, i, i2);
    }

    public void A0H(boolean z) {
        if (this.A0C != null && !this.A0L) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C135846dM(viewTreeObserver, this, z));
            requestLayout();
        }
    }

    public boolean A0I(int i, int i2) {
        if (this.A04 == i && this.A05 == i2) {
            return false;
        }
        A0F();
        boolean A0H2 = this.A0Z.A0H(this.A0C, i, i2);
        this.A04 = i;
        this.A05 = i2;
        return A0H2;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A0M) {
            canvas.clipRect(this.A0X);
        }
        super.dispatchDraw(canvas);
    }

    public int getBottomOfDraggableArea() {
        return (this.A0X.bottom - this.A01) - getPaddingBottom();
    }

    public int getLeftOfDraggableArea() {
        return this.A01 + this.A0X.left + getPaddingLeft();
    }

    public int getRightOfDraggableArea() {
        return (this.A0X.right - this.A01) - getPaddingRight();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0Z.A0F(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0C == null || !this.A0Q) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            scaleFactor = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            scaleFactor = 0.67f;
        }
        this.A0C.setScaleX(scaleFactor);
        this.A0C.setScaleY(this.A00);
        A08(this, this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0C == null || !this.A0Q) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0C;
        if (view != null && this.A0Q) {
            boolean z = this.A0O;
            float f = this.A00;
            if (z) {
                if (f <= 0.85f) {
                    this.A0N = true;
                    AnonymousClass7dA r0 = this.A0H;
                    if (r0 != null) {
                        ((AnonymousClass70Z) r0).A00.B76(true);
                    }
                    C92754eZ r5 = this.A0K;
                    if (r5 != null) {
                        r5.A0A(0, getResources().getColor(R.color.f6nameremoved));
                        this.A0K.setPlayerElevation(6);
                        this.A0K.setVisibility(0);
                    }
                }
                this.A0C.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125);
            } else {
                int i = (f > 0.85f ? 1 : (f == 0.85f ? 0 : -1));
                ViewPropertyAnimator animate = view.animate();
                float f2 = 1.0f;
                if (i <= 0) {
                    f2 = 0.67f;
                }
                C90514aH.A0R(animate, f2).setDuration(125);
                this.A00 = f2;
            }
            this.A0C.setScaleX(this.A00);
            this.A0C.setScaleY(this.A00);
            A08(this, this.A00);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        AnonymousClass0Z5 r3 = this.A0Z;
        if (r3.A02 != 1 && !this.A0a.isInProgress()) {
            if (this.A0C == null || motionEvent.getX() < ((float) (this.A04 + A07(this, this.A0C.getWidth()))) || motionEvent.getX() > ((float) ((this.A04 + this.A0C.getWidth()) - A07(this, this.A0C.getWidth()))) || motionEvent.getY() < ((float) (this.A05 + A07(this, this.A0C.getHeight())))) {
                return false;
            }
            if (motionEvent.getY() > ((float) (C36431kI.A04(this.A0C, this.A05) - A07(this, this.A0C.getHeight())))) {
                return false;
            }
        }
        if (this.A0S || this.A0L || (view = this.A0C) == null || view.getVisibility() != 0) {
            return false;
        }
        this.A0a.onTouchEvent(motionEvent);
        r3.A0C(motionEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A00 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setConfiguration(android.content.res.Configuration r5) {
        /*
            r4 = this;
            int r0 = r5.orientation
            r4.A07 = r0
            r3 = r4
            boolean r0 = r4 instanceof X.AnonymousClass5NC
            if (r0 == 0) goto L_0x0018
            X.5NC r3 = (X.AnonymousClass5NC) r3
            int r0 = r3.A07
            r2 = 2
            if (r0 == r2) goto L_0x0015
            int r0 = r3.A00
            r1 = 0
            if (r0 == r2) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            r3.A0S = r1
        L_0x0018:
            r4.A0E()
            int r1 = r4.A0W
            int r0 = r4.A03
            if (r1 != r0) goto L_0x0027
            int r1 = r4.A0V
            int r0 = r4.A02
            if (r1 == r0) goto L_0x0044
        L_0x0027:
            android.view.View r0 = r4.A0C
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r1 = r5.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0045
            int r0 = r4.A0W
            r2.width = r0
            int r0 = r4.A0V
        L_0x0038:
            r2.height = r0
            android.view.View r0 = r4.A0C
            r0.setLayoutParams(r2)
            android.view.View r0 = r4.A0C
            r0.requestLayout()
        L_0x0044:
            return
        L_0x0045:
            int r0 = r4.A03
            r2.width = r0
            int r0 = r4.A02
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ND.setConfiguration(android.content.res.Configuration):void");
    }

    public void setControlView(C92754eZ r2) {
        this.A0K = r2;
        this.A0D = r2.findViewById(R.id.header);
    }

    public AnonymousClass5ND(Context context, View view) {
        super(context);
        if (view == null) {
            this.A0b = this;
            view = this;
        } else {
            this.A0b = view;
        }
        int[] A1O = C36441kJ.A1O();
        view.getLocationInWindow(A1O);
        int i = A1O[0];
        this.A0X = new Rect(i, A1O[1], i + this.A0b.getWidth(), C36431kI.A04(this.A0b, A1O[1]));
        AnonymousClass0Z5 A012 = AnonymousClass0Z5.A01(this, new C95264kK(this));
        A012.A05 = (int) (((float) A012.A05) * (1.0f / 1.0f));
        this.A0Z = A012;
        A012.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0a = scaleGestureDetector;
        C05510Pz.A00(scaleGestureDetector);
        View A0C2 = C36361kB.A0C(C24801Dv.A00(context));
        C011004s.A07(A0C2, new AnonymousClass4ZQ(this, 4));
        AnonymousClass09G.A00(A0C2);
        this.A07 = C36341k9.A04(context);
    }

    public int A0C(int i) {
        float f = (float) i;
        return Math.min((getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)), getTopOfDraggableArea() - ((int) (((1.0f - this.A00) * f) / 2.0f)));
    }

    public int A0D(int i) {
        float f = (float) i;
        return AnonymousClass001.A02(getTopOfDraggableArea(), (int) (((1.0f - this.A00) * f) / 2.0f), (getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)));
    }

    public void A0F() {
        int[] A1O = C36441kJ.A1O();
        View view = this.A0b;
        view.getLocationInWindow(A1O);
        int i = A1O[0];
        this.A0X = new Rect(i, A1O[1], i + view.getWidth(), C36431kI.A04(view, A1O[1]));
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A0Z.A0I(true)) {
            C011504z.A05(this);
        }
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    public int getTopOfDraggableArea() {
        return getPaddingTop() + this.A01 + this.A0X.top;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0C;
        if (view != null && !this.A0O) {
            if (!this.A0L) {
                view.setScaleX(this.A00);
                this.A0C.setScaleY(this.A00);
            }
            View view2 = this.A0C;
            int i5 = this.A04;
            view2.layout(i5, this.A05, view2.getWidth() + i5, C36431kI.A04(this.A0C, this.A05));
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0E = null;
        this.A0C = view;
        AnimatorSet A0C2 = C36441kJ.A0C();
        A0C2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.A0C, "scaleX", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0C, "scaleY", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0C, "translationX", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0C, "translationY", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0C, "alpha", new float[]{0.0f, 1.0f})});
        A0C2.setInterpolator(new AccelerateInterpolator());
        A0C2.setDuration(130);
        C162337oQ.A00(A0C2, this, 31);
        A0C2.start();
        int[] iArr = this.A0U;
        if (iArr != null) {
            for (int findViewById : iArr) {
                View findViewById2 = this.A0C.findViewById(findViewById);
                if (findViewById2 != null) {
                    this.A0c.add(findViewById2);
                }
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0c.clear();
        this.A0C = null;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i) {
        this.A01 = i;
    }

    public void setClipToDependentView(boolean z) {
        this.A0M = z;
    }

    public void setDismissListener(AnonymousClass7dA r1) {
        this.A0H = r1;
    }

    public void setExitingFullScreen(boolean z) {
        this.A0N = z;
    }

    public void setFullscreen(boolean z) {
        this.A0O = z;
    }

    public void setIgnoreNextSoftInputHide(boolean z) {
        this.A0P = z;
    }

    public void setIsScalingEnabled(boolean z) {
        this.A0Q = z;
    }

    public void setKeyboardLayout(KeyboardPopupLayout keyboardPopupLayout) {
        this.A0F = keyboardPopupLayout;
    }

    public void setListViewLayoutIgnoreListener(AnonymousClass7dB r1) {
        this.A0I = r1;
    }

    public void setLockChild(boolean z) {
        this.A0S = z;
    }

    public void setViewAddedListener(AnonymousClass7dC r1) {
        this.A0J = r1;
    }
}
