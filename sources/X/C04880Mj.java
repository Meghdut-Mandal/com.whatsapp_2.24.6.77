package X;

import java.io.Serializable;

/* renamed from: X.0Mj  reason: invalid class name and case insensitive filesystem */
public final class C04880Mj extends C12160hb implements Serializable {
    public final C12160hb zza;

    public C04880Mj(C12160hb r1) {
        this.zza = r1;
    }

    public final C12160hb A00() {
        return this.zza;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C04880Mj) {
            return this.zza.equals(((C04880Mj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
