package com.google.android.recaptcha.internal;

import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import java.io.IOException;

public class zzje extends IOException {
    public zzke zza = null;
    public boolean zzb;

    public final zzje zzh(zzke zzke) {
        this.zza = zzke;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public static zzje zzb() {
        return C165617ti.A0H("Protocol message end-group tag did not match expected tag.");
    }

    public static zzje zzc() {
        return C165617ti.A0H("Protocol message contained an invalid tag (zero).");
    }

    public static zzje zzd() {
        return C165617ti.A0H("Protocol message had invalid UTF-8.");
    }

    public static zzje zze() {
        return C165617ti.A0H("CodedInputStream encountered a malformed varint.");
    }

    public static zzje zzg() {
        return C165617ti.A0H("Failed to parse the message.");
    }

    public static zzje zzi() {
        return C165617ti.A0H("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public zzje(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzjd zza() {
        return C165587tf.A0H();
    }

    public static zzje zzf() {
        return C165607th.A0N();
    }

    public static zzje zzj() {
        return C165597tg.A0K();
    }

    public zzje(String str) {
        super(str);
    }
}
