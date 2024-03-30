package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0n5;
import X.C009003v;
import X.C023509x;
import X.C36331k8;

public final class zzet extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzez zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzez, C023509x r4) {
        super(2, r4);
        this.zzb = str;
        this.zzc = zzez;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new zzet(this.zzb, this.zzc, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i == 0) {
            zzez zzez = this.zzc;
            String str = this.zzb;
            AnonymousClass0n5 r4 = new AnonymousClass0n5();
            zzez.zzl.put(str, r4);
            String str2 = this.zzb;
            zzou zzf = zzov.zzf();
            zzf.zzd(str2);
            byte[] zzd = zzf.zzj().zzd();
            String zzi = zzfy.zzb.zzi(zzd, 0, zzd.length);
            zzez zzez2 = this.zzc;
            C36331k8.A1T(new zzes(zzez2, zzi, (C023509x) null), zzez2.zzq.zzb);
            this.zza = 1;
            obj = r4.B1c(this);
            if (obj == r6) {
                return r6;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
