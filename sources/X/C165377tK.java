package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7tK  reason: invalid class name and case insensitive filesystem */
public class C165377tK implements AnonymousClass7g0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165377tK(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void Be6() {
        if (this.A02 != 0) {
            C143526qh r5 = (C143526qh) this.A00;
            C128836Du r4 = (C128836Du) this.A01;
            synchronized (C143526qh.class) {
                C119275pY r1 = (C119275pY) C36371kC.A0r(r5.A0B, 0);
                if (r1 != null) {
                    r1.A00 = 1;
                    r1.A01 = r4;
                    if (!r4.A09.isEmpty()) {
                        C143526qh.A04(r5, 0);
                    }
                }
                C143526qh.A03(r5);
            }
            return;
        }
        C143516qg r3 = (C143516qg) this.A00;
        C128836Du r2 = (C128836Du) this.A01;
        C131426Oz r12 = r2.A00;
        AnonymousClass5pR r26 = r3.A07;
        AnonymousClass6QG BH2 = r3.A0B.BH2();
        C18740tg.A06(BH2);
        String str = r2.A02;
        C135016bz r24 = r12.A00;
        C18740tg.A06(r24);
        List list = r12.A01;
        C1509877o r0 = new C1509877o(r12, r3);
        C36321k7.A0v(BH2, 0, r24);
        Double d = BH2.A03;
        C18740tg.A06(d);
        AnonymousClass00C.A08(d);
        double doubleValue = d.doubleValue();
        Double d2 = BH2.A04;
        C18740tg.A06(d2);
        AnonymousClass00C.A08(d2);
        C134976bv A002 = C134976bv.A00(doubleValue, d2.doubleValue());
        ArrayList<C144406s8> A0I = AnonymousClass001.A0I();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            C144406s8 r22 = (C144406s8) next;
            if (i < r24.A02 && r22.A00 <= r24.A00) {
                A0I.add(next);
            }
            i = i2;
        }
        for (C144406s8 r23 : A0I) {
            r23.A04 = r23.A05;
        }
        list.clear();
        ArrayList arrayList = r24.A04;
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C90514aH.A1P(it.next(), A1G);
        }
        for (C144406s8 r8 : A0I) {
            int i3 = 0;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        throw C36351kA.A0v();
                    }
                    C134796bc r6 = (C134796bc) next2;
                    AnonymousClass00C.A0D(r8, 0);
                    double d3 = r8.A00;
                    if (d3 >= ((double) r6.A01) && d3 < ((double) r6.A00)) {
                        r8.A02 = i3;
                        List A0n = C90524aI.A0n(r6, A1G);
                        if (A0n != null) {
                            A0n.add(r8);
                        }
                    }
                    i3 = i4;
                }
            }
        }
        ArrayList A0J = C36321k7.A0J(arrayList);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AnonymousClass000.A1F(A0J, C90484aE.A0F(C90524aI.A0n(it3.next(), A1G)));
        }
        double d4 = r24.A00;
        double d5 = d4 * -1.0d;
        double d6 = A002.A00;
        double d7 = (double) 111132;
        double d8 = A002.A01;
        C134976bv A003 = C131876Ra.A00(C134976bv.A00(d6 + (d5 / d7), d8), d5);
        C134976bv A004 = C131876Ra.A00(C134976bv.A00(d6 + (d4 / d7), d8), d4);
        double d9 = A003.A00;
        double d10 = A003.A01;
        double d11 = A004.A00;
        double d12 = A004.A01;
        ArrayList A14 = C36441kJ.A14(A1G.size());
        Iterator A0y = AnonymousClass000.A0y(A1G);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            C134796bc r19 = (C134796bc) A11.getKey();
            LinkedHashMap A1G2 = C36431kI.A1G();
            for (C144406s8 r10 : (List) A11.getValue()) {
                C134976bv A005 = C134976bv.A00(r10.A06, r10.A07);
                int i5 = r19.A03;
                double d13 = A005.A00;
                if (d9 <= d13 && d13 < d11) {
                    double d14 = A005.A01;
                    if (d10 <= d14 && d14 < d12) {
                        double d15 = (double) i5;
                        double floor = d15 * Math.floor((d13 - d9) / ((d11 - d9) / d15));
                        Integer valueOf = Integer.valueOf((int) (floor + Math.floor((d14 - d10) / ((d12 - d10) / d15))));
                        if (valueOf != null) {
                            if (A1G2.get(valueOf) == null) {
                                C90514aH.A1P(valueOf, A1G2);
                            }
                            List A0n2 = C90524aI.A0n(valueOf, A1G2);
                            if (A0n2 != null) {
                                A0n2.add(r10);
                            }
                        }
                    }
                }
            }
            C90494aF.A1F(r19, A1G2, A14);
        }
        Map A09 = C000400e.A09(A14);
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator A0y2 = AnonymousClass000.A0y(A09);
        while (A0y2.hasNext()) {
            Iterator A0y3 = AnonymousClass000.A0y((Map) C36351kA.A0u(A0y2));
            while (A0y3.hasNext()) {
                A0I2.add(C36351kA.A0u(A0y3));
            }
        }
        AnonymousClass5pR r02 = r26;
        C130846Mq r25 = r02.A01;
        C132296Sz r03 = r02.A00;
        AnonymousClass6QG r13 = r03.A00;
        if (r13 == null) {
            r13 = C132296Sz.A00(r03);
        }
        AnonymousClass6QG r52 = r13;
        r25.A00(new AnonymousClass6DV(r52, new C143486qd(r26, r24, A0J, A09, r0), C90494aF.A0S(), str, A0I2, 2));
    }
}
