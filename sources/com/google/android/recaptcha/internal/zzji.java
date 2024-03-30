package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import java.util.Iterator;
import java.util.Map;

public final class zzji implements Iterator {
    public final Iterator zza;

    public zzji(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A11 = AnonymousClass000.A11(this.zza);
        A11.getValue();
        return A11;
    }

    public final void remove() {
        this.zza.remove();
    }
}
