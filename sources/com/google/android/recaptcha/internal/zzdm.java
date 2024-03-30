package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length != 0) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Method)) {
                A0S = null;
            }
            Method method = (Method) A0S;
            if (method != null) {
                Object[] zzh = zzcj.zze.zzh(AnonymousClass02R.A0D(zzpqArr).subList(1, length));
                try {
                    zzcj.zze.zzf(i, method.invoke((Object) null, Arrays.copyOf(zzh, zzh.length)));
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
