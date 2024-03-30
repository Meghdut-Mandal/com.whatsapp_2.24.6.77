package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.15v  reason: invalid class name and case insensitive filesystem */
public class C227915v {
    public final List A00;
    public final List A01;
    public final List A02;

    public C227915v() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(1024L);
        arrayList.add(10240L);
        arrayList.add(102400L);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(1048576L);
        arrayList2.add(10485760L);
        arrayList2.add(104857600L);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList3.add(10L);
        arrayList3.add(100L);
        arrayList3.add(1000L);
        this.A00 = arrayList;
        this.A01 = arrayList2;
        this.A02 = arrayList3;
    }

    public long A00(long j) {
        List list = this.A01;
        if (list.size() >= 2) {
            long longValue = ((Number) list.get(0)).longValue();
            int i = 1;
            while (i < list.size()) {
                long longValue2 = ((Number) list.get(i)).longValue();
                if (j <= longValue2) {
                    break;
                }
                i++;
                longValue = longValue2;
            }
            return Math.round((((double) j) * 1.0d) / ((double) longValue)) * longValue;
        }
        throw new IllegalArgumentException("Expected more than 1 bucket");
    }
}
