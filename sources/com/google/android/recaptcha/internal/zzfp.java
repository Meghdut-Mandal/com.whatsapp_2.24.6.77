package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

public abstract class zzfp extends zzfn implements Queue {
    public final Object element() {
        return ((zzfl) this).zzb.element();
    }

    public abstract boolean offer(Object obj);

    public final Object peek() {
        return ((zzfl) this).zzb.peek();
    }

    public final Object poll() {
        return ((zzfl) this).zzb.poll();
    }

    public final Object remove() {
        return ((zzfl) this).zzb.remove();
    }

    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    public abstract Queue zzd();
}
