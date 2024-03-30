package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import sun.misc.Unsafe;

public final class zzlt extends zzlu {
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j, z);
        } else {
            zzlv.zzE(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j, b);
        } else {
            zzlv.zzE(obj, j, b);
        }
    }

    public final boolean zzg(Object obj, long j) {
        if (zzlv.zzb) {
            return AnonymousClass000.A1P((byte) (C165567td.A01(~j, zzlv.zzf.zza.getInt(obj, -4 & j)) & 255));
        }
        return AnonymousClass000.A1P((byte) (C165567td.A01(j, zzlv.zzf.zza.getInt(obj, -4 & j)) & 255));
    }

    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    public zzlt(Unsafe unsafe) {
        super(unsafe);
    }
}
