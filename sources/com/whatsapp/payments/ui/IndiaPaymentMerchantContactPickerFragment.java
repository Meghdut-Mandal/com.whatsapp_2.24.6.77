package com.whatsapp.payments.ui;

import X.A8P;
import X.AF8;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass19A;
import X.AnonymousClass1EV;
import X.AnonymousClass1FF;
import X.AnonymousClass9UH;
import X.C18740tg;
import X.C18820ts;
import X.C19730wQ;
import X.C23075B3f;
import X.C24881Ed;
import X.C43212Fq;
import X.C43242Ft;
import X.C43262Fv;
import X.C49032iS;
import X.C50302kX;
import X.C64313Nm;
import X.C68733cN;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndiaPaymentMerchantContactPickerFragment extends Hilt_IndiaPaymentMerchantContactPickerFragment {
    public AnonymousClass1FF A00;
    public C24881Ed A01;
    public A8P A02;
    public AnonymousClass1EV A03;
    public C23075B3f A04;
    public AnonymousClass9UH A05;
    public String A06;
    public C64313Nm A07;

    public C50302kX A1c() {
        ArrayList arrayList = this.A2i;
        List list = this.A2l;
        List list2 = this.A2p;
        List list3 = this.A3n;
        Set set = this.A3p;
        HashSet hashSet = this.A3l;
        C19730wQ r1 = this.A0R;
        C18820ts r6 = this.A1D;
        AnonymousClass16D r2 = this.A0j;
        AnonymousClass171 r4 = this.A0p;
        return new C43212Fq(r1, r2, this.A0o, r4, this, r6, (String) this.A3i.A04(), hashSet, arrayList, list, list2, list3, set);
    }

    public C49032iS A1d() {
        C64313Nm r1 = new C64313Nm(this.A1g);
        this.A07 = r1;
        if (!r1.A02) {
            return new C43242Ft(this.A0j, this, this.A00);
        }
        AnonymousClass16D r4 = this.A0j;
        List list = r1.A00;
        AnonymousClass19A r7 = this.A1r;
        return new C43262Fv(this.A0h, r4, this, this.A12, r7, list);
    }

    public void A1P(Bundle bundle) {
        super.A1P(bundle);
        C68733cN.A00(this).A0I(R.string.f12nameremoved);
        this.A06 = A1Z().getString("referral_screen");
        AF8 A042 = this.A1z.A04("UPI");
        C18740tg.A06(A042);
        this.A04 = A042.BBn();
    }
}
