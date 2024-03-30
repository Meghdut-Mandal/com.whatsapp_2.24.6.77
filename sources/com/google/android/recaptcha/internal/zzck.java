package com.google.android.recaptcha.internal;

import X.C165587tf;
import X.C165617ti;
import X.C36321k7;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import X.C90524aI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzck {
    public final Map zza;
    public final Set zzb = C36441kJ.A17();
    public final Map zzc;

    public final Map zzc() {
        return this.zzc;
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzd() {
        this.zza.clear();
    }

    public final void zze(int i, Object obj) {
        zzf(173, obj);
        this.zzb.add(173);
    }

    public final void zzf(int i, Object obj) {
        C90504aG.A1K(obj, this.zza, i);
    }

    public zzck() {
        LinkedHashMap A1G = C36431kI.A1G();
        this.zza = A1G;
        this.zzc = A1G;
    }

    private final List zzi(List list) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0J.add(zza((zzpq) it.next()));
        }
        return A0J;
    }

    public final Object zza(zzpq zzpq) {
        int zzO = zzpq.zzO();
        int i = zzO - 1;
        if (zzO != 0) {
            switch (i) {
                case 0:
                    return C36371kC.A0r(this.zza, zzpq.zzi());
                case 1:
                    return Boolean.valueOf(zzpq.zzM());
                case 2:
                    byte[] zzo = zzpq.zzI().zzo();
                    if (zzo.length == 1) {
                        return Byte.valueOf(zzo[0]);
                    }
                    throw C165617ti.A0E((Throwable) null, 4, 6);
                case 3:
                    String zzK = zzpq.zzK();
                    if (zzK.length() == 1) {
                        return Character.valueOf(zzK.charAt(0));
                    }
                    throw C165617ti.A0E((Throwable) null, 4, 6);
                case 4:
                    int zzj = zzpq.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw C165617ti.A0E((Throwable) null, 4, 6);
                case 5:
                    return Integer.valueOf(zzpq.zzk());
                case 6:
                case 8:
                    throw C165617ti.A0E((Throwable) null, 4, 6);
                case 7:
                    return Long.valueOf(zzpq.zzH());
                case 9:
                    return Float.valueOf(zzpq.zzg());
                case 10:
                    return Double.valueOf(zzpq.zzf());
                case 11:
                    return zzpq.zzL();
                case 12:
                    return null;
                default:
                    throw C165587tf.A0G();
            }
        } else {
            throw null;
        }
    }

    public final Class[] zzg(List list) {
        List<Object> zzi = zzi(list);
        ArrayList A0J = C36321k7.A0J(zzi);
        for (Object zza2 : zzi) {
            A0J.add(zzci.zza(zza2));
        }
        return (Class[]) A0J.toArray(new Class[0]);
    }

    public final Object[] zzh(List list) {
        return zzi(list).toArray(C90524aI.A0w());
    }
}
