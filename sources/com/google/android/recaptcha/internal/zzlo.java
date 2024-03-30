package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import java.util.ListIterator;

public final class zzlo implements ListIterator {
    public final ListIterator zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzlq zzc;

    public zzlo(zzlq zzlq, int i) {
        this.zzc = zzlq;
        this.zzb = i;
        this.zza = zzlq.zza.listIterator(i);
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.zza.previous();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }

    public final /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0D();
    }
}
