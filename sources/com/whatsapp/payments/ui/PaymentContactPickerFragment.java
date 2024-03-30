package com.whatsapp.payments.ui;

import X.A8P;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16X;
import X.AnonymousClass171;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass6O3;
import X.C167527yC;
import X.C175728ax;
import X.C18740tg;
import X.C18820ts;
import X.C193609Md;
import X.C19730wQ;
import X.C203049nB;
import X.C23075B3f;
import X.C24881Ed;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C43222Fr;
import X.C43252Fu;
import X.C49032iS;
import X.C50302kX;
import X.C65993Ug;
import X.C68733cN;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentContactPickerFragment extends Hilt_PaymentContactPickerFragment {
    public C24881Ed A00;
    public A8P A01;
    public AnonymousClass1EV A02;
    public C23075B3f A03;
    public AnonymousClass6O3 A04;
    public C167527yC A05;
    public PaymentIncentiveViewModel A06;
    public String A07;
    public Map A08 = AnonymousClass001.A0J();

    public C50302kX A1c() {
        if (!this.A02.A02.A0E(2026)) {
            return super.A1c();
        }
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
        return new C43222Fr(r1, r2, this.A0o, r4, this, r6, (String) this.A3i.A04(), hashSet, arrayList, list, list2, list3, set);
    }

    public C49032iS A1d() {
        if (!this.A02.A02.A0E(2026)) {
            return super.A1d();
        }
        AnonymousClass16D r1 = this.A0j;
        AnonymousClass1EU r5 = this.A1z;
        return new C43252Fu(r1, this, this.A00, this.A02, r5);
    }

    public static void A00(PaymentContactPickerFragment paymentContactPickerFragment) {
        if (paymentContactPickerFragment.A03 != null) {
            C203049nB.A04(C203049nB.A01(paymentContactPickerFragment.A1A, (AnonymousClass16X) null, paymentContactPickerFragment.A04, (String) null, false), paymentContactPickerFragment.A03, "payment_contact_picker", paymentContactPickerFragment.A07);
        }
    }

    public void A26(UserJid userJid) {
        Intent A012 = this.A01.A01(A1D(), false, false);
        A012.putExtra("referral_screen", this.A07);
        A012.putExtra("extra_jid", userJid.getRawString());
        A27(userJid);
        A1C(A012);
        C36341k9.A15(this);
    }

    public void A27(UserJid userJid) {
        int i;
        Iterator it = this.A2p.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 133;
                break;
            }
            AnonymousClass11F A0W = C36341k9.A0W(it);
            if (A0W != null && A0W.getRawString().equals(userJid.getRawString())) {
                i = 149;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        C23075B3f b3f = this.A03;
        if (b3f != null) {
            String str = this.A07;
            C18740tg.A06(b3f);
            b3f.BOm(1, valueOf, "payment_contact_picker", str);
        }
    }

    public void A1P(Bundle bundle) {
        super.A1P(bundle);
        AnonymousClass07B A002 = C68733cN.A00(this);
        AnonymousClass00C.A0D(this.A1g, 0);
        A002.A0I(R.string.f12nameremoved);
        this.A07 = A1Z().getString("referral_screen");
        this.A05 = (C167527yC) C36381kD.A0P(this).A00(C167527yC.class);
        this.A03 = this.A1z.A05().BBn();
        if (this.A1g.A0E(842)) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = (PaymentIncentiveViewModel) C36381kD.A0P(this).A00(PaymentIncentiveViewModel.class);
            this.A06 = paymentIncentiveViewModel;
            paymentIncentiveViewModel.A0S();
            C65993Ug.A00(A0i(), this.A06.A01, this, 26);
            return;
        }
        A00(this);
    }

    public int A25(AnonymousClass141 r5) {
        Jid A0h = C36431kI.A0h(r5);
        if (A0h != null) {
            C175728ax r1 = (C175728ax) this.A08.get(A0h);
            C193609Md BFa = this.A1z.A05().BFa();
            if (!(r1 == null || BFa == null)) {
                return (int) ((C175728ax.A02(r1).A00 >> 12) & 15);
            }
        }
        return 0;
    }
}
