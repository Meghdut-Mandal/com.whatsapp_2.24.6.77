package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C36401kF;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzgh extends AbstractList implements zzjb {
    public boolean zza;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i = 0;
                    while (i < size) {
                        if (get(i).equals(list.get(i))) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final void zza() {
        if (!this.zza) {
            throw AnonymousClass001.A0D();
        }
    }

    public zzgh(boolean z) {
        this.zza = z;
    }

    public boolean addAll(int i, Collection collection) {
        zza();
        return super.addAll(i, collection);
    }

    public void clear() {
        zza();
        super.clear();
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = C36401kF.A02(get(i2), i * 31);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    public void add(int i, Object obj) {
        throw null;
    }

    public Object set(int i, Object obj) {
        throw null;
    }

    public boolean add(Object obj) {
        zza();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    public Object remove(int i) {
        throw null;
    }
}
