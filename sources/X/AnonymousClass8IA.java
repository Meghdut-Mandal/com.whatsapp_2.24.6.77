package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Objects;

/* renamed from: X.8IA  reason: invalid class name */
public class AnonymousClass8IA extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass8IA(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i;
            return;
        }
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1L(A1Q, length, 0);
        C165567td.A1X(A1Q, 0, i);
        throw C165607th.A0i("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1Q);
    }

    public final void A0M(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            C165567td.A1X(A1Q, this.A01, i2);
            throw new C187368xk(String.format("Pos: %d, limit: %d, len: %d", A1Q), e);
        }
    }
}
