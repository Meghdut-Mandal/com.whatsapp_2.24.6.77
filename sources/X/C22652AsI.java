package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.AsI  reason: case insensitive filesystem */
public class C22652AsI extends AnonymousClass121 {
    public static C22652AsI[] A02 = new C22652AsI[12];
    public final byte[] A00;
    public final int A01;

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 10, z);
    }

    public boolean A0E() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public static C22652AsI A01(Object obj) {
        if (obj == null || (obj instanceof C22652AsI)) {
            return (C22652AsI) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C22652AsI) AnonymousClass121.A00((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                throw AnonymousClass000.A0c(C90494aF.A0c(e, "encoding error in getInstance: ", A0u), A0u);
            }
        } else {
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public int A0A() {
        return C165587tf.A08(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22652AsI)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22652AsI) r3).A00);
    }

    public int A0H() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        int i = this.A01;
        if (length - i <= 4) {
            int max = Math.max(i, length - 4);
            byte b = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    return b;
                }
                b = (b << 8) | (bArr[max] & 255);
            }
        } else {
            throw new ArithmeticException("ASN.1 Enumerated out of int range");
        }
    }

    public C22652AsI(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C200679hw.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass001.A08("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.A00 = AnonymousClass124.A02(bArr);
            int i = length - 1;
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                if (bArr[i2] != (bArr[i3] >> 7)) {
                    break;
                }
                i2 = i3;
            }
            this.A01 = i2;
        } else {
            throw AnonymousClass001.A08("enumerated must be non-negative");
        }
    }

    public C22652AsI(int i) {
        if (i >= 0) {
            this.A00 = BigInteger.valueOf((long) i).toByteArray();
            this.A01 = 0;
            return;
        }
        throw AnonymousClass001.A08("enumerated must be non-negative");
    }
}
