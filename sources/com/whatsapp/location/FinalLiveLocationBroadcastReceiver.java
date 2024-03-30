package com.whatsapp.location;

import X.AnonymousClass1P5;
import X.C18830tt;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass1P5 A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APO(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        this.A00.A0P();
    }

    public FinalLiveLocationBroadcastReceiver(int i) {
        this.A02 = false;
        this.A01 = C36441kJ.A11();
    }

    public FinalLiveLocationBroadcastReceiver() {
        this(0);
    }
}
