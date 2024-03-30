package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C165587tf;

public class zzin extends zzge {
    public zzit zza;
    public final zzit zzb;

    public final /* synthetic */ zzke zzY() {
        return this.zzb;
    }

    public final /* synthetic */ zzge zzb(zzgf zzgf) {
        zzg((zzit) zzgf);
        return this;
    }

    /* renamed from: zzf */
    public final zzin zza() {
        zzin zzin = (zzin) this.zzb.zzh(5, (Object) null, (Object) null);
        zzin.zza = zzk();
        return zzin;
    }

    public final zzin zzg(zzit zzit) {
        if (!this.zzb.equals(zzit)) {
            C165587tf.A12(this);
            zzd(this.zza, zzit);
        }
        return this;
    }

    /* renamed from: zzi */
    public zzit zzk() {
        zzit zzit = this.zza;
        if (zzit.zzG()) {
            zzit.zzB();
        }
        return this.zza;
    }

    public void zzn() {
        zzit zzs = this.zzb.zzs();
        zzd(zzs, this.zza);
        this.zza = zzs;
    }

    public final boolean zzo() {
        return zzit.zzF(this.zza, false);
    }

    public zzin(zzit zzit) {
        this.zzb = zzit;
        if (!zzit.zzG()) {
            this.zza = zzit.zzs();
            return;
        }
        throw AnonymousClass001.A08("Default instance must be immutable.");
    }

    public static void zzd(Object obj, Object obj2) {
        C165587tf.A0I(obj).zzg(obj, obj2);
    }

    /* renamed from: zzh */
    public final zzit zzj() {
        zzit zzi = zzk();
        if (zzi.zzo()) {
            return zzi;
        }
        throw new zzlk(zzi);
    }

    public final void zzm() {
        C165587tf.A12(this);
    }
}
