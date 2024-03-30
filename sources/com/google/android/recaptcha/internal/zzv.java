package com.google.android.recaptcha.internal;

import X.C90524aI;
import java.util.concurrent.ConcurrentHashMap;

public final class zzv {
    public static final zzv zza = new zzv();
    public static final ConcurrentHashMap zzb = C90524aI.A0s();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzu();
        }
        zzu zzu = (zzu) obj;
        zzu.zza++;
        zzu.zzb += j;
        zzu.zzc = Math.max(j, zzu.zzc);
        concurrentHashMap.put(valueOf, zzu);
    }
}
