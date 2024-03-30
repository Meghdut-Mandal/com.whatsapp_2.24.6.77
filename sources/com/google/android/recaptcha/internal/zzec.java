package com.google.android.recaptcha.internal;

import X.C05250Oz;
import java.math.BigInteger;

public final class zzec {
    public static final zzeb zza = new zzeb((C05250Oz) null);
    public static final zzea zzb = new zzea(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    public final zzea zzc;
    public long zzd;

    public final long zza() {
        zzea zzea = this.zzc;
        long longValue = (BigInteger.valueOf(zzea.zza).multiply(BigInteger.valueOf(this.zzd)).mod(BigInteger.valueOf(zzea.zzb)).longValue() + 11) % this.zzc.zzb;
        this.zzd = longValue;
        return longValue % 255;
    }

    public zzec(long j, long j2, zzea zzea) {
        this.zzc = zzea;
        this.zzd = Math.abs(j);
    }
}
