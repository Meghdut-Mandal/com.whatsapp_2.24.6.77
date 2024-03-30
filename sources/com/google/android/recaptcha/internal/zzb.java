package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;

public final class zzb extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zza zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(zza zza2, String str, long j, C023509x r6) {
        super(2, r6);
        this.zzb = zza2;
        this.zzc = str;
        this.zzd = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new zzb(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zza2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i != 0) {
            zza2 = ((AnonymousClass0AK) obj).value;
        } else {
            zza zza3 = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zza2 = zza3.zza(str, j, this);
            if (zza2 == r5) {
                return r5;
            }
        }
        return new AnonymousClass0AK(zza2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
