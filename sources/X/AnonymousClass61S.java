package X;

import java.util.Arrays;

/* renamed from: X.61S  reason: invalid class name */
public final class AnonymousClass61S {
    public int A00;
    public int[] A01 = new int[10];

    public static int A00(AnonymousClass61S r2) {
        int[] iArr = r2.A01;
        int i = r2.A00 - 1;
        r2.A00 = i;
        return iArr[i];
    }

    public final void A01(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            iArr = Arrays.copyOf(iArr, length * 2);
            AnonymousClass00C.A08(iArr);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }
}
