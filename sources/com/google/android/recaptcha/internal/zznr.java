package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zznr extends zzit implements zzkf {
    public static final zznr zzb;
    public int zzd;
    public String zze = "";
    public zzmu zzf;
    public zzmo zzg;
    public zzmx zzh;
    public String zzi = "";
    public String zzj = "";

    static {
        zznr zznr = new zznr();
        zzb = zznr;
        zzit.zzD(zznr.class, zznr);
    }

    public static zznq zzf() {
        return (zznq) zzb.zzp();
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
            return C165617ti.A0I(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", objArr);
        } else if (i2 == 3) {
            return new zznr();
        } else {
            if (i2 == 4) {
                return new zznq((zznp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzH(zznr zznr, zzmo zzmo) {
        zzmo.getClass();
        zznr.zzg = zzmo;
        zznr.zzd |= 2;
    }

    public static /* synthetic */ void zzi(zznr zznr, String str) {
        str.getClass();
        zznr.zze = str;
    }

    public static /* synthetic */ void zzj(zznr zznr, String str) {
        str.getClass();
        zznr.zzi = str;
    }

    public static /* synthetic */ void zzk(zznr zznr, String str) {
        str.getClass();
        zznr.zzj = str;
    }
}
