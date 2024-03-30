package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass1EU;
import X.AnonymousClass1YN;
import X.AnonymousClass2ZN;
import X.AnonymousClass75B;
import X.B7G;
import X.C131606Ps;
import X.C19770wU;
import X.C22293Aju;
import X.C22294Ajv;
import X.C22295Ajw;
import X.C22296Ajx;
import X.C22955Az7;
import X.C23075B3f;
import X.C23216B9y;
import X.C29231Vv;
import X.C32971eV;
import X.C36321k7;
import X.C36361kB;
import X.C36431kI;
import X.C61233Bb;

public final class PaymentMerchantAccountViewModel extends AnonymousClass04R {
    public final C29231Vv A00;
    public final AnonymousClass1EU A01;
    public final C23075B3f A02;
    public final C32971eV A03;
    public final C19770wU A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(C22293Aju.A00);
    public final AnonymousClass00T A06 = C36431kI.A1I(C22294Ajv.A00);
    public final AnonymousClass00T A07 = C36431kI.A1I(C22295Ajw.A00);
    public final AnonymousClass00T A08 = C36431kI.A1I(C22296Ajx.A00);
    public final C61233Bb A09;
    public final AnonymousClass2ZN A0A;
    public final C22955Az7 A0B;
    public final AnonymousClass1YN A0C;

    public final void A0S(int i) {
        this.A02.BOp((C131606Ps) null, C36361kB.A0i(), Integer.valueOf(i), "business_hub", (String) null);
    }

    public void A0R() {
        this.A0C.unregisterObserver(this.A0B);
        this.A0A.unregisterObserver(this.A09);
    }

    public final void A0T(boolean z) {
        this.A04.Bp1(new AnonymousClass75B(47, (Object) this, z));
    }

    public PaymentMerchantAccountViewModel(AnonymousClass2ZN r4, C29231Vv r5, AnonymousClass1YN r6, AnonymousClass1EU r7, C23075B3f b3f, C32971eV r9, C19770wU r10) {
        C36321k7.A1B(r10, r7, b3f, r4, r9);
        C36321k7.A10(r5, r6);
        this.A04 = r10;
        this.A01 = r7;
        this.A02 = b3f;
        this.A0A = r4;
        this.A03 = r9;
        this.A00 = r5;
        this.A0C = r6;
        B7G b7g = new B7G(this, 6);
        this.A09 = b7g;
        C23216B9y b9y = new C23216B9y(this, 1);
        this.A0B = b9y;
        r6.registerObserver(b9y);
        r4.registerObserver(b7g);
    }
}
