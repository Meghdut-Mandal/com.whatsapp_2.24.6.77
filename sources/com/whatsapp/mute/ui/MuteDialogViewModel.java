package com.whatsapp.mute.ui;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1CR;
import X.C007103b;
import X.C19420v0;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C24361Cd;
import X.C24381Cf;
import X.C32641dx;
import X.C36321k7;
import X.C36341k9;
import X.C51992oi;
import X.C52542pb;
import java.util.List;

public final class MuteDialogViewModel extends AnonymousClass04R {
    public C51992oi A00;
    public C52542pb A01 = C52542pb.A02;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass17Y A05;
    public final C19730wQ A06;
    public final C24361Cd A07;
    public final AnonymousClass16D A08;
    public final C19420v0 A09;
    public final C24381Cf A0A;
    public final AnonymousClass17X A0B;
    public final C20810yC A0C;
    public final C32641dx A0D;
    public final AnonymousClass1CR A0E;
    public final C19770wU A0F;
    public final C19970wo A0G;

    public final void A0S() {
        List list;
        AnonymousClass11F r1;
        C24381Cf r0;
        if (!this.A04 && !this.A03 && (list = this.A02) != null && (r1 = (AnonymousClass11F) C007103b.A0M(list)) != null && (r0 = this.A0A) != null) {
            r0.A02(r1);
        }
    }

    public MuteDialogViewModel(AnonymousClass17Y r2, C19730wQ r3, C24361Cd r4, AnonymousClass16D r5, C19970wo r6, C19420v0 r7, C24381Cf r8, AnonymousClass17X r9, C20810yC r10, C32641dx r11, AnonymousClass1CR r12, C19770wU r13) {
        C36321k7.A1B(r6, r10, r2, r3, r13);
        C36321k7.A13(r11, r5, r12);
        AnonymousClass00C.A0D(r4, 9);
        C36341k9.A1G(r7, r9);
        this.A0G = r6;
        this.A0C = r10;
        this.A05 = r2;
        this.A06 = r3;
        this.A0F = r13;
        this.A0D = r11;
        this.A08 = r5;
        this.A0E = r12;
        this.A07 = r4;
        this.A0A = r8;
        this.A09 = r7;
        this.A0B = r9;
    }
}
