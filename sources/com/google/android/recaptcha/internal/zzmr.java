package com.google.android.recaptcha.internal;

import X.C165617ti;

public final class zzmr extends zzit implements zzkf {
    public static final zzmr zzb;
    public String zzd = "";
    public String zze = "";
    public int zzf;
    public String zzg = "";
    public String zzh = "";
    public int zzi;

    public static zzmr zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zzd;
    }

    static {
        zzmr zzmr = new zzmr();
        zzb = zzmr;
        zzit.zzD(zzmr.class, zzmr);
    }

    public static zzmq zzg() {
        return (zzmq) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg"});
        } else if (i2 == 3) {
            return new zzmr();
        } else {
            if (i2 == 4) {
                return new zzmq((zzmp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzH(zzmr zzmr, String str) {
        str.getClass();
        zzmr.zzd = str;
    }
}
