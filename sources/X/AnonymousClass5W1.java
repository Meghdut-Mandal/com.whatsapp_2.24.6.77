package X;

/* renamed from: X.5W1  reason: invalid class name */
public abstract class AnonymousClass5W1 {
    public static final int A00(C1506776e r5, int i) {
        int i2 = r5.A00 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = r5.A01;
            int i5 = ((C120625ro) objArr[i4]).A01;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C120625ro) objArr[i3]).A01) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
