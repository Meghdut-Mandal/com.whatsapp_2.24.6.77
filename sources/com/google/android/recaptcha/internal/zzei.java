package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165617ti;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class zzei implements zzen {
    public final Context zzb;

    public zzei(Context context) {
        this.zzb = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Intent registerReceiver = this.zzb.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("health", -1);
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
            boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
            int intExtra4 = registerReceiver.getIntExtra("scale", -1);
            int intExtra5 = registerReceiver.getIntExtra("status", -1);
            String stringExtra = registerReceiver.getStringExtra("technology");
            if (stringExtra == null) {
                stringExtra = "";
            }
            int intExtra6 = registerReceiver.getIntExtra("temperature", -1);
            int intExtra7 = registerReceiver.getIntExtra("voltage", -1);
            Object[] objArr2 = new Object[9];
            AnonymousClass000.A1L(objArr2, intExtra, 0);
            C165567td.A1X(objArr2, intExtra2, intExtra3);
            AnonymousClass000.A1N(objArr2, 3, booleanExtra);
            AnonymousClass000.A1L(objArr2, intExtra4, 4);
            AnonymousClass000.A1L(objArr2, intExtra5, 5);
            objArr2[6] = stringExtra;
            AnonymousClass000.A1L(objArr2, intExtra6, 7);
            AnonymousClass000.A1L(objArr2, intExtra7, 8);
            return objArr2;
        }
        throw C165617ti.A0E((Throwable) null, 7, 19);
    }
}
