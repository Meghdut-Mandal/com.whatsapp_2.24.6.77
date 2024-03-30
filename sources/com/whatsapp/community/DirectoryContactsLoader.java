package com.whatsapp.community;

import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass1LV;
import X.AnonymousClass4T0;
import X.C004702c;
import X.C005502l;
import X.C023509x;
import X.C19730wQ;
import X.C220412q;
import X.C28391Sm;
import X.C36321k7;

public final class DirectoryContactsLoader implements AnonymousClass4T0 {
    public final C19730wQ A00;
    public final AnonymousClass1LV A01;
    public final C28391Sm A02;
    public final AnonymousClass16D A03;
    public final C220412q A04;

    public Object BOK(AnonymousClass147 r3, C023509x r4, C005502l r5) {
        if (r3 == null) {
            return C004702c.A00;
        }
        return AnonymousClass0A2.A00(r4, r5, new DirectoryContactsLoader$loadContacts$2(this, r3, (C023509x) null));
    }

    public DirectoryContactsLoader(C19730wQ r1, AnonymousClass1LV r2, C28391Sm r3, AnonymousClass16D r4, C220412q r5) {
        C36321k7.A1B(r1, r5, r4, r3, r2);
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BDM() {
        return "com.whatsapp.community.DirectoryContactsLoader";
    }
}
