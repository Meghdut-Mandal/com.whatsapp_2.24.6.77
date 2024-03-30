package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.3PI  reason: invalid class name */
public final class AnonymousClass3PI {
    public final Set A00;

    public AnonymousClass3PI(Set set) {
        AnonymousClass00C.A0D(set, 1);
        this.A00 = set;
    }

    public final int A01(String str) {
        Object obj;
        AnonymousClass00C.A0D(str, 0);
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass00C.A0J(((C88964Us) obj).BDM(), str)) {
                break;
            }
        }
        C88964Us r1 = (C88964Us) obj;
        if (r1 != null) {
            return r1.BIQ();
        }
        return 22;
    }

    public final boolean A02(View view, String str, String str2) {
        C88964Us A002;
        View BJ3;
        AnonymousClass00C.A0D(view, 0);
        if (str2 == null || (A002 = A00(str, str2)) == null || (BJ3 = A002.BJ3(view)) == null) {
            return false;
        }
        BJ3.getParent().requestChildFocus(BJ3, BJ3);
        if (A002.BN8()) {
            C90204Zm.A00(BJ3.getViewTreeObserver(), BJ3, this, 5);
        }
        if (A002.Bt1()) {
            BJ3.callOnClick();
        }
        return true;
    }

    private final C88964Us A00(String str, String str2) {
        Object obj;
        Set set = this.A00;
        LinkedHashMap A1G = C36431kI.A1G();
        for (Object next : set) {
            ((List) C36391kE.A0s(((C88964Us) next).BF6(), A1G)).add(next);
        }
        List<C88964Us> list = (List) A1G.get(str);
        if (list == null) {
            return null;
        }
        for (C88964Us r6 : list) {
            if (r6.BN8()) {
                String BDM = r6.BDM();
                if (!AnonymousClass00C.A0J(BDM, str2)) {
                    r6 = A00(BDM, str2);
                    if (r6 != null) {
                        return r6;
                    }
                }
            }
            String BDM2 = r6.BDM();
            if (!AnonymousClass00C.A0J(BDM2, str2)) {
                String str3 = str2;
                while (true) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (AnonymousClass00C.A0J(((C88964Us) obj).BDM(), str3)) {
                            break;
                        }
                    }
                    C88964Us r1 = (C88964Us) obj;
                    if (r1 == null || (str3 = r1.BF6()) == null) {
                        break;
                    } else if (str3.equals(BDM2)) {
                        return r6;
                    }
                }
            } else {
                return r6;
            }
        }
        return null;
    }
}
