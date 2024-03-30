package com.google.android.gms.tasks;

import X.AnonymousClass000;
import java.util.concurrent.ExecutionException;

public final class zzaf implements zzae {
    public final Object zza = new Object();
    public final int zzb;
    public final zzw zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public Exception zzg;
    public boolean zzh;

    public zzaf(int i, zzw zzw) {
        this.zzb = i;
        this.zzc = zzw;
    }

    private final void zza() {
        int i = this.zzd;
        int i2 = this.zze;
        int i3 = i + i2 + this.zzf;
        int i4 = this.zzb;
        if (i3 == i4) {
            Exception exc = this.zzg;
            if (exc != null) {
                zzw zzw = this.zzc;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(i2);
                A0u.append(" out of ");
                A0u.append(i4);
                zzw.zza(new ExecutionException(AnonymousClass000.A0q(" underlying tasks failed", A0u), exc));
                return;
            }
            boolean z = this.zzh;
            zzw zzw2 = this.zzc;
            if (z) {
                zzw2.zzc();
            } else {
                zzw2.zzb((Object) null);
            }
        }
    }

    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
