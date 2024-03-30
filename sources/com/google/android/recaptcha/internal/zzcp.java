package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzcp implements zzdd {
    public static final zzcp zza = new zzcp();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Integer)) {
                A0S = null;
            }
            Number number = (Number) A0S;
            if (number != null) {
                int intValue = number.intValue();
                if (intValue != 0) {
                    Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                    if (true != (A0e instanceof Object) || A0e == null) {
                        throw C165617ti.A0E((Throwable) null, 4, 5);
                    }
                    Object zza2 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza2 instanceof Object) || zza2 == null) {
                        throw C165617ti.A0E((Throwable) null, 4, 5);
                    } else if (A0e.equals(zza2)) {
                        zzcj.zzd += intValue;
                    }
                } else {
                    throw C165617ti.A0E((Throwable) null, 4, 6);
                }
            } else {
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
        } else {
            throw C165617ti.A0E((Throwable) null, 4, 3);
        }
    }
}
