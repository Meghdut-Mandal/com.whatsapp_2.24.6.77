package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass48W;
import X.AnonymousClass48X;
import X.AnonymousClass48Y;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C18820ts;
import X.C36341k9;
import X.C36421kH;
import X.C36441kJ;
import X.C84834Et;
import X.C84844Eu;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class LGCCallConfirmationSheet extends Hilt_LGCCallConfirmationSheet {
    public C18820ts A00;
    public final AnonymousClass00T A01;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C36421kH.A18(this.A01, this);
        WDSButton wDSButton = this.A02;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f12nameremoved);
        }
        WDSButton wDSButton2 = this.A02;
        if (wDSButton2 != null) {
            wDSButton2.setCompoundDrawablePadding(C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
        }
    }

    public LGCCallConfirmationSheet() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass48X(new AnonymousClass48W(this)));
        C019308f A1A = C36441kJ.A1A(LGCCallConfirmationSheetViewModel.class);
        this.A01 = C36441kJ.A0a(new AnonymousClass48Y(A002), new C84844Eu(this, A002), new C84834Et(A002), A1A);
    }
}
