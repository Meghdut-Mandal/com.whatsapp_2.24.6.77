package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1uG  reason: invalid class name and case insensitive filesystem */
public final class C39921uG extends AnonymousClass04R {
    public C001700s A00 = C36431kI.A0S();
    public AnonymousClass3T1 A01;
    public AtomicBoolean A02 = C36431kI.A1H();
    public final AnonymousClass08S A03;
    public final AnonymousClass17Y A04;
    public final AnonymousClass1X4 A05;
    public final AnonymousClass1KK A06;
    public final AnonymousClass30Y A07;
    public final AnonymousClass6BB A08;
    public final AnonymousClass1NM A09;
    public final AnonymousClass17U A0A;
    public final AnonymousClass1F4 A0B;
    public final AnonymousClass11F A0C;
    public final C19770wU A0D;
    public final C90394a5 A0E;
    public final C24541Cv A0F;
    public final AnonymousClass16J A0G;

    public C39921uG(AnonymousClass17Y r9, AnonymousClass1X4 r10, AnonymousClass1KK r11, AnonymousClass30Y r12, AnonymousClass6BB r13, AnonymousClass1NM r14, C24541Cv r15, AnonymousClass16J r16, AnonymousClass17U r17, AnonymousClass1F4 r18, AnonymousClass11F r19, C19770wU r20) {
        C19770wU r3 = r20;
        AnonymousClass17U r1 = r17;
        C36321k7.A1B(r9, r3, r1, r10, r15);
        AnonymousClass1F4 r4 = r18;
        AnonymousClass16J r2 = r16;
        C36321k7.A1C(r2, r14, r4, r13, r12);
        AnonymousClass00C.A0D(r11, 11);
        this.A04 = r9;
        this.A0D = r3;
        this.A0A = r1;
        this.A05 = r10;
        this.A0F = r15;
        this.A0G = r2;
        this.A09 = r14;
        this.A0B = r4;
        this.A08 = r13;
        this.A07 = r12;
        this.A06 = r11;
        AnonymousClass11F r7 = r19;
        this.A0C = r7;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A03 = A0Y;
        C90394a5 A002 = C90394a5.A00(this, 4);
        this.A0E = A002;
        if (!C007103b.A0j(C36421kH.A0X(r2), A002)) {
            r2.registerObserver(A002);
        }
        A0Y.A0F(this.A00, new C55492ui(new C85764Ii(this), 39));
        AnonymousClass3T1 A032 = r15.A03(r7);
        if (A032 != null) {
            C63503Kh r110 = A032.A1K;
            AnonymousClass00C.A07(r110);
            if (r110.A01 || !r4.A04(r110)) {
                A01(this, A032);
            } else {
                r3.Bp1(new C1501874h(this, A032, 15));
            }
        }
    }

    public static final void A01(C39921uG r6, AnonymousClass3T1 r7) {
        C80113ur r0;
        C001700s r3 = r6.A00;
        AnonymousClass3T1 A0r = C36431kI.A0r(r3);
        C51962of r4 = null;
        if (A0r != null) {
            long j = A0r.A1O;
            if (Long.valueOf(j) != null && r7.A1O < j) {
                return;
            }
        }
        if (r7.A1J.A02) {
            r3.A0D((Object) null);
            return;
        }
        C51962of[] r2 = new C51962of[2];
        r2[0] = C51962of.LAST;
        Set A0i = C36421kH.A0i(C51962of.FULL, r2, 1);
        C63483Kf A0M = r7.A0M();
        if (A0M != null) {
            r4 = A0M.A01;
        }
        if (C007103b.A0j(A0i, r4) || ((r0 = r7.A0b) != null && r0.hostStorage == 2)) {
            AnonymousClass3KQ A0N = r7.A0N();
            if (A0N == null || A0N.A00 == null) {
                r3.A0D(r7);
            }
        }
    }

    public void A0R() {
        AnonymousClass16J r2 = this.A0G;
        Iterable A0X = C36421kH.A0X(r2);
        C90394a5 r1 = this.A0E;
        if (C007103b.A0j(A0X, r1)) {
            r2.unregisterObserver(r1);
        }
    }
}
