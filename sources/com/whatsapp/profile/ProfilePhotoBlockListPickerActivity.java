package com.whatsapp.profile;

import X.AnonymousClass2aU;
import X.C165567td;
import X.C173788Ta;
import X.C18800tq;
import X.C18830tt;
import X.C23140B7a;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;

public class ProfilePhotoBlockListPickerActivity extends C173788Ta {
    public AnonymousClass2aU A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173788Ta.A0x(this, r2);
            this.A00 = C27111My.A33(A0L);
        }
    }

    public ProfilePhotoBlockListPickerActivity(int i) {
        this.A01 = false;
        C23140B7a.A00(this, 13);
    }

    public ProfilePhotoBlockListPickerActivity() {
        this(0);
    }
}
