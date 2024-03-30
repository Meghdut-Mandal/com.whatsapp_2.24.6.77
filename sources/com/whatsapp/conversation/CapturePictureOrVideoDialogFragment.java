package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass4T1;
import X.AnonymousClass4XM;
import X.C36351kA;
import X.C36441kJ;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class CapturePictureOrVideoDialogFragment extends Hilt_CapturePictureOrVideoDialogFragment {
    public static final int[] A01;
    public AnonymousClass4T1 A00;

    static {
        int[] A1O = C36441kJ.A1O();
        A1O[0] = R.string.f12nameremoved;
        A1O[1] = R.string.f12nameremoved;
        A01 = A1O;
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A00 = (AnonymousClass4T1) context;
        } catch (ClassCastException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1K(context, A0u);
            throw new ClassCastException(AnonymousClass000.A0q(" must implement CapturePictureOrVideoDialogClickListener", A0u));
        }
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0T(new AnonymousClass4XM(this, 29), this.A01.A0Q(A01));
        AnonymousClass0FM create = A04.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
