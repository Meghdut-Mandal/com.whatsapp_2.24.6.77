package X;

import com.google.firebase.iid.Registrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0uP  reason: invalid class name and case insensitive filesystem */
public class C19120uP extends C19110uO {
    public static final C19130uQ A04 = C19140uR.A00;
    public final C19160uT A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public C19120uP(Iterable iterable, Executor executor, C19020uF... r15) {
        C19160uT r4 = new C19160uT(executor);
        this.A00 = r4;
        ArrayList arrayList = new ArrayList();
        Class<C19160uT> cls = C19160uT.class;
        C19030uG r1 = new C19030uG(cls, cls, C19150uS.class);
        r1.A02 = new C36061jh(r4, 0);
        arrayList.add(r1.A00());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Registrar) it.next()).getComponents());
        }
        Collections.addAll(arrayList, r15);
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19020uF r9 = (C19020uF) it2.next();
            C19200uY r8 = new C19200uY(r9);
            Iterator it3 = r9.A04.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Class cls2 = (Class) it3.next();
                    C19210uZ r2 = new C19210uZ(cls2, !(r9.A01 == 0));
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A00) {
                        set.add(r8);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls2}));
                    }
                }
            }
        }
        for (Set<C19200uY> it4 : hashMap.values()) {
            for (C19200uY r5 : it4) {
                for (C19090uM r0 : r5.A00.A03) {
                    Set<C19200uY> set2 = (Set) hashMap.get(new C19210uZ(r0.A01, r0.A00 == 2));
                    if (set2 != null) {
                        for (C19200uY r12 : set2) {
                            r5.A01.add(r12);
                            r12.A02.add(r5);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C19200uY r13 = (C19200uY) it5.next();
            if (r13.A02.isEmpty()) {
                hashSet2.add(r13);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            C19200uY r3 = (C19200uY) hashSet2.iterator().next();
            hashSet2.remove(r3);
            i++;
            for (C19200uY r14 : r3.A01) {
                Set set3 = r14.A02;
                set3.remove(r3);
                if (set3.isEmpty()) {
                    hashSet2.add(r14);
                }
            }
        }
        if (i == arrayList.size()) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                this.A01.put(next, new C19220ua(new C36241jz(next, this, 1)));
            }
            Map map = this.A01;
            for (Map.Entry entry : map.entrySet()) {
                C19020uF r16 = (C19020uF) entry.getKey();
                if (r16.A01 == 0) {
                    Object value = entry.getValue();
                    for (Object put : r16.A04) {
                        this.A02.put(put, value);
                    }
                }
            }
            for (C19020uF r52 : map.keySet()) {
                Iterator it7 = r52.A03.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        C19090uM r17 = (C19090uM) it7.next();
                        if (r17.A00 == 1) {
                            Map map2 = this.A02;
                            Class cls3 = r17.A01;
                            if (!map2.containsKey(cls3)) {
                                throw new C170898Hx(String.format("Unsatisfied dependency for component %s: %s", new Object[]{r52, cls3}));
                            }
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : this.A01.entrySet()) {
                C19020uF r18 = (C19020uF) entry2.getKey();
                if (r18.A01 != 0) {
                    Object value2 = entry2.getValue();
                    for (Object next2 : r18.A04) {
                        if (!hashMap2.containsKey(next2)) {
                            hashMap2.put(next2, new HashSet());
                        }
                        ((Set) hashMap2.get(next2)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                this.A03.put(entry3.getKey(), new C19220ua(new C19230ub((Set) entry3.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            C19200uY r19 = (C19200uY) it8.next();
            if (!r19.A02.isEmpty() && !r19.A01.isEmpty()) {
                arrayList2.add(r19.A00);
            }
        }
        throw new C170908Hy(arrayList2);
    }
}
