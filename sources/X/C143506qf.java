package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6qf  reason: invalid class name and case insensitive filesystem */
public class C143506qf implements C159297j8 {
    public final /* synthetic */ C143516qg A00;

    public C143506qf(C143516qg r1) {
        this.A00 = r1;
    }

    public void BSN(int i, List list) {
        C143516qg r6 = this.A00;
        C128836Du r5 = r6.A09.A05;
        if (r5 != null) {
            AnonymousClass6L1 r4 = r6.A0D;
            int i2 = 0;
            while (true) {
                List list2 = r4.A03;
                if (i2 < list2.size()) {
                    C144416s9 r1 = (C144416s9) list2.get(i2);
                    if (list.contains(r1.A0E)) {
                        C144416s9 A002 = C144416s9.A00(r1);
                        A002.A01 = 2;
                        list2.set(i2, A002);
                    }
                    i2++;
                } else {
                    List list3 = r5.A09;
                    list3.clear();
                    list3.addAll(list2);
                    C143516qg.A06(r6);
                    return;
                }
            }
        }
    }

    public void BSO(Map map) {
        C143516qg r5 = this.A00;
        AnonymousClass00C.A0D(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(map.size()));
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            String str = ((C144416s9) A11.getValue()).A0F;
            AnonymousClass00C.A07(str);
            List list = ((C144416s9) A11.getValue()).A05;
            if (list == null) {
                list = C023409w.A00;
            }
            List list2 = ((C144416s9) A11.getValue()).A06;
            if (list2 == null) {
                list2 = C023409w.A00;
            }
            linkedHashMap.put(key, new AnonymousClass6CB(str, ((C144416s9) A11.getValue()).A04, list, list2));
        }
        LinkedHashMap A0s = C90474aD.A0s(linkedHashMap);
        Iterator A0y2 = AnonymousClass000.A0y(linkedHashMap);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            A0s.put(((AnonymousClass6CB) A112.getValue()).A00, A112.getValue());
        }
        r5.A0E(A0s);
    }
}
