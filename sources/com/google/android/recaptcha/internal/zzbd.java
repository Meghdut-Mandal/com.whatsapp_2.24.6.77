package com.google.android.recaptcha.internal;

import X.C05250Oz;

public final class zzbd {
    public static final zzbc zza = new zzbc((C05250Oz) null);
    public String zzb;
    public String zzc;
    public String zzd;

    public zzbd(String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
    }

    public /* synthetic */ zzbd(String str, String str2, C05250Oz r3) {
        this(str, str2);
    }

    public final zzbb zza(zzne zzne) {
        return new zzbb(zzne, this.zzb, this.zzc, this.zzd, (String) null);
    }

    public final zzbd zzb() {
        return new zzbd(this);
    }

    public final zzbd zzc(String str) {
        this.zzd = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public zzbd(zzbd zzbd) {
        this(zzbd.zzb, zzbd.zzc);
        this.zzd = zzbd.zzd;
    }
}
