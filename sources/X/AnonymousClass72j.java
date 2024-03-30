package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.72j  reason: invalid class name */
public class AnonymousClass72j implements Runnable {
    public int A00;
    public final int A01;

    public AnonymousClass72j(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
    }

    public final void run() {
        switch (this.A01) {
            case 0:
                int i = this.A00;
                AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
                Voip.cancelVideoUpgrade(i);
                return;
            case 1:
                int i2 = this.A00;
                AtomicInteger atomicInteger2 = AnonymousClass6YM.A3X;
                Voip.notifyAudioRouteChange(i2);
                return;
            default:
                int i3 = this.A00;
                AtomicInteger atomicInteger3 = AnonymousClass6YM.A3X;
                Voip.rejectVideoUpgrade(i3);
                return;
        }
    }
}
