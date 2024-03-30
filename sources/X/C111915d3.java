package X;

import android.animation.ValueAnimator;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.5d3  reason: invalid class name and case insensitive filesystem */
public class C111915d3 implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C111915d3(C129126Fh r1, float f, int i, int i2) {
        this.A03 = i2;
        this.A02 = r1;
        this.A00 = f;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C91184bb r0;
        int i = this.A03;
        float f = this.A00;
        int i2 = this.A01;
        TitleBarView titleBarView = ((C129126Fh) this.A02).A0I;
        float A002 = AnonymousClass000.A00(valueAnimator);
        if (i != 0) {
            r0 = titleBarView.A0N;
            if (r0 == null) {
                throw C36331k8.A0d("shapeToolDrawable");
            }
        } else {
            r0 = titleBarView.A0M;
            if (r0 == null) {
                throw C36331k8.A0d("penToolDrawable");
            }
        }
        r0.A01 = f;
        r0.A02 = i2;
        r0.A00 = A002;
        r0.invalidateSelf();
    }
}
