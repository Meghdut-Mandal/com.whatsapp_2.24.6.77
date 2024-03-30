package com.whatsapp.contact.picker;

import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass1NZ;
import X.AnonymousClass4T0;
import X.C005502l;
import X.C023509x;
import X.C36321k7;

public final class RecentlyAcceptedInviteContactsLoader implements AnonymousClass4T0 {
    public final AnonymousClass16D A00;
    public final AnonymousClass1NZ A01;

    public Object BOK(AnonymousClass147 r3, C023509x r4, C005502l r5) {
        return AnonymousClass0A2.A00(r4, r5, new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this, (C023509x) null));
    }

    public RecentlyAcceptedInviteContactsLoader(AnonymousClass16D r1, AnonymousClass1NZ r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BDM() {
        return "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader";
    }
}
