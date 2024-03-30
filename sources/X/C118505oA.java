package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.5oA  reason: invalid class name and case insensitive filesystem */
public class C118505oA {
    public final BlockingQueue A00 = new DelayQueue();
    public final AnonymousClass78Y[] A01;

    public static void A00(AnonymousClass75L r2, String str) {
        r2.A02 = str;
        r2.A01 = 0;
        C133046Wl.A00().A00.add(r2);
    }

    public C118505oA(int i) {
        this.A01 = new AnonymousClass78Y[i];
        int i2 = 0;
        while (true) {
            AnonymousClass78Y[] r1 = this.A01;
            if (i2 < r1.length) {
                r1[i2] = new AnonymousClass78Y(this);
                this.A01[i2].setName(AnonymousClass000.A0r("GCD-Thread #", AnonymousClass000.A0u(), i2));
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}
