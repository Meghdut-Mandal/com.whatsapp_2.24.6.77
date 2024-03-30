package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;
import java.lang.reflect.Array;
import java.util.List;

public final class zzcn implements zzdd {
    public static final zzcn zza = new zzcn();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Object obj;
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
                            obj = String.valueOf(((String) A0S).charAt(intValue));
                        } else if (A0S instanceof List) {
                            obj = ((List) A0S).get(intValue);
                        } else {
                            obj = Array.get(A0S, intValue);
                        }
                        zzcj.zze.zzf(i, obj);
                    } catch (Exception e) {
                        if (e instanceof ArrayIndexOutOfBoundsException) {
                            throw C165617ti.A0E(e, 4, 22);
                        }
                        throw C165617ti.A0E(e, 4, 23);
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
