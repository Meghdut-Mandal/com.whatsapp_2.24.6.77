package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.AnonymousClass040;
import X.C007103b;
import X.C023509x;
import X.C05250Oz;
import X.C36331k8;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi((C05250Oz) null);
    public static Timer zzb;
    public final zzbn zzc;
    public final AnonymousClass040 zzd;
    public final zzaz zze;

    public final void zza(zzpd zzpd) {
        C36331k8.A1T(new zzbl(this, zzpd, (C023509x) null), this.zzd);
        zzh();
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        zzaz zzaz;
        zzaz zzaz2 = this.zze;
        if (zzaz2 != null) {
            Iterator it = C007103b.A0R(zzaz2.zzd(), 20, 20).iterator();
            while (it.hasNext()) {
                zznh zzi = zzni.zzi();
                ArrayList A0I = AnonymousClass001.A0I();
                for (zzba zzba : (List) it.next()) {
                    try {
                        zzpd zzk = zzpd.zzk(zzfy.zza.zzj(zzba.zza));
                        int zzJ = zzk.zzJ();
                        int i = zzJ - 1;
                        if (zzJ != 0) {
                            if (i == 0) {
                                zzi.zzp(zzk.zzf());
                            } else if (i == 1) {
                                zzi.zzq(zzk.zzg());
                            }
                            A0I.add(zzba);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        zzaz zzaz3 = this.zze;
                        if (zzaz3 != null) {
                            zzaz3.zzf(zzba);
                        }
                    }
                }
                if (zzi.zzd() + zzi.zze() != 0) {
                    if (this.zzc.zza(zzi.zzj().zzd()) && (zzaz = this.zze) != null) {
                        zzaz.zza(A0I);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000, 120000);
        }
    }

    public zzbm(Context context, zzbn zzbn, AnonymousClass040 r5) {
        this.zzc = zzbn;
        this.zzd = r5;
        zzaz zzaz = null;
        try {
            zzaz zzaz2 = zzaz.zzc;
            zzaz2 = zzaz2 == null ? new zzaz(context, (C05250Oz) null) : zzaz2;
            zzaz.zzc = zzaz2;
            zzaz = zzaz2;
        } catch (Exception unused) {
        }
        this.zze = zzaz;
        zzh();
    }
}
