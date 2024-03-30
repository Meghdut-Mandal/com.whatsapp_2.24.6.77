package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.12g  reason: invalid class name */
public class AnonymousClass12g {
    public final AnonymousClass12P A00;
    public final AtomicLong A01 = new AtomicLong(-1);
    public final C21010yW A02;
    public final C18950u5 A03;

    public void A01(String str, long j) {
        A00(this.A03, str, j);
    }

    public AnonymousClass12g(AnonymousClass12P r4, C21010yW r5) {
        this.A02 = r5;
        this.A00 = r4;
        this.A03 = new AnonymousClass12h().samplingRate;
    }

    public void A00(C18950u5 r9, String str, long j) {
        if (r9.A00()) {
            AnonymousClass12h r2 = new AnonymousClass12h();
            r2.A04 = str;
            r2.A02 = Long.valueOf(j);
            r2.A00 = Boolean.valueOf(C224714l.A02());
            AtomicLong atomicLong = this.A01;
            if (atomicLong.get() == -1) {
                AnonymousClass12P r0 = this.A00;
                r0.A06();
                atomicLong.compareAndSet(-1, r0.A03.length() / 1048576);
            }
            r2.A03 = Long.valueOf(atomicLong.get());
            if (Boolean.TRUE.equals(C18740tg.A01)) {
                r2.A01 = 1;
            }
            this.A02.Blz(r2, r9.A00);
        }
    }
}
