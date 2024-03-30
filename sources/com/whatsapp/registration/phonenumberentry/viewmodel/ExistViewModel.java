package com.whatsapp.registration.phonenumberentry.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass08M;
import X.C001700s;
import X.C36361kB;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;

public final class ExistViewModel extends AnonymousClass04R {
    public final C001700s A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02;
    public final C001700s A03;
    public final C001700s A04;
    public final C001700s A05;
    public final C001700s A06;
    public final C001700s A07 = C36441kJ.A0Z(0);
    public final C001700s A08;
    public final C001700s A09;
    public final C001700s A0A;
    public final C001700s A0B;
    public final C001700s A0C;
    public final C001700s A0D;
    public final C001700s A0E;
    public final C001700s A0F;
    public final C001700s A0G;

    public ExistViewModel(AnonymousClass08M r4) {
        AnonymousClass00C.A0D(r4, 1);
        this.A03 = r4.A01("countryCodeLiveData");
        this.A09 = r4.A01("phoneNumberLiveData");
        this.A02 = C36431kI.A0S();
        this.A0B = C36441kJ.A0Z(C36411kG.A0t());
        this.A0G = C36441kJ.A0Z(0);
        this.A06 = C36441kJ.A0Z(-1);
        this.A0A = C36441kJ.A0Z(false);
        this.A0F = C36441kJ.A0Z(C36401kF.A0h());
        this.A0E = C36441kJ.A0Z(0);
        this.A0C = C36431kI.A0S();
        this.A04 = C36441kJ.A0Z(false);
        this.A05 = C36441kJ.A0Z(false);
        this.A00 = C36431kI.A0S();
        this.A0D = C36441kJ.A0Z(false);
        this.A08 = C36431kI.A0S();
    }

    public final int A0S() {
        return C36361kB.A03(this.A0G);
    }
}
