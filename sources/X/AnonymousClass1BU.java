package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1BU  reason: invalid class name */
public class AnonymousClass1BU {
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C20810yC A02;
    public final C19700wN A03;

    public synchronized void A00() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public synchronized boolean A02() {
        boolean z;
        if (this.A01) {
            z = false;
        } else {
            z = C20800yB.A01(C21000yV.A02, this.A02, 48);
        }
        return z;
    }

    public AnonymousClass1BU(C19700wN r2, C20810yC r3) {
        this.A02 = r3;
        this.A03 = r2;
    }

    public boolean A01() {
        if (!A02()) {
            return false;
        }
        return C20800yB.A01(C21000yV.A02, this.A02, 58);
    }

    public boolean A03(Throwable th) {
        if (th.getMessage() == null || !th.getMessage().contains("WATLS Exception")) {
            return false;
        }
        return true;
    }
}
