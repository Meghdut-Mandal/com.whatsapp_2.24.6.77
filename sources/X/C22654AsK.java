package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.AsK  reason: case insensitive filesystem */
public class C22654AsK extends AnonymousClass121 {
    public final byte[] A00;
    public final int A01;

    public C22654AsK(long j) {
        this.A00 = BigInteger.valueOf(j).toByteArray();
        this.A01 = 0;
    }

    public C22654AsK(BigInteger bigInteger) {
        this.A00 = bigInteger.toByteArray();
        this.A01 = 0;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 2, z);
    }

    public boolean A0E() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public static C22654AsK A01(Object obj) {
        if (obj == null || (obj instanceof C22654AsK)) {
            return (C22654AsK) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C22654AsK) AnonymousClass121.A00((byte[]) obj);
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
        if (!(r3 instanceof C22654AsK)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22654AsK) r3).A00);
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
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
    }

    public boolean A0I(BigInteger bigInteger) {
        if (bigInteger != null) {
            byte[] bArr = this.A00;
            int i = this.A01;
            int length = bArr.length;
            int max = Math.max(i, length - 4);
            byte b = -1 & bArr[max];
            while (true) {
                max++;
                if (max >= length) {
                    break;
                }
                b = (b << 8) | (bArr[max] & 255);
            }
            if (b != bigInteger.intValue() || !new BigInteger(bArr).equals(bigInteger)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return new BigInteger(this.A00).toString();
    }

    public C22654AsK(byte[] bArr, boolean z) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0 || (length != 1 && bArr[0] == (bArr[1] >> 7) && !C200679hw.A01("org.spongycastle.asn1.allow_unsafe_integer"))) {
            throw AnonymousClass001.A08("malformed integer");
        }
        if (z) {
            bArr2 = AnonymousClass124.A02(bArr);
        } else {
            bArr2 = bArr;
        }
        this.A00 = bArr2;
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
    }

    public static C22654AsK A02(C22658AsO asO) {
        AnonymousClass121 A012 = C22658AsO.A01(asO);
        if (A012 instanceof C22654AsK) {
            return A01(A012);
        }
        return new C22654AsK(C22659AsP.A03(A012), true);
    }
}
