package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C165607th;
import X.C36321k7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzct implements zzdd {
    public static final zzct zza = new zzct();

    public static final boolean zzb(List list) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0J.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        if (!A0J.contains(false)) {
            return true;
        }
        return false;
    }

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzb(AnonymousClass02R.A0D(zzpqArr))) {
            for (zzpq zzi : zzpqArr) {
                zzcj.zze.zzb(zzi.zzi());
            }
            return;
        }
        throw C165607th.A0M(4, 5);
    }
}
