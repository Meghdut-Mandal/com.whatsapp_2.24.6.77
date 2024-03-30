package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C90474aD;
import X.C90504aG;

public abstract class zzgc {
    public static void zza(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("overflow: ");
            A0u.append(str);
            A0u.append("(");
            A0u.append(j);
            C90504aG.A1M(A0u);
            A0u.append(j2);
            throw new ArithmeticException(C90474aD.A0f(A0u));
        }
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
