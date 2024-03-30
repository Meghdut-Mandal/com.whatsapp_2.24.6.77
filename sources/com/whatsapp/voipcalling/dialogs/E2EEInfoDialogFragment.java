package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass00T;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.AnonymousClass4XQ;
import X.C20380xT;
import X.C24801Dv;
import X.C32791eC;
import X.C36331k8;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class E2EEInfoDialogFragment extends Hilt_E2EEInfoDialogFragment {
    public int A00 = 11;
    public C24801Dv A01;
    public C32791eC A02;
    public C20380xT A03;

    public Dialog A1a(Bundle bundle) {
        if (this.A0A != null) {
            AnonymousClass00T A022 = AnonymousClass3TE.A02(this, "entry_point", -1);
            if (C36331k8.A02(A022) != -1) {
                this.A00 = C36331k8.A02(A022);
                int A023 = C36331k8.A02(A022);
                C32791eC r1 = this.A02;
                if (r1 != null) {
                    r1.A00(A023, 1);
                } else {
                    throw C36331k8.A0d("privacyHighlightDailyLogger");
                }
            }
        }
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0c(R.string.f12nameremoved);
        A04.A0f(new AnonymousClass4XQ(this, 23), R.string.f12nameremoved);
        A04.A0g(new AnonymousClass4XQ(this, 24), R.string.f12nameremoved);
        return C36371kC.A0O(A04);
    }
}
