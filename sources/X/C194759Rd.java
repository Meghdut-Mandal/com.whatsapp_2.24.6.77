package X;

import java.util.List;

/* renamed from: X.9Rd  reason: invalid class name and case insensitive filesystem */
public final class C194759Rd {
    public boolean A00;
    public final AnonymousClass9O4 A01;
    public final List A02 = AnonymousClass001.A0I();

    public final void A00() {
        synchronized (this) {
            if (!this.A00) {
                C22544AoQ aoQ = C22544AoQ.A00;
                AnonymousClass00C.A0D(aoQ, 0);
                C176948cw r1 = (C176948cw) this.A01.A08.get();
                r1.A01 = C199649fg.A01;
                r1.A06();
                aoQ.invoke(r1);
                AnonymousClass9VD.A04(r1);
                this.A02.add(r1);
                this.A00 = true;
            }
        }
    }

    public C194759Rd(AnonymousClass9O4 r2) {
        this.A01 = r2;
    }
}
