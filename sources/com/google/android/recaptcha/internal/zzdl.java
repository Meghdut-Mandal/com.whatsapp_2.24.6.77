package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class zzdl implements zzdd {
    public static final zzdl zza = new zzdl();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length >= 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Method)) {
                A0S = null;
            }
            Method method = (Method) A0S;
            if (method != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                Object[] zzh = zzcj.zze.zzh(AnonymousClass02R.A0D(zzpqArr).subList(2, length));
                try {
                    zzcj.zze.zzf(i, method.invoke(A0e, Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e) {
                    throw C165617ti.A0E(e, 6, 15);
                }
            } else {
                throw C165587tf.A0G();
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
