package com.google.android.recaptcha.internal;

import X.C165577te;
import java.nio.charset.Charset;

public final class zzjw implements zzks {
    public static final zzkc zza = new zzju();
    public final zzkc zzb;

    public zzjw() {
        zzkc zzkc;
        zzkc[] zzkcArr = new zzkc[2];
        zzkcArr[0] = zzim.zza;
        try {
            zzkc = (zzkc) C165577te.A0d();
        } catch (Exception unused) {
            zzkc = zza;
        }
        zzkcArr[1] = zzkc;
        zzjv zzjv = new zzjv(zzkcArr);
        Charset charset = zzjc.zza;
        this.zzb = zzjv;
    }

    public final zzkr zza(Class cls) {
        zzkk zzkk;
        zzjs zzjs;
        zzll zzll;
        zzif zzif;
        zzjz zzjz;
        zzll zzll2;
        zzif zza2;
        Class cls2 = cls;
        zzkt.zzs(cls);
        zzkb zzb2 = this.zzb.zzb(cls);
        Class<zzit> cls3 = zzit.class;
        if (zzb2.zzb()) {
            if (cls3.isAssignableFrom(cls)) {
                zzll2 = zzkt.zzd;
                zza2 = zzih.zza;
            } else {
                zzll2 = zzkt.zzc;
                zza2 = zzih.zza();
            }
            return new zzki(zzll2, zza2, zzb2.zza());
        }
        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
        boolean zzb3 = zzb(zzb2);
        if (isAssignableFrom) {
            zzkk = zzkl.zzb;
            zzjs = zzjs.zzb;
            zzll = zzkt.zzd;
            if (zzb3) {
                zzif = zzih.zza;
                zzjz = zzka.zzb;
            } else {
                zzif = null;
                zzjz = zzka.zzb;
            }
        } else {
            zzkk = zzkl.zza;
            zzjs = zzjs.zza;
            zzll = zzkt.zzc;
            if (zzb3) {
                zzif = zzih.zza();
                zzjz = zzka.zza;
            } else {
                zzif = null;
                zzjz = zzka.zza;
            }
        }
        return zzkh.zzm(cls2, zzb2, zzkk, zzjs, zzll, zzif, zzjz);
    }

    public static boolean zzb(zzkb zzkb) {
        if (zzkb.zzc() - 1 == 1) {
            return false;
        }
        return true;
    }
}
