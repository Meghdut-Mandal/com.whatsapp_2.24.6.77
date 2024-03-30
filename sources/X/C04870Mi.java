package X;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: X.0Mi  reason: invalid class name and case insensitive filesystem */
public final class C04870Mi extends C12160hb implements Serializable {
    public final Comparator zza;

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C04870Mi) {
            return this.zza.equals(((C04870Mi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public C04870Mi(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.zza = comparator;
    }
}
