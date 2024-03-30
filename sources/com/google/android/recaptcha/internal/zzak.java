package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import android.app.Application;

public final class zzak extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzak(Application application, String str, long j, C023509x r6) {
        super(2, r6);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new zzak(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            obj = zzam.zzc(application, str, j, (zzbq) null, this);
            if (obj == r1) {
                return r1;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
