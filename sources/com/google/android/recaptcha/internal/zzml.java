package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzml extends zzit implements zzkf {
    public static final zzml zzb;
    public int zzd;
    public zzib zze;
    public int zzf;

    static {
        zzml zzml = new zzml();
        zzb = zzml;
        zzit.zzD(zzml.class, zzml);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[3];
            C165567td.A1V(objArr);
            objArr[2] = "zzf";
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", objArr);
        } else if (i2 == 3) {
            return new zzml();
        } else {
            if (i2 == 4) {
                return new zzmk((zzmj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
