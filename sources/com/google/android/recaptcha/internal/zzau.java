package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzau extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzau(zzaw zzaw, RecaptchaAction recaptchaAction, long j, C023509x r6) {
        super(2, r6);
        this.zzb = zzaw;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new zzau(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zze;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i != 0) {
            zze = ((AnonymousClass0AK) obj).value;
        } else {
            zzaw zzaw = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zze = zzaw.zzk(recaptchaAction, j, this);
            if (zze == r5) {
                return r5;
            }
        }
        AnonymousClass0AN.A00(zze);
        return zze;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
