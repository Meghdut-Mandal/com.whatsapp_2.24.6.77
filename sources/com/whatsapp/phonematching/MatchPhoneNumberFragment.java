package com.whatsapp.phonematching;

import X.AnonymousClass155;
import X.C18740tg;
import X.C19730wQ;
import X.C24801Dv;
import X.C37131lr;
import X.C61573Co;
import X.C88904Um;
import android.content.Context;
import android.os.Bundle;

public class MatchPhoneNumberFragment extends Hilt_MatchPhoneNumberFragment {
    public C19730wQ A00;
    public AnonymousClass155 A01;
    public C37131lr A02;
    public final C61573Co A03 = new C61573Co(this);

    public void A1H() {
        C37131lr r0 = this.A02;
        r0.A00.BwN(this.A03);
        this.A02.removeMessages(4);
        this.A0A = null;
        super.A1H();
    }

    public void A1O(Context context) {
        super.A1O(context);
        AnonymousClass155 r0 = (AnonymousClass155) C24801Dv.A01(context, AnonymousClass155.class);
        this.A01 = r0;
        C18740tg.A0D(r0 instanceof C88904Um, "activity needs to implement PhoneNumberMatchingCallback");
        AnonymousClass155 r2 = this.A01;
        C88904Um r1 = (C88904Um) r2;
        if (this.A02 == null) {
            this.A02 = new C37131lr(r2, r1);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C37131lr r0 = this.A02;
        r0.A00.BnG(this.A03);
        this.A0A = this;
    }
}
