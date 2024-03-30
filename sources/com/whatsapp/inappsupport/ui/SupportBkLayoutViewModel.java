package com.whatsapp.inappsupport.ui;

import X.AnonymousClass005;
import X.C28201Rs;
import X.C33761ft;
import X.C36321k7;
import X.C36441kJ;
import X.C45582Rx;
import X.C95474lE;

public final class SupportBkLayoutViewModel extends C95474lE {
    public String A00;
    public String A01 = "";
    public final C28201Rs A02 = C36441kJ.A0t();
    public final C33761ft A03;

    public static final void A01(SupportBkLayoutViewModel supportBkLayoutViewModel, String str, int i) {
        C33761ft r4 = supportBkLayoutViewModel.A03;
        String str2 = supportBkLayoutViewModel.A01;
        String str3 = supportBkLayoutViewModel.A00;
        C45582Rx r1 = new C45582Rx();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = str2;
        if (str != null) {
            r1.A05 = str;
        }
        if (str3 != null) {
            r1.A03 = str3;
        }
        r4.A00.Blv(r1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportBkLayoutViewModel(C33761ft r2, AnonymousClass005 r3) {
        super(r3);
        C36321k7.A0x(r3, r2);
        this.A03 = r2;
    }
}
