package com.google.android.recaptcha.internal;

import X.C000400e;
import X.C36441kJ;
import X.C90494aF;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzfa {
    public static final zzfa zza = new zzfa();

    public static final Map zza() {
        LinkedHashMap A08 = C000400e.A08(C36441kJ.A19(-4, zzl.zzz), C36441kJ.A19(-12, zzl.zzA), C36441kJ.A19(-6, zzl.zzv), C36441kJ.A19(-11, zzl.zzx), C36441kJ.A19(-13, zzl.zzB), C36441kJ.A19(-14, zzl.zzC), C36441kJ.A19(-2, zzl.zzw), C36441kJ.A19(-7, zzl.zzD), C36441kJ.A19(-5, zzl.zzE), C36441kJ.A19(-9, zzl.zzF), C36441kJ.A19(-8, zzl.zzP), C36441kJ.A19(-15, zzl.zzy), C36441kJ.A19(C90494aF.A0U(), zzl.zzG), C36441kJ.A19(-3, zzl.zzI), C36441kJ.A19(-10, zzl.zzJ));
        if (Build.VERSION.SDK_INT >= 26) {
            A08.put(-16, zzl.zzH);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            A08.put(1, zzl.zzL);
            A08.put(2, zzl.zzM);
            A08.put(0, zzl.zzN);
            A08.put(3, zzl.zzO);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            A08.put(4, zzl.zzK);
        }
        return A08;
    }
}
