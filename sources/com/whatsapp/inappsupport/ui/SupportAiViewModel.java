package com.whatsapp.inappsupport.ui;

import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass3AY;
import X.AnonymousClass3E6;
import X.AnonymousClass4U7;
import X.AnonymousClass4YE;
import X.C001700s;
import X.C19770wU;
import X.C20310xM;
import X.C20810yC;
import X.C220412q;
import X.C24381Cf;
import X.C24521Ct;
import X.C28201Rs;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C80253v6;
import X.C80293vA;
import com.whatsapp.util.Log;

public final class SupportAiViewModel extends AnonymousClass04R implements AnonymousClass4U7 {
    public AnonymousClass11F A00;
    public boolean A01;
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass17Y A04;
    public final C220412q A05;
    public final C24521Ct A06 = new AnonymousClass4YE(this, 14);
    public final C24381Cf A07;
    public final C20310xM A08;
    public final AnonymousClass3AY A09;
    public final AnonymousClass3E6 A0A;
    public final C28201Rs A0B = C36441kJ.A0t();
    public final C28201Rs A0C = C36441kJ.A0t();
    public final C19770wU A0D;
    public final C20810yC A0E;

    public static final boolean A01(SupportAiViewModel supportAiViewModel, boolean z) {
        AnonymousClass11F r1;
        if (supportAiViewModel.A01) {
            return true;
        }
        boolean A0E2 = supportAiViewModel.A0E.A0E(819);
        if (!A0E2 || (r1 = supportAiViewModel.A00) == null || !supportAiViewModel.A05.A0M(r1)) {
            if (z || !A0E2 || supportAiViewModel.A00 == null) {
                Log.i("SupportAiViewModel/openChatOrShowTicketHaveCreatedDialog - showing dialog");
                C36341k9.A18(supportAiViewModel.A03, false);
                supportAiViewModel.A0C.A0D((Object) null);
            }
            return supportAiViewModel.A01;
        }
        Log.i("SupportAiViewModel/openChatOrShowTicketCreatedDialog - opening chat");
        C36341k9.A18(supportAiViewModel.A03, false);
        AnonymousClass11F r12 = supportAiViewModel.A00;
        if (r12 != null) {
            supportAiViewModel.A02.A0D(r12);
        }
        supportAiViewModel.A01 = true;
        return supportAiViewModel.A01;
    }

    public void BTR() {
        Log.i("SupportAiViewModel/onChatSupportTicketCreationDeliveryFailure");
        C36341k9.A18(this.A03, false);
        this.A0B.A0D((Object) null);
    }

    public void BTS(int i) {
        Log.i("SupportAiViewModel/onChatSupportTicketCreationError");
        C36341k9.A18(this.A03, false);
        this.A0B.A0D((Object) null);
    }

    public void BTT(AnonymousClass11F r6) {
        AnonymousClass11F r2;
        Log.i("SupportAiViewModel/onChatSupportTicketCreationSuccess");
        this.A00 = r6;
        boolean z = false;
        this.A01 = false;
        if (!(r6 == null || !this.A05.A0M(r6) || (r2 = this.A00) == null)) {
            C80293vA.A00(this.A0D, this, r2, 18);
        }
        C24381Cf r3 = this.A07;
        C24521Ct r22 = this.A06;
        r3.registerObserver(r22);
        int A072 = this.A0E.A07(974);
        int i = 0;
        if (0 < A072) {
            i = A072;
        } else {
            z = true;
        }
        if (!A01(this, z)) {
            this.A04.A0I(new C80253v6(this, 30), (long) i);
        } else {
            r3.unregisterObserver(r22);
        }
    }

    public SupportAiViewModel(AnonymousClass17Y r3, C220412q r4, C24381Cf r5, C20310xM r6, C20810yC r7, AnonymousClass3AY r8, AnonymousClass3E6 r9, C19770wU r10) {
        C36321k7.A1B(r3, r5, r9, r7, r4);
        C36361kB.A1J(r10, 7, r6);
        this.A04 = r3;
        this.A07 = r5;
        this.A0A = r9;
        this.A0E = r7;
        this.A05 = r4;
        this.A09 = r8;
        this.A0D = r10;
        this.A08 = r6;
    }
}
