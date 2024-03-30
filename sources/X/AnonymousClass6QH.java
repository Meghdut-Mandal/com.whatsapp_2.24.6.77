package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6QH  reason: invalid class name */
public class AnonymousClass6QH {
    public float A00;
    public float A01;
    public long A02;
    public AnimatorSet A03;
    public C160887lk A04;
    public C92354df A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B = false;
    public final float A0C;
    public final float A0D;
    public final int A0E;
    public final Activity A0F;
    public final Handler A0G = C36341k9.A0H();
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final ImageView A0O;
    public final AnonymousClass6E4 A0P;
    public final C19420v0 A0Q;
    public final C18820ts A0R;
    public final AnonymousClass7hS A0S;
    public final Runnable A0T = new C81133wW(this, 28);
    public final boolean A0U;
    public final float A0V;
    public final float A0W;
    public final TextView A0X;
    public final C19970wo A0Y;

    public void A01() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(0);
        translateAnimation.setFillBefore(true);
        translateAnimation.setFillAfter(true);
        this.A0X.startAnimation(translateAnimation);
    }

    public static void A00(AnonymousClass6QH r16) {
        AnonymousClass6QH r6 = r16;
        if (r6.A09) {
            long j = r6.A02;
            r6.A09 = false;
            ImageView imageView = r6.A0O;
            imageView.setVisibility(0);
            float f = r6.A0C;
            C18820ts r7 = r6.A0R;
            int i = 1;
            if (C36401kF.A1X(r7)) {
                i = -1;
            }
            imageView.setTranslationX(f * ((float) i));
            imageView.setTranslationY(r6.A0D);
            imageView.setScaleX(0.5f);
            imageView.setScaleY(0.5f);
            imageView.requestFocus();
            AnonymousClass6E4 r4 = r6.A0P;
            CopyOnWriteArraySet copyOnWriteArraySet = r4.A04;
            copyOnWriteArraySet.clear();
            copyOnWriteArraySet.add(new C98094qr(r6, 0));
            r4.A01(1.0d);
            View view = r6.A0J;
            view.clearAnimation();
            view.setVisibility(8);
            View view2 = r6.A0I;
            view2.clearAnimation();
            view2.setVisibility(8);
            View view3 = r6.A0K;
            view3.clearAnimation();
            view3.setVisibility(8);
            r6.A0H.setVisibility(0);
            View view4 = r6.A0M;
            view4.setVisibility(0);
            view4.post(new C81133wW(r6, 24));
            View view5 = r6.A0L;
            view5.setVisibility(0);
            view5.setClickable(true);
            C011504z.A06(view5, 2);
            float f2 = -1.0f;
            if (C36351kA.A1Y(r7)) {
                f2 = 1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(160);
            view5.startAnimation(translateAnimation);
            r6.A06 = false;
            r6.A02 = j;
            if (r6.A0U) {
                ViewGroup viewGroup = r6.A0N;
                viewGroup.setVisibility(0);
                viewGroup.bringToFront();
                if (r6.A05 == null) {
                    C92354df r1 = new C92354df(r6.A0F, r7, r6.A0E);
                    r6.A05 = r1;
                    r1.setVisibility(4);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    int i2 = 83;
                    if (C36351kA.A1Y(r7)) {
                        i2 = 85;
                    }
                    layoutParams.gravity = i2;
                    viewGroup.addView(r6.A05, layoutParams);
                }
                r6.A07 = false;
                r6.A0A = false;
                r6.A0G.post(r6.A0T);
            }
        }
        if (r6.A08) {
            boolean z = r6.A0B;
            r6.A08 = false;
            r6.A0A = true;
            C90514aH.A1E(new C162337oQ(r6, 27), r6.A0H.animate().setDuration(200).alpha(0.0f));
            C92354df r12 = r6.A05;
            if (r12 != null) {
                if (z) {
                    C81133wW r11 = new C81133wW(r6, 26);
                    r12.setPivotX((float) (r12.getWidth() / 2));
                    r12.setPivotY((float) (r12.A0I / 2));
                    AnimatorSet A0C2 = C36441kJ.A0C();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.3f});
                    ofFloat.setDuration(250);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setRepeatCount(2);
                    C90494aF.A0q(ofFloat);
                    C111565cU.A00(ofFloat, r12, 41);
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    Object[] objArr = new Object[2];
                    char A1b = C36361kB.A1b(objArr, r12.A0O);
                    objArr[1] = Integer.valueOf(r12.A0N);
                    ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
                    ofObject.setDuration(250);
                    C90494aF.A0q(ofObject);
                    C111565cU.A00(ofObject, r12, 42);
                    A0C2.addListener(new C162317oO(r12, r11, 3));
                    Animator[] animatorArr = new Animator[2];
                    animatorArr[A1b] = ofFloat;
                    animatorArr[1] = ofObject;
                    A0C2.playTogether(animatorArr);
                    A0C2.start();
                } else {
                    r6.A0N.setVisibility(8);
                }
            }
            r6.A0O.setVisibility(8);
            r6.A02();
        }
    }

    public void A02() {
        View view = this.A0M;
        view.post(new C81133wW(this, 25));
        view.setVisibility(8);
    }

    public void A03(long j) {
        this.A02 = j;
        this.A09 = true;
        ImageView imageView = this.A0O;
        if (imageView.isLaidOut()) {
            A00(this);
        } else {
            C164757sK.A00(imageView.getViewTreeObserver(), this, 20);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r9 >= 0.0f) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (java.lang.Math.abs(r11) <= r4.A0W) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.MotionEvent r19, int r20, boolean r21) {
        /*
            r18 = this;
            r4 = r18
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0168
            float r9 = r19.getY()
            float r0 = r4.A01
            float r9 = r9 - r0
            float r11 = r19.getX()
            float r0 = r4.A00
            float r11 = r11 - r0
            boolean r0 = r4.A07
            r6 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0025
            float r1 = java.lang.Math.abs(r11)
            float r0 = r4.A0W
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r4.A06 = r0
            boolean r5 = r4.A0U
            r3 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r7 = r21
            if (r5 == 0) goto L_0x00a8
            if (r0 != 0) goto L_0x0042
            float r1 = java.lang.Math.abs(r9)
            float r0 = r4.A0W
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            int r1 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r4.A07 = r0
            if (r0 == 0) goto L_0x01c0
            X.4df r0 = r4.A05
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x005e
            android.os.Handler r1 = r4.A0G
            java.lang.Runnable r0 = r4.A0T
            r1.removeCallbacks(r0)
            X.4df r10 = r4.A05
            r0 = 0
            r8 = 0
            X.C92354df.A02(r10, r8, r0)
        L_0x005e:
            float r0 = r4.A0W
            float r9 = r9 + r0
            X.4df r10 = r4.A05
            int r1 = r10.A0M
            int r0 = r10.A0I
            int r1 = r1 - r0
            float r8 = (float) r1
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x01b5
            r1 = 0
        L_0x006e:
            r10.setPercentageLocked(r1)
            float r0 = r4.A0D
            float r9 = r9 + r0
            float r0 = r0 - r8
            float r0 = java.lang.Math.max(r9, r0)
            android.widget.ImageView r8 = r4.A0O
            r8.setTranslationY(r0)
            X.6E4 r0 = r4.A0P
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            float r0 = r3 - r1
            float r0 = java.lang.Math.max(r15, r0)
            r8.setScaleX(r0)
            r8.setScaleY(r0)
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x009f
            r0.BYv(r2)
        L_0x009f:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            X.7lk r0 = r4.A04
            r0.BaL(r7)
        L_0x00a8:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x019a
            r0 = r20
            float r1 = (float) r0
            float r0 = r4.A0V
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r9
            float r0 = java.lang.Math.min(r1, r0)
            float r0 = r11 / r0
            float r8 = java.lang.Math.abs(r0)
            r0 = 1059481190(0x3f266666, float:0.65)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0173
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x00cc
            r0.Bht(r6, r7, r2, r2)
        L_0x00cc:
            X.7hS r0 = r4.A0S
            boolean r0 = r0.BK7()
            if (r0 == 0) goto L_0x0168
            long r0 = r4.A02
            r6 = 160(0xa0, double:7.9E-322)
            long r0 = r0 + r6
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0168
            X.0ts r6 = r4.A0R
            boolean r1 = X.C36351kA.A1Y(r6)
            boolean r0 = X.C36351kA.A1Y(r6)
            if (r0 == 0) goto L_0x0169
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0171
            float r0 = r4.A0W
            float r11 = r11 + r0
        L_0x00f4:
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x00fb
            r0.BkY(r11, r1)
        L_0x00fb:
            if (r5 == 0) goto L_0x0136
            X.4df r8 = r4.A05
            if (r8 == 0) goto L_0x0136
            boolean r0 = r8.A0d
            if (r0 == 0) goto L_0x0136
            float r7 = X.C36441kJ.A02(r8)
            float r5 = java.lang.Math.abs(r11)
            X.4df r0 = r4.A05
            float r0 = X.C36441kJ.A01(r0)
            float r1 = r5 / r0
            X.4df r0 = r4.A05
            float r0 = X.C36441kJ.A02(r0)
            float r1 = r1 * r0
            r0 = 1066611507(0x3f933333, float:1.15)
            float r1 = r1 * r0
            float r0 = java.lang.Math.min(r7, r1)
            r8.setTranslationY(r0)
            X.4df r1 = r4.A05
            float r0 = X.C36441kJ.A01(r1)
            float r5 = r5 / r0
            float r3 = r3 - r5
            float r0 = java.lang.Math.max(r15, r3)
            r1.setAlpha(r0)
        L_0x0136:
            android.widget.ImageView r5 = r4.A0O
            float r3 = r4.A0C
            boolean r1 = X.C36401kF.A1X(r6)
            r0 = 1
            if (r1 == 0) goto L_0x0142
            r0 = -1
        L_0x0142:
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 + r11
            r5.setTranslationX(r3)
            r10 = 0
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r13 = r11
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 0
            r9.setDuration(r0)
            r9.setFillBefore(r2)
            r9.setFillAfter(r2)
            android.widget.TextView r0 = r4.A0X
            r0.clearAnimation()
            r0.startAnimation(r9)
        L_0x0168:
            return
        L_0x0169:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0171
            float r0 = r4.A0W
            float r11 = r11 - r0
            goto L_0x00f4
        L_0x0171:
            r11 = 0
            goto L_0x00f4
        L_0x0173:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            X.7lk r1 = r4.A04
            if (r0 <= 0) goto L_0x0193
            if (r1 == 0) goto L_0x018a
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r8 = r8 * r9
            float r0 = r0 - r8
            float r0 = java.lang.Math.max(r15, r0)
            r1.Bgq(r0)
        L_0x018a:
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x00cc
            r0.BYv(r2)
            goto L_0x00cc
        L_0x0193:
            if (r1 == 0) goto L_0x00cc
            r1.Bgq(r3)
            goto L_0x00cc
        L_0x019a:
            android.widget.ImageView r3 = r4.A0O
            float r2 = r4.A0C
            X.0ts r0 = r4.A0R
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 1
            if (r1 == 0) goto L_0x01a8
            r0 = -1
        L_0x01a8:
            float r0 = (float) r0
            float r2 = r2 * r0
            r3.setTranslationX(r2)
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x0168
            r0.Bf2()
            return
        L_0x01b5:
            float r1 = java.lang.Math.abs(r9)
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r8
            float r1 = r1 / r0
            goto L_0x006e
        L_0x01c0:
            X.4df r0 = r4.A05
            if (r0 == 0) goto L_0x01c7
            r0.setPercentageLocked(r15)
        L_0x01c7:
            android.widget.ImageView r1 = r4.A0O
            float r0 = r4.A0D
            r1.setTranslationY(r0)
            r1.setScaleX(r3)
            r1.setScaleY(r3)
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QH.A04(android.view.MotionEvent, int, boolean):void");
    }

    public void A05(boolean z) {
        if (this.A0U) {
            C92354df r0 = this.A05;
            if (r0 != null) {
                r0.A03();
            }
            this.A0N.setVisibility(8);
        }
        AnonymousClass6E4 r8 = this.A0P;
        CopyOnWriteArraySet copyOnWriteArraySet = r8.A04;
        copyOnWriteArraySet.clear();
        if (r8.A07.A00 == 0.0d || !z) {
            r8.A01(0.0d);
            ImageView imageView = this.A0O;
            imageView.setVisibility(4);
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            C160887lk r02 = this.A04;
            if (r02 != null) {
                r02.Bgf();
            }
        } else {
            copyOnWriteArraySet.add(new AnonymousClass5JO(this, (int) this.A0O.getTranslationX()));
            r8.A01(0.0d);
        }
        View view = this.A0L;
        view.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160);
        view.startAnimation(alphaAnimation);
    }

    public void A06(boolean z) {
        this.A0B = z;
        this.A08 = true;
        ImageView imageView = this.A0O;
        if (imageView.isLaidOut()) {
            A00(this);
        } else {
            C164757sK.A00(imageView.getViewTreeObserver(), this, 20);
        }
    }

    public boolean A07(boolean z, boolean z2, boolean z3) {
        if (!this.A0A) {
            if (this.A07) {
                ImageView imageView = this.A0O;
                imageView.animate().setListener((Animator.AnimatorListener) null).cancel();
                C90514aH.A0R(imageView.animate().setDuration(200), 0.5f).translationY(this.A0D).setListener(new C90634aT(this, z, z2));
            } else {
                C160887lk r0 = this.A04;
                if (r0 == null) {
                    return true;
                }
                r0.Bht(z, z2, z3, false);
                return true;
            }
        }
        return false;
    }

    public AnonymousClass6QH(Activity activity, View view, View view2, View view3, View view4, View view5, View view6, View view7, ViewGroup viewGroup, ImageView imageView, TextView textView, C19970wo r23, C19630wG r24, C19420v0 r25, C18820ts r26, AnonymousClass7hS r27, float f, int i, boolean z) {
        int paddingLeft;
        float f2;
        int i2 = i;
        this.A0E = i2;
        this.A0F = activity;
        this.A0Y = r23;
        C18820ts r4 = r26;
        this.A0R = r4;
        this.A0Q = r25;
        this.A0N = viewGroup;
        ImageView imageView2 = imageView;
        this.A0O = imageView2;
        TextView textView2 = textView;
        this.A0X = textView2;
        float f3 = i2 == 1 ? 88.0f : 32.0f;
        Context context = r24.A00;
        int A022 = (int) C90464aC.A02(context, f3, 1);
        if (C36401kF.A1X(r4)) {
            paddingLeft = A022;
        } else {
            paddingLeft = textView2.getPaddingLeft();
        }
        textView2.setPadding(paddingLeft, textView2.getPaddingTop(), !C36351kA.A1Y(r4) ? textView2.getPaddingRight() : A022, textView2.getPaddingBottom());
        if (C222013h.A07) {
            AnonymousClass088.A01(C36431kI.A0G(textView2.getContext(), R.color.f6nameremoved), textView2);
        }
        this.A0H = view2;
        this.A0M = view3;
        this.A0J = view4;
        this.A0I = view5;
        this.A0K = view6;
        this.A0L = view7;
        this.A0U = z;
        this.A0V = f;
        this.A0S = r27;
        imageView2.setPadding(0, 0, 0, 0);
        if (i2 == 1) {
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(imageView2);
            A0a.setMargins(0, A0a.topMargin, 0, A0a.bottomMargin);
            imageView2.setLayoutParams(A0a);
            f2 = -36.15f;
        } else {
            f2 = 17.09f;
        }
        this.A0C = C90464aC.A02(context, f2, 1);
        this.A0D = C90464aC.A02(context, 23.5f, 1);
        view.getViewTreeObserver().addOnPreDrawListener(new C135886dQ(view, textView2, this));
        if (C36351kA.A1Y(r4)) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.voice_note_slide_to_cancel, 0, 0, 0);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C91364bt.A00(activity, r4, R.drawable.voice_note_slide_to_cancel), (Drawable) null);
        }
        this.A0W = ((float) ViewConfiguration.get(activity).getScaledTouchSlop()) * 1.5f;
        AnonymousClass6E4 A002 = C130366Ku.A00();
        this.A0P = A002;
        A002.A03 = new C130156Jy(440.0d, 21.0d);
        imageView2.setBackgroundResource(R.drawable.input_circle_large);
    }
}
