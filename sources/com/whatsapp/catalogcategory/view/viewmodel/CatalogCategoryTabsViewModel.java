package com.whatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass04R;
import X.AnonymousClass67M;
import X.AnonymousClass6CI;
import X.AnonymousClass7QI;
import X.C001600r;
import X.C116835lH;
import X.C19770wU;
import X.C198849eI;
import X.C36321k7;
import X.C36431kI;
import java.util.Iterator;
import java.util.List;

public final class CatalogCategoryTabsViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C198849eI A01;
    public final C116835lH A02;
    public final AnonymousClass67M A03;
    public final C19770wU A04;
    public final AnonymousClass00T A05;

    public static final int A01(String str, List list) {
        AnonymousClass00C.A0D(str, 1);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AnonymousClass00C.A0J(((AnonymousClass6CI) it.next()).A01, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public CatalogCategoryTabsViewModel(C198849eI r2, C116835lH r3, AnonymousClass67M r4, C19770wU r5) {
        C36321k7.A0y(r5, r2);
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        AnonymousClass00U A1I = C36431kI.A1I(AnonymousClass7QI.A00);
        this.A05 = A1I;
        this.A00 = (C001600r) A1I.getValue();
    }
}
