package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import android.content.Context;
import java.util.HashMap;

public final class zzbg {
    public final String zza;
    public final Context zzb;
    public final zzab zzc;
    public final zzbh zzd;
    public final HashMap zze = AnonymousClass001.A0J();
    public final zzt zzf;

    public final void zza(zzbb zzbb) {
        zze(zzbb, 3, (zzmr) null);
    }

    public final void zzb(zzbb zzbb, zzp zzp, String str) {
        String valueOf = String.valueOf(zzp.zzc.zzo);
        int i = zzp.zzd.zzap;
        String str2 = zzp.zze;
        zzmq zzg = zzmr.zzg();
        zzg.zzp(valueOf);
        zzg.zzd(i);
        if (str2 != null) {
            zzg.zze(str2);
        }
        zze(zzbb, 4, (zzmr) zzg.zzj());
    }

    public final void zzd(zzpd zzpd) {
        this.zzd.zza(zzpd);
    }

    public final void zze(zzbb zzbb, int i, zzmr zzmr) {
        zzx zzx;
        zzbf zzbf = (zzbf) this.zze.get(zzbb);
        if (zzbf != null) {
            zznf zza2 = zzbf.zza(i, zzmr, this.zzb);
            zzpc zzi = zzpd.zzi();
            zzi.zzd(zza2);
            zzpd zzpd = (zzpd) zzi.zzj();
            zzne zzne = zzbb.zza;
            long j = zza2.zzl * 1000;
            int ordinal = zzne.ordinal();
            if (ordinal == 1) {
                zzx = zzx.zzd;
            } else if (ordinal == 2) {
                zzx = zzx.zze;
            } else if (ordinal == 5) {
                zzx = zzx.zzf;
            } else if (ordinal == 6) {
                zzx = zzx.zzg;
            } else if (ordinal != 24) {
                switch (ordinal) {
                    case 12:
                        zzx = zzx.zzh;
                        break;
                    case 13:
                        zzx = zzx.zzi;
                        break;
                    case 14:
                        zzx = zzx.zzj;
                        break;
                    default:
                        zzx = zzx.zzb;
                        break;
                }
            } else {
                zzx = zzx.zzk;
            }
            zzv.zza(zzx.zzn, j);
            this.zzd.zza(zzpd);
            this.zze.remove(zzbb);
        }
    }

    public zzbg(String str, Context context, zzab zzab, zzt zzt, zzbh zzbh) {
        this.zza = str;
        this.zzb = context;
        this.zzc = zzab;
        this.zzf = zzt;
        this.zzd = zzbh;
    }
}
