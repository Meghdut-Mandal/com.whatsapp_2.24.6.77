package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1f4  reason: invalid class name and case insensitive filesystem */
public class C33301f4 {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public Executor A01;

    public void A00(AnonymousClass4Q6 r4, C81843xi r5) {
        this.A01.execute(new C35321iV(this, r5, r4, 45));
    }

    public C33301f4(Executor executor) {
        this.A01 = executor;
    }
}
