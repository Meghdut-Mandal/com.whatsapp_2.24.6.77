package com.whatsapp.stickers.store;

import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass1AP;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.AnonymousClass6O1;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C89614Xf;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConfirmPackDeleteDialogFragment extends Hilt_ConfirmPackDeleteDialogFragment {
    public AnonymousClass6O1 A00;
    public AnonymousClass1AP A01;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0h = A0h();
        String A17 = C36431kI.A17(A0b(), "pack_id");
        String A172 = C36431kI.A17(A0b(), "pack_name");
        AnonymousClass4XQ r6 = new AnonymousClass4XQ(this, 7);
        C89614Xf r5 = new C89614Xf(6, A17, this);
        C39001qm A002 = AnonymousClass3LW.A00(A0h);
        A002.A0Z(C36401kF.A0q(this, A172, new Object[1], 0, R.string.f12nameremoved));
        C36401kF.A11(r5, r6, A002, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
