package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8TR  reason: invalid class name */
public class AnonymousClass8TR extends C196179Ya {
    public static final C22907AyJ A00 = new A8I();

    public static void A00(C21670AUn aUn, C199959gK r15, C196179Ya r16, C22907AyJ ayJ, Object obj, String str) {
        Object obj2;
        C199959gK r11 = r15;
        C23091B4b b4b = r15.A01.A00;
        Object obj3 = obj;
        C196179Ya r12 = r16;
        C22907AyJ ayJ2 = ayJ;
        String str2 = str;
        if (obj3 instanceof Map) {
            if (ayJ2.BPS(obj3)) {
                r12.A03(aUn, r15, obj3, str2);
            }
            Iterator it = b4b.BGJ(obj3).iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                StringBuilder A0v = AnonymousClass000.A0v(str2);
                A0v.append("['");
                A0v.append(A0C);
                String A0q = AnonymousClass000.A0q("']", A0v);
                Map map = (Map) obj3;
                if (!map.containsKey(A0C)) {
                    obj2 = C23091B4b.A00;
                } else {
                    obj2 = map.get(A0C);
                }
                if (obj2 != C23091B4b.A00) {
                    A00(new C173778Sz(obj3, A0C), r11, r12, ayJ2, obj2, A0q);
                }
            }
        } else if (obj3 instanceof List) {
            int i = 0;
            if (ayJ2.BPS(obj3)) {
                if (r12.A01 == null) {
                    r12.A03(aUn, r15, obj3, str2);
                } else {
                    C196179Ya A01 = r12.A01();
                    int i2 = 0;
                    for (Object next : b4b.Bvj(obj3)) {
                        StringBuilder A0k = C36331k8.A0k(str2, "[");
                        A0k.append(i2);
                        String A0q2 = AnonymousClass000.A0q("]", A0k);
                        A01.A00 = i2;
                        A01.A03(aUn, r15, next, A0q2);
                        i2++;
                    }
                }
            }
            for (Object next2 : b4b.Bvj(obj3)) {
                StringBuilder A0k2 = C36331k8.A0k(str2, "[");
                A0k2.append(i);
                A00(new AnonymousClass8T0(obj3, i), r11, r12, ayJ2, next2, AnonymousClass000.A0q("]", A0k2));
                i++;
            }
        }
    }
}
