package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Asa  reason: case insensitive filesystem */
public class C22670Asa extends AnonymousClass121 implements B0I {
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] A00;

    public C22670Asa(byte[] bArr) {
        this.A00 = AnonymousClass124.A02(bArr);
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 28, z);
    }

    public boolean A0E() {
        return false;
    }

    public String BHz() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A08 = A08();
            for (int i = 0; i != A08.length; i++) {
                char[] cArr = A01;
                stringBuffer.append(cArr[(A08[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A08[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new AnonymousClass92R("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public String toString() {
        return BHz();
    }

    public int A0A() {
        return C165587tf.A08(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22670Asa)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22670Asa) r3).A00);
    }
}
