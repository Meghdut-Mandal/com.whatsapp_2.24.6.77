package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9jP  reason: invalid class name and case insensitive filesystem */
public final class C201369jP {
    public int A00;
    public int A01;
    public long A02;
    public C1264163w A03;
    public AnonymousClass88D A04;
    public Float A05;
    public C006302t A06;
    public C006302t A07;
    public final AtomicInteger A08;
    public final AtomicInteger A09;

    public C201369jP() {
        this((C1264163w) null, (C05250Oz) null, 1);
    }

    public /* synthetic */ C201369jP(C1264163w r4, C05250Oz r5, int i) {
        this.A03 = new C1264163w(2000);
        this.A08 = new AtomicInteger(0);
        this.A09 = new AtomicInteger(0);
        this.A02 = System.currentTimeMillis();
        System.currentTimeMillis();
        this.A00 = 2000000;
        this.A04 = new AnonymousClass88D(0);
    }

    public static final void A00(AnonymousClass88D r5, C201369jP r6) {
        int i = r6.A04.A00;
        int i2 = r5.A00;
        if (i != i2) {
            C200159gk r2 = AnonymousClass9AO.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Updating throughput health from ");
            A0u.append(i);
            r2.A01("sup:BtcThroughputHealth", AnonymousClass000.A0r(" to ", A0u, i2));
            r6.A04 = r5;
            C006302t r0 = r6.A06;
            if (r0 != null) {
                r0.invoke(r5);
            }
        }
    }

    public final void A01(int i) {
        AtomicInteger atomicInteger;
        AnonymousClass88D r0;
        C006302t r02;
        C1264163w r6 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        long j = r6.A02;
        C97984qe r5 = new C97984qe(i, currentTimeMillis + j);
        ConcurrentLinkedQueue concurrentLinkedQueue = r6.A03;
        if (concurrentLinkedQueue.isEmpty()) {
            r6.A00 = System.currentTimeMillis();
        }
        concurrentLinkedQueue.add(r5);
        r6.A01 += (long) i;
        r6.A04.schedule(new C1497572q(r6, 27), j, TimeUnit.MILLISECONDS);
        C1264163w r7 = this.A03;
        float f = (float) (r7.A01 * ((long) 8));
        long j2 = r7.A02;
        long currentTimeMillis2 = System.currentTimeMillis() - r7.A00;
        if (j2 > currentTimeMillis2) {
            j2 = currentTimeMillis2;
        }
        Float valueOf = Float.valueOf(f / (((float) j2) / 1000.0f));
        this.A05 = valueOf;
        if (!(valueOf == null || (r02 = this.A07) == null)) {
            r02.invoke(valueOf);
        }
        Float f2 = this.A05;
        C1264163w r2 = this.A03;
        if (System.currentTimeMillis() - r2.A00 >= r2.A02 && System.currentTimeMillis() - this.A02 > 1000) {
            this.A02 = System.currentTimeMillis();
            if (f2 != null) {
                float floatValue = f2.floatValue();
                C200159gk r4 = AnonymousClass9AO.A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Actual bitrate: ");
                A0u.append(f2);
                A0u.append(" Expected bitrate: ");
                int i2 = this.A00;
                A0u.append(i2);
                A0u.append(", pct: ");
                A0u.append((floatValue * ((float) 100)) / ((float) i2));
                r4.A02("sup:BtcThroughputHealth", A0u.toString());
                double d = (double) floatValue;
                double d2 = (double) this.A00;
                double d3 = AnonymousClass932.A02 * d2;
                int i3 = 1;
                if (d > d3) {
                    double d4 = AnonymousClass932.A00 * d2;
                    if (d3 > d || d > d4) {
                        i3 = 0;
                        if (d >= d4) {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                }
                if (floatValue <= ((float) (this.A01 + 100000)) || i3 == 1) {
                    atomicInteger = this.A08;
                    int incrementAndGet = atomicInteger.incrementAndGet();
                    this.A09.set(0);
                    if (incrementAndGet >= AnonymousClass932.A03) {
                        r0 = new AnonymousClass88D(1);
                    }
                    System.currentTimeMillis();
                }
                atomicInteger = this.A09;
                int incrementAndGet2 = atomicInteger.incrementAndGet();
                this.A08.set(0);
                if (incrementAndGet2 >= AnonymousClass932.A04) {
                    r0 = new AnonymousClass88D(i3);
                }
                System.currentTimeMillis();
                A00(r0, this);
                atomicInteger.set(0);
                System.currentTimeMillis();
            }
        }
    }
}
