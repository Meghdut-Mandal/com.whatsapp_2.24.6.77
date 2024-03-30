package com.google.android.recaptcha.internal;

import X.C165617ti;

public final class zzhx extends zzit implements zzkf {
    public static final zzhx zzb;
    public int zzd;
    public zzjb zze = zzko.zza;
    public String zzf = "";
    public long zzg;
    public long zzh;
    public double zzi;
    public zzgw zzj = zzgw.zzb;
    public String zzk = "";
    public byte zzl = 2;

    static {
        zzhx zzhx = new zzhx();
        zzb = zzhx;
        zzit.zzD(zzhx.class, zzhx);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzhx();
        } else {
            if (i2 == 4) {
                return new zzhu((zzhj) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
