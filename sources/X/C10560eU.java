package X;

import java.io.Serializable;

/* renamed from: X.0eU  reason: invalid class name and case insensitive filesystem */
public final class C10560eU implements C16900qH, Serializable {
    public final Object zza;

    public C10560eU(Object obj) {
        this.zza = obj;
    }

    public final Object ByC() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof C10560eU) || ((obj2 = this.zza) != (obj3 = ((C10560eU) obj).zza) && !obj2.equals(obj3))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass000.A0K(this.zza, AnonymousClass001.A0L());
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suppliers.ofInstance(");
        A0u.append(this.zza);
        return AnonymousClass000.A0q(")", A0u);
    }
}
