package com.google.android.recaptcha.internal;

public class zzjk {
    public static final zzie zzb = zzie.zza;
    public volatile zzke zza;
    public volatile zzgw zzc;

    public int hashCode() {
        return 1;
    }

    public final zzke zzc(zzke zzke) {
        zzke zzke2 = this.zza;
        this.zzc = null;
        this.zza = zzke;
        return zzke2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjk = (zzjk) obj;
        zzke zzke = this.zza;
        zzke zzke2 = zzjk.zza;
        if (zzke == null) {
            if (zzke2 == null) {
                return zzb().equals(zzjk.zzb());
            }
            zzd(zzke2.zzY());
            return this.zza.equals(zzke2);
        } else if (zzke2 != null) {
            return zzke.equals(zzke2);
        } else {
            zzjk.zzd(zzke.zzY());
            return zzke.equals(zzjk.zza);
        }
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgt) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzgw zzb() {
        zzgw zzb2;
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgw zzgw = this.zzc;
                return zzgw;
            }
            if (this.zza == null) {
                zzb2 = zzgw.zzb;
            } else {
                zzb2 = this.zza.zzb();
            }
            this.zzc = zzb2;
            zzgw zzgw2 = this.zzc;
            return zzgw2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.recaptcha.internal.zzke r2) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzke r0 = r1.zza
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            com.google.android.recaptcha.internal.zzke r0 = r1.zza     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.zza = r2     // Catch:{ zzje -> 0x0010 }
            com.google.android.recaptcha.internal.zzgw r0 = com.google.android.recaptcha.internal.zzgw.zzb     // Catch:{ zzje -> 0x0010 }
            r1.zzc = r0     // Catch:{ zzje -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.zza = r2     // Catch:{ all -> 0x0018 }
            com.google.android.recaptcha.internal.zzgw r0 = com.google.android.recaptcha.internal.zzgw.zzb     // Catch:{ all -> 0x0018 }
            r1.zzc = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjk.zzd(com.google.android.recaptcha.internal.zzke):void");
    }
}
