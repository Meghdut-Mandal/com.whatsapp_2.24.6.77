package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165617ti;
import X.C36331k8;
import X.C36441kJ;

public abstract class zzff {
    public static String zzf(int i, int i2, String str) {
        Object[] A1Q;
        String str2;
        if (i < 0) {
            A1Q = new Object[2];
            A1Q[0] = str;
            AnonymousClass000.A1L(A1Q, i, 1);
            str2 = "%s (%s) must not be negative";
        } else {
            A1Q = C36441kJ.A1Q();
            A1Q[0] = str;
            C36331k8.A1X(A1Q, i, 1, i2, 2);
            str2 = "%s (%s) must not be greater than size (%s)";
        }
        return zzfi.zza(str2, A1Q);
    }

    public static void zza(boolean z) {
        if (!z) {
            throw C165617ti.A0U();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A08((String) obj);
        }
    }

    public static void zzc(boolean z, String str, char c) {
        if (!z) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = Character.valueOf(c);
            throw AnonymousClass001.A08(zzfi.zza(str, A0L));
        }
    }

    public static void zzd(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = zzf(i2, i3, "end index");
                } else {
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1W(A0M, i2);
                    AnonymousClass000.A1L(A0M, i, 1);
                    str = zzfi.zza("end index (%s) must not be less than start index (%s)", A0M);
                }
                throw C165617ti.A0W(str);
            }
        }
        str = zzf(i, i3, "start index");
        throw C165617ti.A0W(str);
    }

    public static void zze(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A09((String) obj);
        }
    }
}
