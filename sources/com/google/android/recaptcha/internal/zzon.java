package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzon extends zzit implements zzkf {
    public static final zzon zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";

    public final String zzg() {
        return this.zze;
    }

    public final String zzi() {
        return this.zzf;
    }

    static {
        zzon zzon = new zzon();
        zzb = zzon;
        zzit.zzD(zzon.class, zzon);
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
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", objArr);
        } else if (i2 == 3) {
            return new zzon();
        } else {
            if (i2 == 4) {
                return new zzom((zzoh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
