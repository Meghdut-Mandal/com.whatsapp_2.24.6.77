package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165617ti;

public final class zzov extends zzit implements zzkf {
    public static final zzov zzb;
    public String zzd = "";
    public String zze = "";

    static {
        zzov zzov = new zzov();
        zzb = zzov;
        zzit.zzD(zzov.class, zzov);
    }

    public static zzou zzf() {
        return (zzou) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[2];
            C165567td.A1V(objArr);
            return C165617ti.A0I(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", objArr);
        } else if (i2 == 3) {
            return new zzov();
        } else {
            if (i2 == 4) {
                return new zzou((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzi(zzov zzov, String str) {
        str.getClass();
        zzov.zzd = str;
    }
}
