package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;

public final class zzex extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzex(zzez zzez, String str, C023509x r4) {
        super(2, r4);
        this.zza = zzez;
        this.zzb = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new zzex(this.zza, this.zzb, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AN.A00(obj);
        zzez.zzm(this.zza, this.zzb);
        return AnonymousClass0AJ.A00;
    }
}
