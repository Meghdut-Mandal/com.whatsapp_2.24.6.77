package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import java.util.Iterator;

public final class zzlp implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzlq zzb;

    public zzlp(zzlq zzlq) {
        this.zzb = zzlq;
        this.zza = zzlq.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
