package X;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.util.Log;

/* renamed from: X.6dH  reason: invalid class name and case insensitive filesystem */
public class C135796dH implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public C122375uk A0E;
    public Runnable A0F;
    public boolean A0G;
    public final double A0H;
    public final int A0I = ViewConfiguration.getLongPressTimeout();
    public final /* synthetic */ PipViewContainer A0J;

    public C135796dH(PipViewContainer pipViewContainer) {
        this.A0J = pipViewContainer;
        int i = C90484aE.A0P().widthPixels;
        int A002 = C36411kG.A00();
        this.A0H = Math.sqrt((double) ((i * i) + (A002 * A002)));
        this.A0F = new C1501574e(this, 5);
    }

    public static boolean A01(C135796dH r6) {
        C97034oI r0 = r6.A0J.A04;
        if (r0 == null || !r0.A0A() || ((double) r6.A08) >= r6.A0H / 60.0d) {
            return false;
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        String str;
        boolean z;
        int i2;
        int i3;
        int i4;
        float f;
        float rawX;
        int i5;
        View view2 = view;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view2);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                A00(view2.animate(), 1.0f);
                this.A0G = false;
                if (this.A0E == null) {
                    str = "PipViewContainer/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore";
                } else {
                    view2.removeCallbacks(this.A0F);
                    if (A01(this)) {
                        PipViewContainer pipViewContainer = this.A0J;
                        pipViewContainer.A04.A0H.performClick();
                        PipViewContainer.A04(pipViewContainer, false);
                        PipViewContainer.A01(pipViewContainer);
                        return true;
                    }
                    float f2 = this.A04;
                    float f3 = this.A05;
                    float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
                    double d = this.A0H;
                    boolean A1R = AnonymousClass000.A1R((((double) sqrt) > (d / 1.0d) ? 1 : (((double) sqrt) == (d / 1.0d) ? 0 : -1)));
                    float rawX2 = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (A1R) {
                        double d2 = (double) ((this.A04 / sqrt) * 64.0f);
                        double d3 = (double) ((this.A05 / sqrt) * 64.0f);
                        while (rawX2 >= 0.0f && rawX2 <= ((float) this.A07) && rawY >= 0.0f && rawY <= ((float) this.A06)) {
                            rawX2 = (float) (((double) rawX2) + d2);
                            rawY = (float) (((double) rawY) + d3);
                        }
                    }
                    PipViewContainer pipViewContainer2 = this.A0J;
                    C18820ts r0 = pipViewContainer2.A07;
                    C18820ts r15 = r0;
                    boolean A1Y = C36351kA.A1Y(r0);
                    float f4 = (float) (this.A07 / 2);
                    if (!A1Y ? rawX2 > f4 : rawX2 < f4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean A1U = C36401kF.A1U((rawY > ((float) (this.A06 / 2)) ? 1 : (rawY == ((float) (this.A06 / 2)) ? 0 : -1)));
                    pipViewContainer2.A02 = C36441kJ.A0Q(Boolean.valueOf(z), Boolean.valueOf(A1U));
                    C124545yN r9 = pipViewContainer2.A06;
                    C18740tg.A06(r9);
                    Point point = pipViewContainer2.A01;
                    C18740tg.A06(point);
                    C122375uk A002 = PipViewContainer.A00(point, new Point(this.A0C, this.A0B), pipViewContainer2, r9);
                    if (z) {
                        i2 = A002.A00;
                    } else {
                        i2 = A002.A02;
                    }
                    if (A1U) {
                        i3 = A002.A01;
                    } else {
                        i3 = A002.A03;
                    }
                    Point point2 = new Point(i2, i3);
                    int i6 = point2.x;
                    if (C36351kA.A1Y(r15)) {
                        i4 = A0a.leftMargin;
                    } else {
                        i4 = A0a.rightMargin;
                    }
                    int i7 = i6 - i4;
                    int i8 = point2.y - A0a.topMargin;
                    double sqrt2 = Math.sqrt((double) ((i7 * i7) + (i8 * i8)));
                    long max = (long) Math.max(200, (int) ((500.0d * sqrt2) / d));
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("PipViewContainer/onTouch ACTION_UP xVelocity: ");
                    A0u.append(this.A04);
                    A0u.append(", yVelocity: ");
                    A0u.append(this.A05);
                    A0u.append(", velocity: ");
                    A0u.append(sqrt);
                    A0u.append(", fling: ");
                    A0u.append(A1R);
                    A0u.append(", finalRawX: ");
                    A0u.append(rawX2);
                    A0u.append(", finalRawY: ");
                    A0u.append(rawY);
                    A0u.append(", screen length: (");
                    A0u.append(d);
                    A0u.append("), container size: ");
                    A0u.append(this.A07);
                    A0u.append("x");
                    A0u.append(this.A06);
                    A0u.append(", pipAtRight: ");
                    A0u.append(z);
                    A0u.append(", pipAtBottom: ");
                    A0u.append(A1U);
                    A0u.append(", moving distance: ");
                    A0u.append(sqrt2);
                    C36321k7.A1V(", duration: ", A0u, max);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("PipViewContainer/animatePiPView with duration: ");
                    A0u2.append(max);
                    A0u2.append(", xOffset: ");
                    A0u2.append(i7);
                    C36321k7.A1T(", yOffset: ", A0u2, i8);
                    if (max <= 0 || !pipViewContainer2.A0B) {
                        PipViewContainer.A02(pipViewContainer2);
                        return true;
                    }
                    float[] A0v = C90524aI.A0v();
                    // fill-array-data instruction
                    A0v[0] = 0;
                    A0v[1] = 1065353216;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
                    pipViewContainer2.A00 = ofFloat;
                    ofFloat.setDuration(max);
                    pipViewContainer2.A00.addUpdateListener(new C111815ct(view2, pipViewContainer2, i7, i8));
                    C162337oQ.A00(pipViewContainer2.A00, pipViewContainer2, 14);
                    pipViewContainer2.A00.start();
                    return true;
                }
            } else if (action != 2) {
                if (action != 3) {
                    return true;
                }
                A00(view2.animate(), 1.0f);
                this.A0G = false;
                view2.removeCallbacks(this.A0F);
                return true;
            } else if (this.A0E == null) {
                str = "PipViewContainer/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore";
            } else {
                int i9 = this.A09;
                C18820ts r7 = this.A0J.A07;
                if (C36351kA.A1Y(r7)) {
                    f = motionEvent.getRawX();
                    rawX = this.A00;
                } else {
                    f = this.A00;
                    rawX = motionEvent.getRawX();
                }
                int rawY2 = this.A0A + ((int) (motionEvent.getRawY() - this.A01));
                C122375uk r4 = this.A0E;
                int max2 = Math.max(r4.A02, Math.min(r4.A00, i9 + ((int) (f - rawX))));
                int max3 = Math.max(r4.A03, Math.min(r4.A01, rawY2));
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                if (C36351kA.A1Y(r7)) {
                    i5 = A0a.rightMargin;
                } else {
                    i5 = A0a.leftMargin;
                }
                View view3 = view2;
                AnonymousClass1JZ.A06(view3, r7, max2, max3, i5, A0a.bottomMargin);
                this.A08 = Math.max(Math.max(AnonymousClass000.A05(max2, this.A09), AnonymousClass000.A05(max3, this.A0A)), this.A08);
                if (!A01(this) && !this.A0G) {
                    this.A0G = true;
                    A00(view2.animate(), 1.1f);
                    view3.removeCallbacks(this.A0F);
                }
                long eventTime = motionEvent.getEventTime() - this.A0D;
                if (eventTime > 0) {
                    float f5 = (float) eventTime;
                    this.A04 = ((motionEvent.getRawX() - this.A02) * 1000.0f) / f5;
                    this.A05 = ((motionEvent.getRawY() - this.A03) * 1000.0f) / f5;
                }
                this.A02 = motionEvent.getRawX();
                this.A03 = motionEvent.getRawY();
                this.A0D = motionEvent.getEventTime();
                return true;
            }
            Log.i(str);
            return true;
        }
        view2.postDelayed(this.A0F, (long) this.A0I);
        PipViewContainer pipViewContainer3 = this.A0J;
        Point point3 = pipViewContainer3.A01;
        C18740tg.A06(point3);
        this.A07 = point3.x;
        C18740tg.A06(point3);
        this.A06 = point3.y;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        if (C36351kA.A1Y(pipViewContainer3.A07)) {
            i = A0a.leftMargin;
        } else {
            i = A0a.rightMargin;
        }
        this.A09 = i;
        this.A0A = A0a.topMargin;
        this.A0C = view2.getWidth();
        this.A0B = view2.getHeight();
        PipViewContainer.A04(pipViewContainer3, true);
        this.A08 = 0;
        ViewGroup.LayoutParams layoutParams = pipViewContainer3.getLayoutParams();
        Point point4 = new Point(layoutParams.width, layoutParams.height);
        C124545yN r1 = pipViewContainer3.A06;
        C18740tg.A06(r1);
        Point point5 = pipViewContainer3.A01;
        C18740tg.A06(point5);
        this.A0E = PipViewContainer.A00(point5, point4, pipViewContainer3, r1);
        this.A05 = 0.0f;
        this.A04 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A0D = 0;
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("PipViewContainer/onTouch ACTION_DOWN downX: ");
        A0u3.append(this.A00);
        A0u3.append(", downY: ");
        A0u3.append(this.A01);
        A0u3.append(", leftMargin: ");
        A0u3.append(this.A09);
        A0u3.append(", topMargin: ");
        C36321k7.A1Y(A0u3, this.A0A);
        return true;
    }

    public static void A00(ViewPropertyAnimator viewPropertyAnimator, float f) {
        viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(100).start();
    }
}
