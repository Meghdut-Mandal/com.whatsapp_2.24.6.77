package com.whatsapp.phoneid;

import X.C140256lI;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C29071Vf;
import X.C36441kJ;
import X.C56042vd;
import X.C90814at;
import android.content.Context;
import android.content.Intent;

public class PhoneIdRequestReceiver extends C90814at {
    public C20810yC A00;
    public C29071Vf A01;
    public C140256lI A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C18830tt.APh(((C18800tq) C56042vd.A01(context)).AfI.A00, this);
                    this.A04 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public PhoneIdRequestReceiver(int i) {
        this.A04 = false;
        this.A03 = C36441kJ.A11();
    }

    public PhoneIdRequestReceiver() {
        this(0);
    }
}
