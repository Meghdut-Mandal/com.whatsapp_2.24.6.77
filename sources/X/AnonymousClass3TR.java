package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3TR  reason: invalid class name */
public final class AnonymousClass3TR {
    public Map A00;
    public List A01;
    public Map A02;
    public final C19630wG A03;
    public final Set A04;

    private final void A01(C88964Us r4) {
        String BF9;
        Map map = this.A00;
        if (map == null) {
            throw C36331k8.A0d("allSettingsMap");
        }
        C88964Us r0 = (C88964Us) map.get(r4.BDM());
        if (r0 != null && (BF9 = r0.BF9()) != null && BF9.length() == 0) {
            Map map2 = this.A00;
            if (map2 == null) {
                throw C36331k8.A0d("allSettingsMap");
            }
            C88964Us r2 = (C88964Us) map2.get(r4.BF6());
            if (r2 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(r4.BF9());
                r4.BrU(AnonymousClass000.A0q(r2.BF9(), A0u));
                String BF92 = r4.BF9();
                if (BF92.length() > 0) {
                    r4.BrU(AnonymousClass000.A0q(" > ", AnonymousClass000.A0v(BF92)));
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(r4.BF9());
                r4.BrU(AnonymousClass000.A0q(r2.BGE(), A0u2));
            }
        }
    }

    public static final void A02(AnonymousClass3TR r5, String str, String str2, List list) {
        Map map = r5.A02;
        if (map == null) {
            throw C36331k8.A0d("groupedSettings");
        }
        List<C88964Us> list2 = (List) map.get(str2);
        if (list2 != null) {
            for (C88964Us r3 : list2) {
                r5.A01(r3);
                if (!AnonymousClass099.A0O(r3.BGE(), str, true)) {
                    List B8J = r3.B8J();
                    if (!(B8J instanceof Collection) || !B8J.isEmpty()) {
                        Iterator it = B8J.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (AnonymousClass099.A0O(AnonymousClass001.A0C(it), str, true)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A02(r5, str, r3.BDM(), list);
                } else {
                    list.add(r3);
                    r5.A03(r3.BDM(), list);
                }
            }
        }
    }

    private final void A03(String str, List list) {
        Map map = this.A02;
        if (map == null) {
            throw C36331k8.A0d("groupedSettings");
        }
        List<C88964Us> list2 = (List) map.get(str);
        if (list2 != null) {
            for (C88964Us r0 : list2) {
                A01(r0);
                list.add(r0);
                A03(r0.BDM(), list);
            }
        }
    }

    public final void A04() {
        Set set = this.A04;
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : set) {
            if (((C88964Us) next).BNj()) {
                A0I.add(next);
            }
        }
        this.A01 = A0I;
        LinkedHashMap A1G = C36431kI.A1G();
        for (Object next2 : A0I) {
            ((List) C36391kE.A0s(((C88964Us) next2).BF6(), A1G)).add(next2);
        }
        this.A02 = A1G;
        List list = this.A01;
        if (list == null) {
            throw C36331k8.A0d("filteredSettings");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
        for (Object next3 : list) {
            linkedHashMap.put(((C88964Us) next3).BDM(), next3);
        }
        this.A00 = linkedHashMap;
    }

    public AnonymousClass3TR(C19630wG r1, Set set) {
        C36321k7.A0x(set, r1);
        this.A04 = set;
        this.A03 = r1;
    }

    public static final C88964Us A00(C88964Us r2, AnonymousClass3TR r3) {
        while (!AnonymousClass00C.A0J(r2.BF6(), "")) {
            Map map = r3.A00;
            if (map != null) {
                C88964Us r0 = (C88964Us) map.get(r2.BF6());
                if (r0 == null) {
                    break;
                }
                r2 = r0;
            } else {
                throw C36331k8.A0d("allSettingsMap");
            }
        }
        return r2;
    }
}
