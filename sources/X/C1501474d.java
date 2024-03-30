package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.74d  reason: invalid class name and case insensitive filesystem */
public class C1501474d implements Runnable {
    public boolean A00;
    public final int A01;

    public C1501474d(int i) {
        this.A01 = i;
        this.A00 = false;
    }

    public void run() {
        if (1 - this.A01 != 0) {
            this.A00 = true;
            return;
        }
        boolean z = this.A00;
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        Voip.toggleToHammerheadDev(z);
    }

    public C1501474d(boolean z) {
        this.A01 = 1;
        this.A00 = z;
    }
}
