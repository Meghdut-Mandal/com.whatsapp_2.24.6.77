package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C36431kI;

public final class zzbb {
    public final zzne zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze = null;

    public zzbb(zzne zzne, String str, String str2, String str3, String str4) {
        this.zza = zzne;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final zzne zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbb) {
            zzbb zzbb = (zzbb) obj;
            if (zzbb.zza != this.zza || !AnonymousClass00C.A0J(zzbb.zzb, this.zzb) || !AnonymousClass00C.A0J(zzbb.zzc, this.zzc) || !AnonymousClass00C.A0J(zzbb.zzd, this.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1Z = C36431kI.A1Z(this.zza, 5);
        A1Z[1] = this.zzb;
        A1Z[2] = this.zzc;
        A1Z[3] = this.zzd;
        return AnonymousClass000.A0M((Object) null, A1Z, 4);
    }
}
