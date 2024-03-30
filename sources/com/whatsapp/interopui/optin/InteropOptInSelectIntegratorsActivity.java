package com.whatsapp.interopui.optin;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass4C8;
import X.C1272367m;
import X.C18800tq;
import X.C18830tt;
import X.C32931eR;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C89344We;
import android.os.Bundle;

public final class InteropOptInSelectIntegratorsActivity extends AnonymousClass155 {
    public C32931eR A00;
    public C1272367m A01;
    public boolean A02;
    public final AnonymousClass00T A03;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (C1272367m) r1.A2K.get();
            this.A00 = C36431kI.A0g(A0B);
        }
    }

    public InteropOptInSelectIntegratorsActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C32931eR r0 = this.A00;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C36331k8.A0d("interopRolloutManager");
    }

    public InteropOptInSelectIntegratorsActivity() {
        this(0);
        this.A03 = C36431kI.A1I(new AnonymousClass4C8(this));
    }
}
