package com.whatsapp.group;

import X.AnonymousClass04R;
import X.AnonymousClass05H;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass3IR;
import X.AnonymousClass4WB;
import X.C06810Ve;
import X.C12960iw;
import X.C18010sR;
import X.C19600wD;
import X.C233117z;
import X.C27541Op;
import X.C36321k7;
import X.C36341k9;
import X.C87854Qk;
import X.C89584Xc;
import com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper;

public final class HistorySettingViewModel extends AnonymousClass04R {
    public AnonymousClass141 A00;
    public AnonymousClass147 A01;
    public final C19600wD A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass17X A04;
    public final EnableGroupHistoryProtocolHelper A05;
    public final C18010sR A06;
    public final AnonymousClass05H A07;
    public final AnonymousClass05L A08;
    public final AnonymousClass05K A09;
    public final C87854Qk A0A;
    public final C27541Op A0B;
    public final C233117z A0C;
    public final AnonymousClass4WB A0D;

    public HistorySettingViewModel(C19600wD r4, AnonymousClass16D r5, AnonymousClass17X r6, C27541Op r7, C233117z r8, EnableGroupHistoryProtocolHelper enableGroupHistoryProtocolHelper) {
        C36321k7.A16(r4, r5, r6, 1);
        C36341k9.A1F(r7, r8);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = enableGroupHistoryProtocolHelper;
        this.A0B = r7;
        this.A0C = r8;
        AnonymousClass05N r0 = new AnonymousClass05N(new AnonymousClass3IR(false, true));
        this.A08 = r0;
        this.A09 = r0;
        C12960iw r02 = new C12960iw(0);
        this.A06 = r02;
        this.A07 = C06810Ve.A01(r02);
        C89584Xc r2 = new C89584Xc(this, 18);
        this.A0A = r2;
        AnonymousClass4WB r03 = new AnonymousClass4WB(this, 19);
        this.A0D = r03;
        r7.A00(r2);
        r8.registerObserver(r03);
    }

    public void A0R() {
        this.A0B.A01(this.A0A);
        this.A0C.unregisterObserver(this.A0D);
    }
}
