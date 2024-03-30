package X;

import java.util.Iterator;

/* renamed from: X.7s1  reason: invalid class name and case insensitive filesystem */
public class C164567s1 implements C17140qn {
    public Object A00;
    public final int A01;

    public C164567s1(Iterable iterable, int i) {
        this.A01 = i;
        this.A00 = iterable;
    }

    public Object BNv(Object obj) {
        if (3 - this.A01 != 0) {
            return ((C1266865b) obj).A03();
        }
        return ((C1268665y) obj).A01();
    }

    public Iterator BuI() {
        return ((Iterable) this.A00).iterator();
    }
}
