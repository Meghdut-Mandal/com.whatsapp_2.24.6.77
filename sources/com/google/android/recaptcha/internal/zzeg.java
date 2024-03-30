package com.google.android.recaptcha.internal;

import X.C007103b;
import X.C165607th;
import X.C165617ti;
import X.C90524aI;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzeg implements zzee {
    public final zzef zza;
    public final zzed zzb;

    public zzeg(zzef zzef, zzed zzed) {
        this.zza = zzef;
        this.zzb = zzed;
    }

    public final zzpf zza(zzpn zzpn) {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        zzpf zzb2 = zzb(zzpn.zzd, zzpn.zzf);
        zzfh.zzf();
        zzv.zza(zzx.zzm.zzn, zzfh.zza(TimeUnit.MICROSECONDS));
        return zzb2;
    }

    private final zzpf zzb(String str, List list) {
        int length = str.length();
        if (length != 0) {
            try {
                zzec zzec = new zzec(this.zza.zza(C007103b.A0n(list)), 255, zzec.zzb);
                StringBuilder A0h = C90524aI.A0h(length);
                for (int i = 0; i < length; i++) {
                    A0h.append((char) (str.charAt(i) ^ ((int) zzec.zza())));
                }
                return zzpf.zzg(zzfy.zzb.zzj(A0h.toString()));
            } catch (Exception e) {
                throw C165617ti.A0E(e, 3, 18);
            }
        } else {
            throw C165607th.A0M(3, 17);
        }
    }
}
