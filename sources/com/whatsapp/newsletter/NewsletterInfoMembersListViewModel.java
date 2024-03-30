package com.whatsapp.newsletter;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass11F;
import X.AnonymousClass12O;
import X.AnonymousClass141;
import X.AnonymousClass142;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1ZV;
import X.AnonymousClass1ZZ;
import X.AnonymousClass2EJ;
import X.AnonymousClass2Y2;
import X.AnonymousClass2Y4;
import X.AnonymousClass2Y5;
import X.AnonymousClass378;
import X.AnonymousClass3KO;
import X.AnonymousClass4CV;
import X.AnonymousClass4CW;
import X.C001600r;
import X.C001700s;
import X.C007103b;
import X.C023409w;
import X.C07710Yz;
import X.C1502074j;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C223313w;
import X.C22726Aue;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C44072La;
import X.C52172p0;
import X.C52382pL;
import X.C81523x9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class NewsletterInfoMembersListViewModel extends AnonymousClass04R implements AnonymousClass01Y {
    public C22726Aue A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04;
    public final C001700s A05;
    public final C19730wQ A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass12O A08;
    public final C28981Uw A09;
    public final AnonymousClass1ZZ A0A;
    public final AnonymousClass2EJ A0B;
    public final C81523x9 A0C;
    public final AnonymousClass1ZV A0D;
    public final C19770wU A0E;
    public final boolean A0F;
    public final long A0G;

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        int A062 = C36431kI.A06(r4, 1);
        if (A062 == 2) {
            A02(new AnonymousClass4CV(this), false);
        } else if (A062 == 3) {
            A02(new AnonymousClass4CW(this), true);
        }
    }

    public static final void A01(C52172p0 r7, NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel, List<AnonymousClass3KO> list) {
        C001700s r6;
        ArrayList arrayList;
        ArrayList A15;
        AnonymousClass11F r1;
        boolean z;
        if (list == null) {
            list = newsletterInfoMembersListViewModel.A0D.A01(r7, newsletterInfoMembersListViewModel.A09);
            if (((long) list.size()) > newsletterInfoMembersListViewModel.A0G) {
                list = C023409w.A00;
            }
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (AnonymousClass3KO r4 : list) {
            C223313w r2 = r4.A03;
            if (r2 != null) {
                AnonymousClass11F A0A2 = newsletterInfoMembersListViewModel.A08.A0A(r2);
                if (A0A2 == null) {
                    A0A2 = r2;
                }
                AnonymousClass11F r12 = A0A2;
                if (r12 != null) {
                    AnonymousClass141 A0D2 = newsletterInfoMembersListViewModel.A07.A0D(r12);
                    C52382pL r22 = r4.A01;
                    Set set = (Set) newsletterInfoMembersListViewModel.A0B.A06.A04();
                    if (set != null) {
                        z = set.contains(A0D2);
                    } else {
                        z = false;
                    }
                    A0I.add(new AnonymousClass378(r22, A0D2, z));
                }
            }
        }
        List A012 = C07710Yz.A01(A0I);
        C19730wQ r0 = newsletterInfoMembersListViewModel.A06;
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        if (!(r02 == null || (r1 = r02.A0H) == null)) {
            AnonymousClass141 A0D3 = newsletterInfoMembersListViewModel.A07.A0D(r1);
            C44072La r03 = newsletterInfoMembersListViewModel.A0B.A00;
            if (r03 == null) {
                throw C36331k8.A0d("newsletterInfo");
            }
            A012.add(new AnonymousClass378(r03.A09, A0D3, false));
        }
        List<AnonymousClass378> A0c = C007103b.A0c(A012, newsletterInfoMembersListViewModel.A0C);
        ArrayList A0r = C36361kB.A0r(A0c);
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (AnonymousClass378 r13 : A0c) {
            A0I2.add(new AnonymousClass2Y2(r13));
        }
        A0r.addAll(A0I2);
        if (A0r.isEmpty()) {
            A0r.add(new AnonymousClass2Y5(""));
        }
        if (r7 == C52172p0.SHORT) {
            newsletterInfoMembersListViewModel.A04.A0C(A0r);
            if (A0r.size() >= 11) {
                A15 = C36441kJ.A15(A0r.subList(0, 10));
                A15.add(new AnonymousClass2Y4(A0r.size() - 10));
            } else {
                A15 = C36441kJ.A15(A0r);
            }
            if (A15.isEmpty()) {
                A15.add(new AnonymousClass2Y5(""));
            }
            A0r = A15;
            r6 = newsletterInfoMembersListViewModel.A05;
        } else {
            C001700s r14 = newsletterInfoMembersListViewModel.A05;
            Object A042 = r14.A04();
            r6 = newsletterInfoMembersListViewModel.A04;
            if (A042 != null) {
                Collection collection = (Collection) r14.A04();
                if (collection != null) {
                    ArrayList A0S = C007103b.A0S(A0r, collection);
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    Iterator it = A0S.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof AnonymousClass2Y2) {
                            A0I3.add(next);
                        }
                    }
                    HashSet A16 = C36441kJ.A16();
                    arrayList = AnonymousClass001.A0I();
                    for (Object next2 : A0I3) {
                        if (A16.add(((AnonymousClass2Y2) next2).A00.A00.A0H)) {
                            arrayList.add(next2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r6.A0C(arrayList);
                return;
            }
        }
        r6.A0C(A0r);
    }

    private final void A02(AnonymousClass00S r4, boolean z) {
        Iterable A0X = C36421kH.A0X(this.A0A);
        boolean z2 = false;
        if (!(A0X instanceof Collection) || !((Collection) A0X).isEmpty()) {
            Iterator it = A0X.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass00C.A0J(it.next(), this)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 == z) {
            r4.invoke();
        }
    }

    public final void A0S(C52172p0 r3) {
        this.A0E.Bp1(new C1502074j(r3, this));
    }

    public NewsletterInfoMembersListViewModel(C19730wQ r2, AnonymousClass16D r3, AnonymousClass171 r4, AnonymousClass12O r5, C20810yC r6, C28981Uw r7, AnonymousClass1ZZ r8, AnonymousClass2EJ r9, AnonymousClass1ZV r10, C19770wU r11, long j) {
        C36321k7.A1B(r6, r4, r2, r11, r3);
        C36321k7.A13(r5, r10, r8);
        this.A06 = r2;
        this.A0E = r11;
        this.A07 = r3;
        this.A08 = r5;
        this.A0D = r10;
        this.A0A = r8;
        this.A09 = r7;
        this.A0G = j;
        this.A0B = r9;
        this.A0F = r6.A0E(6535);
        this.A0C = new C81523x9(r2, r4);
        C001700s A0S = C36431kI.A0S();
        this.A05 = A0S;
        this.A02 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A04 = A0S2;
        this.A01 = A0S2;
    }
}
