package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public class C64353Nq {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C24341Cb A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass39B A04;

    public static void A00(C64353Nq r3) {
        AnonymousClass005 r1 = r3.A02.A00;
        if (!((AnonymousClass36X) r1.get()).A00 && !((AnonymousClass36X) r1.get()).A01) {
            AnonymousClass39B r32 = r3.A04;
            if (r32.A04 == null) {
                synchronized (r32) {
                    if (r32.A04 == null) {
                        r32.A04 = new AnonymousClass3E5(r32.A00.A00(), r32.A02);
                    }
                }
            }
            AnonymousClass3E5 r2 = r32.A04;
            Lock lock = r2.A03;
            lock.lock();
            if (!r2.A00) {
                lock.unlock();
                C80243v5.A01(r2.A02, r2, 23);
                return;
            }
            lock.unlock();
        }
    }

    public C64353Nq(C20690y0 r1, AnonymousClass17Y r2, C24341Cb r3, AnonymousClass39B r4, AnonymousClass005 r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r4;
        this.A02 = r3;
        this.A03 = r5;
    }
}
