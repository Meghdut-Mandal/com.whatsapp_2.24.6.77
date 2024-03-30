package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.AnonymousClass02R;
import X.C007103b;
import X.C023409w;
import X.C36391kE;
import X.C36431kI;
import java.util.Iterator;
import java.util.List;

public final class zzef {
    public List zza = C023409w.A00;

    public final long zza(long[] jArr) {
        Iterator it = C007103b.A0S(AnonymousClass02R.A0B(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(C36431kI.A09(next) ^ C36391kE.A0D(it));
            }
            return C36431kI.A09(next);
        }
        throw AnonymousClass001.A0E("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = AnonymousClass02R.A0B(jArr);
    }
}
