package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.2ra  reason: invalid class name and case insensitive filesystem */
public class C53602ra implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C53602ra(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C77933rI r3 = (C77933rI) obj;
            int A002 = (int) (((float) this.A00) * (AnonymousClass000.A00(valueAnimator) / 100.0f));
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(r3.A01);
            A0a.topMargin = -A002;
            r3.A01.setLayoutParams(A0a);
            return;
        }
        SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) obj;
        segmentedProgressBar.A0D[this.A00] = AnonymousClass000.A00(valueAnimator);
        segmentedProgressBar.postInvalidate();
    }
}
