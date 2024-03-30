package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import java.util.Iterator;

public final class zzku extends zzle {
    public zzku(int i) {
        super(i, (zzld) null);
    }

    public final void zza() {
        if (!this.zzd) {
            for (int i = 0; i < this.zzb.size(); i++) {
                ((zzii) zzg(i).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzii) AnonymousClass000.A11(it).getKey()).zzg();
            }
        }
        super.zza();
    }
}
