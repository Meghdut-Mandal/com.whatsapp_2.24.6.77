package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzfh {
    public final zzfk zza = zzfk.zza;
    public boolean zzb;
    public long zzc;
    public long zzd;

    public static zzfh zzc() {
        return new zzfh();
    }

    public final zzfh zzd() {
        this.zzc = 0;
        this.zzb = false;
        return this;
    }

    public static zzfh zzb() {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        return zzfh;
    }

    private final long zzg() {
        if (this.zzb) {
            return (System.nanoTime() - this.zzd) + this.zzc;
        }
        return this.zzc;
    }

    public final zzfh zze() {
        zzff.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = System.nanoTime();
        return this;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long zzg = zzg();
        if (TimeUnit.DAYS.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        Locale locale = Locale.ROOT;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = Double.valueOf(((double) zzg) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit)));
        String format = String.format(locale, "%.4g", A0L);
        switch (zzfg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return AnonymousClass000.A0p(" ", str, AnonymousClass000.A0v(format));
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzfh zzf() {
        long nanoTime = System.nanoTime();
        zzff.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += nanoTime - this.zzd;
        return this;
    }
}
