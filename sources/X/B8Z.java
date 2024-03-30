package X;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class B8Z implements Callable {
    public Object A00;
    public String A01;
    public final int A02;

    public B8Z(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final Object call() {
        String str;
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            return C203529oE.A04((InputStream) obj, this.A01);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        String str2 = this.A01;
        boolean z = lottieAnimationView.A03;
        Context context = lottieAnimationView.getContext();
        if (z) {
            str = AnonymousClass000.A0p("asset_", str2, AnonymousClass000.A0u());
        } else {
            str = null;
        }
        return C203529oE.A01(context, str2, str);
    }
}
