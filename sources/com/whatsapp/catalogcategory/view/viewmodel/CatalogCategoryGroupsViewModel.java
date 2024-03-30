package com.whatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass04R;
import X.AnonymousClass67M;
import X.AnonymousClass7QH;
import X.AnonymousClass8X8;
import X.AnonymousClass8X9;
import X.AnonymousClass96C;
import X.C001600r;
import X.C001700s;
import X.C128506Cn;
import X.C1502474n;
import X.C187808yZ;
import X.C19770wU;
import X.C198849eI;
import X.C28201Rs;
import X.C36321k7;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class CatalogCategoryGroupsViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001700s A03;
    public final C198849eI A04;
    public final AnonymousClass67M A05;
    public final C19770wU A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass96C A08;
    public final C28201Rs A09;

    public final void A0S(UserJid userJid, List list) {
        AnonymousClass00C.A0D(list, 0);
        C36341k9.A18(this.A03, false);
        this.A06.Boy(new C1502474n(this, list, userJid, 34));
    }

    public static final void A01(C128506Cn r4, CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, int i) {
        Object r1;
        C187808yZ r2 = C187808yZ.CATALOG_CATEGORY_FLOW;
        C28201Rs r3 = catalogCategoryGroupsViewModel.A09;
        if (r4.A04) {
            r1 = new AnonymousClass8X9(userJid, r4.A01, r4.A02, i);
        } else {
            r1 = new AnonymousClass8X8(r2, userJid, r4.A01);
        }
        r3.A0D(r1);
    }

    public CatalogCategoryGroupsViewModel(C198849eI r2, AnonymousClass67M r3, AnonymousClass96C r4, C19770wU r5) {
        C36321k7.A0y(r5, r2);
        this.A06 = r5;
        this.A05 = r3;
        this.A04 = r2;
        this.A08 = r4;
        AnonymousClass00U A1I = C36431kI.A1I(AnonymousClass7QH.A00);
        this.A07 = A1I;
        this.A00 = (C001600r) A1I.getValue();
        C28201Rs A0t = C36441kJ.A0t();
        this.A09 = A0t;
        this.A01 = A0t;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A02 = A0S;
    }
}
