package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;
import X.C023409w;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class zzch extends zzce {
    public final zzcg zza;
    public final String zzb;

    public zzch(zzcg zzcg, String str, Object obj) {
        super(obj);
        this.zza = zzcg;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!AnonymousClass00C.A0J(method.getName(), this.zzb)) {
            return false;
        }
        zzcg zzcg = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            AnonymousClass00C.A08(list);
        } else {
            list = C023409w.A00;
        }
        zzcg.zzb(list);
        return true;
    }
}
