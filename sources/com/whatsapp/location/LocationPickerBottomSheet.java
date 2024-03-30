package com.whatsapp.location;

import X.AnonymousClass1XN;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C235618y;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C64813Pn;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;

public class LocationPickerBottomSheet extends LocationPicker {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A0F = C36351kA.A0W(A0B);
            this.A0H = C36351kA.A0a(A0B);
            this.A08 = C36381kD.A0U(A0B);
            this.A0M = C36351kA.A0g(A0B);
            this.A09 = C36361kB.A0T(A0B);
            this.A0N = C90494aF.A0L(A0B);
            this.A0K = (AnonymousClass1XN) A0B.A7G.get();
            this.A0I = C36371kC.A0b(r1);
            this.A0R = C36411kG.A0m(A0B);
            this.A0A = C36361kB.A0V(A0B);
            this.A0V = C36331k8.A0I(A0B);
            this.A0U = C36351kA.A0n(A0B);
            this.A0C = (C235618y) A0B.A15.get();
            this.A0S = C90494aF.A0P(A0B);
            this.A0L = C36351kA.A0f(r1);
            this.A0B = C36371kC.A0U(A0B);
            this.A0G = C36351kA.A0X(A0B);
            this.A07 = C90484aE.A0T(A0B);
            this.A0W = (C64813Pn) r1.A9Z.get();
            this.A0Q = C36411kG.A0l(A0B);
            this.A0T = C36351kA.A0m(A0B);
            this.A0D = C90504aG.A0M(A0B);
            this.A0J = C36351kA.A0c(r1);
            this.A0E = C90474aD.A0R(r1);
        }
    }

    public LocationPickerBottomSheet(int i) {
        this.A00 = false;
        C163027pX.A00(this, 35);
    }

    public LocationPickerBottomSheet() {
        this(0);
    }
}
