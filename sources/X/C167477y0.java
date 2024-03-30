package X;

import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.7y0  reason: invalid class name and case insensitive filesystem */
public class C167477y0 extends C187478xw {
    public C167477y0(InputStream inputStream) {
        super(inputStream, ByteOrder.BIG_ENDIAN);
        if (inputStream.markSupported()) {
            this.A03.mark(Integer.MAX_VALUE);
            return;
        }
        throw AnonymousClass001.A08("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public void A01(long j) {
        long j2 = (long) this.A00;
        if (j2 > j) {
            this.A00 = 0;
            this.A03.reset();
        } else {
            j -= j2;
        }
        A00((int) j);
    }

    public C167477y0(byte[] bArr) {
        super(bArr);
        this.A03.mark(Integer.MAX_VALUE);
    }
}
