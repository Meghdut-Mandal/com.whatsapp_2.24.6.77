package X;

import java.io.File;

/* renamed from: X.9eh  reason: invalid class name and case insensitive filesystem */
public final class C199099eh {
    public final C20690y0 A00;
    public final C20050ww A01;
    public final C25691Hh A02;
    public final AnonymousClass16D A03;
    public final C27391Oa A04;
    public final C20430xY A05;
    public final C19970wo A06;
    public final C20060wx A07;
    public final C20810yC A08;
    public final AnonymousClass1BV A09;
    public final C27591Ow A0A;
    public final AnonymousClass19A A0B;
    public final AnonymousClass1O8 A0C;
    public final AnonymousClass1BS A0D;
    public final C19770wU A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass16K A0G;

    public C199099eh(C20690y0 r18, C20050ww r19, C25691Hh r20, AnonymousClass16D r21, C27391Oa r22, AnonymousClass16K r23, C20430xY r24, C19970wo r25, C20060wx r26, C20810yC r27, AnonymousClass1BV r28, C27591Ow r29, AnonymousClass19A r30, AnonymousClass1O8 r31, AnonymousClass1BS r32, C19770wU r33, AnonymousClass005 r34) {
        C19770wU r0 = r33;
        C20810yC r7 = r27;
        C19970wo r15 = r25;
        C20690y0 r16 = r18;
        C20050ww r14 = r19;
        C36321k7.A1B(r15, r7, r0, r16, r14);
        AnonymousClass1BS r3 = r32;
        C27591Ow r6 = r29;
        AnonymousClass19A r5 = r30;
        C20060wx r8 = r26;
        AnonymousClass16D r12 = r21;
        C36321k7.A1C(r8, r5, r3, r12, r6);
        AnonymousClass1O8 r4 = r31;
        AnonymousClass16K r10 = r23;
        C25691Hh r13 = r20;
        C36321k7.A15(r13, r10, r4);
        C20430xY r9 = r24;
        AnonymousClass00C.A0D(r9, 15);
        AnonymousClass005 r2 = r34;
        C27391Oa r11 = r22;
        C165607th.A1J(r2, 16, r11);
        this.A06 = r15;
        this.A08 = r7;
        this.A0E = r0;
        this.A00 = r16;
        this.A01 = r14;
        this.A07 = r8;
        this.A0B = r5;
        this.A0D = r3;
        this.A03 = r12;
        this.A0A = r6;
        this.A02 = r13;
        this.A0G = r10;
        this.A0C = r4;
        this.A09 = r28;
        this.A05 = r9;
        this.A0F = r2;
        this.A04 = r11;
    }

    public static final boolean A00(C199099eh r6, AnonymousClass141 r7) {
        File A002;
        int i = r7.A05;
        if (i < 0) {
            return false;
        }
        if (i == 0 || (A002 = r6.A0G.A00(r7)) == null || !A002.exists() || A002.length() == 0) {
            return true;
        }
        return false;
    }

    public final C79593ty A01() {
        AnonymousClass9HS r4 = new AnonymousClass9HS(this);
        C199099eh r2 = r4.A01;
        if (r2.A08.A0E(7240)) {
            C1501874h.A01(r2.A0E, r2, r4, 17);
        } else {
            AnonymousClass9HU r3 = new AnonymousClass9HU(r2.A06, r2.A0B);
            AnonymousClass9QZ r0 = new AnonymousClass9QZ(r4, r2);
            AnonymousClass19A r5 = r3.A01;
            String A092 = r5.A09();
            C107535Pi r22 = new C107535Pi(A092);
            C203399nx r7 = r22.A00;
            AnonymousClass00C.A08(r7);
            r5.A0E(new C185868uv(r22, new AnonymousClass9HT(r0, r3), 0), r7, A092, 395, 32000);
        }
        return r4.A00;
    }
}
