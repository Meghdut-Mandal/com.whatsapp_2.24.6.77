package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C165617ti;
import java.lang.reflect.Proxy;

public final class zzcz implements zzdd {
    public static final zzcz zza = new zzcz();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        Object obj = null;
        if (length == 4 || length == 5) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Number number = (Number) zza2;
            if (number != null) {
                int intValue = number.intValue();
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof Integer)) {
                    A0e = null;
                }
                Number number2 = (Number) A0e;
                if (number2 != null) {
                    int intValue2 = number2.intValue();
                    Object zza3 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza3 instanceof String)) {
                        zza3 = null;
                    }
                    String str = (String) zza3;
                    if (str != null) {
                        String zza4 = zzcj.zzi.zza(str);
                        Object A0e2 = C165577te.A0e(zzcj, zzpqArr, 3);
                        if (true != (A0e2 instanceof String)) {
                            A0e2 = null;
                        }
                        String str2 = (String) A0e2;
                        if (str2 != null) {
                            String zza5 = zzcj.zzi.zza(str2);
                            if (length == 5) {
                                obj = C165577te.A0e(zzcj, zzpqArr, 4);
                            }
                            zzcg zzcg = new zzcg(intValue2);
                            try {
                                Class zza6 = zzci.zza(zza4);
                                zzcj.zze.zzf(intValue, Proxy.newProxyInstance(zza6.getClassLoader(), new Class[]{zza6}, new zzch(zzcg, zza5, obj)));
                                zzcj.zze.zzf(i, zzcg);
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
