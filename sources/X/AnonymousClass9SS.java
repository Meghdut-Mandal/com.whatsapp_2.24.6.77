package X;

import java.util.Arrays;

/* renamed from: X.9SS  reason: invalid class name */
public final class AnonymousClass9SS {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass9OI A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public int A00(long j) {
        int i;
        long[] jArr = this.A07;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length || jArr[binarySearch] != j) {
                    i = binarySearch - 1;
                }
                binarySearch++;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch - 1;
        }
        while (i < jArr.length) {
            if ((this.A04[i] & 1) != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public AnonymousClass9SS(AnonymousClass9OI r7, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2, int i, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = false;
        C200319h9.A01(AnonymousClass000.A1S(length, length2));
        int length3 = jArr.length;
        C200319h9.A01(AnonymousClass000.A1S(length3, length2));
        int length4 = iArr2.length;
        C200319h9.A01(length4 == length2 ? true : z);
        this.A03 = r7;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }
}
