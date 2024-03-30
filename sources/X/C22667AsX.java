package X;

import java.io.IOException;
import java.util.Objects;

/* renamed from: X.AsX  reason: case insensitive filesystem */
public abstract class C22667AsX extends AnonymousClass121 implements B0I {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final byte[] A01;

    public AnonymousClass121 A0B() {
        return new C22586ArE(this.A01, this.A00);
    }

    public boolean A0F(AnonymousClass121 r9) {
        if (!(r9 instanceof C22667AsX)) {
            return false;
        }
        C22667AsX asX = (C22667AsX) r9;
        int i = this.A00;
        if (i != asX.A00) {
            return false;
        }
        byte[] bArr = this.A01;
        byte[] bArr2 = asX.A01;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = length - 1;
        if (i2 < 0) {
            return true;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
        }
        int i4 = 255 << i;
        return ((byte) (bArr[i2] & i4)) == ((byte) (bArr2[i2] & i4));
    }

    public byte[] A0H() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length == 0) {
            return bArr;
        }
        byte[] A022 = AnonymousClass124.A02(bArr);
        int i = length - 1;
        A022[i] = (byte) (A022[i] & (255 << this.A00));
        return A022;
    }

    public String toString() {
        return BHz();
    }

    public String BHz() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A08 = A08();
            for (int i = 0; i != A08.length; i++) {
                char[] cArr = A02;
                stringBuffer.append(cArr[(A08[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A08[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new AnonymousClass92R(C36331k8.A0i("Internal error encoding BitString: ", AnonymousClass000.A0u(), e), e);
        }
    }

    public int hashCode() {
        byte[] bArr = this.A01;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = bArr[length];
        int i = this.A00;
        byte b2 = (byte) (b & (255 << i));
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return ((i2 * 257) ^ b2) ^ i;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public C22667AsX(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0) {
            if (i != 0) {
                throw AnonymousClass001.A08("zero length data with non-zero pad bits");
            }
        } else if (i > 7 || i < 0) {
            throw AnonymousClass001.A08("pad bits cannot be greater than 7 or less than 0");
        }
        this.A01 = AnonymousClass124.A02(bArr);
        this.A00 = i;
    }
}
