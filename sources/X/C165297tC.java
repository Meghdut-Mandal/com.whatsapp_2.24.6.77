package X;

import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.7tC  reason: invalid class name and case insensitive filesystem */
public class C165297tC implements AnonymousClass004 {
    public Object A00;
    public final int A01;

    public C165297tC(C25461Gk r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object get() {
        LinkedBlockingQueue linkedBlockingQueue;
        String str;
        int i;
        int i2 = this.A01;
        Set set = C25461Gk.A04;
        C19770wU r1 = ((C25461Gk) this.A00).A00.A00;
        if (i2 != 0) {
            str = "TranscodeQueue";
            i = 1;
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
            str = "ProcessImageQueue";
            i = 4;
        }
        return r1.B4z(str, linkedBlockingQueue, i, i, 1, 0);
    }
}
