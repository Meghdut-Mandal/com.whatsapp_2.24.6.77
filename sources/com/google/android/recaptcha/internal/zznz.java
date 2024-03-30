package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zznz extends zzit implements zzkf {
    public static final zznz zzb;
    public int zzd;
    public zznx zze;
    public zznx zzf;

    static {
        zznz zznz = new zznz();
        zzb = zznz;
        zzit.zzD(zznz.class, zznz);
    }

    public static zznz zzj(byte[] bArr) {
        return (zznz) zzit.zzu(zzb, bArr);
    }

    public final zznx zzf() {
        zznx zznx = this.zze;
        if (zznx == null) {
            return zznx.zzb;
        }
        return zznx;
    }

    public final zznx zzg() {
        zznx zznx = this.zzf;
        if (zznx == null) {
            return zznx.zzb;
        }
        return zznx;
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
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", objArr);
        } else if (i2 == 3) {
            return new zznz();
        } else {
            if (i2 == 4) {
                return new zzny((zznv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
