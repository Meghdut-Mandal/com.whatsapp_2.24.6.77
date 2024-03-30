package com.whatsapp.voipcalling;

import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.C130046Jm;
import X.C19970wo;
import X.C36321k7;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class ReplyWithMessageDialogFragment extends Hilt_ReplyWithMessageDialogFragment {
    public static final int[] A04 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public C130046Jm A00;
    public C19970wo A01;
    public final UserJid A02;
    public final String A03;

    public ReplyWithMessageDialogFragment(UserJid userJid, String str) {
        C36321k7.A0x(userJid, str);
        this.A02 = userJid;
        this.A03 = str;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A042 = AnonymousClass3LW.A04(this);
        String[] A0Q = this.A01.A0Q(A04);
        A042.A0T(new C89714Xp(A0Q, this, 27), A0Q);
        AnonymousClass0FM create = A042.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
