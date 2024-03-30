package X;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.9xr  reason: invalid class name and case insensitive filesystem */
public final class C208209xr implements C158937iU, C22770Avg {
    public final B0S A00;
    public final Object A01 = C36441kJ.A11();
    public final C208199xq[] A02;

    public C208209xr(B0S b0s, AnonymousClass9L0 r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass9YC r2 = r6.A02;
        C208199xq[] r3 = {new C1682880a(r6.A01), new C1682980b(r6.A00), new C1683280e(r6.A03), new C1683080c(r2), new C1683180d(r2), new C1683480g(r2), new C1683380f(r2)};
        this.A00 = b0s;
        this.A02 = r3;
    }

    public void BoB(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        synchronized (this.A01) {
            C208199xq[] r6 = this.A02;
            int i = 0;
            int i2 = 0;
            do {
                C208199xq r2 = r6[i2];
                if (r2.A00 != null) {
                    r2.A00 = null;
                    r2.A04.isEmpty();
                }
                i2++;
            } while (i2 < 7);
            int i3 = 0;
            while (true) {
                C208199xq r8 = r6[i3];
                List<AnonymousClass6QA> list = r8.A04;
                list.clear();
                List list2 = r8.A03;
                list2.clear();
                for (Object next : iterable) {
                    if (r8.A01((AnonymousClass6QA) next)) {
                        list.add(next);
                    }
                }
                for (AnonymousClass6QA r0 : list) {
                    list2.add(r0.A0J);
                }
                boolean isEmpty = list.isEmpty();
                AnonymousClass9YC r11 = r8.A02;
                if (isEmpty) {
                    r11.A03(r8);
                } else {
                    synchronized (r11.A02) {
                        LinkedHashSet linkedHashSet = r11.A03;
                        if (linkedHashSet.add(r8)) {
                            if (linkedHashSet.size() == 1) {
                                r11.A00 = r11.A05();
                                AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                                String str = AnonymousClass98L.A00;
                                StringBuilder A0u = AnonymousClass000.A0u();
                                AnonymousClass000.A1C(r11, A0u);
                                A0u.append(": initial state = ");
                                A002.A04(str, AnonymousClass000.A0o(r11.A00, A0u));
                                r11.A06();
                            }
                            Object obj = r11.A00;
                            r8.A01 = obj;
                            C208199xq.A00(r8.A00, r8, obj);
                        }
                    }
                }
                C208199xq.A00(r8.A00, r8, r8.A01);
                i3++;
                if (i3 >= 7) {
                    do {
                        C208199xq r1 = r6[i];
                        if (r1.A00 != this) {
                            r1.A00 = this;
                            C208199xq.A00(this, r1, r1.A01);
                        }
                        i++;
                    } while (i < 7);
                }
            }
        }
    }

    public final boolean A00(String str) {
        boolean z;
        synchronized (this.A01) {
            C208199xq[] r3 = this.A02;
            z = false;
            int i = 0;
            while (true) {
                C208199xq r4 = r3[i];
                Object obj = r4.A01;
                if (obj != null && r4.A02(obj) && r4.A03.contains(str)) {
                    AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                    String str2 = AnonymousClass98H.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Work ");
                    A0u.append(str);
                    A0u.append(" constrained by ");
                    AnonymousClass000.A1C(r4, A0u);
                    A002.A04(str2, A0u.toString());
                    break;
                }
                i++;
                if (i >= 7) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void reset() {
        synchronized (this.A01) {
            C208199xq[] r5 = this.A02;
            int i = 0;
            do {
                C208199xq r2 = r5[i];
                List list = r2.A04;
                if (C36401kF.A1a(list)) {
                    list.clear();
                    r2.A02.A03(r2);
                }
                i++;
            } while (i < 7);
        }
    }
}
