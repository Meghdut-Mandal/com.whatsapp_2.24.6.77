package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import java.util.Arrays;

public final class zzdg implements zzdd {
    public static final zzdg zza = new zzdg();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length != 0) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Class)) {
                A0S = null;
            }
            Class cls = (Class) A0S;
            if (cls != null) {
                Class[] zzg = zzcj.zze.zzg(AnonymousClass02R.A0D(zzpqArr).subList(1, length));
                try {
                    zzcj.zze.zzf(i, cls.getConstructor((Class[]) Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e) {
                    throw C165617ti.A0E(e, 6, 9);
                }
            } else {
                throw C165587tf.A0G();
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
