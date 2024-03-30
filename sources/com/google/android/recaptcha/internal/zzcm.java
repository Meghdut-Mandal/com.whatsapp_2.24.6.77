package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165577te;
import X.C165617ti;
import X.C36441kJ;
import java.util.ArrayList;

public final class zzcm implements zzdd {
    public static final zzcm zza = new zzcm();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Object array;
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof Integer)) {
                    A0e = null;
                }
                Number number = (Number) A0e;
                if (number != null) {
                    int intValue = number.intValue();
                    if (zza2 instanceof Integer) {
                        array = Integer.valueOf(AnonymousClass000.A0I(zza2) + intValue);
                    } else if (zza2 instanceof int[]) {
                        ArrayList A14 = C36441kJ.A14(r3);
                        for (int i2 : (int[]) zza2) {
                            AnonymousClass000.A1F(A14, i2 + intValue);
                        }
                        array = A14.toArray(new Integer[0]);
                    } else {
                        throw C165617ti.A0E((Throwable) null, 4, 5);
                    }
                    zzcj.zze.zzf(i, array);
                    return;
                }
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
            throw C165617ti.A0E((Throwable) null, 4, 5);
        }
        throw C165577te.A0N();
    }
}
