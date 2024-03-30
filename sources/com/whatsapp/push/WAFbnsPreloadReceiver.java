package com.whatsapp.push;

import X.AnonymousClass005;
import X.C18800tq;
import X.C18830tt;
import X.C31071bE;
import X.C36441kJ;
import X.C56042vd;
import X.C90804ar;
import android.content.Context;
import android.content.Intent;

public class WAFbnsPreloadReceiver extends C90804ar {
    public C31071bE A00;
    public AnonymousClass005 A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APk(((C18800tq) C56042vd.A01(context)).AfI.A00, this);
                    this.A03 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public WAFbnsPreloadReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public WAFbnsPreloadReceiver() {
        this(0);
    }
}
