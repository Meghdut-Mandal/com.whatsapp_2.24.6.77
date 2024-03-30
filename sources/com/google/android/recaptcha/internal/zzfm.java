package com.google.android.recaptcha.internal;

import X.AnonymousClass000;

public abstract class zzfm implements Iterable {
    public final zzfe zza = zzfd.zza;

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('[');
        boolean z = true;
        for (Object append : this) {
            if (!z) {
                A0u.append(", ");
            }
            A0u.append(append);
            z = false;
        }
        return AnonymousClass000.A0t(A0u, ']');
    }
}
