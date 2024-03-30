package com.google.android.recaptcha.internal;

public class zzio extends zzin implements zzkf {
    /* renamed from: zzd */
    public final zzip zzk() {
        zzit zzit = this.zza;
        if (zzit.zzG()) {
            ((zzip) zzit).zzb.zzg();
            zzit = super.zzk();
        }
        return (zzip) zzit;
    }

    public final void zzn() {
        super.zzn();
        zzip zzip = (zzip) this.zza;
        zzij zzij = zzip.zzb;
        if (zzij != zzij.zzb) {
            zzip.zzb = zzij.clone();
        }
    }

    public zzio(zzip zzip) {
        super(zzip);
    }
}
