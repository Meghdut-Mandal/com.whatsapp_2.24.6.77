package X;

import java.util.List;
import java.util.Map;

public class A8E implements C22905AyH {
    public Object BKy(C21670AUn aUn, C199959gK r5, Object obj, String str, List list) {
        int BOA;
        if (list != null && list.size() > 0) {
            AnonymousClass8TP r1 = ((C201989kp) list.get(0)).A01.A00;
            boolean z = r1.A01 instanceof AnonymousClass8TO;
            C196179Ya r12 = r1;
            if (!z) {
                while (true) {
                    C196179Ya r13 = r12.A01;
                    if (r13 == null) {
                        break;
                    }
                    C196179Ya r0 = r13.A01;
                    r12 = r13;
                    if (r0 == null) {
                        r13.A01 = new AnonymousClass8TM();
                        break;
                    }
                }
            }
            C195299Tr r02 = ((C201989kp) list.get(0)).A01;
            C194879Rp r14 = r5.A01;
            Object A00 = r02.A00(r14, obj, obj).A00();
            C23091B4b b4b = r14.A00;
            if (A00 instanceof List) {
                BOA = b4b.BOA(A00);
                return Integer.valueOf(BOA);
            }
        }
        C23091B4b b4b2 = r5.A01.A00;
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return null;
        }
        BOA = b4b2.BOA(obj);
        return Integer.valueOf(BOA);
    }
}
