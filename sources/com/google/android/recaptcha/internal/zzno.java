package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzno extends zzit implements zzkf {
    public static final zzno zzb;
    public int zzd;
    public zzib zze;
    public zzlj zzf;
    public zzib zzg;
    public zzlj zzh;

    static {
        zzno zzno = new zzno();
        zzb = zzno;
        zzit.zzD(zzno.class, zzno);
    }

    public static zznn zzf() {
        return (zznn) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[5];
            C165567td.A1W(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", objArr);
        } else if (i2 == 3) {
            return new zzno();
        } else {
            if (i2 == 4) {
                return new zznn((zznm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzH(zzno zzno, zzib zzib) {
        zzib.getClass();
        zzno.zzg = zzib;
        zzno.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzno zzno, zzib zzib) {
        zzib.getClass();
        zzno.zze = zzib;
        zzno.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzno zzno, zzlj zzlj) {
        zzlj.getClass();
        zzno.zzh = zzlj;
        zzno.zzd |= 8;
    }

    public static /* synthetic */ void zzk(zzno zzno, zzlj zzlj) {
        zzlj.getClass();
        zzno.zzf = zzlj;
        zzno.zzd |= 2;
    }
}
