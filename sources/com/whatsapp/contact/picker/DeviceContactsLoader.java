package com.whatsapp.contact.picker;

import X.AnonymousClass00C;
import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass4T0;
import X.C005502l;
import X.C023509x;

public final class DeviceContactsLoader implements AnonymousClass4T0 {
    public final AnonymousClass16D A00;

    public DeviceContactsLoader(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public Object BOK(AnonymousClass147 r3, C023509x r4, C005502l r5) {
        return AnonymousClass0A2.A00(r4, r5, new DeviceContactsLoader$loadContacts$2(this, (C023509x) null));
    }

    public String BDM() {
        return "com.whatsapp.contact.picker.DeviceContactsLoader";
    }
}
