package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;
import X.AnonymousClass02R;
import X.C165567td;
import X.C165577te;
import X.C165617ti;
import java.util.Arrays;

public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Class<?> cls;
        int length = zzpqArr.length;
        if (length >= 2) {
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
                    String zza2 = zzcj.zzi.zza(str);
                    if (!AnonymousClass00C.A0J(zza2, "forName")) {
                        Class[] zzg = zzcj.zze.zzg(AnonymousClass02R.A0D(zzpqArr).subList(2, length));
                        try {
                            zzcj.zze.zzf(i, cls.getMethod(zza2, (Class[]) Arrays.copyOf(zzg, zzg.length)));
                        } catch (Exception e) {
                            throw C165617ti.A0E(e, 6, 13);
                        }
                    } else {
                        throw C165617ti.A0E((Throwable) null, 6, 48);
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
