package com.whatsapp.stickers.picker.pages;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.R;

public class ThirdPartyPackPage$StickerBlockedDialogFragment extends Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment {
    public Dialog A1a(Bundle bundle) {
        String A17 = C36431kI.A17(A0b(), "sticker_pack_name");
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0L(R.string.f12nameremoved);
        Context A1D = A1D();
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = Html.escapeHtml(A17);
        A04.A0Z(AnonymousClass14B.A01(A1D, A0L, R.string.f12nameremoved));
        AnonymousClass4XQ.A00(A04, this, 5, R.string.f12nameremoved);
        return C36431kI.A0R(new AnonymousClass4XQ(this, 6), A04, R.string.f12nameremoved);
    }
}
