package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165587tf;

public final class zzds implements zzdd {
    public static final zzds zza = new zzds();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 1) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof String)) {
                A0S = null;
            }
            String str = (String) A0S;
            if (str != null) {
                zzcj.zzc = str;
                return;
            }
            throw C165587tf.A0G();
        }
        throw C165577te.A0N();
    }
}
