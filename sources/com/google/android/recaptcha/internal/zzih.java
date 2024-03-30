package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;

public abstract class zzih {
    public static final zzif zza = new zzig();
    public static final zzif zzb;

    public static zzif zzb() {
        return zza;
    }

    static {
        zzif zzif;
        try {
            zzif = (zzif) AnonymousClass000.A0i("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            zzif = null;
        }
        zzb = zzif;
    }

    public static zzif zza() {
        zzif zzif = zzb;
        if (zzif != null) {
            return zzif;
        }
        throw AnonymousClass001.A09("Protobuf runtime is not correctly loaded.");
    }
}
