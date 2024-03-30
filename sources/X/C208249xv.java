package X;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: X.9xv  reason: invalid class name and case insensitive filesystem */
public class C208249xv implements AnonymousClass7eC {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        AnonymousClass9Y2 r2 = (AnonymousClass9Y2) obj;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00.get();
        if (lottieAnimationView != null) {
            lottieAnimationView.setComposition(r2);
        }
    }

    public C208249xv(LottieAnimationView lottieAnimationView) {
        this.A00 = AnonymousClass001.A0F(lottieAnimationView);
    }
}
