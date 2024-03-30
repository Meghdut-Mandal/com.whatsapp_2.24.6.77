package com.google.android.recaptcha.internal;

import X.AnonymousClass001;

public abstract class zzge implements zzkd {
    public abstract zzge zza();

    public abstract zzge zzb(zzgf zzgf);

    public /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ zzkd zzc(zzke zzke) {
        if (zzY().getClass().isInstance(zzke)) {
            zzb((zzgf) zzke);
            return this;
        }
        throw AnonymousClass001.A08("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
