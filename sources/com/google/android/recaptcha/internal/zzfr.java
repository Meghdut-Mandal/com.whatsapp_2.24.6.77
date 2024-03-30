package com.google.android.recaptcha.internal;

import X.C36401kF;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class zzfr extends zzfm {
    public final /* synthetic */ Iterable zza;
    public final /* synthetic */ int zzb;

    public zzfr(Iterable iterable, int i) {
        this.zza = iterable;
        this.zzb = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i = this.zzb;
        Iterator it = iterable.iterator();
        Objects.requireNonNull(it);
        zzff.zzb(C36401kF.A1U(i), "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new zzfq(this, it);
    }
}
