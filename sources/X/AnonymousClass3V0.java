package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.3V0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C43842Ka A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass3V0(C43842Ka r1, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A05 = r1;
        this.A02 = i3;
        this.A06 = z;
        this.A03 = i4;
        this.A04 = i5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A00;
        int i2 = this.A01;
        C43842Ka r4 = this.A05;
        int i3 = this.A02;
        boolean z = this.A06;
        int i4 = this.A03;
        int i5 = this.A04;
        int A002 = (int) ((((float) i) * C36361kB.A00(valueAnimator, 7)) + ((float) i2));
        ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(r4);
        A0K.width = A002;
        int i6 = i3 - A002;
        int i7 = A0K.topMargin;
        int i8 = A0K.bottomMargin;
        if (z) {
            A0K.setMargins(i6, i7, i4, i8);
            int i9 = r4.A00;
            r4.setPadding(i9 - Math.min(i6, 0), i9, i9, i9);
        } else {
            A0K.setMargins(i5, i7, i6, i8);
            int i10 = r4.A00;
            r4.setPadding(i10, i10, i10 - Math.min(i6, 0), i10);
        }
        r4.setLayoutParams(A0K);
    }
}
