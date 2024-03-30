package com.whatsapp.businessupsell;

import X.AnonymousClass155;
import X.AnonymousClass2PD;
import X.C18800tq;
import X.C18830tt;
import X.C21010yW;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C61673Cz;
import X.C89314Wb;
import android.os.Bundle;
import com.whatsapp.R;

public class BusinessAppEducation extends AnonymousClass155 {
    public C21010yW A00;
    public C61673Cz A01;
    public boolean A02;

    public static void A01(BusinessAppEducation businessAppEducation, int i) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = C36431kI.A12();
        businessAppEducation.A00.Blw(r1);
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = C36351kA.A0g(r2);
            this.A01 = C27111My.A3Y(A0L);
        }
    }

    public BusinessAppEducation(int i) {
        this.A02 = false;
        C89314Wb.A00(this, 30);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36361kB.A17(findViewById(R.id.close), this, 27);
        C36361kB.A17(findViewById(R.id.install_smb_google_play), this, 28);
        A01(this, 1);
    }

    public BusinessAppEducation() {
        this(0);
    }
}
