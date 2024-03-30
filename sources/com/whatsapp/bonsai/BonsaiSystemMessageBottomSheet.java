package com.whatsapp.bonsai;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass48F;
import X.AnonymousClass48G;
import X.C019308f;
import X.C36361kB;
import X.C36441kJ;
import X.C51152nM;
import X.C53102qm;
import X.C55492ui;
import X.C84764Em;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class BonsaiSystemMessageBottomSheet extends Hilt_BonsaiSystemMessageBottomSheet {
    public final AnonymousClass00T A00;
    public final int A01 = R.layout.f9nameremoved;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = 0;
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("ARG_TYPE_ORDINAL", 0);
        }
        AnonymousClass00T r3 = this.A00;
        C51152nM r1 = C51152nM.values()[i];
        AnonymousClass00C.A0D(r1, 0);
        ((BonsaiSystemMessageBottomSheetViewModel) r3.getValue()).A00.A0D(r1);
        C55492ui.A01(A0m(), ((BonsaiSystemMessageBottomSheetViewModel) r3.getValue()).A00, C53102qm.A02(this, 5), 26);
        C36361kB.A18(C36361kB.A0G(view, R.id.bonsai_system_message_bottom_sheet_learn_more_button), this, 18);
    }

    public BonsaiSystemMessageBottomSheet() {
        C019308f A1A = C36441kJ.A1A(BonsaiSystemMessageBottomSheetViewModel.class);
        this.A00 = C36441kJ.A0a(new AnonymousClass48F(this), new AnonymousClass48G(this), new C84764Em(this), A1A);
    }

    public int A1i() {
        return this.A01;
    }
}
