package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C165567td;
import X.C165607th;
import X.C36341k9;
import X.C36351kA;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzkt {
    public static final /* synthetic */ int zza = 0;
    public static final Class zzb;
    public static final zzll zzc;
    public static final zzll zzd = new zzln();

    static {
        Class<?> cls;
        zzll zzll = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                zzll = (zzll) C165607th.A0m(cls2);
            }
        } catch (Throwable unused2) {
        }
        zzc = zzll;
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static zzll zzm() {
        return zzc;
    }

    public static zzll zzn() {
        return zzd;
    }

    public static void zzr(zzll zzll, Object obj, Object obj2) {
        zzll.zzo(obj, zzll.zze(((zzit) obj).zzc, ((zzit) obj2).zzc));
    }

    public static void zzA(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzu(i, list, z);
        }
    }

    public static void zzB(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzy(i, list, z);
        }
    }

    public static void zzC(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzA(i, list, z);
        }
    }

    public static void zzD(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzC(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzE(i, list, z);
        }
    }

    public static void zzF(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzJ(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzL(i, list, z);
        }
    }

    public static int zzh(int i, Object obj, zzkr zzkr) {
        int i2 = i << 3;
        if (obj instanceof zzjk) {
            int i3 = zzhh.zzb;
            int zza2 = ((zzjk) obj).zza();
            return C165567td.A00(i2) + C165567td.A00(zza2) + zza2;
        }
        return C165567td.A00(i2) + zzhh.zzw((zzke) obj, zzkr);
    }

    public static Object zzo(Object obj, int i, List list, zzix zzix, Object obj2, zzll zzll) {
        if (zzix != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int A06 = C36351kA.A06(list, i3);
                    if (zzix.zza(A06)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(A06));
                        }
                        i2++;
                    } else {
                        obj2 = zzp(obj, i, A06, obj2, zzll);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj2;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A0A = C36341k9.A0A(it);
                    if (!zzix.zza(A0A)) {
                        obj2 = zzp(obj, i, A0A, obj2, zzll);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzll zzll) {
        if (obj2 == null) {
            obj2 = zzll.zzc(obj);
        }
        zzll.zzl(obj2, i, (long) i2);
        return obj2;
    }

    public static void zzq(zzif zzif, Object obj, Object obj2) {
        zzij zzij = ((zzip) obj2).zzb;
        if (!zzij.zza.isEmpty()) {
            ((zzip) obj).zzi().zzh(zzij);
        }
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzit.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw AnonymousClass001.A08("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzc(i, list, z);
        }
    }

    public static void zzu(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzg(i, list, z);
        }
    }

    public static void zzv(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzj(i, list, z);
        }
    }

    public static void zzw(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzl(i, list, z);
        }
    }

    public static void zzx(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzn(i, list, z);
        }
    }

    public static void zzy(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzp(i, list, z);
        }
    }

    public static void zzz(int i, List list, zzmd zzmd, boolean z) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzs(i, list, z);
        }
    }

    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i = 0;
            while (i2 < size) {
                i += zzhh.zzu(zziu.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzhh.zzu(C36351kA.A06(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C165607th.A01(i) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C165607th.A01(i) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i = 0;
            while (i2 < size) {
                i += zzhh.zzu(zziu.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzhh.zzu(C36351kA.A06(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i = 0;
            while (i2 < size) {
                i += zzhh.zzz(zzjt.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzhh.zzz(C165567td.A08(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i = 0;
            while (i2 < size) {
                int zze = zziu.zze(i2);
                int i3 = (zze >> 31) ^ (zze + zze);
                int i4 = zzhh.zzb;
                i += C165567td.A00(i3);
                i2++;
            }
        } else {
            int i5 = 0;
            while (i2 < size) {
                int A06 = C36351kA.A06(list, i2);
                int i6 = (A06 >> 31) ^ (A06 + A06);
                int i7 = zzhh.zzb;
                i5 = i + C165567td.A00(i6);
                i2++;
            }
        }
        return i;
    }

    public static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i = 0;
            while (i2 < size) {
                long zze = zzjt.zze(i2);
                i += zzhh.zzz((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long A08 = C165567td.A08(list, i2);
                i3 = i + zzhh.zzz((A08 >> 63) ^ (A08 + A08));
                i2++;
            }
        }
        return i;
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i = 0;
            while (i2 < size) {
                int zze = zziu.zze(i2);
                int i3 = zzhh.zzb;
                i += C165567td.A00(zze);
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int A06 = C36351kA.A06(list, i2);
                int i5 = zzhh.zzb;
                i4 = i + C165567td.A00(A06);
                i2++;
            }
        }
        return i;
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i = 0;
            while (i2 < size) {
                i += zzhh.zzz(zzjt.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzhh.zzz(C165567td.A08(list, i2));
                i2++;
            }
        }
        return i;
    }
}
