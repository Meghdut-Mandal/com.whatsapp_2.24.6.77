package com.google.android.recaptcha.internal;

import X.AnonymousClass040;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.C007103b;
import X.C009403z;
import X.C023509x;
import X.C05250Oz;
import X.C165597tg;
import X.C165607th;
import X.C36331k8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv((C05250Oz) null);
    public final AnonymousClass040 zzb;
    public final zzcl zzc;
    public final zzee zzd;
    public final Map zze;
    public final Map zzf;

    /* access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcj, C023509x r5) {
        Object A00 = C009403z.A00(r5, new zzbx(zzcj, list, this, (C023509x) null));
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A00;
    }

    /* access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcj, C023509x r5) {
        Object A00 = C009403z.A00(r5, new zzby(exc, zzcj, this, (C023509x) null));
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A00;
    }

    /* access modifiers changed from: private */
    public final void zzi(zzpr zzpr, zzcj zzcj) {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        int i = zzcj.zzd;
        zzdd zzdd = (zzdd) this.zze.get(Integer.valueOf(zzpr.zzf));
        if (zzdd != null) {
            int i2 = zzpr.zzg;
            zzpq[] zzpqArr = (zzpq[]) zzpr.zzh.toArray(new zzpq[0]);
            zzdd.zza(i2, zzcj, (zzpq[]) Arrays.copyOf(zzpqArr, zzpqArr.length));
            int i3 = zzcj.zzd;
            if (i == i3) {
                zzcj.zzd = i3 + 1;
            }
            zzfh.zzf();
            long zza2 = zzfh.zza(TimeUnit.MICROSECONDS);
            int zzk = zzpr.zzk();
            if (zzk != 1) {
                zzv.zza(zzk - 2, zza2);
                C007103b.A0Q(", ", "", "", zzpr.zzh, new zzbw(this));
                return;
            }
            throw C165597tg.A0c();
        }
        throw C165607th.A0M(5, 2);
    }

    public final void zza(String str) {
        C36331k8.A1T(new zzbz(new zzcj(this.zzc), this, str, (C023509x) null), this.zzb);
    }

    public zzca(AnonymousClass040 r2, zzcl zzcl, zzee zzee, Map map) {
        this.zzb = r2;
        this.zzc = zzcl;
        this.zzd = zzee;
        this.zze = map;
        this.zzf = zzcl.zzb.zzc;
    }
}
