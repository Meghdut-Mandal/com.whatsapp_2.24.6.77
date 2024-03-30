package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Ns  reason: invalid class name and case insensitive filesystem */
public class C27311Ns {
    public final C19970wo A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public void A00(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(AnonymousClass143.A08(strArr));
        }
    }

    public boolean A01(C64933Qa r3) {
        boolean add;
        Set set = this.A02;
        synchronized (set) {
            add = set.add(r3);
        }
        return add;
    }

    public C27311Ns(C19970wo r2) {
        this.A00 = r2;
    }
}
