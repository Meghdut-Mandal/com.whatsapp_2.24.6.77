package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzdh implements zzdd {
    public static final zzdh zza = new zzdh();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Class<?> cls;
        if (zzpqArr.length == 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Object)) {
                A0S = null;
            }
            if (A0S != null) {
                if (A0S instanceof Class) {
                    cls = (Class) A0S;
                } else {
                    cls = A0S.getClass();
                }
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof String)) {
                    A0e = null;
                }
                String str = (String) A0e;
                if (str != null) {
                    try {
                        zzcj.zze.zzf(i, cls.getField(zzcj.zzi.zza(str)));
                    } catch (Exception e) {
                        throw C165617ti.A0E(e, 6, 10);
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
