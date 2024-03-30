package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C36371kC;
import X.C90494aF;
import X.C90514aH;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

public final class zzq {
    public final SharedPreferences zza;

    public final String zza(String str) {
        return C36371kC.A0t(this.zza, "_GRECAPTCHA_KC");
    }

    public final void zzb(Map map) {
        SharedPreferences.Editor edit = this.zza.edit();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            edit.putString(C90494aF.A0f(A11), C90514aH.A10(A11));
        }
        edit.commit();
    }

    public zzq(Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
