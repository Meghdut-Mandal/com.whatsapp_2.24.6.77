package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;
import X.AnonymousClass099;
import X.C007103b;
import X.C90484aE;
import java.util.Set;

public final class zzcb {
    public static final zzcb zza = new zzcb();
    public static Set zzb;
    public static Set zzc;
    public static Long zzd;
    public static int zze;

    public static final boolean zzc(String str, Set set) {
        AnonymousClass00C.A0D(str, 0);
        String str2 = "";
        for (Object valueOf : AnonymousClass099.A0K(str, String.valueOf(new char[]{'.'}[0]), 0)) {
            String concat = str2.concat(String.valueOf(valueOf));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public static final void zza(zznz zznz) {
        zznx zznx = zznz.zze;
        if (zznx == null) {
            zznx = zznx.zzb;
        }
        zzb = C007103b.A0f(zznx.zzd);
        zznx zznx2 = zznz.zzf;
        if (zznx2 == null) {
            zznx2 = zznx.zzb;
        }
        zzc = C007103b.A0f(zznx2.zzd);
    }

    public static final boolean zzb(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = C90484aE.A0g();
            }
            zze++;
        } else if (!set.isEmpty()) {
            Set set2 = zzc;
            AnonymousClass00C.A0E(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
        return true;
    }
}
