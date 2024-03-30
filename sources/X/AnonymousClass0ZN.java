package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: X.0ZN  reason: invalid class name */
public class AnonymousClass0ZN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ Matrix A07;
    public final /* synthetic */ AnonymousClass063 A08;

    public AnonymousClass0ZN(Matrix matrix, AnonymousClass063 r2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A08 = r2;
        this.A00 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A06 = f4;
        this.A03 = f5;
        this.A01 = f6;
        this.A04 = f7;
        this.A07 = matrix;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass000.A00(valueAnimator);
        AnonymousClass063 r4 = this.A08;
        AnonymousClass060 r3 = r4.A0I;
        r3.setAlpha(AnonymousClass064.A00(this.A00, this.A05, 0.0f, 0.2f, A002));
        float f = this.A02;
        float f2 = this.A06;
        r3.setScaleX(AnonymousClass001.A00(f2, f, A002));
        r3.setScaleY(AnonymousClass001.A00(f2, this.A03, A002));
        float A003 = AnonymousClass001.A00(this.A04, this.A01, A002);
        r4.A02 = A003;
        Matrix matrix = this.A07;
        AnonymousClass063.A03(matrix, r4, A003);
        r3.setImageMatrix(matrix);
    }
}
