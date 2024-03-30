package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import android.content.ContentValues;

public final class zzbl extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ zzbm zza;
    public final /* synthetic */ zzpd zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbm, zzpd zzpd, C023509x r4) {
        super(2, r4);
        this.zza = zzbm;
        this.zzb = zzpd;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new zzbl(this.zza, this.zzb, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AJ r0;
        AnonymousClass0AN.A00(obj);
        zzbm zzbm = this.zza;
        zzpd zzpd = this.zzb;
        synchronized (zzbh.class) {
            if (zzbm.zze != null) {
                byte[] zzd = zzpd.zzd();
                String zzi = zzfy.zza.zzi(zzd, 0, zzd.length);
                long currentTimeMillis = System.currentTimeMillis();
                zzaz zzaz = zzbm.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzi);
                contentValues.put("ts", Long.valueOf(currentTimeMillis));
                zzaz.getWritableDatabase().insert("ce", (String) null, contentValues);
                int zzb2 = zzbm.zze.zzb() - 500;
                if (zzb2 > 0) {
                    zzbm.zze.zza(C007103b.A0a(zzbm.zze.zzd(), zzb2));
                }
                if (zzbm.zze.zzb() >= 20) {
                    zzbm.zzg();
                }
            }
            r0 = AnonymousClass0AJ.A00;
        }
        return r0;
    }
}
