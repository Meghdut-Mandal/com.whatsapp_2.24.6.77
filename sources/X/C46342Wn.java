package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Wn  reason: invalid class name and case insensitive filesystem */
public class C46342Wn extends AnonymousClass6FT {
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public final C21060yb A00;
    public final C21430zE A01;
    public final Handler A02;

    public void A02() {
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C80253v6(this, 35), 2000);
    }

    public C46342Wn(Handler handler, C21060yb r2, C21430zE r3) {
        this.A01 = r3;
        this.A02 = handler;
        this.A00 = r2;
    }
}
