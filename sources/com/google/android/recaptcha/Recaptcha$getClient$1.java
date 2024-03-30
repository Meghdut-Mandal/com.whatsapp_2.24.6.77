package com.google.android.recaptcha;

import X.AnonymousClass0A0;
import X.C023509x;
import X.C165597tg;
import android.app.Application;

public final class Recaptcha$getClient$1 extends AnonymousClass0A0 {
    public /* synthetic */ Object zza;
    public final /* synthetic */ Recaptcha zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, C023509x r2) {
        super(r2);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return C165597tg.A0i(this.zzb.m65getClientBWLJW6A((Application) null, (String) null, 0, this));
    }
}
