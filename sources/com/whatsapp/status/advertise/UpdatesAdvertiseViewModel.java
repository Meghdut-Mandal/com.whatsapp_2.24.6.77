package com.whatsapp.status.advertise;

import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.AnonymousClass08M;
import X.C19420v0;
import X.C19460v5;
import X.C36321k7;
import X.C36331k8;
import X.C48052gc;
import X.C51362nh;
import X.C51642o9;
import X.C65423Rz;

public final class UpdatesAdvertiseViewModel extends AnonymousClass04R {
    public final AnonymousClass08M A00;
    public final C19460v5 A01;
    public final C19420v0 A02;
    public final C65423Rz A03;

    public final void A0S(C48052gc r4) {
        if (r4.A00 == C51362nh.Banner) {
            C36331k8.A0w(C19420v0.A00(this.A02), "pref_advertise_banner_status_main_shown", true);
            this.A03.A02(C51642o9.ADVERTISE);
        }
        C19460v5 r1 = this.A01;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("logStatusEntryPointImpression");
        }
    }

    public UpdatesAdvertiseViewModel(AnonymousClass08M r1, C19460v5 r2, C19420v0 r3, C65423Rz r4) {
        C36321k7.A18(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
