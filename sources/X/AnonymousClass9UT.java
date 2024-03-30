package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9UT  reason: invalid class name */
public final class AnonymousClass9UT {
    public AnonymousClass9MY A00;
    public Map[] A01;
    public boolean A02;
    public final C21430zE A03;
    public final AnonymousClass004 A04;

    public final AnonymousClass004 A00(C019108d r3, int i) {
        AnonymousClass00C.A0D(r3, 0);
        A01();
        if (i < 0) {
            return null;
        }
        AnonymousClass9MY r1 = this.A00;
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
        Throwable th;
        List list;
        synchronized (this) {
            if (!this.A02) {
                C21430zE r5 = this.A03;
                r5.markerStart(314515949);
                C148306ye.A00.A00(r5, 314515949);
                r5.markerPoint(314515949, "get_regs");
                Set<C195819Wd> set = (Set) this.A04.get();
                r5.markerPoint(314515949, "config_regs");
                AnonymousClass00C.A0B(set);
                for (C195819Wd r1 : set) {
                    synchronized (r1) {
                        try {
                            if (!r1.A00) {
                                r1.A01();
                                r1.A00 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                r5.markerPoint(314515949, "process_regs");
                AnonymousClass9MY r7 = new AnonymousClass9MY();
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = set.iterator();
                loop1:
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        C195819Wd r12 = (C195819Wd) next;
                        synchronized (next) {
                            if (!r12.A00) {
                                r12.A01();
                                r12.A00 = true;
                            }
                            try {
                                list = r12.A02;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C176968cy r2 = (C176968cy) it2.next();
                                Integer num = r2.A05;
                                C019108d r13 = r2.A06;
                                if (r13 == null) {
                                    th = C36331k8.A0d("messageClass");
                                    break loop1;
                                } else if (num != null) {
                                    C90494aF.A1F(num, r13, r7.A01);
                                    int intValue = num.intValue();
                                    if (intValue > r7.A00) {
                                        r7.A00 = intValue;
                                    }
                                    C176908cs r6 = r2.A04;
                                    if (r6 == null) {
                                        th = C36331k8.A0d("integrationPointsBuilder");
                                        break loop1;
                                    }
                                    LinkedHashMap A1G = C36431kI.A1G();
                                    Iterator it3 = r6.A01.iterator();
                                    while (it3.hasNext()) {
                                        C165607th.A1Q(A1G, it3);
                                    }
                                    Iterator it4 = r6.A00.iterator();
                                    while (it4.hasNext()) {
                                        C165607th.A1Q(A1G, it4);
                                    }
                                    C90494aF.A1F(Integer.valueOf(intValue), A1G, A0I);
                                } else {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("Configuration error in builder=");
                                    A0u.append(C36441kJ.A1A(r2.getClass()).BGN());
                                    A0u.append(", message type=");
                                    A0u.append(r2.A05);
                                    A0u.append(",, message class=");
                                    C019108d r0 = r2.A06;
                                    if (r0 != null) {
                                        th = new C21848AbY(AnonymousClass000.A0o(r0, A0u));
                                    } else {
                                        th = C36331k8.A0d("messageClass");
                                    }
                                }
                            }
                        }
                    } else {
                        r5.markerPoint(314515949, "init_state");
                        this.A00 = r7;
                        int i = r7.A00 + 1;
                        Map[] mapArr = new Map[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            mapArr[i2] = null;
                        }
                        this.A01 = mapArr;
                        Iterator it5 = A0I.iterator();
                        while (it5.hasNext()) {
                            AnonymousClass011 r14 = (AnonymousClass011) it5.next();
                            int A0I2 = AnonymousClass000.A0I(r14.first);
                            Object obj = r14.second;
                            Object[] objArr = this.A01;
                            if (objArr == null) {
                                th = C36331k8.A0d("integrationPointsFast");
                            } else {
                                objArr[A0I2] = obj;
                            }
                        }
                        r5.markerPoint(314515949, "init_complete");
                        this.A02 = true;
                        r5.markerEnd(314515949, 2);
                    }
                }
                throw th;
            }
        }
    }

    public AnonymousClass9UT(C21430zE r1, AnonymousClass004 r2) {
        C36321k7.A0x(r1, r2);
        this.A03 = r1;
        this.A04 = r2;
    }
}
