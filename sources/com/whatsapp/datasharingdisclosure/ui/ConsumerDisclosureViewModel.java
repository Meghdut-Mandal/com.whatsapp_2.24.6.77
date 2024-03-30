package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass35I;
import X.AnonymousClass3EX;
import X.C023509x;
import X.C19970wo;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C64733Pf;
import com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1;

public final class ConsumerDisclosureViewModel extends AnonymousClass04R {
    public final C64733Pf A00;

    public ConsumerDisclosureViewModel(C64733Pf r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A0S(AnonymousClass11F r7, Boolean bool) {
        C64733Pf r5 = this.A00;
        AnonymousClass3EX r4 = (AnonymousClass3EX) r5.A06.getValue();
        AnonymousClass35I r3 = r4.A02;
        C36341k9.A0w(C36351kA.A0A(r3.A01), "consumer_disclosure", C19970wo.A00(r4.A00));
        C36331k8.A1T(new ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1(r4, (C023509x) null), r4.A04);
        if (r7 != null && bool != null) {
            r5.A01(r7, bool.booleanValue());
        }
    }
}
