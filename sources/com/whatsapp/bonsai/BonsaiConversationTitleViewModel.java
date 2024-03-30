package com.whatsapp.bonsai;

import X.AVW;
import X.AnonymousClass04R;
import X.AnonymousClass17Y;
import X.AnonymousClass1DP;
import X.AnonymousClass1K3;
import X.AnonymousClass2Wx;
import X.C001700s;
import X.C007103b;
import X.C34831hi;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C51132nK;
import X.C51142nL;
import com.whatsapp.jid.UserJid;

public final class BonsaiConversationTitleViewModel extends AnonymousClass04R {
    public C51132nK A00;
    public UserJid A01;
    public boolean A02;
    public final C001700s A03 = C36441kJ.A0Z(C51142nL.TAP_FOR_INFO);
    public final AnonymousClass2Wx A04 = new AnonymousClass2Wx(this, 0);
    public final AnonymousClass1K3 A05;
    public final AnonymousClass1DP A06;
    public final C34831hi A07;
    public final C34831hi A08;
    public final C34831hi A09;
    public final C34831hi A0A;
    public final AnonymousClass17Y A0B;

    public static final void A01(C51132nK r3, BonsaiConversationTitleViewModel bonsaiConversationTitleViewModel) {
        if (bonsaiConversationTitleViewModel.A03.A04() != C51142nL.AI) {
            C51132nK[] r2 = new C51132nK[2];
            r2[0] = null;
            if (C36421kH.A0i(C51132nK.CENTER, r2, 1).contains(bonsaiConversationTitleViewModel.A00) && r3 == C51132nK.END) {
                bonsaiConversationTitleViewModel.A0B.A0I(new AVW(bonsaiConversationTitleViewModel, 44), 3000);
            }
        }
    }

    public static final void A02(BonsaiConversationTitleViewModel bonsaiConversationTitleViewModel) {
        C34831hi r0;
        boolean z = bonsaiConversationTitleViewModel.A02;
        Integer A0r = C36391kE.A0r();
        if (z) {
            bonsaiConversationTitleViewModel.A09.A0D(A0r);
            bonsaiConversationTitleViewModel.A08.A0D(A0r);
            bonsaiConversationTitleViewModel.A0A.A0D(A0r);
            r0 = bonsaiConversationTitleViewModel.A07;
        } else {
            C34831hi r02 = bonsaiConversationTitleViewModel.A07;
            Integer A0m = C36381kD.A0m();
            r02.A0D(A0m);
            boolean BLC = bonsaiConversationTitleViewModel.A05.BLC(bonsaiConversationTitleViewModel.A01);
            C34831hi r03 = bonsaiConversationTitleViewModel.A09;
            if (BLC) {
                r03.A0D(A0r);
                C51132nK r1 = bonsaiConversationTitleViewModel.A00;
                if (r1 == C51132nK.CENTER) {
                    C36341k9.A16(bonsaiConversationTitleViewModel.A08, 4);
                    bonsaiConversationTitleViewModel.A0A.A0D(A0m);
                    return;
                } else if (r1 == C51132nK.END) {
                    bonsaiConversationTitleViewModel.A08.A0D(A0m);
                    r0 = bonsaiConversationTitleViewModel.A0A;
                } else {
                    return;
                }
            } else {
                r03.A0D(A0m);
                bonsaiConversationTitleViewModel.A08.A0D(A0m);
                bonsaiConversationTitleViewModel.A0A.A0D(A0r);
                A01(C51132nK.END, bonsaiConversationTitleViewModel);
                return;
            }
        }
        r0.A0D(A0r);
    }

    public void A0R() {
        AnonymousClass1DP r2 = this.A06;
        Iterable A0X = C36421kH.A0X(r2);
        AnonymousClass2Wx r1 = this.A04;
        if (C007103b.A0j(A0X, r1)) {
            r2.unregisterObserver(r1);
        }
    }

    public BonsaiConversationTitleViewModel(AnonymousClass17Y r4, AnonymousClass1K3 r5, AnonymousClass1DP r6) {
        C36321k7.A11(r4, r5, r6);
        this.A0B = r4;
        this.A05 = r5;
        this.A06 = r6;
        Integer A0r = C36391kE.A0r();
        this.A09 = C36441kJ.A0s(A0r);
        Integer A0m = C36381kD.A0m();
        this.A07 = C36441kJ.A0s(A0m);
        this.A08 = C36441kJ.A0s(A0m);
        this.A0A = C36441kJ.A0s(A0r);
    }
}
