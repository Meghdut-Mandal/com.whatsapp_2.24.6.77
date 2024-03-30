package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;
import java.lang.reflect.Array;

public final class zzda implements zzdd {
    public static final zzda zza = new zzda();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Object)) {
                A0S = null;
            }
            if (A0S != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof Integer)) {
                    A0e = null;
                }
                Number number = (Number) A0e;
                if (number != null) {
                    int intValue = number.intValue();
                    try {
                        if (A0S instanceof String) {
                            A0S = zzcj.zzi.zza((String) A0S);
                        }
                        zzcj.zze.zzf(i, Array.newInstance(zzci.zza(A0S), intValue));
                    } catch (Exception e) {
                        throw C165617ti.A0E(e, 6, 21);
                    }
                } else {
                    throw C165617ti.A0E((Throwable) null, 4, 5);
                }
            } else {
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
        } else {
            throw C165577te.A0N();
        }
    }
}
