package com.whatsapp.companiondevice;

import X.AnonymousClass001;
import X.AnonymousClass08X;
import X.AnonymousClass143;
import X.AnonymousClass17Y;
import X.AnonymousClass3SB;
import X.C19460v5;
import X.C19770wU;
import X.C224714l;
import X.C236419g;
import X.C236919l;
import X.C28201Rs;
import X.C32041cr;
import X.C36331k8;
import X.C36441kJ;
import X.C49222il;
import X.C70043eV;
import X.C81093wS;
import android.app.Application;
import java.util.List;

public class LinkedDevicesViewModel extends AnonymousClass08X {
    public List A00 = AnonymousClass001.A0I();
    public final C19460v5 A01;
    public final C32041cr A02 = new C70043eV(this);
    public final C236419g A03;
    public final C236919l A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final C28201Rs A06 = C36441kJ.A0t();
    public final C28201Rs A07 = C36441kJ.A0t();
    public final C28201Rs A08 = C36441kJ.A0t();
    public final C19770wU A09;
    public final AnonymousClass17Y A0A;

    public int A0S() {
        int i = 0;
        for (AnonymousClass3SB r1 : this.A00) {
            if (!r1.A02() && !AnonymousClass143.A0I(r1.A07)) {
                i++;
            }
        }
        return i;
    }

    public LinkedDevicesViewModel(Application application, C19460v5 r3, AnonymousClass17Y r4, C236419g r5, C236919l r6, C19770wU r7) {
        super(application);
        this.A0A = r4;
        this.A09 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
    }

    public void A0T() {
        if (C224714l.A02()) {
            C36331k8.A1F(new C49222il(this.A01, this.A02, this.A03), this.A09);
            return;
        }
        C81093wS.A00(this.A0A, this, 49);
    }
}
