package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;
import java.lang.reflect.Array;

public final class zzco implements zzdd {
    public static final zzco zza = new zzco();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
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
                    Object zza2 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza2 instanceof Object) || zza2 == null) {
                        throw C165617ti.A0E((Throwable) null, 4, 5);
                    }
                    try {
                        Array.set(A0S, intValue, zza2);
                    } catch (Exception e) {
                        if (e instanceof ArrayIndexOutOfBoundsException) {
                            throw C165617ti.A0E(e, 4, 22);
                        }
                        throw C165617ti.A0E(e, 4, 25);
                    }
                } else {
                    throw C165617ti.A0E((Throwable) null, 4, 5);
                }
            } else {
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
        } else {
            throw C165617ti.A0E((Throwable) null, 4, 3);
        }
    }
}
