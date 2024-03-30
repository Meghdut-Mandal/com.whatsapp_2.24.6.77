package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzib extends zzit implements zzkf {
    public static final zzib zzb;
    public long zzd;
    public int zze;

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    static {
        zzib zzib = new zzib();
        zzb = zzib;
        zzit.zzD(zzib.class, zzib);
    }

    public static zzia zzi() {
        return (zzia) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[2];
            C165567td.A1V(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", objArr);
        } else if (i2 == 3) {
            return new zzib();
        } else {
            if (i2 == 4) {
                return new zzia((zzhz) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            return null;
        }
    }
}
