package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import java.lang.reflect.Field;

public final class zzdj implements zzdd {
    public static final zzdj zza = new zzdj();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Field)) {
                A0S = null;
            }
            Field field = (Field) A0S;
            if (field != null) {
                try {
                    zzcj.zze.zzf(i, field.get(C165577te.A0e(zzcj, zzpqArr, 1)));
                } catch (Exception e) {
                    throw C165617ti.A0E(e, 6, 16);
                }
            } else {
                throw C165587tf.A0G();
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
