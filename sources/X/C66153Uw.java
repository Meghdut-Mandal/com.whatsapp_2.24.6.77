package X;

import android.animation.ValueAnimator;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.3Uw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66153Uw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SizeTickerView A02;

    public /* synthetic */ C66153Uw(SizeTickerView sizeTickerView, long j, long j2) {
        this.A02 = sizeTickerView;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SizeTickerView sizeTickerView = this.A02;
        long j = this.A00;
        sizeTickerView.A05 = (long) (((float) j) + (((float) ((this.A01 - j) * ((long) C36361kB.A01(valueAnimator)))) / 10.0f));
        SizeTickerView.A06(sizeTickerView);
    }
}
