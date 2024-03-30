package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;

/* renamed from: X.1uL  reason: invalid class name and case insensitive filesystem */
public class C39951uL extends AnonymousClass04R {
    public AnonymousClass141 A00;
    public AnonymousClass11F A01;
    public final AnonymousClass08S A02;
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass1KK A04;
    public final AnonymousClass1LV A05;
    public final MemberSuggestedGroupsManager A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass1LL A08;
    public final C39471sS A09;
    public final CountryGatingViewModel A0A;
    public final AnonymousClass1PF A0B;
    public final AnonymousClass17X A0C;
    public final C20810yC A0D;
    public final AnonymousClass3G3 A0E;
    public final ToSGatingViewModel A0F;
    public final C28201Rs A0G;
    public final C28201Rs A0H = C36441kJ.A0t();
    public final C28201Rs A0I;
    public final C32001cn A0J;
    public final C24361Cd A0K;
    public final C226815j A0L;
    public final AnonymousClass16I A0M;
    public final C220412q A0N;
    public final AnonymousClass1A5 A0O;
    public final C20350xQ A0P;
    public final C34711hW A0Q;
    public final C27281Np A0R;
    public final C87854Qk A0S;
    public final C27541Op A0T;
    public final C24511Cs A0U;
    public final C233117z A0V;
    public final AnonymousClass1EL A0W;
    public final AnonymousClass3H7 A0X;
    public final AnonymousClass1EM A0Y;
    public final C19930wk A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r4.A0H.equals(r3.A00.A0H) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C39951uL r3, X.AnonymousClass141 r4) {
        /*
            X.08S r2 = r3.A02
            X.141 r0 = r3.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x001b
            if (r4 == 0) goto L_0x001b
            X.11F r1 = r4.A0H
            X.141 r0 = r3.A00
            X.11F r0 = r0.A0H
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            X.C36341k9.A18(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39951uL.A01(X.1uL, X.141):void");
    }

    public void A0R() {
        this.A0M.unregisterObserver(this.A0L);
        this.A0K.unregisterObserver(this.A0J);
        this.A0V.unregisterObserver(this.A0U);
        if (this.A00.A0G()) {
            this.A0T.A01(this.A0S);
            this.A0R.unregisterObserver(this.A0Q);
        }
    }

    public C52382pL A0S() {
        C65073Qp A0W2 = C36371kC.A0W(this.A0N, this.A01);
        if (A0W2 instanceof C44072La) {
            return ((C44072La) A0W2).A09;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (r1.A00.A12 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r13 == 1) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (r1.A0D.A0E(5747) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r2 != X.C52382pL.OWNER) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r1.A0C.A0C((com.whatsapp.jid.GroupJid) X.C36381kD.A0e(r1.A00, X.AnonymousClass147.class)) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T() {
        /*
            r36 = this;
            r1 = r36
            X.141 r0 = r1.A00
            X.11F r4 = X.C36351kA.A0j(r0)
            X.1A5 r0 = r1.A0O
            X.141 r0 = r0.A01(r4)
            r1.A00 = r0
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x001d
            X.141 r2 = r1.A00
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            r2.A06(r0)
        L_0x001d:
            X.147 r3 = X.C65533Sl.A01(r4)
            X.141 r0 = r1.A00
            boolean r0 = r0.A0G()
            r2 = 1
            if (r0 == 0) goto L_0x003e
            X.17X r6 = r1.A0C
            X.141 r5 = r1.A00
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r0 = X.C36381kD.A0e(r5, r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r6.A0C(r0)
            r16 = 1
            if (r0 == 0) goto L_0x0040
        L_0x003e:
            r16 = 0
        L_0x0040:
            X.1EL r6 = r1.A0W
            X.141 r0 = r1.A00
            boolean r22 = r6.A01(r0)
            X.0xQ r5 = r1.A0P
            X.141 r0 = r1.A00
            int r13 = r5.A0M(r0)
            X.141 r0 = r1.A00
            boolean r23 = r6.A00(r0)
            X.12q r0 = r1.A0N
            int r12 = r0.A05(r3)
            if (r3 == 0) goto L_0x006e
            X.17X r0 = r1.A0C
            boolean r0 = r0.A0D(r3)
            if (r0 == 0) goto L_0x006e
            X.141 r0 = r1.A00
            boolean r0 = r0.A12
            r30 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r30 = 0
        L_0x0070:
            X.1EM r0 = r1.A0Y
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x0085
            r0 = 3
            if (r12 != r0) goto L_0x0085
            if (r22 != 0) goto L_0x0085
            if (r23 != 0) goto L_0x0085
            r20 = 1
            if (r13 != r2) goto L_0x0087
        L_0x0085:
            r20 = 0
        L_0x0087:
            X.141 r0 = r1.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00a3
            X.141 r0 = r1.A00
            com.whatsapp.jid.Jid r0 = X.C36431kI.A0h(r0)
            if (r0 == 0) goto L_0x00a3
            X.0yC r2 = r1.A0D
            r0 = 5747(0x1673, float:8.053E-42)
            boolean r0 = r2.A0E(r0)
            r32 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a3:
            r32 = 0
        L_0x00a5:
            if (r20 != 0) goto L_0x0100
            if (r30 != 0) goto L_0x0100
            boolean r0 = X.AnonymousClass143.A0I(r4)
            if (r0 != 0) goto L_0x0100
            if (r32 != 0) goto L_0x0100
            X.00s r4 = r1.A03
            X.141 r8 = r1.A00
            r7 = 0
            boolean r5 = r8.A0i
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r1.A0A
            X.11F r3 = r1.A01
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r3)
            X.3Ge r0 = r0.A01
            boolean r18 = r0.A00(r2)
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r1.A0F
            X.3Ge r0 = r0.A02
            boolean r19 = r0.A01(r2)
            boolean r21 = r1.A0U()
            X.2pL r2 = r1.A0S()
            if (r2 == 0) goto L_0x00de
            X.2pL r0 = X.C52382pL.OWNER
            r24 = 1
            if (r2 == r0) goto L_0x00e0
        L_0x00de:
            r24 = 0
        L_0x00e0:
            X.3G3 r1 = r1.A0E
            X.3Ro r0 = X.C28981Uw.A03
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00fe
            X.1Uw r3 = (X.C28981Uw) r3
        L_0x00ea:
            boolean r25 = r1.A01(r3)
            r14 = 0
            X.3HD r6 = new X.3HD
            r10 = r7
            r11 = r7
            r15 = 0
            r9 = r7
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.A0C(r6)
            return
        L_0x00fe:
            r3 = 0
            goto L_0x00ea
        L_0x0100:
            X.0wk r2 = r1.A0Z
            X.3w9 r0 = new X.3w9
            r24 = r0
            r25 = r1
            r26 = r4
            r27 = r3
            r28 = r12
            r29 = r13
            r31 = r20
            r33 = r16
            r34 = r22
            r35 = r23
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39951uL.A0T():void");
    }

    public boolean A0U() {
        return this.A0X.A01(this.A00, this.A01);
    }

    public C39951uL(AnonymousClass1KK r18, AnonymousClass1K3 r19, C24361Cd r20, AnonymousClass1LV r21, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass16D r23, AnonymousClass16I r24, AnonymousClass1LL r25, C39471sS r26, CountryGatingViewModel countryGatingViewModel, C220412q r28, AnonymousClass1A5 r29, AnonymousClass1PF r30, AnonymousClass17X r31, AnonymousClass141 r32, C20810yC r33, C20350xQ r34, C27281Np r35, C27541Op r36, C233117z r37, AnonymousClass1EL r38, AnonymousClass3H7 r39, AnonymousClass11F r40, AnonymousClass3G3 r41, ToSGatingViewModel toSGatingViewModel, AnonymousClass1EM r43, C19770wU r44) {
        AnonymousClass1K3 r8 = r19;
        AnonymousClass08S A0Y2 = C36441kJ.A0Y();
        this.A02 = A0Y2;
        this.A0I = C36441kJ.A0t();
        this.A0G = C36441kJ.A0t();
        AnonymousClass4W3 A002 = AnonymousClass4W3.A00(this, 19);
        this.A0L = A002;
        AnonymousClass4W0 r7 = new AnonymousClass4W0(this, 10);
        this.A0J = r7;
        AnonymousClass4WB r6 = new AnonymousClass4WB(this, 16);
        this.A0U = r6;
        C89584Xc r3 = new C89584Xc(this, 14);
        this.A0S = r3;
        AnonymousClass4WA r1 = new AnonymousClass4WA(this, 0);
        this.A0Q = r1;
        this.A01 = r40;
        this.A0D = r33;
        AnonymousClass141 r16 = r32;
        this.A00 = r16;
        this.A0N = r28;
        this.A07 = r23;
        this.A0Y = r43;
        this.A0X = r39;
        this.A0P = r34;
        AnonymousClass16I r13 = r24;
        this.A0M = r13;
        this.A0W = r38;
        C24361Cd r14 = r20;
        this.A0K = r14;
        this.A0F = toSGatingViewModel;
        C27281Np r12 = r35;
        this.A0R = r12;
        this.A05 = r21;
        this.A04 = r18;
        this.A0A = countryGatingViewModel;
        this.A09 = r26;
        C27541Op r11 = r36;
        this.A0T = r11;
        this.A0C = r31;
        this.A08 = r25;
        this.A0E = r41;
        this.A0O = r29;
        C233117z r15 = r37;
        this.A0V = r15;
        this.A06 = memberSuggestedGroupsManager;
        this.A0B = r30;
        this.A0Z = new C19930wk(r44, false);
        r13.registerObserver(A002);
        r14.registerObserver(r7);
        r15.registerObserver(r6);
        if (r16.A0G()) {
            r11.A00(r3);
            r12.registerObserver(r1);
        }
        if (C197029b1.A00(this.A00.A0H)) {
            C132326Tc r310 = (C132326Tc) ((AnonymousClass1K4) r8).A08.get();
            C001700s A0S2 = C36431kI.A0S();
            AnonymousClass141 r0 = r310.A08;
            if (r0 != null) {
                A0S2.A0D(r0);
            } else {
                r310.A04.Bp1(new C1501874h(A0S2, r310));
            }
            A01(this, (AnonymousClass141) A0S2.A04());
            A0Y2.A0F(A0S2, new C66033Uk(this, 25));
            return;
        }
        C36341k9.A18(A0Y2, false);
    }
}
