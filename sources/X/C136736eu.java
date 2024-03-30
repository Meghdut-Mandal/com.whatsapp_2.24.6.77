package X;

/* renamed from: X.6eu  reason: invalid class name and case insensitive filesystem */
public final class C136736eu implements C158757iB {
    public /* synthetic */ float BHm() {
        return (float) 0;
    }

    public String toString() {
        return "Arrangement#Start";
    }

    public void B1Q(C161937ni r7, AnonymousClass5RW r8, int[] iArr, int[] iArr2, int i) {
        if (r8 == AnonymousClass5RW.Ltr) {
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
        for (int i7 : iArr) {
            i6 += i7;
        }
        int i8 = i - i6;
        for (int i9 = r3 - 1; -1 < i9; i9--) {
            int i10 = iArr[i9];
            iArr2[i9] = i8;
            i8 += i10;
        }
    }
}
