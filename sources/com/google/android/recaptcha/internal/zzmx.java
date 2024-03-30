package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzmx extends zzit implements zzkf {
    public static final zzmx zzb;
    public String zzd = "";
    public String zze = "";

    static {
        zzmx zzmx = new zzmx();
        zzb = zzmx;
        zzit.zzD(zzmx.class, zzmx);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[2];
            C165567td.A1V(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", objArr);
        } else if (i2 == 3) {
            return new zzmx();
        } else {
            if (i2 == 4) {
                return new zzmw((zzmv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
