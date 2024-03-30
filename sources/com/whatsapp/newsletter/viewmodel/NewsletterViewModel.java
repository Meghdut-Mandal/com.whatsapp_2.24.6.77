package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass08S;
import X.AnonymousClass0VV;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass1ZX;
import X.AnonymousClass3CC;
import X.AnonymousClass3E9;
import X.AnonymousClass3IZ;
import X.AnonymousClass3JI;
import X.AnonymousClass3R7;
import X.AnonymousClass4ZI;
import X.C001600r;
import X.C001700s;
import X.C109325Xd;
import X.C28981Uw;
import X.C30131Zi;
import X.C36321k7;
import X.C36401kF;
import X.C36431kI;
import X.C44072La;
import X.C51952oe;
import X.C52512pY;
import X.C71723hE;
import X.C86784Mg;
import java.util.Iterator;
import java.util.List;

public final class NewsletterViewModel extends NewsletterListViewModel {
    public final C001600r A00;
    public final C001600r A01;
    public final C001700s A02;
    public final C001700s A03;
    public final AnonymousClass16D A04;
    public final C28981Uw A05;
    public final AnonymousClass3E9 A06;

    public final void A0V(C44072La r7, C52512pY r8, Long l, AnonymousClass00S r10) {
        Object obj;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass11F A062 = r7.A06();
        AnonymousClass00C.A08(A062);
        C001700s r4 = this.A02;
        List A0w = C36401kF.A0w(r4);
        if (A0w != null) {
            Iterator it = A0w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AnonymousClass00C.A0J(((AnonymousClass3JI) obj).A02.A06(), A062)) {
                    break;
                }
            }
            AnonymousClass3JI r2 = (AnonymousClass3JI) obj;
            if (r2 != null) {
                r2.A01 = true;
                AnonymousClass3R7.A00(r4);
                this.A06.A00(r7, r8, l, new C86784Mg(this, r2, r10));
            }
        }
    }

    public final AnonymousClass08S A0U() {
        return AnonymousClass0VV.A00(new AnonymousClass4ZI(this, 11), this.A03.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterViewModel(AnonymousClass3CC r2, AnonymousClass16D r3, C28981Uw r4, AnonymousClass1ZX r5, C71723hE r6, C30131Zi r7) {
        super(r5, r6, r7);
        C36321k7.A1B(r6, r7, r5, r2, r3);
        this.A04 = r3;
        this.A05 = r4;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A01 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A02 = A0S2;
        this.A00 = A0S2;
        this.A06 = r2.A00(C109325Xd.A00(this));
    }

    public void BQf(C28981Uw r2, C51952oe r3, Throwable th) {
        if (AnonymousClass00C.A0J(r2, AnonymousClass3IZ.A00(this).A06())) {
            super.BQf(r2, r3, th);
        }
    }

    public void BQi(C28981Uw r2, C51952oe r3) {
        if (AnonymousClass00C.A0J(r2, AnonymousClass3IZ.A00(this).A06())) {
            super.BQi(r2, r3);
        }
    }
}
