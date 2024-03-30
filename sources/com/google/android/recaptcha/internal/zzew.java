package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C165607th;
import X.C17980sO;

public final class zzew extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzez zzb;
    public final /* synthetic */ zzoe zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzez, zzoe zzoe, C023509x r4) {
        super(2, r4);
        this.zzb = zzez;
        this.zzc = zzoe;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new zzew(this.zzb, this.zzc, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i == 0) {
            zzez zzez = this.zzb;
            zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzb.zzj(this.zzc.zzj)));
            zzez zzez2 = this.zzb;
            zzfh zzfh = zzez2.zzn;
            zzfh.zzd();
            zzfh.zze();
            zzez.zzl(zzez2, this.zzc);
            C165607th.A13(this.zzb).hashCode();
            C17980sO A13 = C165607th.A13(this.zzb);
            this.zza = 1;
            if (A13.B1c(this) == r2) {
                return r2;
            }
        }
        return new AnonymousClass0AK(AnonymousClass0AJ.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
