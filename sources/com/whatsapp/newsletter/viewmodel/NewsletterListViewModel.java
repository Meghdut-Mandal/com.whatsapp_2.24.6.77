package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass1GQ;
import X.AnonymousClass1ZX;
import X.AnonymousClass3KA;
import X.AnonymousClass4TL;
import X.AnonymousClass8fQ;
import X.C001700s;
import X.C178228fO;
import X.C178238fP;
import X.C21854Abe;
import X.C28981Uw;
import X.C30131Zi;
import X.C35741jB;
import X.C36321k7;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C51952oe;
import X.C62913Ia;
import X.C65903Tx;
import X.C71723hE;
import X.C84284Cq;
import X.C84294Cr;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

public class NewsletterListViewModel extends AnonymousClass04R implements AnonymousClass01Y, AnonymousClass4TL {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final AnonymousClass1ZX A02;
    public final C71723hE A03;
    public final C30131Zi A04;

    public final void A0S(C28981Uw r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04.A0A(r2);
    }

    public final void A0T(C28981Uw r5) {
        AnonymousClass00C.A0D(r5, 0);
        C30131Zi r3 = this.A04;
        AnonymousClass1GQ r1 = r3.A0G;
        if (C36391kE.A1Z(r1) && C65903Tx.A06(r3.A0C, r5, r1)) {
            r3.A0S.Boy(new C35741jB(r3, r5, 26));
        }
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        int A06 = C36431kI.A06(r4, 1);
        if (A06 == 2) {
            A02(new C84284Cq(this), false);
        } else if (A06 == 3) {
            A02(new C84294Cr(this), true);
        }
    }

    private final int A01(C51952oe r3, Throwable th) {
        C21854Abe abe;
        if ((th instanceof C178238fP) && (abe = (C21854Abe) th) != null && abe.code == 419) {
            return R.string.f12nameremoved;
        }
        switch (r3.ordinal()) {
            case 0:
                return R.string.f12nameremoved;
            case 1:
                return R.string.f12nameremoved;
            case 2:
                return R.string.f12nameremoved;
            case 3:
                return R.string.f12nameremoved;
            case 4:
                return R.string.f12nameremoved;
            case 5:
                return R.string.f12nameremoved;
            default:
                throw C36441kJ.A18();
        }
    }

    private final void A02(AnonymousClass00S r4, boolean z) {
        Iterable A0X = C36421kH.A0X(this.A02);
        boolean z2 = false;
        if (!(A0X instanceof Collection) || !((Collection) A0X).isEmpty()) {
            Iterator it = A0X.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass00C.A0J(it.next(), this)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 == z) {
            r4.invoke();
        }
    }

    public void BQf(C28981Uw r9, C51952oe r10, Throwable th) {
        int A012;
        int A013;
        C28981Uw r2 = r9;
        if (this.A03.A01(r9) != null) {
            boolean z = !(th instanceof C178238fP);
            boolean z2 = th instanceof C178228fO;
            boolean z3 = th instanceof AnonymousClass8fQ;
            C51952oe r3 = r10;
            if (z2) {
                A012 = R.string.f12nameremoved;
                A013 = R.string.f12nameremoved;
            } else {
                A012 = A01(r10, th);
                if (z3) {
                    A013 = R.string.f12nameremoved;
                } else {
                    A013 = A01(r10, th);
                }
            }
            this.A01.A0C(new AnonymousClass3KA(r2, r3, A012, A013, z, z2));
        }
    }

    public void BQi(C28981Uw r3, C51952oe r4) {
        this.A00.A0C(new C62913Ia(r3, r4));
        if (r4 == C51952oe.UNFOLLOW) {
            this.A04.A06(r3);
        }
    }

    public NewsletterListViewModel(AnonymousClass1ZX r2, C71723hE r3, C30131Zi r4) {
        C36321k7.A11(r3, r4, r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
