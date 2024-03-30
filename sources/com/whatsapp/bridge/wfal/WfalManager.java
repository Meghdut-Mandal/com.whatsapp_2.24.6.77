package com.whatsapp.bridge.wfal;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass1U9;
import X.AnonymousClass1UC;
import X.AnonymousClass1UM;
import X.C108475Tq;
import X.C13180jS;
import X.C135086c7;
import X.C19730wQ;
import X.C20810yC;

public final class WfalManager {
    public final AnonymousClass1UC A00;
    public final AnonymousClass1U9 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final C19730wQ A05;
    public final C20810yC A06;
    public final AnonymousClass1UM A07;

    public WfalManager(C19730wQ r2, C20810yC r3, AnonymousClass1UC r4, AnonymousClass1U9 r5, AnonymousClass1UM r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9) {
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r6, 8);
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A05 = r2;
        this.A06 = r3;
        this.A07 = r6;
    }

    public final C135086c7 A00(C108475Tq r5) {
        String str;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass1UC r2 = (AnonymousClass1UC) this.A03.get();
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            str = "F";
        } else if (ordinal == 1) {
            str = "I";
        } else {
            throw new C13180jS();
        }
        return r2.A07(str);
    }
}
