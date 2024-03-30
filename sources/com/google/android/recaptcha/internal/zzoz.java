package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;
import java.io.InputStream;

public final class zzoz extends zzit implements zzkf {
    public static final zzoz zzb;
    public int zzd;
    public int zze;
    public int zzf;

    static {
        zzoz zzoz = new zzoz();
        zzb = zzoz;
        zzit.zzD(zzoz.class, zzoz);
    }

    public static zzoz zzg(InputStream inputStream) {
        return (zzoz) zzit.zzt(zzb, inputStream);
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
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", objArr);
        } else if (i2 == 3) {
            return new zzoz();
        } else {
            if (i2 == 4) {
                return new zzoy((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzpb zzi() {
        zzpb zzb2 = zzpb.zzb(this.zzf);
        if (zzb2 == null) {
            return zzpb.UNRECOGNIZED;
        }
        return zzb2;
    }
}
