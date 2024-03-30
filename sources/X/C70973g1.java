package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3g1  reason: invalid class name and case insensitive filesystem */
public final class C70973g1 implements AnonymousClass4Q7 {
    public final AnonymousClass171 A00;
    public final AnonymousClass1SA A01;
    public final List A02;

    public boolean B7L(AnonymousClass11F r11) {
        long j;
        AnonymousClass00C.A0D(r11, 0);
        AnonymousClass1SA r8 = this.A01;
        Map map = r8.A01;
        Map map2 = map;
        if (map == null) {
            synchronized (r8) {
                Map map3 = r8.A01;
                LinkedHashMap linkedHashMap = map3;
                if (map3 == null) {
                    List A002 = r8.A00();
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (Object next : A002) {
                        if (((AnonymousClass141) next).A0H != null) {
                            A0I.add(next);
                        }
                    }
                    LinkedHashMap A1G = C36431kI.A1G();
                    Iterator it = A0I.iterator();
                    while (it.hasNext()) {
                        AnonymousClass141 A0f = C36391kE.A0f(it);
                        AnonymousClass11F r5 = A0f.A0H;
                        if (r5 != null) {
                            AnonymousClass141 r0 = (AnonymousClass141) A1G.get(r5);
                            if (r0 != null) {
                                j = r0.A0A;
                            } else {
                                j = 0;
                            }
                            if (j < A0f.A0A) {
                                A1G.put(r5, A0f);
                            }
                        }
                    }
                    linkedHashMap = A1G;
                }
                r8.A01 = linkedHashMap;
                map2 = linkedHashMap;
            }
        }
        AnonymousClass141 r3 = (AnonymousClass141) map2.get(r11);
        if (r3 == null || !this.A00.A0h(r3, this.A02, true)) {
            return false;
        }
        return true;
    }

    public C70973g1(AnonymousClass171 r1, AnonymousClass1SA r2, List list) {
        this.A02 = list;
        this.A00 = r1;
        this.A01 = r2;
    }
}
