package com.whatsapp.invites;

import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.C18740tg;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C39001qm;
import X.C87934Qt;
import X.C89714Xp;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class RevokeInviteDialogFragment extends Hilt_RevokeInviteDialogFragment {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public C87934Qt A02;

    public void A19() {
        super.A19();
        this.A02 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof C87934Qt) {
            this.A02 = (C87934Qt) context;
        }
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        AnonymousClass01I A0i = A0i();
        UserJid A0h = C36391kE.A0h(A0b, "jid");
        C18740tg.A06(A0h);
        AnonymousClass141 A0D = this.A00.A0D(A0h);
        C89714Xp r6 = new C89714Xp(A0h, this, 20);
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.A0Z(C36401kF.A0q(this, C36381kD.A0v(this.A01, A0D), new Object[1], 0, R.string.f12nameremoved));
        C36371kC.A15(r6, A002, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
