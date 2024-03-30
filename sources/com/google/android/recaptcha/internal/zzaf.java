package com.google.android.recaptcha.internal;

import X.C02600Bc;
import android.content.Context;
import android.os.Build;

public final class zzaf {
    public static final zzaf zza = new zzaf();
    public static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    public static final C02600Bc zzc = C02600Bc.A00;

    public static final String zza(Context context) {
        int A02 = zzc.A02(context, 12451000);
        if (A02 == 1 || A02 == 3 || A02 == 9) {
            return "ANDROID_OFFPLAY";
        }
        return "ANDROID_ONPLAY";
    }
}
