package X;

import java.util.List;
import java.util.Objects;

/* renamed from: X.82d  reason: invalid class name and case insensitive filesystem */
public final class C1688282d extends AnonymousClass82X implements B2l {
    public long A00;
    public B2l A01;
    public final C1688382f A02;

    public void clear() {
        this.A00 = 0;
        this.A01 = null;
    }

    public List BAU(long j) {
        B2l b2l = this.A01;
        Objects.requireNonNull(b2l);
        return b2l.BAU(j - this.A00);
    }

    public long BBf(int i) {
        B2l b2l = this.A01;
        Objects.requireNonNull(b2l);
        return b2l.BBf(i) + this.A00;
    }

    public int BBg() {
        B2l b2l = this.A01;
        Objects.requireNonNull(b2l);
        return b2l.BBg();
    }

    public int BEU(long j) {
        B2l b2l = this.A01;
        Objects.requireNonNull(b2l);
        return b2l.BEU(j - this.A00);
    }

    public final void release() {
        this.A02.A07(this);
    }

    public C1688282d(C1688382f r1) {
        this.A02 = r1;
    }

    public C1688282d() {
    }
}
