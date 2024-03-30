package com.whatsapp.contact.picker.nativecontacts;

import X.AnonymousClass00C;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C20830yE;
import X.C229516p;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C80273v8;
import X.C89324Wc;
import java.util.ArrayList;

public final class NativeContactsMultipleContactPicker extends AnonymousClass27v {
    public C229516p A00;
    public C19630wG A01;
    public C20830yE A02;
    public boolean A03;

    public void A42(ArrayList arrayList) {
        AnonymousClass00C.A0D(arrayList, 0);
        this.A04.Bp6(new C80273v8(this, arrayList, 24), "fetchOSAddressBookContacts");
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A01 = C36351kA.A0W(r2);
            this.A02 = C36351kA.A0X(r2);
            this.A00 = (C229516p) r2.A29.get();
        }
    }

    public NativeContactsMultipleContactPicker(int i) {
        this.A03 = false;
        C89324Wc.A00(this, 38);
    }

    public NativeContactsMultipleContactPicker() {
        this(0);
    }
}
