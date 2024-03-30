package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A08 implements B2l {
    public final long[] A00;
    public final AnonymousClass6TI[] A01;

    public long BBf(int i) {
        boolean z = true;
        C200319h9.A01(C36401kF.A1U(i));
        long[] jArr = this.A00;
        if (i >= jArr.length) {
            z = false;
        }
        C200319h9.A01(z);
        return jArr[i];
    }

    public List BAU(long j) {
        AnonymousClass6TI r0;
        int A03 = Util.A03(this.A00, j, false);
        if (A03 == -1 || (r0 = this.A01[A03]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(r0);
    }

    public int BBg() {
        return this.A00.length;
    }

    public int BEU(long j) {
        long[] jArr = this.A00;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }

    public A08(long[] jArr, AnonymousClass6TI[] r2) {
        this.A01 = r2;
        this.A00 = jArr;
    }
}
