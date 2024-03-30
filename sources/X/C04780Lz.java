package X;

/* renamed from: X.0Lz  reason: invalid class name and case insensitive filesystem */
public final class C04780Lz extends C10820fH {
    public final Object zza;

    public C04780Lz(Object obj) {
        this.zza = obj;
    }

    public final Object A00() {
        return this.zza;
    }

    public final boolean A01() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C04780Lz) {
            return this.zza.equals(((C04780Lz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Optional.of(");
        A0u.append(this.zza);
        return AnonymousClass000.A0q(")", A0u);
    }
}
