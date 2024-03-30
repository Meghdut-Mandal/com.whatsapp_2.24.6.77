package com.whatsapp.base;

import X.AnonymousClass00C;
import X.C18950u5;
import X.C19430v1;
import X.C225214t;
import X.C28031Qx;
import X.C32181d7;
import com.whatsapp.updates.ui.UpdatesFragment;

public abstract class WaFragment extends Hilt_WaFragment implements C225214t, C28031Qx {
    public C32181d7 A00;

    public void A1V(boolean z) {
        C32181d7 r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
        }
        super.A1V(z);
    }

    public /* synthetic */ C18950u5 BGv() {
        if (!(this instanceof UpdatesFragment)) {
            return C19430v1.A02;
        }
        C18950u5 r0 = C19430v1.A01;
        AnonymousClass00C.A09(r0);
        return r0;
    }
}
