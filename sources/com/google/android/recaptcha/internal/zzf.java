package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
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
import X.C10810fG;
import X.C165617ti;
import X.C17990sP;
import X.C90514aH;
import X.C90524aI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class zzf extends AnonymousClass0A1 implements C009003v {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzoe zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzg, long j, zzoe zzoe, C023509x r6) {
        super(2, r6);
        this.zzb = zzg;
        this.zzc = j;
        this.zzd = zzoe;
    }

    public final C023509x create(Object obj, C023509x r8) {
        zzf zzf = new zzf(this.zzb, this.zzc, this.zzd, r8);
        zzf.zze = obj;
        return zzf;
    }

    public final Object invokeSuspend(Object obj) {
        C10810fG r3;
        Object obj2;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            r3 = (C10810fG) this.zze;
            AnonymousClass0AN.A00(obj);
        } else {
            AnonymousClass0AN.A00(obj);
            AnonymousClass040 r5 = (AnonymousClass040) this.zze;
            ArrayList A0I = AnonymousClass001.A0I();
            for (zza zze2 : this.zzb.zza) {
                zze zze3 = new zze(zze2, this.zzc, this.zzd, (C023509x) null);
                A0I.add(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, zze3, r5));
            }
            r3 = new C10810fG();
            C17990sP[] r1 = (C17990sP[]) A0I.toArray(new C17990sP[0]);
            C17990sP[] r12 = (C17990sP[]) Arrays.copyOf(r1, r1.length);
            this.zze = r3;
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
        Iterator A13 = C90514aH.A13(obj);
        while (A13.hasNext()) {
            Throwable A00 = AnonymousClass0AK.A00(((AnonymousClass0AK) A13.next()).value);
            if (A00 != null) {
                Throwable th = null;
                if (r3.element != null) {
                    th = C165617ti.A0K(zzl.zzal, zzn.zzc, (String) null);
                } else if (A00 instanceof zzp) {
                    th = A00;
                }
                r3.element = th;
            }
        }
        Throwable th2 = (Throwable) r3.element;
        if (th2 != null) {
            obj2 = C90524aI.A0t(th2);
        } else {
            obj2 = AnonymousClass0AJ.A00;
        }
        return new AnonymousClass0AK(obj2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
