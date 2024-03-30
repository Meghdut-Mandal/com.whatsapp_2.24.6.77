package com.whatsapp.contact.picker.invite;

import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass4XM;
import X.C18740tg;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class InviteToGroupCallConfirmationFragment extends Hilt_InviteToGroupCallConfirmationFragment {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;

    public Dialog A1a(Bundle bundle) {
        UserJid A0h = C36391kE.A0h(A0b(), "peer_id");
        C18740tg.A07(A0h, "null peer jid");
        AnonymousClass01I A0h2 = A0h();
        C39001qm A002 = AnonymousClass3LW.A00(A0h2);
        A002.setTitle(C36401kF.A0q(this, C36381kD.A0v(this.A01, this.A00.A0D(A0h)), new Object[1], 0, R.string.f12nameremoved));
        Object[] objArr = new Object[1];
        C36361kB.A0x(A1D(), A0h2, objArr);
        A002.A0Z(Html.fromHtml(A0o(R.string.f12nameremoved, objArr)));
        A002.setPositiveButton(R.string.f12nameremoved, new C89714Xp(A0h, this, 6));
        AnonymousClass0FM A0R = C36431kI.A0R(new AnonymousClass4XM(this, 26), A002, R.string.f12nameremoved);
        A0R.setCanceledOnTouchOutside(true);
        return A0R;
    }
}
