package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;

public final class zzbz extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    public final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbz(zzcj zzcj, zzca zzca, String str, C023509x r5) {
        super(2, r5);
        this.zzb = zzcj;
        this.zzc = zzca;
        this.zzd = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new zzbz(this.zzb, this.zzc, this.zzd, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.zzb.zza = new zzz();
            zzpf zza2 = this.zzc.zzd.zza(zzpn.zzg(zzfy.zzb.zzj(this.zzd)));
            zzca zzca = this.zzc;
            zzjb zzjb = zza2.zzd;
            zzcj zzcj = this.zzb;
            this.zza = 1;
            if (zzca.zzg(zzjb, zzcj, this) == r4) {
                return r4;
            }
        } else if (i != 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Exception e) {
                zzca zzca2 = this.zzc;
                zzcj zzcj2 = this.zzb;
                this.zza = 2;
                if (zzca2.zzh(e, zzcj2, this) == r4) {
                    return r4;
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbz) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
