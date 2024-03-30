package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6fj  reason: invalid class name and case insensitive filesystem */
public final class C137186fj implements C160267kj {
    public final Map A00;
    public final C006302t A01;
    public final Map A02;

    public boolean B2M(Object obj) {
        return C90464aC.A1Y(obj, this.A01);
    }

    public Object B3V(String str) {
        Map map = this.A02;
        List list = (List) map.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(str, list.subList(1, list.size()));
        }
        return C36391kE.A0t(list);
    }

    public Map Bla() {
        LinkedHashMap A06 = C000400e.A06(this.A02);
        Iterator A0y = AnonymousClass000.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            List list = (List) A11.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((AnonymousClass00S) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (C90464aC.A1Y(invoke, this.A01)) {
                    A06.put(key, AnonymousClass03T.A02(invoke));
                } else {
                    throw AnonymousClass001.A09("item can't be saved");
                }
            } else {
                int size = list.size();
                ArrayList A14 = C36441kJ.A14(size);
                while (i < size) {
                    Object invoke2 = ((AnonymousClass00S) list.get(i)).invoke();
                    if (invoke2 == null || C90464aC.A1Y(invoke2, this.A01)) {
                        A14.add(invoke2);
                        i++;
                    } else {
                        throw AnonymousClass001.A09("item can't be saved");
                    }
                }
                A06.put(key, A14);
            }
        }
        return A06;
    }

    public C137186fj(Map map, C006302t r3) {
        LinkedHashMap A1G;
        this.A01 = r3;
        if (map != null) {
            A1G = new LinkedHashMap(map);
        } else {
            A1G = C36431kI.A1G();
        }
        this.A02 = A1G;
        this.A00 = C36431kI.A1G();
    }

    public C157607do BnI(String str, AnonymousClass00S r4) {
        if (!AnonymousClass098.A06(str)) {
            Map map = this.A00;
            Object obj = map.get(str);
            if (obj == null) {
                obj = AnonymousClass001.A0I();
                map.put(str, obj);
            }
            ((List) obj).add(r4);
            return new C137166fh(this, str, r4);
        }
        throw AnonymousClass001.A08("Registered key is empty or blank");
    }
}
