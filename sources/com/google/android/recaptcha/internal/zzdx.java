package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165577te;
import X.C165617ti;
import X.C90514aH;

public final class zzdx implements zzdd {
    public static final zzdx zza = new zzdx();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof int[])) {
                zza2 = null;
            }
            int[] iArr = (int[]) zza2;
            if (iArr != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof String)) {
                    A0e = null;
                }
                String str = (String) A0e;
                if (str != null) {
                    zzck zzck = zzcj.zze;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    try {
                        for (int A1R : iArr) {
                            C90514aH.A1R(str, A0u, A1R);
                        }
                        zzck.zzf(i, A0u.toString());
                    } catch (Exception e) {
                        throw C165617ti.A0E(e, 4, 22);
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
