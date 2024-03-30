package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzna extends zzit implements zzkf {
    public static final zzna zzb;
    public int zzd;
    public String zze = "";
    public int zzf;
    public String zzg = "";
    public int zzh;
    public String zzi = "";
    public int zzj;

    static {
        zzna zzna = new zzna();
        zzb = zzna;
        zzit.zzD(zzna.class, zzna);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[7];
            C165567td.A1W(objArr);
            C165577te.A1U(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", objArr);
        } else if (i2 == 3) {
            return new zzna();
        } else {
            if (i2 == 4) {
                return new zzmz((zzmy) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
