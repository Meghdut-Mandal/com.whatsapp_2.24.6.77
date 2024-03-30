package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C36331k8;
import X.C36401kF;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;

public final class zzfl extends zzfp implements Serializable {
    public final int zza;
    public final Queue zzb;

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }

    public static zzfl zza(int i) {
        return new zzfl(i);
    }

    public zzfl(int i) {
        if (i >= 0) {
            this.zzb = new ArrayDeque(i);
            this.zza = i;
            return;
        }
        Object[] A0L = AnonymousClass001.A0L();
        C36331k8.A1W(A0L, i);
        throw AnonymousClass001.A08(zzfi.zza("maxSize (%s) must >= 0", A0L));
    }

    public final boolean add(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zza != 0) {
            if (size() == this.zza) {
                this.zzb.remove();
            }
            this.zzb.add(obj);
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i = this.zza;
            Objects.requireNonNull(collection);
            int i2 = size - i;
            zzff.zzb(C36401kF.A1U(i2), "number to skip cannot be negative");
            it = new zzfr(collection, i2).iterator();
        } else {
            it = collection.iterator();
        }
        return zzfs.zza(this, it);
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
