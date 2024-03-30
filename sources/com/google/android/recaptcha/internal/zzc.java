package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.AnonymousClass03N;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C008903u;
import X.C009003v;
import X.C023109s;
import X.C023409w;
import X.C023509x;
import X.C07160Wo;
import X.C17990sP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzc extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzg, String str, long j, C023509x r6) {
        super(2, r6);
        this.zzb = zzg;
        this.zzc = str;
        this.zzd = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        zzc zzc2 = new zzc(this.zzb, this.zzc, this.zzd, r8);
        zzc2.zze = obj;
        return zzc2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.zza;
        AnonymousClass0AN.A00(obj);
        if (i == 0) {
            AnonymousClass040 r5 = (AnonymousClass040) this.zze;
            ArrayList A0I = AnonymousClass001.A0I();
            for (zza zzb2 : this.zzb.zza) {
                zzb zzb3 = new zzb(zzb2, this.zzc, this.zzd, (C023509x) null);
                A0I.add(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, zzb3, r5));
            }
            C17990sP[] r1 = (C17990sP[]) A0I.toArray(new C17990sP[0]);
            C17990sP[] r12 = (C17990sP[]) Arrays.copyOf(r1, r1.length);
            this.zza = 1;
            if (r12.length == 0) {
                obj = C023409w.A00;
            } else {
                obj = new C07160Wo(r12).A00(this);
            }
            if (obj == r2) {
                return r2;
            }
        }
        String str = this.zzc;
        zzof zzf = zzog.zzf();
        zzf.zzd(str);
        for (AnonymousClass0AK r0 : (List) obj) {
            Object obj2 = r0.value;
            if (!(obj2 instanceof AnonymousClass03N)) {
                zzf.zzg((zzit) obj2);
            }
        }
        return zzf.zzj();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
