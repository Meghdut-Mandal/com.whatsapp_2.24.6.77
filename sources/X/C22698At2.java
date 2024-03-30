package X;

/* renamed from: X.At2  reason: case insensitive filesystem */
public class C22698At2 extends AnonymousClass9g1 {
    public B3G A00 = new C22711AtF();

    public static byte[] A00(C22698At2 at2, int i) {
        B3G b3g = at2.A00;
        int BB8 = b3g.BB8();
        byte[] bArr = new byte[BB8];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = at2.A01;
            b3g.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = at2.A02;
            b3g.update(bArr4, 0, bArr4.length);
            b3g.B5n(bArr, 0);
            int i3 = i;
            if (i > BB8) {
                i3 = BB8;
            }
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            b3g.reset();
            b3g.update(bArr, 0, BB8);
        }
    }
}
