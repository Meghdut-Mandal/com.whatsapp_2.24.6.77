package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C165617ti;
import java.lang.reflect.Proxy;

public final class zzcy implements zzdd {
    public static final zzcy zza = new zzcy();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int i2;
        int length = zzpqArr.length;
        if (length == 4 || length == 5) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof Object) || A0e == null) {
                    throw C165617ti.A0E((Throwable) null, 4, 5);
                }
                Object zza3 = zzcj.zze.zza(zzpqArr[2]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str2 = (String) zza3;
                if (str2 != null) {
                    String zza4 = zzcj.zzi.zza(str2);
                    Object A0e2 = C165577te.A0e(zzcj, zzpqArr, 3);
                    if (length == 5) {
                        Object A0e3 = C165577te.A0e(zzcj, zzpqArr, 4);
                        if (true != (A0e3 instanceof Integer)) {
                            A0e3 = null;
                        }
                        Number number = (Number) A0e3;
                        if (number != null) {
                            i2 = number.intValue();
                        } else {
                            throw C165617ti.A0E((Throwable) null, 4, 5);
                        }
                    } else {
                        i2 = -1;
                    }
                    try {
                        if (A0e instanceof String) {
                            A0e = zzcj.zzi.zza((String) A0e);
                        }
                        Class zza5 = zzci.zza(A0e);
                        zzcj.zze.zzf(i, Proxy.newProxyInstance(zza5.getClassLoader(), new Class[]{zza5}, new zzcf(new zzcx(zzcj, str, i2), zza4, A0e2)));
                    } catch (Exception e) {
                        throw C165617ti.A0E(e, 6, 20);
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
