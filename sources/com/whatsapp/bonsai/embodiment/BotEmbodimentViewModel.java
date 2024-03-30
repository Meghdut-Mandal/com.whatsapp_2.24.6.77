package com.whatsapp.bonsai.embodiment;

import X.AVW;
import X.AnonymousClass005;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass16J;
import X.AnonymousClass17Y;
import X.AnonymousClass48P;
import X.AnonymousClass48Q;
import X.C001700s;
import X.C007103b;
import X.C1501874h;
import X.C19770wU;
import X.C20810yC;
import X.C34831hi;
import X.C36321k7;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90394a5;
import com.whatsapp.jid.UserJid;

public final class BotEmbodimentViewModel extends AnonymousClass04R {
    public UserJid A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass17Y A03;
    public final C20810yC A04;
    public final C34831hi A05 = C36441kJ.A0s(C36381kD.A0m());
    public final AnonymousClass005 A06;
    public final Runnable A07 = new AVW(this, 47);
    public final Runnable A08 = new AVW(this, 48);
    public final AnonymousClass00T A09 = C36431kI.A1I(new AnonymousClass48P(this));
    public final AnonymousClass00T A0A = C36431kI.A1I(new AnonymousClass48Q(this));
    public final C90394a5 A0B = C90394a5.A00(this, 1);
    public final AnonymousClass16J A0C;
    public final C19770wU A0D;

    public void A0R() {
        AnonymousClass16J r2 = this.A0C;
        Iterable A0X = C36421kH.A0X(r2);
        C90394a5 r1 = this.A0B;
        if (C007103b.A0j(A0X, r1)) {
            r2.unregisterObserver(r1);
        }
    }

    public final void A0S(AnonymousClass11F r4) {
        if (r4 instanceof UserJid) {
            AnonymousClass16J r2 = this.A0C;
            Iterable A0X = C36421kH.A0X(r2);
            C90394a5 r1 = this.A0B;
            if (!C007103b.A0j(A0X, r1)) {
                r2.registerObserver(r1);
            }
            this.A00 = (UserJid) r4;
            this.A0D.Bp1(new C1501874h(this, r4, 10));
        }
    }

    public BotEmbodimentViewModel(AnonymousClass17Y r3, AnonymousClass16J r4, C20810yC r5, C19770wU r6, AnonymousClass005 r7) {
        C36321k7.A1B(r5, r3, r6, r4, r7);
        this.A04 = r5;
        this.A03 = r3;
        this.A0D = r6;
        this.A0C = r4;
        this.A06 = r7;
    }
}
