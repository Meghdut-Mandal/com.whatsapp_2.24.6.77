package com.whatsapp.bizintegrity.marketingoptout;

import X.AnonymousClass17Y;
import X.AnonymousClass1NT;
import X.C124425yA;
import X.C20810yC;
import X.C21060yb;
import X.C24361Cd;
import X.C24801Dv;
import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;

public class MarketingOptOutFragment extends BizIntegrityFragment {
    public Context A00;
    public AnonymousClass1NT A01;
    public UserJid A02;
    public String A03;
    public C24361Cd A04;

    public MarketingOptOutFragment(Context context, C24801Dv r9, AnonymousClass17Y r10, AnonymousClass1NT r11, C124425yA r12, C24361Cd r13, C21060yb r14, C20810yC r15, UserJid userJid, String str) {
        super(r9, r10, r12, r14, r15);
        this.A01 = r11;
        this.A02 = userJid;
        this.A03 = str;
        this.A04 = r13;
        this.A00 = context;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C24361Cd r1 = this.A04;
        if (r1 != null) {
            r1.A01(this.A02);
        }
        super.onDismiss(dialogInterface);
    }
}
