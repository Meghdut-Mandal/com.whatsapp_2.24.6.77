package com.whatsapp.blocklist;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass4PJ;
import X.AnonymousClass4XL;
import X.AnonymousClass4ZV;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class UnblockDialogFragment extends Hilt_UnblockDialogFragment {
    public AnonymousClass4PJ A00;
    public boolean A01;

    public static UnblockDialogFragment A03(AnonymousClass4PJ r3, String str, int i, boolean z) {
        UnblockDialogFragment unblockDialogFragment = new UnblockDialogFragment();
        unblockDialogFragment.A00 = r3;
        unblockDialogFragment.A01 = z;
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("message", str);
        A07.putInt("title", i);
        unblockDialogFragment.A17(A07);
        return unblockDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass4XL A002;
        AnonymousClass01I A0h = A0h();
        String A17 = C36431kI.A17(A0b(), "message");
        int i = A0b().getInt("title");
        if (this.A00 == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass4XL.A00(this, 23);
        }
        C89714Xp r1 = new C89714Xp(A0h, this, 1);
        C39001qm A003 = AnonymousClass3LW.A00(A0h);
        A003.A0Z(A17);
        if (i != 0) {
            A003.A0L(i);
        }
        C36401kF.A11(A002, r1, A003, R.string.f12nameremoved);
        if (this.A01) {
            A003.A0W(new AnonymousClass4ZV(A0h, 0));
        }
        AnonymousClass0FM create = A003.create();
        create.setCanceledOnTouchOutside(!this.A01);
        return create;
    }
}
