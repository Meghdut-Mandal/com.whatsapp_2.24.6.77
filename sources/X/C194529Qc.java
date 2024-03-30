package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Qc  reason: invalid class name and case insensitive filesystem */
public class C194529Qc {
    public final AtomicInteger A00 = new AtomicInteger();
    public final C21010yW A01;

    public void A00(Boolean bool, Boolean bool2, int i) {
        C176328bw r1 = new C176328bw();
        r1.A03 = C36441kJ.A0y(this.A00.getAndIncrement());
        r1.A02 = Integer.valueOf(i);
        r1.A00 = bool;
        r1.A01 = bool2;
        this.A01.Bly(r1);
    }

    public C194529Qc(C21010yW r2) {
        this.A01 = r2;
    }
}
