package X;

/* renamed from: X.5aC  reason: invalid class name and case insensitive filesystem */
public class C110145aC implements C158767iC {
    public final int A00;

    public /* synthetic */ float BHm() {
        return (float) 0;
    }

    public C110145aC(int i) {
        this.A00 = i;
    }

    public void B1P(C161937ni r7, int[] iArr, int[] iArr2, int i) {
        if (this.A00 != 0) {
            int i2 = 0;
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        int i9 = i - i7;
        int i10 = 0;
        while (i6 < r4) {
            int i11 = iArr[i6];
            iArr2[i10] = i9;
            i9 += i11;
            i6++;
            i10++;
        }
    }

    public String toString() {
        if (this.A00 != 0) {
            return "Arrangement#Top";
        }
        return "Arrangement#Bottom";
    }
}
