package com.google.android.recaptcha.internal;

import X.AnonymousClass00R;
import X.AnonymousClass0AJ;
import X.C009003v;

public final class zzcx extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ zzcj zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcx(zzcj zzcj, String str, int i) {
        super(2);
        this.zza = zzcj;
        this.zzb = str;
        this.zzc = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        this.zza.zzh.zzb(this.zzb, obj2);
        int i = this.zzc;
        if (i != -1) {
            this.zza.zze.zzf(i, obj);
        }
        return AnonymousClass0AJ.A00;
    }
}
