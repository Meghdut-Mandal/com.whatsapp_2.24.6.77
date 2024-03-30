package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzog extends zzit implements zzkf {
    public static final zzog zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";

    public final String zzH() {
        return this.zzf;
    }

    public final String zzI() {
        return this.zzg;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zze;
    }

    static {
        zzog zzog = new zzog();
        zzb = zzog;
        zzit.zzD(zzog.class, zzog);
    }

    public static zzof zzf() {
        return (zzof) zzb.zzp();
    }

    public static zzog zzi(byte[] bArr) {
        return (zzog) zzit.zzu(zzb, bArr);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[5];
            C165567td.A1W(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", objArr);
        } else if (i2 == 3) {
            return new zzog();
        } else {
            if (i2 == 4) {
                return new zzof((zzoa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzJ(zzog zzog, String str) {
        str.getClass();
        zzog.zzd |= 1;
        zzog.zze = str;
    }
}
