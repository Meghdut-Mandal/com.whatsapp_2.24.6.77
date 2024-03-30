package X;

/* renamed from: X.6Ks  reason: invalid class name and case insensitive filesystem */
public final class C130346Ks {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03 = new int[16];
    public int[] A04 = new int[16];

    public static final void A00(C130346Ks r3, int i, int i2) {
        int[] iArr = r3.A04;
        int[] iArr2 = r3.A03;
        int[] iArr3 = r3.A02;
        C90494aF.A1R(iArr, i, i2);
        C90494aF.A1R(iArr2, i, i2);
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public C130346Ks() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.A02 = iArr;
    }
}
