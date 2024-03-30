package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzoj extends zzit implements zzkf {
    public static final zzoj zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public String zzk = "";

    static {
        zzoj zzoj = new zzoj();
        zzb = zzoj;
        zzit.zzD(zzoj.class, zzoj);
    }

    public static zzoi zzf() {
        return (zzoi) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[8];
            C165567td.A1W(objArr);
            C165577te.A1U(objArr);
            objArr[7] = "zzk";
            return C165617ti.A0I(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006", objArr);
        } else if (i2 == 3) {
            return new zzoj();
        } else {
            if (i2 == 4) {
                return new zzoi((zzoh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzH(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 32;
        zzoj.zzj = str;
    }

    public static /* synthetic */ void zzI(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 64;
        zzoj.zzk = str;
    }

    public static /* synthetic */ void zzJ(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 2;
        zzoj.zzf = str;
    }

    public static /* synthetic */ void zzK(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 4;
        zzoj.zzg = str;
    }

    public static /* synthetic */ void zzi(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 1;
        zzoj.zze = str;
    }

    public static /* synthetic */ void zzj(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 8;
        zzoj.zzh = str;
    }

    public static /* synthetic */ void zzk(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd |= 16;
        zzoj.zzi = str;
    }
}
