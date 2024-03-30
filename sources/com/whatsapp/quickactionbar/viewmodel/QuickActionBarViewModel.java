package com.whatsapp.quickactionbar.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05I;
import X.AnonymousClass05J;
import X.AnonymousClass0W6;
import X.C005502l;
import X.C009403z;
import X.C023109s;
import X.C023509x;
import X.C07360Xi;
import X.C13090j9;
import X.C15350nC;
import X.C228016a;
import X.C36321k7;

public final class QuickActionBarViewModel extends AnonymousClass04R {
    public final C228016a A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass05J A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final C005502l A06;
    public final C005502l A07;
    public final AnonymousClass05I A08;

    public QuickActionBarViewModel(C228016a r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, C005502l r11, C005502l r12) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A19(r11, r12, r7, r8);
        C36321k7.A10(r9, r10);
        this.A00 = r6;
        this.A07 = r11;
        this.A06 = r12;
        this.A01 = r7;
        this.A05 = r8;
        this.A04 = r9;
        this.A02 = r10;
        C15350nC r1 = new C15350nC(C023109s.A00, 0, 0);
        this.A03 = r1;
        this.A08 = C07360Xi.A00(C009403z.A02(r11), new C13090j9(new QuickActionBarViewModel$actionBarState$1((C023509x) null), r1), AnonymousClass0W6.A01, 1);
    }
}
