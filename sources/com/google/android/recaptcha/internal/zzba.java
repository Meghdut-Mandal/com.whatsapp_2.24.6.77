package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;

public final class zzba {
    public final String zza;
    public final long zzb;
    public final int zzc;

    public zzba(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzba = (zzba) obj;
            if (AnonymousClass00C.A0J(zzba.zza, this.zza) && zzba.zzb == this.zzb && zzba.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }
}
