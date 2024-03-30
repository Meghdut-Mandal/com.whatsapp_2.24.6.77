package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;
import java.io.InputStream;
import java.util.List;

public final class zzol extends zzit implements zzkf {
    public static final zzol zzb;
    public int zzd;
    public String zze = "";
    public long zzf;
    public int zzg;
    public zzjb zzh = zzko.zza;

    public final String zzi() {
        return this.zze;
    }

    public final List zzj() {
        return this.zzh;
    }

    static {
        zzol zzol = new zzol();
        zzb = zzol;
        zzit.zzD(zzol.class, zzol);
    }

    public static zzol zzg(InputStream inputStream) {
        return (zzol) zzit.zzt(zzb, inputStream);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[6];
            C165567td.A1W(objArr);
            objArr[5] = zzon.class;
            return C165617ti.A0I(zzb, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b", objArr);
        } else if (i2 == 3) {
            return new zzol();
        } else {
            if (i2 == 4) {
                return new zzok((zzoh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
