package X;

/* renamed from: X.ArC  reason: case insensitive filesystem */
public class C22584ArC extends C22649AsF {
    public C22584ArC(byte[] bArr, int i, boolean z) {
        super(bArr, i, z);
    }

    public void A0D(C200179gm r5, boolean z) {
        int i = 64;
        if (this.A01) {
            i = 96;
        }
        int i2 = this.A00;
        byte[] bArr = this.A02;
        r5.A02(i, i2, z);
        int length = bArr.length;
        r5.A01(length);
        r5.A00.write(bArr, 0, length);
    }
}
