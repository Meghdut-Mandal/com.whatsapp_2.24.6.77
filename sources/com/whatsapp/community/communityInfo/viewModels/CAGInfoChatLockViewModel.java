package com.whatsapp.community.communityInfo.viewModels;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass08S;
import X.AnonymousClass147;
import X.AnonymousClass49Y;
import X.C24381Cf;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39811tr;

public final class CAGInfoChatLockViewModel extends AnonymousClass04R {
    public C39811tr A00;
    public AnonymousClass147 A01;
    public final AnonymousClass08S A02 = C36441kJ.A0Y();
    public final C24381Cf A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass49Y(this));

    public CAGInfoChatLockViewModel(C24381Cf r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A03 = r2;
    }

    public void A0R() {
        C39811tr r0 = this.A00;
        if (r0 != null) {
            this.A02.A0E(r0.A0F);
        }
        C36411kG.A1I(this.A03, this.A04);
    }
}
