package com.google.android.recaptcha.internal;

import X.C165617ti;
import java.util.List;

public final class zzni extends zzit implements zzkf {
    public static final zzni zzb;
    public zzjb zzd;
    public zzjb zze;

    public final List zzH() {
        return this.zzd;
    }

    static {
        zzni zzni = new zzni();
        zzb = zzni;
        zzit.zzD(zzni.class, zzni);
    }

    public static zznh zzi() {
        return (zznh) zzb.zzp();
    }

    public static zzni zzk(byte[] bArr) {
        return (zzni) zzit.zzu(zzb, bArr);
    }

    public final int zzf() {
        return this.zzd.size();
    }

    public final int zzg() {
        return this.zze.size();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", zznf.class, "zze", zznu.class});
        } else if (i2 == 3) {
            return new zzni();
        } else {
            if (i2 == 4) {
                return new zznh((zzng) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public zzni() {
        zzko zzko = zzko.zza;
        this.zzd = zzko;
        this.zze = zzko;
    }

    public static /* synthetic */ void zzI(zzni zzni, zznf zznf) {
        zznf.getClass();
        zzjb zzjb = zzni.zzd;
        if (!zzjb.zzc()) {
            zzni.zzd = zzit.zzy(zzjb);
        }
        zzni.zzd.add(zznf);
    }

    public static /* synthetic */ void zzJ(zzni zzni, zznu zznu) {
        zznu.getClass();
        zzjb zzjb = zzni.zze;
        if (!zzjb.zzc()) {
            zzni.zze = zzit.zzy(zzjb);
        }
        zzni.zze.add(zznu);
    }
}
