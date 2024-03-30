package X;

/* renamed from: X.6ev  reason: invalid class name and case insensitive filesystem */
public final class C136746ev implements C161447mv {
    public final float A00 = ((float) 0);

    public void B1P(C161937ni r8, int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        int i5 = 0;
        while (i2 < r6) {
            int i6 = iArr[i2];
            iArr2[i5] = C14960mT.A01(f);
            f += (float) i6;
            i2++;
            i5++;
        }
    }

    public String toString() {
        return "Arrangement#Center";
    }

    public void B1Q(C161937ni r8, AnonymousClass5RW r9, int[] iArr, int[] iArr2, int i) {
        boolean z = true;
        if (r9 == AnonymousClass5RW.Ltr) {
            z = false;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        if (!z) {
            int i5 = 0;
            while (i2 < r6) {
                int i6 = iArr[i2];
                iArr2[i5] = C14960mT.A01(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = r6 - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = C14960mT.A01(f);
            f += (float) i8;
        }
    }

    public float BHm() {
        return this.A00;
    }
}
