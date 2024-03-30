package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass099;
import X.C05590Qh;

public final class zzu implements Comparable {
    public int zza;
    public long zzb;
    public long zzc;

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }

    public final String toString() {
        String A0G = AnonymousClass099.A0G(String.valueOf(this.zzb / ((long) this.zza)), 10);
        String A0G2 = AnonymousClass099.A0G(String.valueOf(this.zzc), 10);
        String A0G3 = AnonymousClass099.A0G(String.valueOf(this.zzb), 10);
        String A0G4 = AnonymousClass099.A0G(String.valueOf(this.zza), 5);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("avgExecutionTime: ");
        A0u.append(A0G);
        A0u.append(" us| maxExecutionTime: ");
        A0u.append(A0G2);
        A0u.append(" us| totalTime: ");
        A0u.append(A0G3);
        return AnonymousClass000.A0p(" us| #Usages: ", A0G4, A0u);
    }

    /* renamed from: zza */
    public final int compareTo(zzu zzu) {
        return C05590Qh.A00(Long.valueOf(this.zzb), Long.valueOf(zzu.zzb));
    }
}
