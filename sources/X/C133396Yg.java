package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Yg  reason: invalid class name and case insensitive filesystem */
public class C133396Yg implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C96324n9 A01;

    public C133396Yg(RecyclerView recyclerView, C96324n9 r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A01 = AnonymousClass000.A00(valueAnimator);
        this.A00.invalidate();
    }
}
