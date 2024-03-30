package X;

import java.util.ArrayList;
import java.util.Objects;

public abstract class A0K implements B39 {
    public int A00;
    public C202189lD A01;
    public final ArrayList A02 = C165607th.A10();
    public final boolean A03;

    public final void A02() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(C202189lD r5) {
        this.A01 = r5;
        for (int i = 0; i < this.A00; i++) {
            ((B2E) this.A02.get(i)).BjZ(r5, this, this.A03, false);
        }
    }

    public /* synthetic */ void cancel() {
    }

    public final void A01() {
        C202189lD r3 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((B2E) this.A02.get(i)).BjV(r3, this, this.A03);
        }
        this.A01 = null;
    }

    public final void A03(int i) {
        C202189lD r3 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((B2E) this.A02.get(i2)).BSX(r3, this, i, this.A03);
        }
    }

    public A0K(boolean z) {
        this.A03 = z;
    }

    public final void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(b2e)) {
            arrayList.add(b2e);
            this.A00++;
        }
    }
}
