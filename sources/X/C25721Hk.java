package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Hk  reason: invalid class name and case insensitive filesystem */
public class C25721Hk implements C25711Hj {
    public Object A00;
    public final Object A01 = new Object();
    public final List A02 = new ArrayList();

    public Object A00() {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
        }
        return obj;
    }

    public void A01() {
        synchronized (this.A01) {
            this.A02.clear();
        }
    }

    public void A02(C25711Hj r4) {
        synchronized (this.A01) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                if (((C25711Hj) ((Pair) it.next()).first).equals(r4)) {
                    it.remove();
                }
            }
        }
    }

    public void A03(C25711Hj r5, Executor executor) {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
            this.A02.add(Pair.create(r5, executor));
        }
        if (obj == null) {
            return;
        }
        if (executor == null) {
            r5.accept(obj);
        } else {
            executor.execute(new C35621iz(r5, obj, 37));
        }
    }

    public void A04(Object obj) {
        ArrayList arrayList;
        synchronized (this.A01) {
            this.A00 = obj;
            arrayList = new ArrayList(this.A02);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C25711Hj r3 = (C25711Hj) pair.first;
            Executor executor = (Executor) pair.second;
            if (executor == null) {
                r3.accept(obj);
            } else {
                executor.execute(new C35621iz(r3, obj, 37));
            }
        }
    }

    public void accept(Object obj) {
        A04(obj);
    }
}
