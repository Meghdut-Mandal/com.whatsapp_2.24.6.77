package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzcu implements zzdd {
    public static final zzcu zza = new zzcu();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof String)) {
                A0S = null;
            }
            String str = (String) A0S;
            if (str != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof String)) {
                    A0e = null;
                }
                String str2 = (String) A0e;
                if (str2 != null) {
                    zzcj.zze.zzf(i, str.concat(str2));
                    return;
                }
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
            throw C165617ti.A0E((Throwable) null, 4, 5);
        }
        throw C165577te.A0N();
    }
}
