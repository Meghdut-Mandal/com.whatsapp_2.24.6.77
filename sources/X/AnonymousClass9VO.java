package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9VO  reason: invalid class name */
public final class AnonymousClass9VO {
    public int A00 = 0;
    public final ArrayList A01 = AnonymousClass001.A0I();

    public int A00(Iterable iterable) {
        int i = 0;
        synchronized (this.A01) {
            for (Object A012 : iterable) {
                i |= A01(A012);
            }
        }
        return i;
    }

    public int A01(Object obj) {
        int i;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().equals(obj)) {
                    i |= 1 << i2;
                }
                i2++;
            }
        }
        return i;
    }

    public int A02(Object obj) {
        int i;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int i2 = this.A00;
            if (i2 < 32) {
                arrayList.add(obj);
                i = 1 << i2;
                this.A00 = i2 + 1;
            } else {
                throw AnonymousClass001.A09("Attempting to newEntry more than 32 entries.");
            }
        }
        return i;
    }
}
