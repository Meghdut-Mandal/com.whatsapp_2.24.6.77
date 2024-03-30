package com.whatsapp.payments.ui;

import X.AE0;
import X.AF7;
import X.AF8;
import X.AnonymousClass01I;
import X.AnonymousClass3EU;
import X.AnonymousClass9YX;
import X.C18740tg;
import X.C195479Ul;
import X.C207359uy;
import X.C21100yf;
import X.C225314u;
import X.C23054B2a;
import X.C24601Db;
import X.C36391kE;
import X.C36441kJ;
import X.C64073Mn;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IndiaUpiContactPickerFragment extends Hilt_IndiaUpiContactPickerFragment {
    public AE0 A00;
    public C24601Db A01;
    public AnonymousClass3EU A02;
    public C195479Ul A03;
    public AF7 A04;

    public void A1m() {
        boolean A002 = C64073Mn.A00(this.A1g, this.A00.A0B());
        int i = R.string.f12nameremoved;
        if (A002) {
            i = R.string.f12nameremoved;
        }
        FrameLayout A1a = A1a(new C207359uy(this, 11), R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, i);
        FrameLayout A1a2 = A1a(new C207359uy(this, 12), R.drawable.ic_scan_qr, C36391kE.A03(A0h()), R.drawable.green_circle, R.string.f12nameremoved);
        ListView listView = (ListView) this.A08.findViewById(16908298);
        this.A0D = listView;
        listView.addHeaderView(A1a, (Object) null, true);
        this.A0D.addHeaderView(A1a2, (Object) null, true);
        super.A1m();
    }

    public void A26(UserJid userJid) {
        this.A03.A00(A1D(), userJid, (AnonymousClass9YX) null, (C23054B2a) null, this.A01.A05());
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof C225314u) {
            AF8 A042 = this.A1z.A04("UPI");
            C18740tg.A06(A042);
            Intent A0H = C36441kJ.A0H(A0h, A042.BHH());
            A0H.putExtra("extra_jid", userJid.getRawString());
            A0H.putExtra("extra_is_pay_money_only", !this.A1z.A07.A00.A09(C21100yf.A0g));
            A0H.putExtra("referral_screen", "payment_contact_picker");
            super.A27(userJid);
            ((C225314u) A0h).A33(A0H, true);
            return;
        }
        Log.e("India Payments' contact picker activity is null");
    }
}
