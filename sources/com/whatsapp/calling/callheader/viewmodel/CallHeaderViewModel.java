package com.whatsapp.calling.callheader.viewmodel;

import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass3KV;
import X.C001700s;
import X.C105545Fb;
import X.C122385ul;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C26211Jh;
import X.C36431kI;
import X.C95504lc;

public class CallHeaderViewModel extends C95504lc {
    public AnonymousClass3KV A00;
    public C20810yC A01;
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C105545Fb A05;
    public final C122385ul A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final C18820ts A09;
    public final C26211Jh A0A;
    public final C19770wU A0B;

    public void A0R() {
        this.A05.unregisterObserver(this);
    }

    public CallHeaderViewModel(AnonymousClass17Y r2, C19730wQ r3, C105545Fb r4, C122385ul r5, AnonymousClass16D r6, AnonymousClass171 r7, C18820ts r8, C26211Jh r9, C20810yC r10, C19770wU r11) {
        this.A01 = r10;
        this.A05 = r4;
        this.A04 = r3;
        this.A08 = r7;
        this.A07 = r6;
        this.A03 = r2;
        this.A0B = r11;
        this.A09 = r8;
        this.A0A = r9;
        this.A06 = r5;
        r4.registerObserver(this);
        C95504lc.A02(r4, this);
    }
}
