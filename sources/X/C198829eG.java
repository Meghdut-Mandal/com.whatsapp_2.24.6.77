package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.9eG  reason: invalid class name and case insensitive filesystem */
public final class C198829eG {
    public static final C191099Bo A03 = new C191099Bo(2);
    public static final C191099Bo A04 = new C191099Bo(3);
    public static final C191099Bo A05 = new C191099Bo(0);
    public static final C191099Bo A06 = new C191099Bo(1);
    public C166117v3 A00;
    public IOException A01;
    public final ExecutorService A02;

    public C198829eG(String str) {
        this.A02 = Executors.newSingleThreadExecutor(new AnonymousClass77E(str));
    }

    public void A00(B2D b2d, B0X b0x, int i) {
        Looper myLooper = Looper.myLooper();
        C200319h9.A02(AnonymousClass000.A1V(myLooper));
        C200319h9.A02(AnonymousClass000.A1V(myLooper));
        this.A01 = null;
        C166117v3 r2 = new C166117v3(myLooper, b2d, b0x, this, i, SystemClock.elapsedRealtime());
        C198829eG r1 = r2.A0A;
        C200319h9.A02(AnonymousClass000.A1W(r1.A00));
        r1.A00 = r2;
        r2.A01 = null;
        ExecutorService executorService = r1.A02;
        Objects.requireNonNull(r2);
        executorService.execute(r2);
    }
}
