package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;

public final class zze extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zza zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzoe zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zze(zza zza2, long j, zzoe zzoe, C023509x r6) {
        super(2, r6);
        this.zzb = zza2;
        this.zzc = j;
        this.zzd = zzoe;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new zze(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zzb2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i != 0) {
            zzb2 = ((AnonymousClass0AK) obj).value;
        } else {
            zza zza2 = this.zzb;
            long j = this.zzc;
            zzoe zzoe = this.zzd;
            this.zza = 1;
            zzb2 = zza2.zzb(j, zzoe, this);
            if (zzb2 == r5) {
                return r5;
            }
        }
        return new AnonymousClass0AK(zzb2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
