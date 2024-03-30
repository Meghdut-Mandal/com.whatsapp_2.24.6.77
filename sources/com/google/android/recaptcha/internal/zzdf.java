package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;

public final class zzdf implements zzdd {
    public static final zzdf zza = new zzdf();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 1) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Object) || A0S == null) {
                throw C165587tf.A0G();
            }
            try {
                if (A0S instanceof String) {
                    A0S = zzcj.zzi.zza((String) A0S);
                }
                zzcj.zze.zzf(i, zzci.zza(A0S));
            } catch (zzae e) {
                throw e;
            } catch (Exception e2) {
                throw C165617ti.A0E(e2, 6, 8);
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
