package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.620  reason: invalid class name */
public class AnonymousClass620 {
    public C160507l7 A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public Object A00(C158367go r7) {
        C160507l7 r0;
        C1265864p BAg = this.A00.BAg();
        if (BAg == null) {
            return null;
        }
        AnonymousClass6XL r4 = null;
        boolean z = false;
        while (BAg != null) {
            r4 = r7.Bos(BAg);
            if (z) {
                this.A01.incrementAndGet();
            }
            if (!r4.A05) {
                int i = r4.A00;
                z = true;
                if (i != 1 || (r0 = r4.A01) == null) {
                    this.A00.BWu(r4.A04, i);
                    if (!r4.A03) {
                    }
                } else {
                    this.A00 = r0;
                    z = false;
                }
                try {
                    Thread.sleep(this.A00.B8k());
                    BAg = this.A00.BAg();
                } catch (InterruptedException unused) {
                    C90484aE.A0z();
                }
            }
            return r4.A02;
        }
        if (r4 != null) {
            return r4.A02;
        }
        return null;
    }

    public AnonymousClass620(C160507l7 r2) {
        this.A00 = r2;
    }
}
