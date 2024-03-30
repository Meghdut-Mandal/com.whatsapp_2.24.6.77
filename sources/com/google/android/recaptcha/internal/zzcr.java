package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C165587tf;
import X.C165617ti;

public final class zzcr implements zzdd {
    public static final zzcr zza = new zzcr();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (A0e == null) {
                    throw new zzae(4, 4, (Throwable) null);
                } else if ((A0e instanceof Integer) || (A0e instanceof Short) || (A0e instanceof Byte) || (A0e instanceof Long) || (A0e instanceof Double) || (A0e instanceof Float) || (A0e instanceof Boolean) || (A0e instanceof Character) || (A0e instanceof String)) {
                    zzcj.zzh.zzb(str, A0e.toString());
                } else {
                    throw C165617ti.A0E((Throwable) null, 4, 7);
                }
            } else {
                throw C165587tf.A0G();
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
