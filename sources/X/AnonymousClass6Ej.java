package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.6Ej  reason: invalid class name */
public abstract class AnonymousClass6Ej {
    public final C001700s A00 = C36431kI.A0S();
    public final C29301Wc A01;
    public final C20720y3 A02;
    public final C20280xJ A03;
    public final AnonymousClass3HJ A04;
    public final C19770wU A05;
    public final AnonymousClass005 A06;

    public void A00() {
        if (this instanceof AnonymousClass5JW) {
            AnonymousClass5JW r0 = (AnonymousClass5JW) this;
            r0.A05.Box(new AnonymousClass5JU(r0), C90524aI.A0w());
            return;
        }
        AnonymousClass5JX r6 = (AnonymousClass5JX) this;
        if (r6.A00) {
            C1496972k r2 = new C1496972k(r6, 5);
            C1496972k r1 = new C1496972k(r6, 7);
            AnonymousClass1CY r7 = r6.A06;
            C35631j0 r4 = new C35631j0(r7, r1, r2, 1);
            File A0H = C29301Wc.A00(r6.A01).A09.A0H();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = AnonymousClass6YO.A06(AnonymousClass5U6.A01()).iterator();
            while (it.hasNext()) {
                A0I.addAll(AnonymousClass6YO.A08(A0H, Collections.singletonList(it.next())));
            }
            if (r7.A00(r4, A0I) != 0) {
                r6.A04.sendEmptyMessageDelayed(1, 32000);
                return;
            }
        }
        r6.A05.Box(new AnonymousClass5JV(r6, r6.A0C, r6.A00, r6.A0B), new Object[0]);
    }

    public void A01() {
        if (!(this instanceof AnonymousClass5JW)) {
            ((AnonymousClass5JX) this).A03.A00.A3j();
        }
    }

    public void A02() {
        if (!((C29501Ww) this.A06.get()).A0G()) {
            C36341k9.A17(this.A00, 0);
        } else {
            A00();
        }
    }

    public void A03(C131006Ni r3) {
        if (this instanceof AnonymousClass5JW) {
            boolean A002 = r3.A00();
            C105535Fa r1 = ((AnonymousClass5JW) this).A04;
            if (A002) {
                r1.A01();
            } else {
                r1.A02(202);
            }
        } else {
            ((AnonymousClass5JX) this).A03.A00.A3k(r3);
        }
    }

    public AnonymousClass6Ej(C29301Wc r2, C20720y3 r3, C20280xJ r4, AnonymousClass3HJ r5, C19770wU r6, AnonymousClass005 r7) {
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
    }
}
