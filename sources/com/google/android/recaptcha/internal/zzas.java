package com.google.android.recaptcha.internal;

import X.AnonymousClass0A0;
import X.C023509x;
import X.C165597tg;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzas extends AnonymousClass0A0 {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzaw zzb;
    public int zzc;
    public zzaw zzd;
    public zzbd zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzas(zzaw zzaw, C023509x r2) {
        super(r2);
        this.zzb = zzaw;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return C165597tg.A0i(this.zzb.zzk((RecaptchaAction) null, 0, this));
    }
}
