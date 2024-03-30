package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165577te;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;

public final class zzcq implements zzdd {
    public static final zzcq zza = new zzcq();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        String obj;
        int length = zzpqArr.length;
        if (length != 0) {
            zzpi zzf = zzpl.zzf();
            int i2 = 0;
            do {
                Object zza2 = zzcj.zze.zza(zzpqArr[i2]);
                if (zza2 != null) {
                    zzpj zzf2 = zzpk.zzf();
                    if (zza2 instanceof Integer) {
                        zzf2.zzt(AnonymousClass000.A0I(zza2));
                    } else if (zza2 instanceof Short) {
                        zzf2.zzs(((Number) zza2).shortValue());
                    } else if (zza2 instanceof Byte) {
                        zzf2.zze(zzgw.zzm(new byte[]{((Number) zza2).byteValue()}, 0, 1));
                    } else if (zza2 instanceof Long) {
                        zzf2.zzu(C36431kI.A09(zza2));
                    } else if (zza2 instanceof Double) {
                        zzf2.zzq(C90504aG.A01(zza2));
                    } else if (zza2 instanceof Float) {
                        zzf2.zzr(C36441kJ.A03(zza2));
                    } else if (zza2 instanceof Boolean) {
                        zzf2.zzd(AnonymousClass000.A1X(zza2));
                    } else if (zza2 instanceof Character) {
                        zzf2.zzp(zza2.toString());
                    } else {
                        if (zza2 instanceof String) {
                            obj = (String) zza2;
                        } else {
                            obj = zza2.toString();
                        }
                        zzf2.zzv(obj);
                    }
                    zzf.zze((zzpk) zzf2.zzj());
                    i2++;
                } else {
                    throw new zzae(4, 4, (Throwable) null);
                }
            } while (i2 < length);
            zzck zzck = zzcj.zze;
            byte[] zzd = zzf.zzj().zzd();
            zzck.zzf(i, zzfy.zzb.zzi(zzd, 0, zzd.length));
            return;
        }
        throw C165577te.A0N();
    }
}
