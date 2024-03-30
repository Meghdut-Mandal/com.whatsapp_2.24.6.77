package com.whatsapp.calling.calllink;

import X.AnonymousClass14B;
import X.AnonymousClass3UD;
import X.C130806Mm;
import X.C18740tg;
import X.C18830tt;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

public class CallLinkShareReceiver extends BroadcastReceiver {
    public C130806Mm A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APG(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!AnonymousClass14B.A0F(packageName)) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (charSequence != null) {
                        packageName = charSequence;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                if (!intent.hasExtra("extra_entry_point")) {
                    str = "CallLinkShareReceiver/onReceive entryPoint extra not available";
                } else if (!intent.hasExtra("extra_is_video")) {
                    str = "CallLinkShareReceiver/onReceive isVideo extra not available";
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("extra_is_video", false);
                    int intExtra = intent.getIntExtra("extra_entry_point", 0);
                    C130806Mm r2 = this.A00;
                    r2.A00.Bly(AnonymousClass3UD.A02(packageName, 2, intExtra, booleanExtra));
                    return;
                }
                C18740tg.A0D(false, str);
            }
        }
    }

    public CallLinkShareReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public CallLinkShareReceiver() {
        this(0);
    }
}
