package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8FN  reason: invalid class name */
public class AnonymousClass8FN extends AX1 {
    public Object A00;
    public final int A01;

    public AnonymousClass8FN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void b() {
        if (this.A01 != 0) {
            C201499ji r5 = (C201499ji) this.A00;
            synchronized (r5.A08) {
                AtomicInteger atomicInteger = r5.A0D;
                if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                    if (r5.A01 != null) {
                        r5.A06.A02("Unbind from service.", new Object[0]);
                        r5.A03.unbindService(r5.A00);
                        r5.A02 = false;
                        r5.A01 = null;
                        r5.A00 = null;
                    }
                    C201499ji.A00(r5);
                } else {
                    r5.A06.A02("Leaving the connection open for other ongoing calls.", new Object[0]);
                }
            }
            return;
        }
        C201499ji r4 = ((C204169pZ) this.A00).A00;
        r4.A06.A02("unlinkToDeath", new Object[0]);
        r4.A01.asBinder().unlinkToDeath(r4.A05, 0);
        r4.A01 = null;
        r4.A02 = false;
    }
}
