package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass3LW;
import X.C18740tg;
import X.C231417i;
import X.C236919l;
import X.C36421kH;
import X.C39001qm;
import X.C89614Xf;
import X.C89714Xp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class IdentityChangeDialogFragment extends Hilt_IdentityChangeDialogFragment {
    public C231417i A00;
    public C236919l A01;

    public Dialog A1a(Bundle bundle) {
        A0b();
        String string = this.A0A.getString("participant_jid");
        AnonymousClass11F A0N = C36421kH.A0N(string);
        C18740tg.A07(A0N, AnonymousClass000.A0p("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=", string, AnonymousClass000.A0u()));
        AnonymousClass141 A0D = this.A02.A0D(A0N);
        C39001qm A02 = AnonymousClass3LW.A02(this);
        A02.A0p(A1k(A0D, R.string.f12nameremoved));
        A02.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A02.A0g(new C89714Xp(A0D, this, 11), R.string.f12nameremoved);
        boolean A0E = this.A02.A0E(3336);
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        A02.setPositiveButton(i, new C89614Xf(2, string, this));
        return A02.create();
    }
}
