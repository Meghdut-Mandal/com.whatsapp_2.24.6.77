package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass13J;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1HK;
import X.AnonymousClass1NG;
import X.AnonymousClass1PZ;
import X.AnonymousClass61I;
import X.C001700s;
import X.C105545Fb;
import X.C162747p5;
import X.C19700wN;
import X.C19770wU;
import X.C20810yC;
import X.C226815j;
import X.C27631Pa;
import X.C34831hi;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C95504lc;
import java.util.Set;

public class ParticipantsListViewModel extends C95504lc {
    public AnonymousClass61I A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C19700wN A02;
    public final AnonymousClass1NG A03;
    public final C105545Fb A04;
    public final AnonymousClass1PZ A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass171 A07;
    public final AnonymousClass1HK A08;
    public final C20810yC A09;
    public final C34831hi A0A = C36441kJ.A0s(C36381kD.A0j());
    public final C19770wU A0B;
    public final Set A0C = C36441kJ.A16();
    public final AnonymousClass17Y A0D;
    public final C27631Pa A0E;
    public final C226815j A0F;
    public final AnonymousClass16I A0G;
    public final AnonymousClass13J A0H;

    public void A0R() {
        this.A04.unregisterObserver(this);
        this.A0G.unregisterObserver(this.A0F);
    }

    public ParticipantsListViewModel(C19700wN r3, AnonymousClass17Y r4, AnonymousClass1NG r5, C27631Pa r6, C105545Fb r7, AnonymousClass1PZ r8, AnonymousClass16D r9, AnonymousClass16I r10, AnonymousClass171 r11, AnonymousClass1HK r12, C20810yC r13, AnonymousClass13J r14, C19770wU r15) {
        C162747p5 r0 = new C162747p5(this, 2);
        this.A0F = r0;
        this.A09 = r13;
        this.A0D = r4;
        this.A02 = r3;
        this.A0B = r15;
        this.A08 = r12;
        this.A04 = r7;
        this.A06 = r9;
        this.A07 = r11;
        this.A03 = r5;
        this.A0G = r10;
        this.A05 = r8;
        this.A0E = r6;
        this.A0H = r14;
        r7.registerObserver(this);
        C95504lc.A02(r7, this);
        r10.registerObserver(r0);
    }
}
