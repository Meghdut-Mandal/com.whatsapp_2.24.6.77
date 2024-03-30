package com.google.android.gms.tasks;

import X.AnonymousClass001;
import java.util.ArrayList;
import java.util.Collection;

public final class zzab implements Continuation {
    public final /* synthetic */ Collection zza;

    public zzab(Collection collection) {
        this.zza = collection;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.addAll(this.zza);
        zzw zzw = new zzw();
        zzw.zzb(A0I);
        return zzw;
    }
}
