package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.whatsapp.R;

/* renamed from: X.4df  reason: invalid class name and case insensitive filesystem */
public class C92354df extends View implements C18700tb {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public Bitmap A0P;
    public Bitmap A0Q;
    public Bitmap A0R;
    public Matrix A0S;
    public Paint A0T;
    public Paint A0U;
    public Paint A0V;
    public Paint A0W;
    public RectF A0X;
    public RectF A0Y;
    public C18820ts A0Z;
    public AnonymousClass1QZ A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public int A0e;
    public int A0f;
    public AnimatorSet A0g;

    public C92354df(Context context, C18820ts r7, int i) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0b) {
            this.A0b = true;
            generatedComponent();
        }
        this.A0c = false;
        this.A0L = i;
        this.A0Z = r7;
        this.A0I = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0M = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0G = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0H = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0E = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0J = this.A0I / 2;
        this.A0O = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0N = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0F = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0X = C36441kJ.A0N();
        int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        Paint A0L2 = C36441kJ.A0L(1);
        this.A0U = A0L2;
        C36431kI.A1L(A0L2);
        this.A0U.setColor(A022);
        this.A0Y = C36441kJ.A0N();
        int A002 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
        Paint A0L3 = C36441kJ.A0L(1);
        this.A0V = A0L3;
        A0L3.setColor(A002);
        C36421kH.A0q(this.A0V);
        this.A0V.setStrokeWidth((float) this.A0G);
        Paint A0L4 = C36441kJ.A0L(1);
        this.A0W = A0L4;
        A0L4.setFilterBitmap(true);
        Paint A0L5 = C36441kJ.A0L(1);
        this.A0T = A0L5;
        A0L5.setFilterBitmap(true);
        this.A0T.setColorFilter(new PorterDuffColorFilter(this.A0F, PorterDuff.Mode.SRC_IN));
        this.A0R = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_shackle);
        this.A0Q = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_body);
        this.A0P = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_arrow);
        float height = ((float) this.A0R.getHeight()) * 0.39f;
        this.A05 = height;
        this.A0B = height;
        float height2 = (float) ((this.A0I / 2) - (this.A0R.getHeight() / 2));
        this.A0D = height2;
        float height3 = height2 + (((float) this.A0R.getHeight()) * 0.9f);
        this.A0C = height3;
        this.A0A = height3 + ((float) this.A0Q.getHeight()) + C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
        this.A01 = this.A0B;
        this.A03 = -2.5f;
        this.A06 = (float) (this.A0M + this.A0P.getHeight());
        float height4 = (float) (this.A0M + this.A0R.getHeight());
        this.A08 = height4;
        this.A07 = height4 + (((float) this.A0R.getHeight()) * 0.9f);
        this.A0S = C90524aI.A0B();
        A00(this);
        setElevation(C36441kJ.A00(getResources(), R.dimen.f7nameremoved));
        setClipToOutline(false);
        setOutlineProvider(new C92444dz(this));
    }

    public void setPercentageLocked(float f) {
        C18740tg.A0E(C36401kF.A1U((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "Percentage must be >= 0.0");
        float min = Math.min(1.0f, f);
        if (this.A09 != min) {
            this.A09 = min;
            int i = this.A0M;
            int i2 = this.A0I;
            float f2 = (float) (i - i2);
            float height = ((float) this.A0R.getHeight()) * 0.39f;
            this.A0e = 255 - ((int) (C90524aI.A00(min, 0.65f, 1.0f) * 255.0f));
            this.A0f = Math.min(i, Math.max((int) (((float) i) - (f2 * min)), i2));
            setTranslationY((-f2) * Math.min(min, 1.0f));
            if (min >= 0.15f) {
                if (this.A0c) {
                    A04();
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (2.5f * min2) - 1.75f;
                this.A02 = this.A0C - (height * min2);
                postInvalidate();
                invalidateOutline();
            } else if (this.A0d && !this.A0c) {
                A01(this);
            }
        }
    }

    public static void A00(C92354df r4) {
        r4.A01 = r4.A0B;
        r4.A00 = r4.A06;
        r4.A04 = r4.A08;
        r4.A02 = r4.A07;
        r4.A0K = 0;
        r4.A0f = r4.A0M;
        r4.A0e = 255;
        r4.A09 = 0.0f;
        r4.setTranslationY(0.0f);
        C90484aE.A16(r4);
        if (r4.A0L == 1) {
            r4.setTranslationX((float) r4.A0H);
        }
        r4.A0W.setColorFilter(new PorterDuffColorFilter(r4.A0O, PorterDuff.Mode.SRC_IN));
        if (r4.getMeasuredHeight() != 0 && r4.getMeasuredWidth() != 0) {
            r4.setPivotY((float) (r4.getMeasuredHeight() / 2));
            r4.setPivotX((float) (r4.getMeasuredWidth() / 2));
        }
    }

    public static void A01(C92354df r6) {
        if (!r6.A0c) {
            r6.A0g = C36441kJ.A0C();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            C36391kE.A13(ofFloat);
            C111565cU.A00(ofFloat, r6, 43);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(400);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            C111565cU.A00(ofFloat2, r6, 44);
            AnimatorSet animatorSet = r6.A0g;
            Animator[] animatorArr = new Animator[2];
            C36331k8.A1N(ofFloat, ofFloat2, animatorArr);
            animatorSet.playTogether(animatorArr);
            C162337oQ.A00(r6.A0g, r6, 32);
            r6.A0g.start();
        }
    }

    public static void A02(C92354df r3, Runnable runnable, long j) {
        if (!r3.A0d) {
            float[] A0v = C90524aI.A0v();
            // fill-array-data instruction
            A0v[0] = 0;
            A0v[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            ofFloat.setDuration(j);
            C36391kE.A13(ofFloat);
            C111565cU.A00(ofFloat, r3, 40);
            ofFloat.addListener(new C162317oO(r3, runnable, 2));
            ofFloat.start();
        }
    }

    public void A03() {
        if (this.A0d) {
            A04();
            int alpha = (int) ((getAlpha() / 1.0f) * 200.0f);
            animate().setListener((Animator.AnimatorListener) null).cancel();
            C90514aH.A1E(new C162337oQ(this, 33), animate().alpha(0.0f).setDuration((long) alpha));
        }
    }

    public void A04() {
        if (this.A0c) {
            AnimatorSet animatorSet = this.A0g;
            if (animatorSet != null) {
                animatorSet.end();
                this.A0g.removeAllListeners();
            }
            this.A0g = null;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0a;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0a = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0I, (int) (((float) this.A0M) + this.A05));
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0M;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A0U;
        paint.setAlpha(this.A0K);
        RectF rectF = this.A0X;
        rectF.left = 0.0f;
        float f = (float) ((int) this.A01);
        rectF.top = f;
        rectF.right = 0.0f + ((float) this.A0I);
        rectF.bottom = f + ((float) this.A0f);
        float f2 = (float) this.A0J;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float width = (float) (getWidth() / 2);
        Matrix matrix = this.A0S;
        Bitmap bitmap = this.A0R;
        matrix.setTranslate(width - ((float) (bitmap.getWidth() / 2)), this.A04);
        matrix.postRotate(this.A03, (float) (bitmap.getWidth() / 2), (float) bitmap.getHeight());
        Paint paint2 = this.A0W;
        canvas.drawBitmap(bitmap, matrix, paint2);
        Bitmap bitmap2 = this.A0Q;
        canvas.drawBitmap(bitmap2, width - ((float) (bitmap2.getWidth() / 2)), this.A02, paint2);
        Paint paint3 = this.A0T;
        paint3.setAlpha(this.A0e);
        Bitmap bitmap3 = this.A0P;
        canvas.drawBitmap(bitmap3, width - ((float) (bitmap3.getWidth() / 2)), this.A00, paint3);
    }
}
