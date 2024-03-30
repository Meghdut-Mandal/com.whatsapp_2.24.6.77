package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C36341k9;
import X.C36381kD;
import X.C39001qm;
import X.C88474Sv;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public class ViewPhotoOrStatusDialogFragment extends Hilt_ViewPhotoOrStatusDialogFragment {
    public C88474Sv A00;

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof C88474Sv) {
            this.A00 = (C88474Sv) context;
            return;
        }
        throw new ClassCastException(AnonymousClass000.A0q(" must implement ViewPhotoOrStatusDialogClickListener", C36381kD.A11(context)));
    }

    public Dialog A1a(Bundle bundle) {
        String[] stringArray = C36341k9.A0G(this).getStringArray(R.array.f3nameremoved);
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0T(AnonymousClass4XL.A00(this, 36), stringArray);
        return A04.create();
    }
}
