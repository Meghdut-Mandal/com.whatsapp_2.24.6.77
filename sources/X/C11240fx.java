package X;

import android.animation.ValueAnimator;

/* renamed from: X.0fx  reason: invalid class name and case insensitive filesystem */
public class C11240fx implements Runnable {
    public final /* synthetic */ AnonymousClass0I5 A00;

    public C11240fx(AnonymousClass0I5 r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0I5 r2 = this.A00;
        int i = r2.A02;
        if (i == 1) {
            r2.A0K.cancel();
        } else if (i != 2) {
            return;
        }
        r2.A02 = 3;
        ValueAnimator valueAnimator = r2.A0K;
        valueAnimator.setFloatValues(new float[]{AnonymousClass000.A00(valueAnimator), 0.0f});
        valueAnimator.setDuration((long) 500);
        valueAnimator.start();
    }
}
