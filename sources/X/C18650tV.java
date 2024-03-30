package X;

import java.util.Iterator;

/* renamed from: X.0tV  reason: invalid class name and case insensitive filesystem */
public class C18650tV implements C16970qV {
    public Object A00;
    public final int A01;

    public C18650tV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Iterator iterator() {
        int i = this.A01;
        Object obj = this.A00;
        if (i == 0) {
            return ((Iterable) obj).iterator();
        }
        C12250hk r1 = new C12250hk();
        r1.A02 = AnonymousClass0AA.A00(r1, r1, (C009003v) obj);
        return r1;
    }
}
