package X;

/* renamed from: X.AtD  reason: case insensitive filesystem */
public class C22709AtD extends C21788AaL {
    public static final int[] A04;
    public int A00;
    public int[] A01;
    public int[] A02;
    public int[] A03;

    static {
        int i;
        int[] iArr = new int[64];
        A04 = iArr;
        int i2 = 0;
        do {
            iArr[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
            i = 16;
        } while (i2 < 16);
        do {
            int i3 = i % 32;
            iArr[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
            i++;
        } while (i < 64);
    }

    public C22709AtD() {
        this.A01 = new int[8];
        this.A03 = new int[16];
        this.A02 = new int[68];
        reset();
    }

    public B21 B3i() {
        return new C22709AtD(this);
    }

    public String B8R() {
        return "SM3";
    }

    public int BB8() {
        return 32;
    }

    public void reset() {
        super.reset();
        int[] iArr = this.A01;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.A00 = 0;
    }

    public void BoU(B21 b21) {
        C22709AtD atD = (C22709AtD) b21;
        super.A0S(atD);
        int[] iArr = atD.A01;
        int[] iArr2 = this.A01;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = atD.A03;
        int[] iArr4 = this.A03;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.A00 = atD.A00;
    }

    public C22709AtD(C22709AtD atD) {
        super(atD);
        int[] iArr = new int[8];
        this.A01 = iArr;
        this.A03 = new int[16];
        this.A02 = new int[68];
        System.arraycopy(atD.A01, 0, iArr, 0, 8);
        int[] iArr2 = atD.A03;
        int[] iArr3 = this.A03;
        System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        this.A00 = atD.A00;
    }

    public int B5n(byte[] bArr, int i) {
        A0R();
        int[] iArr = this.A01;
        for (int A022 : iArr) {
            C202779me.A02(bArr, A022, i);
            i += 4;
        }
        reset();
        return 32;
    }
}
