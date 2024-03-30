package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzjq extends zzjs {
    public zzjq() {
        super((zzjr) null);
    }

    public /* synthetic */ zzjq(zzjp zzjp) {
        super((zzjr) null);
    }

    public final List zza(Object obj, long j) {
        zzjb zzjb = (zzjb) zzlv.zzf(obj, j);
        if (zzjb.zzc()) {
            return zzjb;
        }
        int size = zzjb.size();
        int i = size + size;
        if (size == 0) {
            i = 10;
        }
        zzjb zzd = zzjb.zzd(i);
        zzlv.zzs(obj, j, zzd);
        return zzd;
    }

    public final void zzb(Object obj, long j) {
        ((zzjb) zzlv.zzf(obj, j)).zzb();
    }

    public final void zzc(Object obj, Object obj2, long j) {
        zzjb zzjb = (zzjb) zzlv.zzf(obj, j);
        List list = (List) zzlv.zzf(obj2, j);
        int size = zzjb.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!zzjb.zzc()) {
                    zzjb = zzjb.zzd(size2 + size);
                }
                zzjb.addAll(list);
            }
            list = zzjb;
        }
        zzlv.zzs(obj, j, list);
    }
}
