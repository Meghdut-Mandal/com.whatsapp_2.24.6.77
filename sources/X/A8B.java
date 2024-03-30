package X;

import java.util.Iterator;
import java.util.List;

public class A8B implements C22905AyH {
    public Object BKy(C21670AUn aUn, C199959gK r7, Object obj, String str, List list) {
        C23091B4b b4b = r7.A01.A00;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C201989kp r2 = (C201989kp) it.next();
                if (obj instanceof List) {
                    b4b.BqC(obj, b4b.BOA(obj), r2.A00.get());
                }
            }
        }
        return obj;
    }
}
