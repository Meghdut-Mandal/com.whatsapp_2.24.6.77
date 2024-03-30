package com.google.android.recaptcha.internal;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import java.util.Timer;

public final class zzbk extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ zzbm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbm, C023509x r3) {
        super(2, r3);
        this.zza = zzbm;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new zzbk(this.zza, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzbk(this.zza, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AJ r0;
        AnonymousClass0AN.A00(obj);
        zzbm zzbm = this.zza;
        synchronized (zzbh.class) {
            zzaz zzaz = zzbm.zze;
            if (zzaz != null && zzaz.zzb() == 0) {
                Timer timer = zzbm.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzbm.zzb = null;
            }
            zzbm.zzg();
            r0 = AnonymousClass0AJ.A00;
        }
        return r0;
    }
}
