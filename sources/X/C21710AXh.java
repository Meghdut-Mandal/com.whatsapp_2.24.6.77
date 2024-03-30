package X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.AXh  reason: case insensitive filesystem */
public class C21710AXh implements Comparator, B5X {
    public long A00;
    public final long A01;
    public final TreeSet A02 = new TreeSet(this);

    public void BWv(int i, int i2, String str, String str2) {
    }

    public void A00(C23077B3i b3i, long j) {
        try {
            C196289Yq.A01("evictCache");
            B5Y b5y = (B5Y) b3i;
            while (this.A00 + j > this.A01) {
                TreeSet treeSet = this.A02;
                if (treeSet.isEmpty()) {
                    break;
                }
                b5y.Bnz((C21664AUg) treeSet.first(), "lru_policy");
            }
        } finally {
            C196289Yq.A00();
        }
    }

    public void Bgt(C23077B3i b3i, C21664AUg aUg) {
        this.A02.add(aUg);
        this.A00 += aUg.A04;
        A00(b3i, 0);
    }

    public void Bgu(C23077B3i b3i, C21664AUg aUg) {
        this.A02.remove(aUg);
        this.A00 -= aUg.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C21664AUg aUg = (C21664AUg) obj;
        C21664AUg aUg2 = (C21664AUg) obj2;
        long j = aUg.A03;
        long j2 = aUg2.A03;
        if (j - j2 == 0) {
            return aUg.compareTo(aUg2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public C21710AXh(long j) {
        this.A01 = j;
    }

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
        Bgu(b3i, aUg);
        Bgt(b3i, aUg2);
    }

    public void BhF(C23077B3i b3i, String str, long j, long j2) {
        A00(b3i, j2);
    }
}
