package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6Jf  reason: invalid class name and case insensitive filesystem */
public class C129976Jf {
    public final C159017ie A00;
    public final ExecutorService A01 = Executors.newFixedThreadPool(3);

    public C129976Jf(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }

    public C129976Jf() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }
}
