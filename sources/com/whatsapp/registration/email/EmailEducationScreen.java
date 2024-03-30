package com.whatsapp.registration.email;

import X.AnonymousClass155;
import X.AnonymousClass190;
import X.C18800tq;
import X.C18830tt;
import X.C194349Pi;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C67133Yq;
import X.C89364Wg;
import android.os.Bundle;
import com.whatsapp.R;

public final class EmailEducationScreen extends AnonymousClass155 {
    public int A00;
    public C194349Pi A01;
    public AnonymousClass190 A02;
    public String A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = C36351kA.A0h(A0B);
            this.A01 = C36411kG.A0f(r1);
        }
    }

    public EmailEducationScreen(int i) {
        this.A04 = false;
        C89364Wg.A00(this, 5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        this.A00 = C36431kI.A02(C36431kI.A0F(this, R.layout.f9nameremoved), "entrypoint");
        String A0u = C36391kE.A0u(this);
        this.A03 = A0u;
        C194349Pi r3 = this.A01;
        if (r3 != null) {
            C36401kF.A1G(r3, A0u, this.A00, 5, 8);
            C67133Yq.A00(C36361kB.A0G(this.A00, R.id.email_education_submit), this, 7);
            C67133Yq.A00(C36361kB.A0G(this.A00, R.id.email_education_skip), this, 6);
            return;
        }
        throw C36331k8.A0d("emailVerificationLogger");
    }

    public EmailEducationScreen() {
        this(0);
    }
}
