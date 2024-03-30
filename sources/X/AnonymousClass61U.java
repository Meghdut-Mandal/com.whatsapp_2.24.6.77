package X;

import java.util.Arrays;

/* renamed from: X.61U  reason: invalid class name */
public final class AnonymousClass61U {
    public int A00;
    public long[] A01 = new long[2];

    public final void A00(long j) {
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            if (this.A01[i2] != j) {
                i2++;
            } else {
                return;
            }
        }
        long[] jArr = this.A01;
        int length = jArr.length;
        if (i >= length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, length * 2));
            AnonymousClass00C.A08(jArr);
            this.A01 = jArr;
        }
        jArr[i] = j;
        if (i >= this.A00) {
            this.A00 = i + 1;
        }
    }
}
