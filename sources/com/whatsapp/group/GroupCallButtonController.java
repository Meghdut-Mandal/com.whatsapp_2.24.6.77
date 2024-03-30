package com.whatsapp.group;

import X.AnonymousClass00N;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass1EM;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1HP;
import X.AnonymousClass1MK;
import X.AnonymousClass1NK;
import X.AnonymousClass3KV;
import X.AnonymousClass4PQ;
import X.AnonymousClass4PR;
import X.AnonymousClass4YF;
import X.AnonymousClass4YG;
import X.AnonymousClass4YS;
import X.AnonymousClass4YT;
import X.AnonymousClass5Ng;
import X.C023109s;
import X.C107265Nh;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C21100yf;
import X.C220412q;
import X.C27721Pm;
import X.C31021b9;
import X.C31031bA;
import X.C32011co;
import X.C34661hR;
import X.C36371kC;
import X.C49202ij;
import X.C49212ik;
import X.C589831u;
import X.C90224Zo;

public class GroupCallButtonController implements AnonymousClass00N {
    public C49202ij A00;
    public C49212ik A01;
    public AnonymousClass3KV A02;
    public AnonymousClass141 A03;
    public C589831u A04;
    public AnonymousClass147 A05;
    public C107265Nh A06;
    public AnonymousClass5Ng A07;
    public Integer A08 = C023109s.A00;
    public AnonymousClass13J A09;
    public final C19730wQ A0A;
    public final C21100yf A0B;
    public final AnonymousClass4PR A0C = new AnonymousClass4YT(this, 1);
    public final AnonymousClass1MK A0D;
    public final AnonymousClass16D A0E;
    public final C220412q A0F;
    public final AnonymousClass17X A0G;
    public final AnonymousClass1HO A0H;
    public final C20810yC A0I;
    public final C31021b9 A0J;
    public final C34661hR A0K = new AnonymousClass4YG(this, 1);
    public final C31031bA A0L;
    public final AnonymousClass1EM A0M;
    public final C19770wU A0N;
    public final C32011co A0O = new C90224Zo(this, 1);
    public final AnonymousClass1HP A0P;
    public final AnonymousClass1NK A0Q = new AnonymousClass4YF(this, 3);
    public final C27721Pm A0R;
    public final AnonymousClass4PQ A0S = new AnonymousClass4YS(this, 1);
    public final AnonymousClass1HJ A0T;

    public static void A00(GroupCallButtonController groupCallButtonController, long j) {
        AnonymousClass1HJ r2 = groupCallButtonController.A0T;
        C107265Nh A052 = r2.A05(j);
        if (A052 != null) {
            groupCallButtonController.A0S.BSe(A052);
        } else if (groupCallButtonController.A00 == null) {
            C49202ij r1 = new C49202ij(groupCallButtonController.A0S, r2, j);
            groupCallButtonController.A00 = r1;
            C36371kC.A1P(r1, groupCallButtonController.A0N);
        }
    }

    public GroupCallButtonController(C19730wQ r4, C21100yf r5, AnonymousClass1MK r6, AnonymousClass16D r7, AnonymousClass1HJ r8, C220412q r9, AnonymousClass17X r10, AnonymousClass1HO r11, C20810yC r12, C31021b9 r13, C31031bA r14, AnonymousClass1EM r15, AnonymousClass13J r16, C19770wU r17, AnonymousClass1HP r18, C27721Pm r19) {
        this.A0I = r12;
        this.A0A = r4;
        this.A0N = r17;
        this.A0F = r9;
        this.A0B = r5;
        this.A0R = r19;
        this.A0D = r6;
        this.A0E = r7;
        this.A0M = r15;
        this.A09 = r16;
        this.A0P = r18;
        this.A0T = r8;
        this.A0J = r13;
        this.A0H = r11;
        this.A0L = r14;
        this.A0G = r10;
    }
}
