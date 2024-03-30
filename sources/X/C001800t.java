package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.00t  reason: invalid class name and case insensitive filesystem */
public class C001800t implements Iterable {
    public int A00 = 0;
    public C003201h A01;
    public C003201h A02;
    public WeakHashMap A03 = new WeakHashMap();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C001800t) {
            C001800t r7 = (C001800t) obj;
            if (this.A00 == r7.A00) {
                Iterator it = iterator();
                Iterator it2 = r7.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if (entry == null) {
                        if (next == null) {
                        }
                    } else if (!entry.equals(next)) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
        return false;
    }

    public C003201h A00(Object obj) {
        C003201h r1 = this.A02;
        while (r1 != null && !r1.A02.equals(obj)) {
            r1 = r1.A00;
        }
        return r1;
    }

    public Iterator iterator() {
        C003701q r2 = new C003701q(this.A02, this.A01);
        this.A03.put(r2, false);
        return r2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object A01(Object obj) {
        C003201h A002 = A00(obj);
        if (A002 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (C003501o BvH : weakHashMap.keySet()) {
                BvH.BvH(A002);
            }
        }
        C003201h r1 = A002.A01;
        C003201h r0 = A002.A00;
        if (r1 != null) {
            r1.A00 = r0;
        } else {
            this.A02 = r0;
        }
        C003201h r02 = A002.A00;
        if (r02 != null) {
            r02.A01 = r1;
        } else {
            this.A01 = r1;
        }
        A002.A00 = null;
        A002.A01 = null;
        return A002.A03;
    }

    public Object A02(Object obj, Object obj2) {
        C003201h A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        C003201h r1 = new C003201h(obj, obj2);
        this.A00++;
        C003201h r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }
}
