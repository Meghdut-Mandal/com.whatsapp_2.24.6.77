package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1A7  reason: invalid class name */
public class AnonymousClass1A7 implements Iterable {
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final Comparator A02 = AnonymousClass1A8.A00;
    public final HashMap A03 = new HashMap();

    public static int A00(AnonymousClass1A7 r3, AnonymousClass11F r4) {
        int i = 0;
        while (true) {
            ArrayList arrayList = r3.A01;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((AnonymousClass3I6) arrayList.get(i)).A01.equals(r4)) {
                return i;
            }
            i++;
        }
    }

    public AnonymousClass3I6 A01(AnonymousClass11F r3) {
        if (this.A00) {
            this.A03.remove(r3);
        }
        int A002 = A00(this, r3);
        if (A002 >= 0) {
            return (AnonymousClass3I6) this.A01.remove(A002);
        }
        return null;
    }

    public void A02(List list) {
        if (this.A00) {
            HashMap hashMap = this.A03;
            hashMap.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3I6 r0 = (AnonymousClass3I6) it.next();
                hashMap.put(r0.A01, Long.valueOf(r0.A00));
            }
        }
        ArrayList arrayList = this.A01;
        arrayList.clear();
        arrayList.addAll(list);
        Collections.sort(arrayList, this.A02);
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }

    public boolean A03(AnonymousClass11F r9, AnonymousClass11F r10, long j) {
        AnonymousClass3I6 r5;
        int A002 = A00(this, r9);
        if (A002 >= 0) {
            r5 = (AnonymousClass3I6) this.A01.remove(A002);
        } else {
            r5 = null;
        }
        if (this.A00) {
            HashMap hashMap = this.A03;
            hashMap.remove(r9);
            Long valueOf = Long.valueOf(j);
            hashMap.put(r10, valueOf);
            if (r5 != null) {
                long longValue = valueOf.longValue();
                long j2 = r5.A00;
                if (longValue <= j2) {
                    if (r10 != r5.A01) {
                        r5 = new AnonymousClass3I6(r10, j2);
                    }
                }
            }
            r5 = new AnonymousClass3I6(r10, valueOf.longValue());
        } else {
            r5 = new AnonymousClass3I6(r10, j);
        }
        ArrayList arrayList = this.A01;
        int binarySearch = Collections.binarySearch(arrayList, r5, this.A02);
        boolean z = false;
        if (binarySearch < 0) {
            z = true;
        }
        C18740tg.A0B(z);
        int i = (-binarySearch) - 1;
        arrayList.add(i, r5);
        if (A002 != i) {
            return true;
        }
        return false;
    }
}
