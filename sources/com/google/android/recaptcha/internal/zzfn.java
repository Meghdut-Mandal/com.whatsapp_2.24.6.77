package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

public abstract class zzfn extends zzfo implements Collection {
    public abstract boolean add(Object obj);

    public abstract boolean addAll(Collection collection);

    public final void clear() {
        ((zzfl) this).zzb.clear();
    }

    public final boolean contains(Object obj) {
        return ((zzfl) this).zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return ((zzfl) this).zzb.containsAll(collection);
    }

    public final boolean isEmpty() {
        return ((zzfl) this).zzb.isEmpty();
    }

    public final Iterator iterator() {
        return ((zzfl) this).zzb.iterator();
    }

    public final boolean remove(Object obj) {
        return ((zzfl) this).zzb.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return ((zzfl) this).zzb.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return ((zzfl) this).zzb.retainAll(collection);
    }

    public final int size() {
        return ((zzfl) this).zzb.size();
    }

    public final Object[] toArray(Object[] objArr) {
        return ((zzfl) this).zzb.toArray(objArr);
    }

    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    public abstract Collection zzc();

    public final Object[] toArray() {
        return ((zzfl) this).zzb.toArray();
    }
}
