package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.08S  reason: invalid class name */
public class AnonymousClass08S extends C001700s {
    public C001800t A00 = new C001800t();

    public void A05() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass08U r1 = (AnonymousClass08U) ((Map.Entry) it.next()).getValue();
            r1.A02.A0A(r1);
        }
    }

    public void A06() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass08U r1 = (AnonymousClass08U) ((Map.Entry) it.next()).getValue();
            r1.A02.A0B(r1);
        }
    }

    public void A0E(C001600r r3) {
        AnonymousClass08U r1 = (AnonymousClass08U) this.A00.A01(r3);
        if (r1 != null) {
            r1.A02.A0B(r1);
        }
    }

    public void A0F(C001600r r3, AnonymousClass04S r4) {
        Objects.requireNonNull(r3, "source cannot be null");
        AnonymousClass08U r1 = new AnonymousClass08U(r3, r4);
        AnonymousClass08U r0 = (AnonymousClass08U) this.A00.A02(r3, r1);
        if (r0 != null) {
            if (r0.A01 != r4) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
        } else if (this.A00 > 0) {
            r1.A02.A0A(r1);
        }
    }
}
