package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1H2;
import X.AnonymousClass3LW;
import X.AnonymousClass3UG;
import X.C20380xT;
import X.C21010yW;
import X.C24801Dv;
import X.C39001qm;
import X.C89784Xw;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class VerifiedBusinessInfoDialogFragment extends Hilt_VerifiedBusinessInfoDialogFragment {
    public C24801Dv A00;
    public AnonymousClass1H2 A01;
    public C21010yW A02;
    public C20380xT A03;

    public Dialog A1a(Bundle bundle) {
        A0b();
        String string = this.A0A.getString("message");
        int i = this.A0A.getInt("system_action");
        C39001qm A032 = AnonymousClass3LW.A03(this);
        C39001qm.A09(A032, AnonymousClass3UG.A05(A1D(), this.A01, string));
        A032.A0g(new C89784Xw(this, i, 3), R.string.f12nameremoved);
        C39001qm.A0E(A032, this, 33, R.string.f12nameremoved);
        return A032.create();
    }
}
