package com.whatsapp.status.advertise;

import X.AAH;
import X.AnonymousClass004;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass08M;
import X.AnonymousClass191;
import X.AnonymousClass2LA;
import X.C001600r;
import X.C001700s;
import X.C023409w;
import X.C19420v0;
import X.C19460v5;
import X.C19770wU;
import X.C22207AiU;
import X.C22208AiV;
import X.C23169B8d;
import X.C33301f4;
import X.C36321k7;
import X.C36351kA;
import X.C36431kI;
import java.util.List;

public final class AdvertiseViewModel extends AnonymousClass04R {
    public C19420v0 A00;
    public List A01 = C023409w.A00;
    public AnonymousClass2LA A02;
    public final C001700s A03;
    public final C19770wU A04;
    public final AnonymousClass00T A05;
    public final C001600r A06;
    public final AnonymousClass08M A07;
    public final C19460v5 A08;
    public final AnonymousClass191 A09;
    public final AnonymousClass004 A0A;
    public final AnonymousClass00T A0B = C36431kI.A1I(new C22208AiV(this));

    public final void A0S() {
        C36351kA.A1H(this.A02);
        AnonymousClass2LA r3 = (AnonymousClass2LA) this.A0A.get();
        ((C33301f4) this.A05.getValue()).A00(new C23169B8d(this, 2), r3);
        this.A02 = r3;
    }

    public AdvertiseViewModel(AnonymousClass08M r3, C19460v5 r4, C19420v0 r5, C19770wU r6, AnonymousClass004 r7) {
        C36321k7.A1B(r6, r7, r5, r3, r4);
        this.A04 = r6;
        this.A0A = r7;
        this.A00 = r5;
        this.A07 = r3;
        this.A08 = r4;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A06 = A0S;
        this.A09 = new AAH(this);
        this.A05 = C36431kI.A1I(new C22207AiU(this));
    }
}
