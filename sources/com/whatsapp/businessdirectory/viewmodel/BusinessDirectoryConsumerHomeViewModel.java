package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08S;
import X.AnonymousClass08X;
import X.AnonymousClass141;
import X.AnonymousClass1QW;
import X.AnonymousClass1U2;
import X.AnonymousClass32W;
import X.AnonymousClass4PO;
import X.AnonymousClass510;
import X.AnonymousClass513;
import X.AnonymousClass517;
import X.AnonymousClass593;
import X.AnonymousClass5DR;
import X.AnonymousClass5ED;
import X.AnonymousClass6DV;
import X.AnonymousClass6QG;
import X.AnonymousClass7gB;
import X.AnonymousClass7gD;
import X.C001600r;
import X.C001700s;
import X.C105225Dv;
import X.C119215pS;
import X.C119275pY;
import X.C1260462i;
import X.C1261662u;
import X.C1265464l;
import X.C129006Eo;
import X.C132296Sz;
import X.C134986bw;
import X.C142616pA;
import X.C142646pD;
import X.C143466qb;
import X.C143526qh;
import X.C144416s9;
import X.C145806uY;
import X.C145816uZ;
import X.C145896uh;
import X.C158207fy;
import X.C158217fz;
import X.C159357jE;
import X.C159377jG;
import X.C160727lU;
import X.C164337re;
import X.C164347rf;
import X.C165157sy;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C19700wN;
import X.C19770wU;
import X.C20810yC;
import X.C27121Mz;
import X.C28201Rs;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C90494aF;
import X.C95434kv;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryConsumerHomeViewModel extends AnonymousClass08X implements C160727lU, C159377jG, C159357jE, AnonymousClass4PO, AnonymousClass7gD {
    public C134986bw A00;
    public C144416s9 A01;
    public AnonymousClass141 A02;
    public boolean A03;
    public final AnonymousClass08S A04;
    public final C142616pA A05;
    public final C142646pD A06;
    public final AnonymousClass5DR A07;
    public final C129006Eo A08;
    public final C143526qh A09;
    public final C143466qb A0A;
    public final AnonymousClass1QW A0B;
    public final C28201Rs A0C;
    public final C28201Rs A0D = C36441kJ.A0t();
    public final C28201Rs A0E;
    public final C001600r A0F;
    public final C132296Sz A0G;

    public void BTX(int i) {
        C28201Rs r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            this.A06.A08(this.A08.A03(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0D;
            i2 = 8;
        } else if (i == 3) {
            this.A06.A08(this.A08.A03(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0D;
            i2 = 5;
        } else {
            return;
        }
        r2.A0C(C36441kJ.A0Q(Integer.valueOf(i2), A01(this)));
    }

    public void BTb() {
    }

    public void BfX() {
        this.A03 = true;
        A03(this);
    }

    public static AnonymousClass6QG A01(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        AnonymousClass6QG A012 = businessDirectoryConsumerHomeViewModel.A08.A01();
        if (A012 != null) {
            return A012;
        }
        C132296Sz r1 = businessDirectoryConsumerHomeViewModel.A0G;
        AnonymousClass6QG r0 = r1.A00;
        if (r0 == null) {
            return C132296Sz.A00(r1);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r3 != 1) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r3 != 1) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C124535yM r7, com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel r8) {
        /*
            X.62u r2 = r7.A07
            if (r2 == 0) goto L_0x0038
            X.6pD r6 = r8.A06
            int r1 = r7.A01
            if (r1 == 0) goto L_0x0048
            r0 = 1
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = "unified_home"
        L_0x000f:
            java.util.HashMap r5 = r2.A00(r0)
            r4 = 0
            int r3 = r7.A01
            X.62u r0 = r7.A07
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0042
            r1 = 1
            if (r2 == r1) goto L_0x0039
            r0 = 4
            if (r2 == r0) goto L_0x0039
            r0 = 7
            if (r2 == r0) goto L_0x0039
            if (r3 == 0) goto L_0x002b
            r0 = 41
            if (r3 == r1) goto L_0x002d
        L_0x002b:
            r0 = 40
        L_0x002d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            r6.BOk(r5, r4, r0)
        L_0x0038:
            return
        L_0x0039:
            if (r3 == 0) goto L_0x003f
            r0 = 44
            if (r3 == r1) goto L_0x002d
        L_0x003f:
            r0 = 43
            goto L_0x002d
        L_0x0042:
            r0 = 28
            goto L_0x002d
        L_0x0045:
            java.lang.String r0 = "businesses"
            goto L_0x000f
        L_0x0048:
            java.lang.String r0 = "home"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel.A02(X.5yM, com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel):void");
    }

    public static void A03(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        AnonymousClass513 r11;
        AnonymousClass510 r4;
        BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel2 = businessDirectoryConsumerHomeViewModel;
        C143466qb r3 = businessDirectoryConsumerHomeViewModel2.A0A;
        if (r3.A09()) {
            C143526qh r2 = businessDirectoryConsumerHomeViewModel2.A09;
            boolean z = businessDirectoryConsumerHomeViewModel2.A03;
            r2.A00 = r3.A00.A01;
            if (z) {
                AnonymousClass1QW r7 = r2.A09;
                C20810yC r6 = r7.A03;
                if (r6.A0E(4610)) {
                    r2.A0B.clear();
                    C145896uh r0 = r2.A03;
                    AnonymousClass6QG r8 = r2.A00;
                    r0.A01();
                    C145816uZ r13 = new C145816uZ(r0);
                    r0.A06 = r13;
                    C158217fz r42 = r0.A0L;
                    C1265464l r14 = r0.A0M.A00;
                    C164347rf r43 = (C164347rf) r42;
                    int i = r43.A01;
                    Object obj = r43.A00;
                    if (i != 0) {
                        C18800tq r44 = ((AnonymousClass1U2) obj).A00;
                        C20810yC A0V = C36341k9.A0V(r44);
                        C19700wN A0V2 = C36391kE.A0V(r44);
                        C19770wU A0Z = C36341k9.A0Z(r44);
                        C19630wG A0W = C36351kA.A0W(r44);
                        C18820ts A0T = C36341k9.A0T(r44);
                        C18830tt r32 = r44.A00;
                        r4 = new AnonymousClass510(A0V2, C18830tt.A13(r32), C90494aF.A0J(r32), r8, A0W, C36411kG.A0c(r44), A0T, A0V, r13, r14, C90494aF.A0O(r32), (AnonymousClass32W) r32.A1C.get(), A0Z);
                    } else {
                        C18800tq r45 = ((C27121Mz) obj).A01;
                        C20810yC A0V3 = C36341k9.A0V(r45);
                        C19700wN A0V4 = C36391kE.A0V(r45);
                        C19770wU A0Z2 = C36341k9.A0Z(r45);
                        C19630wG A0W2 = C36351kA.A0W(r45);
                        C18820ts A0T2 = C36341k9.A0T(r45);
                        C18830tt r33 = r45.A00;
                        r4 = new AnonymousClass510(A0V4, C18830tt.A13(r33), C90494aF.A0J(r33), r8, A0W2, C36411kG.A0c(r45), A0T2, A0V3, r13, r14, C90494aF.A0O(r33), (AnonymousClass32W) r33.A1C.get(), A0Z2);
                    }
                    r4.A0B();
                    r0.A00 = r4;
                } else {
                    Map map = r2.A0B;
                    map.put(C36361kB.A0i(), new C119275pY(0));
                    map.put(C36361kB.A0j(), new C119275pY(0));
                    C145896uh r02 = r2.A03;
                    AnonymousClass6QG r15 = r2.A00;
                    if (!(r02.A00 instanceof AnonymousClass517)) {
                        r02.A01();
                    }
                    C145806uY r5 = new C145806uY(r02);
                    r02.A04 = r5;
                    C158207fy r112 = r02.A0K;
                    C1265464l r10 = r02.A0M.A00;
                    C164337re r113 = (C164337re) r112;
                    int i2 = r113.A01;
                    Object obj2 = r113.A00;
                    if (i2 != 0) {
                        C18800tq r82 = ((AnonymousClass1U2) obj2).A00;
                        C20810yC A0V5 = C36341k9.A0V(r82);
                        C19700wN A0V6 = C36391kE.A0V(r82);
                        C19630wG A0W3 = C36351kA.A0W(r82);
                        C19770wU A0Z3 = C36341k9.A0Z(r82);
                        C18820ts A0T3 = C36341k9.A0T(r82);
                        C18830tt r9 = r82.A00;
                        r11 = new AnonymousClass513(A0V6, C18830tt.A13(r9), C90494aF.A0J(r9), r15, A0W3, C36411kG.A0c(r82), A0T3, A0V5, r5, r10, C90494aF.A0O(r9), A0Z3);
                    } else {
                        C18800tq r83 = ((C27121Mz) obj2).A01;
                        C20810yC A0V7 = C36341k9.A0V(r83);
                        C19700wN A0V8 = C36391kE.A0V(r83);
                        C19630wG A0W4 = C36351kA.A0W(r83);
                        C19770wU A0Z4 = C36341k9.A0Z(r83);
                        C18820ts A0T4 = C36341k9.A0T(r83);
                        C18830tt r92 = r83.A00;
                        r11 = new AnonymousClass513(A0V8, C18830tt.A13(r92), C90494aF.A0J(r92), r15, A0W4, C36411kG.A0c(r83), A0T4, A0V7, r5, r10, C90494aF.A0O(r92), A0Z4);
                    }
                    r11.A0B();
                    r02.A00 = r11;
                    C119275pY r84 = (C119275pY) map.get(0);
                    if (r84 != null && r84.A01 != null && r84.A00 != 2) {
                        r2.A0A();
                    } else if (C143526qh.A07(r2.A00)) {
                        map.put(0, new C119275pY(0));
                        int A072 = r2.A08.A07(1895);
                        r02.A04(new C119215pS(A072, (String) null), (C1260462i) null, r2.A00, (String) null);
                    } else {
                        map.put(0, new C119275pY(1));
                        C143526qh.A03(r2);
                    }
                    if (r7.A02() && r6.A0E(3948)) {
                        map.put(3, new C119275pY(0));
                        r2.A0A.A00(r2, 3);
                    }
                }
                C143526qh.A03(r2);
                return;
            }
            r2.A0A();
        }
    }

    public void A0R() {
        C143466qb r2 = this.A0A;
        C95434kv r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A09);
        r2.A04.A00();
        r2.A01 = null;
        C143526qh r22 = this.A09;
        AnonymousClass6DV r1 = r22.A01;
        if (r1 != null) {
            r1.A00 = true;
            r22.A01 = null;
        }
        C145896uh r02 = r22.A03;
        r02.A0A = null;
        r02.A0B = null;
        r02.A08 = null;
        C36331k8.A1E(r22.A0A.A00);
    }

    public void BR4() {
        if (this.A0B.A05()) {
            C142616pA r2 = this.A05;
            Integer A002 = C143466qb.A00(this.A0A);
            AnonymousClass593 A003 = AnonymousClass593.A00(3);
            A003.A09 = A002;
            C142616pA.A01(r2, A003);
            this.A07.A02(true);
        }
        C36341k9.A17(this.A0C, 3);
    }

    public void BTG() {
        this.A0A.A03();
        this.A0D.A0D(C36441kJ.A0Q(C36401kF.A0h(), A01(this)));
    }

    public void BaE() {
        C36341k9.A16(this.A0E, 10);
    }

    public void BaJ() {
        C36341k9.A17(this.A0C, 0);
        this.A06.A08(this.A08.A03(), C36391kE.A0r(), (Map) null, 0, 48, 1);
    }

    public void BfW() {
        C143466qb r0 = this.A0A;
        r0.A02();
        r0.A00.A0F();
        C36341k9.A17(this.A0C, 1);
        this.A06.A08(this.A08.A03(), (Integer) null, (Map) null, 0, 49, 1);
    }

    public void Bg2() {
        C36341k9.A17(this.A0E, 8);
    }

    public BusinessDirectoryConsumerHomeViewModel(Application application, C142616pA r6, C142646pD r7, AnonymousClass5DR r8, C129006Eo r9, C132296Sz r10, C143526qh r11, AnonymousClass7gB r12, AnonymousClass1QW r13) {
        super(application);
        this.A0B = r13;
        AnonymousClass08S r3 = new AnonymousClass08S();
        this.A04 = r3;
        this.A0E = C36441kJ.A0t();
        this.A0C = C36441kJ.A0t();
        this.A08 = r9;
        this.A07 = r8;
        this.A0G = r10;
        this.A05 = r6;
        this.A06 = r7;
        C143466qb B4H = r12.B4H(this, this, this);
        this.A0A = B4H;
        this.A09 = r11;
        C001700s r1 = r11.A02;
        this.A0F = r1;
        this.A03 = true;
        C165157sy.A01(r1, r3, this, 40);
        C165157sy.A01(B4H.A00, r3, this, 41);
    }

    public static void A04(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new AnonymousClass5ED(businessDirectoryConsumerHomeViewModel));
        ArrayList A0I2 = AnonymousClass001.A0I();
        C95434kv r2 = businessDirectoryConsumerHomeViewModel.A0A.A00;
        if (r2.A04() != null && r2.A00 == 4) {
            A0I2.addAll(businessDirectoryConsumerHomeViewModel.A09.A08(r2.A01));
        }
        A0I.addAll(A0I2);
        A0I.addAll(list);
        businessDirectoryConsumerHomeViewModel.A04.A0C(A0I);
    }

    public void BZ5(C1261662u r3, int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        C105225Dv.A00(this, A0I, 2);
        A04(this, A0I);
    }

    public void BbC() {
        BTG();
    }

    public void BfV(String str) {
        A03(this);
    }
}
