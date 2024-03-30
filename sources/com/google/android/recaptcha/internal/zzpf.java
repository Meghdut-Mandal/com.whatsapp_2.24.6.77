package com.google.android.recaptcha.internal;

import X.C165617ti;
import java.util.List;

public final class zzpf extends zzit implements zzkf {
    public static final zzpf zzb;
    public zzjb zzd = zzko.zza;

    public final List zzi() {
        return this.zzd;
    }

    static {
        zzpf zzpf = new zzpf();
        zzb = zzpf;
        zzit.zzD(zzpf.class, zzpf);
    }

    public static zzpf zzg(byte[] bArr) {
        return (zzpf) zzit.zzu(zzb, bArr);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzpr.class});
        } else if (i2 == 3) {
            return new zzpf();
        } else {
            if (i2 == 4) {
                return new zzpe((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
