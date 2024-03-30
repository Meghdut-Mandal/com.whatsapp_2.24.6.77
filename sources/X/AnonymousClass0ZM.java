package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* renamed from: X.0ZM  reason: invalid class name */
public class AnonymousClass0ZM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C09000bf A02;
    public final /* synthetic */ C07460Xt A03;
    public final /* synthetic */ AnonymousClass09H A04;
    public final /* synthetic */ AnonymousClass09H A05;

    public AnonymousClass0ZM(View view, C09000bf r2, C07460Xt r3, AnonymousClass09H r4, AnonymousClass09H r5, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass09P r1;
        C07460Xt r8 = this.A03;
        r8.A00.A08(valueAnimator.getAnimatedFraction());
        AnonymousClass09H r7 = this.A05;
        AnonymousClass09H r12 = this.A04;
        float A052 = r8.A00.A05();
        int i = this.A00;
        Interpolator interpolator = AnonymousClass0Gz.A00;
        AnonymousClass09O r5 = new AnonymousClass09O(r7);
        int i2 = 1;
        do {
            int i3 = i & i2;
            AnonymousClass09T A0C = r7.A00.A0C(i2);
            if (i3 != 0) {
                AnonymousClass09T A0C2 = r12.A00.A0C(i2);
                float f = 1.0f - A052;
                A0C = AnonymousClass09H.A00(A0C, (int) (((double) (((float) (A0C.A01 - A0C2.A01)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A03 - A0C2.A03)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A02 - A0C2.A02)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A00 - A0C2.A00)) * f)) + 0.5d));
            }
            r1 = r5.A00;
            r1.A07(A0C, i2);
            i2 <<= 1;
        } while (i2 <= 256);
        AnonymousClass0Gz.A04(this.A01, r1.A00(), Collections.singletonList(r8));
    }
}
