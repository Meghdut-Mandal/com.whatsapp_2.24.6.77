package com.google.android.recaptcha.internal;

import X.C90524aI;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

public final class zzkn {
    public static final /* synthetic */ int zza = 0;
    public static final zzkn zzb = new zzkn();
    public final zzks zzc = new zzjw();
    public final ConcurrentMap zzd = C90524aI.A0s();

    public static zzkn zza() {
        return zzb;
    }

    public final zzkr zzb(Class cls) {
        Charset charset = zzjc.zza;
        Objects.requireNonNull(cls, "messageType");
        zzkr zzkr = (zzkr) this.zzd.get(cls);
        if (zzkr == null) {
            zzkr = this.zzc.zza(cls);
            Objects.requireNonNull(cls, "messageType");
            zzkr zzkr2 = (zzkr) this.zzd.putIfAbsent(cls, zzkr);
            if (zzkr2 != null) {
                return zzkr2;
            }
        }
        return zzkr;
    }
}
