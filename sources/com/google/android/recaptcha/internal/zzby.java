package com.google.android.recaptcha.internal;

import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C36441kJ;
import java.util.Arrays;

public final class zzby extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Exception zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    public /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcj, zzca zzca, C023509x r5) {
        super(2, r5);
        this.zza = exc;
        this.zzb = zzcj;
        this.zzc = zzca;
    }

    public final C023509x create(Object obj, C023509x r6) {
        zzby zzby = new zzby(this.zza, this.zzb, this.zzc, r6);
        zzby.zzd = obj;
        return zzby;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        zzpg zzf;
        AnonymousClass0AN.A00(obj);
        AnonymousClass040 r3 = (AnonymousClass040) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzf = ((zzae) exc).zzb;
            zzf.zzd(this.zzb.zzd);
        } else {
            zzcj zzcj = this.zzb;
            zzf = zzph.zzf();
            zzf.zzd(zzcj.zzd);
            zzf.zzp(2);
            zzf.zze(2);
        }
        zzit zzh = zzf.zzj();
        C36441kJ.A1A(this.zza.getClass()).BHa();
        this.zza.getMessage();
        zzcj zzcj2 = this.zzb;
        zzz zzz = zzcj2.zzg;
        zzz zzz2 = zzcj2.zza;
        if (zzz2 == null) {
            zzz2 = null;
        }
        zzno zza2 = zzbp.zza(zzz, zzz2);
        String str = this.zzb.zzc;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (C009403z.A04(r3)) {
            zzca zzca = this.zzc;
            zzfy zzfy = zzfy.zzb;
            byte[] zzd2 = zzh.zzd();
            byte[] zzd3 = zza2.zzd();
            zzca.zzc.zzd.zzb(str, (String[]) Arrays.copyOf(new String[]{zzfy.zzi(zzd2, 0, zzd2.length), zzfy.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return AnonymousClass0AJ.A00;
    }
}
