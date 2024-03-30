package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6qd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143486qd implements AnonymousClass7g0 {
    public final /* synthetic */ AnonymousClass5pR A00;
    public final /* synthetic */ C135016bz A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ C009003v A04;

    public /* synthetic */ C143486qd(AnonymousClass5pR r1, C135016bz r2, List list, Map map, C009003v r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
        this.A03 = map;
        this.A04 = r5;
    }

    public final void Be6() {
        C135016bz r11 = this.A01;
        List list = this.A02;
        Map map = this.A03;
        C009003v r5 = this.A04;
        C36331k8.A1G(list, 2, r5);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (true) {
            int i = 0;
            if (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Iterator A0y2 = AnonymousClass000.A0y((Map) A11.getValue());
                while (true) {
                    if (A0y2.hasNext()) {
                        List list2 = (List) C36351kA.A0u(A0y2);
                        Iterator it = ((C134796bc) A11.getKey()).A04.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i4 = i2 + 1;
                                if (i2 < 0) {
                                    throw C36351kA.A0v();
                                }
                                C134616bK r1 = (C134616bK) next;
                                if (i3 < list2.size()) {
                                    ArrayList arrayList = r11.A03;
                                    Object obj = arrayList.get(r1.A00);
                                    AnonymousClass00C.A08(obj);
                                    float A032 = C36441kJ.A03(obj);
                                    Object obj2 = arrayList.get(AnonymousClass001.A02(i2, ((C134796bc) A11.getKey()).A02, 0));
                                    AnonymousClass00C.A08(obj2);
                                    float A033 = C36441kJ.A03(obj2);
                                    C15020mZ A05 = C15040mb.A05(i3, Math.min(r1.A01, list2.size()));
                                    int i5 = A05.A00;
                                    int i6 = A05.A01;
                                    if (i5 <= i6) {
                                        while (true) {
                                            A0I.add(new C144426sA((C144406s8) list2.get(i5), A032, A033, false));
                                            if (i5 == i6) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    i3 = A05.A01 + 1;
                                }
                                i2 = i4;
                            }
                        }
                    }
                }
            } else {
                List A002 = C163907qx.A00(A0I, 6);
                for (Object next2 : A002) {
                    int i7 = i + 1;
                    if (i < 0) {
                        throw C36351kA.A0v();
                    }
                    ((C144426sA) next2).A0B.A01 = i7;
                    i = i7;
                }
                r5.invoke(A002, list);
                return;
            }
        }
    }
}
