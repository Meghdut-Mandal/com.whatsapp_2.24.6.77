package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C90524aI;

public final class zzim implements zzkc {
    public static final zzim zza = new zzim();

    public static zzim zza() {
        return zza;
    }

    public final zzkb zzb(Class cls) {
        Class<zzit> cls2 = zzit.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzkb) zzit.zzr(cls.asSubclass(cls2)).zzh(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw C90524aI.A0e("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw AnonymousClass001.A08("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzit.class.isAssignableFrom(cls);
    }
}
