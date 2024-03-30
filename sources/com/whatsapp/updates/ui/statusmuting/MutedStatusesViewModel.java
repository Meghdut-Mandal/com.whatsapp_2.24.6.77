package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass08S;
import X.AnonymousClass2L8;
import X.AnonymousClass3P0;
import X.AnonymousClass4ET;
import X.AnonymousClass4LZ;
import X.AnonymousClass4YN;
import X.C18830tt;
import X.C19770wU;
import X.C33301f4;
import X.C36321k7;
import X.C36351kA;
import X.C36431kI;
import X.C36441kJ;
import X.C57962z6;
import X.C65963Ud;
import X.C88194Rt;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class MutedStatusesViewModel extends AnonymousClass04R implements AnonymousClass01Y, C88194Rt {
    public AnonymousClass08S A00 = C36441kJ.A0Y();
    public AnonymousClass2L8 A01;
    public final AnonymousClass00T A02;
    public final C57962z6 A03;
    public final /* synthetic */ StatusesViewModel A04;

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        AnonymousClass3P0 r0;
        AnonymousClass00C.A0D(r2, 1);
        if (r2 == AnonymousClass05R.ON_PAUSE) {
            C36351kA.A1H(this.A01);
        } else if (r2 == AnonymousClass05R.ON_RESUME && (r0 = (AnonymousClass3P0) this.A04.A05.A04()) != null) {
            A01(r0, this);
        }
    }

    public void Bhb(AnonymousClass3P0 r2) {
        this.A04.Bhb(r2);
    }

    public static final void A01(AnonymousClass3P0 r5, MutedStatusesViewModel mutedStatusesViewModel) {
        C36351kA.A1H(mutedStatusesViewModel.A01);
        AnonymousClass2L8 r4 = new AnonymousClass2L8(r5, C18830tt.ADH(mutedStatusesViewModel.A03.A00.A01.A00));
        ((C33301f4) mutedStatusesViewModel.A02.getValue()).A00(new AnonymousClass4YN(mutedStatusesViewModel.A00, 2), r4);
        mutedStatusesViewModel.A01 = r4;
    }

    public MutedStatusesViewModel(C57962z6 r5, StatusesViewModel statusesViewModel, C19770wU r7) {
        C36321k7.A0x(r7, r5);
        this.A03 = r5;
        this.A04 = statusesViewModel;
        this.A02 = C36431kI.A1I(new AnonymousClass4ET(r7));
        C65963Ud.A02(statusesViewModel.A05, this.A00, new AnonymousClass4LZ(this), 37);
    }
}
