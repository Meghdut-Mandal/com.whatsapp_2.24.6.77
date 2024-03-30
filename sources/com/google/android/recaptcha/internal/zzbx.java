package com.google.android.recaptcha.internal;

import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzbx extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ zzca zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcj, List list, zzca zzca, C023509x r5) {
        super(2, r5);
        this.zzb = zzcj;
        this.zzc = list;
        this.zzd = zzca;
    }

    public final C023509x create(Object obj, C023509x r6) {
        zzbx zzbx = new zzbx(this.zzb, this.zzc, this.zzd, r6);
        zzbx.zze = obj;
        return zzbx;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i == 0) {
            AnonymousClass040 r5 = (AnonymousClass040) this.zze;
            zzfh zzfh = new zzfh();
            zzfh.zze();
            while (true) {
                int i2 = this.zzb.zzd;
                if (i2 < 0 || i2 >= this.zzc.size() || !C009403z.A04(r5)) {
                    zzfh.zzf();
                    zzfh.zza(TimeUnit.MICROSECONDS);
                } else {
                    try {
                        this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zzd), this.zzb);
                    } catch (Exception e) {
                        zzca zzca = this.zzd;
                        zzcj zzcj = this.zzb;
                        this.zza = 1;
                        if (zzca.zzh(e, zzcj, this) == r4) {
                            return r4;
                        }
                    }
                }
            }
            zzfh.zzf();
            zzfh.zza(TimeUnit.MICROSECONDS);
        }
        return AnonymousClass0AJ.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
