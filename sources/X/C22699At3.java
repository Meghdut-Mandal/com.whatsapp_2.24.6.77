package X;

/* renamed from: X.At3  reason: case insensitive filesystem */
public class C22699At3 extends AnonymousClass9g1 {
    public B3G A00;

    public C22699At3(B3G b3g) {
        this.A00 = b3g;
    }

    public static byte[] A00(C22699At3 at3) {
        B3G b3g = at3.A00;
        int BB8 = b3g.BB8();
        byte[] bArr = new byte[BB8];
        byte[] bArr2 = at3.A01;
        b3g.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = at3.A02;
        b3g.update(bArr3, 0, bArr3.length);
        b3g.B5n(bArr, 0);
        for (int i = 1; i < at3.A00; i++) {
            b3g.update(bArr, 0, BB8);
            b3g.B5n(bArr, 0);
        }
        return bArr;
    }
}
