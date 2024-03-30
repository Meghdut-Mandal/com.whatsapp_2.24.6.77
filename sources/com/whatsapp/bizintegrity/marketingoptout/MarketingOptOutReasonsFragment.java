package com.whatsapp.bizintegrity.marketingoptout;

import X.AnonymousClass17Y;
import X.AnonymousClass1NP;
import X.C119085pD;
import X.C124425yA;
import X.C135436ch;
import X.C136066di;
import X.C20810yC;
import X.C21060yb;
import X.C24361Cd;
import X.C24801Dv;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.R;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class MarketingOptOutReasonsFragment extends BizIntegrityFragment {
    public static final C119085pD[] A08 = {new C119085pD("too_many_messages", R.string.f12nameremoved), new C119085pD("no_sign_up", R.string.f12nameremoved), new C119085pD("no_sign_up", R.string.f12nameremoved), new C119085pD("no_longer_relevant", R.string.f12nameremoved)};
    public View.OnClickListener A00 = new C135436ch(this, 9);
    public C119085pD A01;
    public List A02;
    public boolean A03 = false;
    public AnonymousClass1NP A04;
    public C24361Cd A05;
    public UserJid A06;
    public final CompoundButton.OnCheckedChangeListener A07 = new C136066di(this);

    public MarketingOptOutReasonsFragment(C24801Dv r9, AnonymousClass17Y r10, AnonymousClass1NP r11, C124425yA r12, C24361Cd r13, C21060yb r14, C20810yC r15, UserJid userJid) {
        super(r9, r10, r12, r14, r15);
        this.A06 = userJid;
        this.A04 = r11;
        this.A01 = null;
        this.A05 = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != r3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.widget.RadioButton r3, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r4) {
        /*
            r2 = 0
        L_0x0001:
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0025
            java.util.List r0 = r4.A02
            java.lang.Object r1 = r0.get(r2)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            if (r1 == 0) goto L_0x0016
            r0 = 1
            if (r1 == r3) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r1.setChecked(r0)
            if (r0 == 0) goto L_0x0022
            X.5pD[] r0 = A08
            r0 = r0[r2]
            r4.A01 = r0
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A03(android.widget.RadioButton, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C119085pD r0;
        AnonymousClass1NP r4 = this.A04;
        UserJid userJid = this.A06;
        if (!this.A03 || (r0 = this.A01) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        r4.A02(userJid, str, "quick_action", 0);
        super.onDismiss(dialogInterface);
    }
}
