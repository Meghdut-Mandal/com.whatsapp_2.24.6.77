package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C165617ti;

public final class zzdy implements zzdd {
    public static final zzdy zza = new zzdy();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof zzz)) {
                    A0e = null;
                }
                zzz zzz = (zzz) A0e;
                if (zzz != null) {
                    byte[] zzd = zzbp.zza(zzcj.zzg, zzz).zzd();
                    zzcj.zzh.zzb(str, zzfy.zzb.zzi(zzd, 0, zzd.length));
                    return;
                }
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
            throw C165617ti.A0E((Throwable) null, 4, 5);
        } else if (length == 0) {
            zzcj.zze.zzf(i, new zzz());
        } else {
            throw C165577te.A0N();
        }
    }
}
