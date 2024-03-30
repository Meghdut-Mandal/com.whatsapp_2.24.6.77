package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.063  reason: invalid class name */
public abstract class AnonymousClass063 {
    public static final TimeInterpolator A0O = AnonymousClass064.A01;
    public static final int[] A0P = new int[0];
    public static final int[] A0Q = {16842910};
    public static final int[] A0R = {16842908, 16842910};
    public static final int[] A0S = {16843623, 16842910};
    public static final int[] A0T = {16843623, 16842908, 16842910};
    public static final int[] A0U = {16842919, 16842910};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public AnonymousClass06H A0A;
    public AnonymousClass06H A0B;
    public C014706j A0C;
    public C012505l A0D;
    public AnonymousClass06J A0E;
    public boolean A0F;
    public boolean A0G = true;
    public final Matrix A0H = new Matrix();
    public final AnonymousClass060 A0I;
    public final AnonymousClass067 A0J;
    public final Rect A0K = new Rect();
    public final RectF A0L = new RectF();
    public final RectF A0M = new RectF();
    public final AnonymousClass06A A0N;

    public abstract void A05(float f, float f2, float f3);

    public abstract void A09(int[] iArr);

    public static AnimatorSet A00(AnonymousClass06H r9, AnonymousClass063 r10, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass060 r6 = r10.A0I;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6, View.ALPHA, new float[]{f});
        r9.A03("opacity").A00(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r6, View.SCALE_X, new float[]{f2});
        r9.A03("scale").A00(ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new AnonymousClass0ZF(r10));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r6, View.SCALE_Y, new float[]{f2});
        r9.A03("scale").A00(ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new AnonymousClass0ZF(r10));
        }
        arrayList.add(ofFloat3);
        Matrix matrix = r10.A0H;
        A03(matrix, r10, f3);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r6, new AnonymousClass0EB(), new AnonymousClass0ZI(r10), new Matrix[]{new Matrix(matrix)});
        r9.A03("iconScale").A00(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C05520Qa.A00(animatorSet, arrayList);
        return animatorSet;
    }

    public static AnimatorSet A01(AnonymousClass063 r13, float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        AnonymousClass063 r7 = r13;
        AnonymousClass060 r3 = r13.A0I;
        ofFloat.addUpdateListener(new AnonymousClass0ZN(new Matrix(r7.A0H), r7, r3.getAlpha(), f, r3.getScaleX(), f2, r3.getScaleY(), r13.A02, f3));
        arrayList.add(ofFloat);
        C05520Qa.A00(animatorSet, arrayList);
        animatorSet.setDuration((long) C014506h.A00(r3.getContext(), i, r3.getContext().getResources().getInteger(R.integer.f8nameremoved)));
        animatorSet.setInterpolator(C017807p.A01(AnonymousClass064.A02, r3.getContext(), i2));
        return animatorSet;
    }

    public static ValueAnimator A02(AnonymousClass06B r3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0O);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(r3);
        valueAnimator.addUpdateListener(r3);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (X.AnonymousClass060.A00(r1, r1.A01) >= r13.A06) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r13 = this;
            android.graphics.Rect r6 = r13.A0K
            r13.A07(r6)
            android.graphics.drawable.Drawable r1 = r13.A08
            java.lang.String r0 = "Didn't initialize content background"
            X.AnonymousClass0YM.A02(r1, r0)
            X.067 r0 = r13.A0J
            X.068 r0 = (X.AnonymousClass068) r0
            X.060 r5 = r0.A00
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0044
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0026
            X.060 r1 = r13.A0I
            int r0 = r1.A01
            int r1 = X.AnonymousClass060.A00(r1, r0)
            int r0 = r13.A06
            if (r1 < r0) goto L_0x0044
        L_0x0026:
            android.graphics.drawable.Drawable r7 = r13.A08
            if (r7 == 0) goto L_0x002d
        L_0x002a:
            X.AnonymousClass063.super.setBackgroundDrawable(r7)
        L_0x002d:
            int r4 = r6.left
            int r3 = r6.top
            int r2 = r6.right
            int r1 = r6.bottom
            android.graphics.Rect r0 = r5.A0C
            r0.set(r4, r3, r2, r1)
            int r0 = r5.A00
            int r4 = r4 + r0
            int r3 = r3 + r0
            int r2 = r2 + r0
            int r1 = r1 + r0
            r5.setPadding(r4, r3, r2, r1)
            return
        L_0x0044:
            android.graphics.drawable.Drawable r8 = r13.A08
            int r9 = r6.left
            int r10 = r6.top
            int r11 = r6.right
            int r12 = r6.bottom
            android.graphics.drawable.InsetDrawable r7 = new android.graphics.drawable.InsetDrawable
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass063.A04():void");
    }

    public void A06(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            AnonymousClass076.A01(C014906l.A02(colorStateList), drawable);
        }
    }

    public void A07(Rect rect) {
        int i;
        float f;
        if (this.A0F) {
            int i2 = this.A06;
            AnonymousClass060 r1 = this.A0I;
            i = (i2 - AnonymousClass060.A00(r1, r1.A01)) / 2;
        } else {
            i = 0;
        }
        if (this.A0G) {
            f = this.A0I.getElevation() + this.A03;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, (int) Math.ceil((double) (f * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public final void A08(AnonymousClass06J r3) {
        this.A0E = r3;
        C012505l r0 = this.A0D;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        Drawable drawable = this.A09;
        if (drawable instanceof C012405k) {
            ((C012405k) drawable).setShapeAppearanceModel(r3);
        }
        C014706j r02 = this.A0C;
        if (r02 != null) {
            r02.A07 = r3;
            r02.invalidateSelf();
        }
    }

    public AnonymousClass063(AnonymousClass060 r4, AnonymousClass067 r5) {
        this.A0I = r4;
        this.A0J = r5;
        AnonymousClass06A r2 = new AnonymousClass06A();
        this.A0N = r2;
        r2.A00(A02(new AnonymousClass06C(this)), A0U);
        r2.A00(A02(new AnonymousClass06E(this)), A0T);
        r2.A00(A02(new AnonymousClass06E(this)), A0R);
        r2.A00(A02(new AnonymousClass06E(this)), A0S);
        r2.A00(A02(new AnonymousClass06F(this)), A0Q);
        r2.A00(A02(new AnonymousClass06G(this)), A0P);
        r4.getRotation();
    }

    public static void A03(Matrix matrix, AnonymousClass063 r6, float f) {
        matrix.reset();
        Drawable drawable = r6.A0I.getDrawable();
        if (drawable != null && r6.A05 != 0) {
            RectF rectF = r6.A0L;
            RectF rectF2 = r6.A0M;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) r6.A05;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) r6.A05) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }
}
