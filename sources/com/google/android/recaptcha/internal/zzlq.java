package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzlq extends AbstractList implements zzjm, RandomAccess {
    public final zzjm zza;

    public final zzjm zze() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzjl) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzlp(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzlo(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public zzlq(zzjm zzjm) {
        this.zza = zzjm;
    }

    public final void zzi(zzgw zzgw) {
        throw AnonymousClass001.A0D();
    }
}
