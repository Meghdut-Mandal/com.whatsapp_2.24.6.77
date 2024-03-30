package com.google.android.recaptcha.internal;

import X.C165617ti;

public final class zzpk extends zzit implements zzkf {
    public static final zzpk zzb;
    public int zzd = 0;
    public Object zze;

    public static /* synthetic */ void zzJ(zzpk zzpk, boolean z) {
        zzpk.zzd = 1;
        zzpk.zze = Boolean.valueOf(z);
    }

    public static /* synthetic */ void zzK(zzpk zzpk, zzgw zzgw) {
        zzpk.zzd = 2;
        zzpk.zze = zzgw;
    }

    public static /* synthetic */ void zzM(zzpk zzpk, int i) {
        zzpk.zzd = 4;
        zzpk.zze = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzi(zzpk zzpk, int i) {
        zzpk.zzd = 5;
        zzpk.zze = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzj(zzpk zzpk, long j) {
        zzpk.zzd = 7;
        zzpk.zze = Long.valueOf(j);
    }

    static {
        zzpk zzpk = new zzpk();
        zzb = zzpk;
        zzit.zzD(zzpk.class, zzpk);
    }

    public static /* synthetic */ void zzH(zzpk zzpk, double d) {
        zzpk.zzd = 10;
        zzpk.zze = Double.valueOf(d);
    }

    public static zzpj zzf() {
        return (zzpj) zzb.zzp();
    }

    public static /* synthetic */ void zzk(zzpk zzpk, float f) {
        zzpk.zzd = 9;
        zzpk.zze = Float.valueOf(f);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zze", "zzd"});
        } else if (i2 == 3) {
            return new zzpk();
        } else {
            if (i2 == 4) {
                return new zzpj((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzI(zzpk zzpk, String str) {
        str.getClass();
        zzpk.zzd = 11;
        zzpk.zze = str;
    }

    public static /* synthetic */ void zzL(zzpk zzpk, String str) {
        str.getClass();
        zzpk.zzd = 3;
        zzpk.zze = str;
    }
}
