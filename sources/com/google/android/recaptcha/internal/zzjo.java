package com.google.android.recaptcha.internal;

import X.C165587tf;
import X.C36441kJ;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public final class zzjo extends zzjs {
    public static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public zzjo() {
        super((zzjr) null);
    }

    public /* synthetic */ zzjo(zzjn zzjn) {
        super((zzjr) null);
    }

    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    public static List zzf(Object obj, long j, int i) {
        AbstractList zzjl;
        List list = (List) zzlv.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzjm) {
                list = new zzjl(i);
            } else if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
                list = C36441kJ.A14(i);
            } else {
                list = ((zzjb) list).zzd(i);
            }
            zzlv.zzs(obj, j, list);
        } else {
            if (C165587tf.A1b(zza, list)) {
                zzjl = C165587tf.A0n(list, i);
                zzjl.addAll(list);
            } else if (list instanceof zzlq) {
                zzjm zzjm = zzjl.zza;
                zzjl = new zzjl(list.size() + i);
                zzjl.addAll(zzjl.size(), list);
            } else if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjb = (zzjb) list;
                if (!zzjb.zzc()) {
                    zzjb zzd = zzjb.zzd(list.size() + i);
                    zzlv.zzs(obj, j, zzd);
                    return zzd;
                }
            }
            zzlv.zzs(obj, j, zzjl);
            return zzjl;
        }
        return list;
    }

    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzlv.zzf(obj, j);
        if (list instanceof zzjm) {
            unmodifiableList = ((zzjm) list).zze();
        } else if (C165587tf.A1b(zza, list)) {
            return;
        } else {
            if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzjb zzjb = (zzjb) list;
                if (zzjb.zzc()) {
                    zzjb.zzb();
                    return;
                }
                return;
            }
        }
        zzlv.zzs(obj, j, unmodifiableList);
    }

    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzlv.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                zzf.addAll(list);
            }
            list = zzf;
        }
        zzlv.zzs(obj, j, list);
    }
}
