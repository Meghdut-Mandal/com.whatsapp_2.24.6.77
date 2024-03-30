package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9UU  reason: invalid class name */
public final class AnonymousClass9UU {
    public AnonymousClass39C A00;
    public Map[] A01;
    public boolean A02;
    public final C21430zE A03;
    public final AnonymousClass004 A04;

    public final AnonymousClass004 A00(C019108d r3, int i) {
        AnonymousClass00C.A0D(r3, 0);
        A01();
        AnonymousClass39C r1 = this.A00;
        if (r1 == null) {
            throw C36331k8.A0d("metadata");
        } else if (i > r1.A00) {
            return null;
        } else {
            Map[] mapArr = this.A01;
            if (mapArr == null) {
                throw C36331k8.A0d("integrationPointsFast");
            }
            Map map = mapArr[i];
            if (map != null) {
                return (AnonymousClass004) map.get(r3);
            }
            return null;
        }
    }

    public final void A01() {
        RuntimeException th;
        List list;
        synchronized (this) {
            if (!this.A02) {
                C21430zE r5 = this.A03;
                r5.markerStart(314520282);
                C148306ye.A00.A00(r5, 314520282);
                r5.markerPoint(314520282, "get_regs");
                Set<AnonymousClass9X0> set = (Set) this.A04.get();
                r5.markerPoint(314520282, "config_regs");
                AnonymousClass00C.A0B(set);
                for (AnonymousClass9X0 A08 : set) {
                    A08.A08();
                }
                r5.markerPoint(314520282, "process_regs");
                AnonymousClass39C r6 = new AnonymousClass39C();
                ArrayList A14 = C36441kJ.A14(170);
                Iterator it = set.iterator();
                loop1:
                while (true) {
                    if (it.hasNext()) {
                        AnonymousClass9X0 r1 = (AnonymousClass9X0) it.next();
                        synchronized (r1) {
                            try {
                                r1.A08();
                                list = r1.A03;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C176978cz r10 = (C176978cz) it2.next();
                                C176888cq r0 = r10.A06;
                                if (r0 == null) {
                                    th = C36331k8.A0d("systemActionsBuilder");
                                    break loop1;
                                }
                                ArrayList arrayList = r0.A00;
                                C019108d r9 = r10.A07;
                                if (r9 == null) {
                                    th = C36331k8.A0d("messageClass");
                                    break loop1;
                                }
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    int A0A = C36341k9.A0A(it3);
                                    C90494aF.A1F(Integer.valueOf(A0A), r9, r6.A01);
                                    if (A0A > r6.A00) {
                                        r6.A00 = A0A;
                                    }
                                }
                                C176908cs r7 = r10.A05;
                                if (r7 == null) {
                                    th = C36331k8.A0d("integrationPointsBuilder");
                                    break loop1;
                                }
                                LinkedHashMap A1G = C36431kI.A1G();
                                Iterator it4 = r7.A01.iterator();
                                while (it4.hasNext()) {
                                    C165607th.A1Q(A1G, it4);
                                }
                                Iterator it5 = r7.A00.iterator();
                                while (it5.hasNext()) {
                                    C165607th.A1Q(A1G, it5);
                                }
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    C90494aF.A1F(Integer.valueOf(C36341k9.A0A(it6)), A1G, A14);
                                }
                            }
                        }
                    } else {
                        r5.markerPoint(314520282, "init_state");
                        this.A00 = r6;
                        int i = r6.A00 + 1;
                        Map[] mapArr = new Map[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            mapArr[i2] = null;
                        }
                        this.A01 = mapArr;
                        Iterator it7 = A14.iterator();
                        while (it7.hasNext()) {
                            AnonymousClass011 r12 = (AnonymousClass011) it7.next();
                            int A0I = AnonymousClass000.A0I(r12.first);
                            Object obj = r12.second;
                            Object[] objArr = this.A01;
                            if (objArr == null) {
                                th = C36331k8.A0d("integrationPointsFast");
                            } else {
                                objArr[A0I] = obj;
                            }
                        }
                        r5.markerPoint(314520282, "init_complete");
                        this.A02 = true;
                        r5.markerEnd(314520282, 2);
                    }
                }
                throw th;
            }
        }
    }

    public AnonymousClass9UU(C21430zE r1, AnonymousClass004 r2) {
        C36321k7.A0x(r1, r2);
        this.A03 = r1;
        this.A04 = r2;
    }
}
