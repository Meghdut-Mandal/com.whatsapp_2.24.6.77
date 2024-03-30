package com.google.android.recaptcha.internal;

public final class zzid {
    public final Object zza;
    public final int zzb;

    public zzid(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzid) {
            zzid zzid = (zzid) obj;
            if (this.zza == zzid.zza && this.zzb == zzid.zzb) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
