package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.9NE  reason: invalid class name */
public class AnonymousClass9NE {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public PointF A04;
    public boolean A05;

    public AnonymousClass9NE(PointF pointF, AnonymousClass9KS r7, float f, float f2, int i, long j) {
        this.A04 = pointF;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.2f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A02 = ofFloat;
        ofFloat.setDuration(250);
        this.A02.setInterpolator(accelerateInterpolator);
        this.A02.addUpdateListener(new C203929pB(this, f, f2, i));
        this.A02.addListener(new C165627tj(r7, this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A03 = ofFloat2;
        ofFloat2.setDuration(200);
        this.A03.setInterpolator(accelerateInterpolator);
        this.A03.addUpdateListener(new C203919pA(this, f, f2));
        this.A03.addListener(new C165637tk(r7, this, j));
    }
}
