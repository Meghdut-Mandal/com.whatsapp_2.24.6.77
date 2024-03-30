package X;

import java.util.Objects;

/* renamed from: X.0eR  reason: invalid class name */
public final class AnonymousClass0eR implements C16900qH {
    public Object A00;
    public volatile C16900qH A01;
    public volatile boolean A02;

    public final Object ByC() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    C16900qH r0 = this.A01;
                    r0.getClass();
                    Object ByC = r0.ByC();
                    this.A00 = ByC;
                    this.A02 = true;
                    this.A01 = null;
                    return ByC;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suppliers.memoize(");
        if (obj == null) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("<supplier that returned ");
            A0u2.append(this.A00);
            obj = AnonymousClass000.A0q(">", A0u2);
        }
        A0u.append(obj);
        return AnonymousClass000.A0q(")", A0u);
    }

    public AnonymousClass0eR(C16900qH r1) {
        Objects.requireNonNull(r1);
        this.A01 = r1;
    }
}
