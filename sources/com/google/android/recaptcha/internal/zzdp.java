package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class zzdp implements zzdd {
    public static final zzdp zza = new zzdp();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Constructor<?> constructor;
        int length = zzpqArr.length;
        if (length != 0) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Object) || zza2 == null) {
                throw C165587tf.A0G();
            }
            if (zza2 instanceof Constructor) {
                constructor = (Constructor) zza2;
            } else {
                constructor = zza2.getClass().getConstructor(new Class[0]);
            }
            Object[] zzh = zzcj.zze.zzh(AnonymousClass02R.A0D(zzpqArr).subList(1, length));
            try {
                zzcj.zze.zzf(i, constructor.newInstance(Arrays.copyOf(zzh, zzh.length)));
            } catch (Exception e) {
                throw C165617ti.A0E(e, 6, 14);
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
