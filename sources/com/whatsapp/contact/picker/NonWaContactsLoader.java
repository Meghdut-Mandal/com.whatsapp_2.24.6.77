package com.whatsapp.contact.picker;

import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass4T0;
import X.C005502l;
import X.C023509x;
import X.C18820ts;
import X.C36321k7;

public final class NonWaContactsLoader implements AnonymousClass4T0 {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final C18820ts A02;

    public Object BOK(AnonymousClass147 r3, C023509x r4, C005502l r5) {
        return AnonymousClass0A2.A00(r4, r5, new NonWaContactsLoader$loadContacts$2(this, (C023509x) null));
    }

    public NonWaContactsLoader(AnonymousClass16D r1, AnonymousClass171 r2, C18820ts r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BDM() {
        return "com.whatsapp.contact.picker.NonWaContactsLoader";
    }
}
