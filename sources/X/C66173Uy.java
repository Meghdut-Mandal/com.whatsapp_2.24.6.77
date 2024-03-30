package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.whatsapp.RollingCounterView;

/* renamed from: X.3Uy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66173Uy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ RollingCounterView A05;

    public /* synthetic */ C66173Uy(RollingCounterView rollingCounterView, int i, int i2, int i3, int i4, int i5) {
        this.A05 = rollingCounterView;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RollingCounterView rollingCounterView = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        float A002 = AnonymousClass000.A00(valueAnimator);
        int i6 = ((int) (((float) i) * A002)) + i2;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(rollingCounterView);
        A0a.width = i6;
        A0a.height = i3;
        A0a.leftMargin = Math.round(((float) (rollingCounterView.A01 - i4)) * A002) + i4;
        A0a.rightMargin = Math.round(A002 * ((float) (rollingCounterView.A02 - i5))) + i5;
        rollingCounterView.A0A.set(0, 0, i6, i3);
        rollingCounterView.setLayoutParams(A0a);
    }
}
