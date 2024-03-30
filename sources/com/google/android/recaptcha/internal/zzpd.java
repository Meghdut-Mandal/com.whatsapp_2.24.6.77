package com.google.android.recaptcha.internal;

import X.C165617ti;

public final class zzpd extends zzit implements zzkf {
    public static final zzpd zzb;
    public int zzd = 0;
    public Object zze;

    public final int zzJ() {
        int i = this.zzd;
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 1;
    }

    static {
        zzpd zzpd = new zzpd();
        zzb = zzpd;
        zzit.zzD(zzpd.class, zzpd);
    }

    public static zzpc zzi() {
        return (zzpc) zzb.zzp();
    }

    public static zzpd zzk(byte[] bArr) {
        return (zzpd) zzit.zzu(zzb, bArr);
    }

    public final zznf zzf() {
        if (this.zzd == 1) {
            return (zznf) this.zze;
        }
        return zznf.zzb;
    }

    public final zznu zzg() {
        if (this.zzd == 2) {
            return (zznu) this.zze;
        }
        return zznu.zzb;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zznf.class, zznu.class});
        } else if (i2 == 3) {
            return new zzpd();
        } else {
            if (i2 == 4) {
                return new zzpc((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzH(zzpd zzpd, zznf zznf) {
        zznf.getClass();
        zzpd.zze = zznf;
        zzpd.zzd = 1;
    }

    public static /* synthetic */ void zzI(zzpd zzpd, zznu zznu) {
        zznu.getClass();
        zzpd.zze = zznu;
        zzpd.zzd = 2;
    }
}
