package com.whatsapp.catalogsearch.view.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass1KP;
import X.AnonymousClass8XW;
import X.AnonymousClass8XZ;
import X.C001600r;
import X.C174478Xa;
import X.C174488Xb;
import X.C174498Xc;
import X.C187818ya;
import X.C193109Jw;
import X.C193369Le;
import X.C197189bH;
import X.C197919cb;
import X.C207109uZ;
import X.C22150AhZ;
import X.C22271AjY;
import X.C36371kC;
import X.C36431kI;
import com.whatsapp.jid.UserJid;

public final class CatalogSearchViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C197189bH A02;
    public final AnonymousClass1KP A03;
    public final C193109Jw A04;
    public final C197919cb A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(C22271AjY.A00);
    public final AnonymousClass00T A07 = C36431kI.A1I(new C22150AhZ(this));

    public CatalogSearchViewModel(C197189bH r2, AnonymousClass1KP r3, C193109Jw r4, C197919cb r5) {
        AnonymousClass00C.A0D(r2, 3);
        this.A05 = r5;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r5.A00;
        this.A00 = r4.A00;
    }

    public final void A0S(C207109uZ r3, UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 1);
        if (!this.A03.A01(r3)) {
            A01(this, new C174478Xa(AnonymousClass8XW.A00));
            return;
        }
        A01(this, C174488Xb.A00);
        C197919cb.A00(C187818ya.START, this.A05, userJid, str);
    }

    public static final void A01(CatalogSearchViewModel catalogSearchViewModel, C193369Le r1) {
        ((C001600r) catalogSearchViewModel.A06.getValue()).A0D(r1);
    }

    public final void A0T(C207109uZ r4, String str) {
        if (str.length() == 0) {
            AnonymousClass1KP r2 = this.A03;
            A01(this, new AnonymousClass8XZ(AnonymousClass1KP.A00(r2, r4, "categories", r2.A01.A0E(1514))));
            this.A04.A01.A0D("");
            return;
        }
        C193109Jw r0 = this.A04;
        r0.A01.A0D(C36371kC.A0y(str));
        A01(this, C174498Xc.A00);
    }
}
