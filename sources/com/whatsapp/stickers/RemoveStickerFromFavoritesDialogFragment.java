package com.whatsapp.stickers;

import X.AnonymousClass01I;
import X.AnonymousClass1AP;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C135066c4;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class RemoveStickerFromFavoritesDialogFragment extends Hilt_RemoveStickerFromFavoritesDialogFragment {
    public C135066c4 A00;
    public AnonymousClass1AP A01;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        this.A00 = (C135066c4) A0b().getParcelable("sticker");
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.A0c(R.string.f12nameremoved);
        C39001qm.A03(new AnonymousClass4XQ(this, 2), A002, R.string.f12nameremoved);
        return C36371kC.A0O(A002);
    }
}
