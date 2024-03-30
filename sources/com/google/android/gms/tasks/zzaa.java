package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.ArrayList;
import java.util.Collection;

public final class zzaa implements Continuation {
    public final /* synthetic */ Collection zza;

    public zzaa(Collection collection) {
        this.zza = collection;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Task result : this.zza) {
            A0I.add(result.getResult());
        }
        return A0I;
    }
}
