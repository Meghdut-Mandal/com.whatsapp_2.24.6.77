package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass19R;
import X.AnonymousClass3LW;
import X.AnonymousClass3XA;
import X.AnonymousClass4XQ;
import X.C023509x;
import X.C18740tg;
import X.C222813r;
import X.C26591Kt;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class RemoveUserConfirmationDialogFragment extends Hilt_RemoveUserConfirmationDialogFragment {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public String A02;
    public UserJid A03;

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        C222813r r0 = UserJid.Companion;
        UserJid A012 = C222813r.A01(A0b.getString("user_jid"));
        this.A03 = A012;
        C36381kD.A1R(AnonymousClass19R.A02, new RemoveUserConfirmationDialogFragment$onCreate$1$1(A012, this, (C023509x) null), C26591Kt.A00);
    }

    public Dialog A1a(Bundle bundle) {
        Object parcelable;
        String A0q;
        Context A0a = A0a();
        int i = Build.VERSION.SDK_INT;
        Bundle A0b = A0b();
        if (i >= 33) {
            parcelable = A0b.getParcelable("callback", AnonymousClass3XA.class);
        } else {
            parcelable = A0b.getParcelable("callback");
            if (!(parcelable instanceof AnonymousClass3XA)) {
                parcelable = null;
            }
        }
        C18740tg.A06(this.A03);
        C39001qm A002 = AnonymousClass3LW.A00(A0a);
        String str = this.A02;
        if (str == null) {
            A0q = new String();
        } else {
            A0q = C36401kF.A0q(this, str, new Object[1], 0, R.string.f12nameremoved);
            AnonymousClass00C.A0B(A0q);
        }
        A002.A0q(A0q);
        A002.A0p(A0n(R.string.f12nameremoved));
        A002.A0r(true);
        A002.A0h(new AnonymousClass4XQ(parcelable, 29), R.string.f12nameremoved);
        A002.A0f(new AnonymousClass4XQ(parcelable, 28), R.string.f12nameremoved);
        A002.A0g(new AnonymousClass4XQ(this, 27), R.string.f12nameremoved);
        return C36371kC.A0O(A002);
    }
}
