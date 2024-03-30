package X;

import android.os.ConditionVariable;
import java.util.concurrent.Callable;

/* renamed from: X.0wr  reason: invalid class name and case insensitive filesystem */
public class C20000wr {
    public int A00 = 1;

    @Deprecated
    public void A00() {
        if (A06()) {
            synchronized (this) {
                ConditionVariable conditionVariable = C18740tg.A00;
                while (this.A00 <= 3) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public synchronized void A01() {
        this.A00 = 5;
        notifyAll();
    }

    public synchronized void A02() {
        this.A00 = 4;
        notifyAll();
    }

    public synchronized void A03() {
        this.A00 = 3;
    }

    public void A04(Callable callable) {
        synchronized (this) {
            if (this.A00 == 1) {
                try {
                    callable.call();
                } catch (Exception e) {
                    if (e instanceof RuntimeException) {
                        throw ((RuntimeException) e);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception occurred with while executing operation with message: ");
                    sb.append(e.getMessage());
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public synchronized boolean A05() {
        boolean z;
        z = true;
        if (this.A00 != 1) {
            z = false;
        }
        return z;
    }

    public synchronized boolean A06() {
        boolean z;
        z = false;
        if (this.A00 > 3) {
            z = true;
        }
        return !z;
    }
}
