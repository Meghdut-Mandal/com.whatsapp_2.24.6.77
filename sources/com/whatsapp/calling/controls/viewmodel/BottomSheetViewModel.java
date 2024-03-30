package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass13J;
import X.AnonymousClass6OZ;
import X.AnonymousClass6PI;
import X.C001700s;
import X.C105545Fb;
import X.C131856Qx;
import X.C21060yb;
import X.C34831hi;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C95504lc;

public class BottomSheetViewModel extends C95504lc {
    public AnonymousClass6PI A00;
    public boolean A01;
    public boolean A02;
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36431kI.A0S();
    public final C001700s A06 = C36431kI.A0S();
    public final C105545Fb A07;
    public final C21060yb A08;
    public final C34831hi A09;
    public final C34831hi A0A;
    public final C34831hi A0B;
    public final AnonymousClass13J A0C;

    public static boolean A06(AnonymousClass6OZ r3, BottomSheetViewModel bottomSheetViewModel) {
        AnonymousClass6PI r0 = bottomSheetViewModel.A00;
        if (r0 == null || r0.A00 != 2) {
            if (C131856Qx.A00(r3.A09) && r3.A0J) {
                return true;
            }
            if (r3.A0I || bottomSheetViewModel.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A0R() {
        this.A07.unregisterObserver(this);
    }

    public BottomSheetViewModel(C105545Fb r3, C21060yb r4, AnonymousClass13J r5) {
        Boolean A0j = C36381kD.A0j();
        this.A0A = C36441kJ.A0s(A0j);
        this.A0B = C36441kJ.A0s(A0j);
        this.A09 = C36441kJ.A0s(A0j);
        this.A07 = r3;
        this.A0C = r5;
        this.A08 = r4;
        r3.registerObserver(this);
        C95504lc.A02(r3, this);
    }
}
