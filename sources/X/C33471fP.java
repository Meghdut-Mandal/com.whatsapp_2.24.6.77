package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1fP  reason: invalid class name and case insensitive filesystem */
public class C33471fP {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C32211dA> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C32211dA BQy : set) {
                    BQy.BQy();
                }
            }
        }
    }

    public void A01() {
        Set<C32211dA> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C32211dA BS9 : set) {
                    BS9.BS9();
                }
            }
        }
    }

    public void A02(C32211dA r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
