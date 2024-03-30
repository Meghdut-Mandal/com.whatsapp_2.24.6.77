package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.3Uz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66183Uz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C43842Ka A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C66183Uz(C43842Ka r1, int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A04 = r1;
        this.A05 = z;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A00;
        C43842Ka r8 = this.A04;
        boolean z = this.A05;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int A002 = (int) (((float) i) * C36361kB.A00(valueAnimator, 6));
        ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(r8);
        A0K.height = A002;
        A0K.width = A002;
        int i5 = (i - A002) / 2;
        if (z) {
            A0K.setMargins((i2 - A002) - i5, i5, i3 + i5, A0K.bottomMargin);
        } else {
            A0K.setMargins(i4 + i5, i5, 0, A0K.bottomMargin);
        }
        r8.setLayoutParams(A0K);
    }
}
