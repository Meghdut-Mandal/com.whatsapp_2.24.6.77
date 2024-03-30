package com.google.android.recaptcha.internal;

import X.C165617ti;
import java.util.List;

public final class zznx extends zzit implements zzkf {
    public static final zznx zzb;
    public zzjb zzd = zzko.zza;

    public static zznx zzg() {
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }

    static {
        zznx zznx = new zznx();
        zzb = zznx;
        zzit.zzD(zznx.class, zznx);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zznx();
        } else {
            if (i2 == 4) {
                return new zznw((zznv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
