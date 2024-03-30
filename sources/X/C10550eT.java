package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.0eT  reason: invalid class name and case insensitive filesystem */
public final class C10550eT implements C16900qH, Serializable {
    public transient Object A00;
    public volatile transient boolean A01;
    public final C16900qH zza;

    public final Object ByC() {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    Object ByC = this.zza.ByC();
                    this.A00 = ByC;
                    this.A01 = true;
                    return ByC;
                }
            }
        }
        return this.A00;
    }

    public C10550eT(C16900qH r1) {
        Objects.requireNonNull(r1);
        this.zza = r1;
    }

    public final String toString() {
        Object obj;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suppliers.memoize(");
        if (this.A01) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("<supplier that returned ");
            A0u2.append(this.A00);
            obj = AnonymousClass000.A0q(">", A0u2);
        } else {
            obj = this.zza;
        }
        A0u.append(obj);
        return AnonymousClass000.A0q(")", A0u);
    }
}
