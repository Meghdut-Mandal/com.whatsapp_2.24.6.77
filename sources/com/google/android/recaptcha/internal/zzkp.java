package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165597tg;

public final class zzkp implements zzkb {
    public final zzke zza;
    public final String zzb;
    public final Object[] zzc;
    public final int zzd;

    public final zzke zza() {
        return this.zza;
    }

    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }

    public final boolean zzb() {
        return AnonymousClass000.A1S(this.zzd & 2, 2);
    }

    public zzkp(zzke zzke, String str, Object[] objArr) {
        char charAt;
        this.zza = zzke;
        this.zzb = str;
        this.zzc = objArr;
        char A00 = C165597tg.A00(str);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = C165597tg.A04(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A00 = i | (charAt << i3);
        }
        this.zzd = A00;
    }
}
