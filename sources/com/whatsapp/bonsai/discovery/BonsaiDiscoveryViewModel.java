package com.whatsapp.bonsai.discovery;

import X.AnonymousClass005;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass08S;
import X.AnonymousClass16D;
import X.AnonymousClass4I0;
import X.C001700s;
import X.C132326Tc;
import X.C19770wU;
import X.C21010yW;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C53102qm;
import X.C55492ui;
import java.util.concurrent.atomic.AtomicInteger;

public final class BonsaiDiscoveryViewModel extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02;
    public final C132326Tc A03;
    public final AnonymousClass16D A04;
    public final C21010yW A05;
    public final C34831hi A06;
    public final C19770wU A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass00T A09;
    public final AtomicInteger A0A;

    public BonsaiDiscoveryViewModel(C132326Tc r6, AnonymousClass16D r7, C21010yW r8, C19770wU r9, AnonymousClass005 r10) {
        int A042 = C36361kB.A04(r9, r8, 1);
        C36321k7.A17(r7, r6, r10, 3);
        this.A07 = r9;
        this.A05 = r8;
        this.A04 = r7;
        this.A03 = r6;
        this.A08 = r10;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A00 = A0Y;
        this.A06 = C36441kJ.A0s(Integer.valueOf(A042));
        this.A02 = C36431kI.A0S();
        this.A0A = new AtomicInteger(0);
        this.A09 = C36431kI.A1I(AnonymousClass4I0.A00);
        A0Y.A0F(r6.A00, new C55492ui(C53102qm.A02(this, 6), 35));
    }

    public static final void A01(BonsaiDiscoveryViewModel bonsaiDiscoveryViewModel) {
        AtomicInteger atomicInteger = bonsaiDiscoveryViewModel.A0A;
        if (atomicInteger.get() >= 3 || atomicInteger.getAndIncrement() >= 3) {
            C36331k8.A13(bonsaiDiscoveryViewModel.A01);
        } else {
            bonsaiDiscoveryViewModel.A03.A02();
        }
    }
}
