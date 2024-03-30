package com.whatsapp;

import X.AnonymousClass14B;
import X.C18830tt;
import X.C32611du;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class TellAFriendReceiver extends BroadcastReceiver {
    public C32611du A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APB(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!AnonymousClass14B.A0F(packageName)) {
                this.A00.A01(Integer.valueOf(intent.getIntExtra("extra_invite_source", 0)), packageName, 2, 1);
            }
        }
    }

    public TellAFriendReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public TellAFriendReceiver() {
        this(0);
    }
}
