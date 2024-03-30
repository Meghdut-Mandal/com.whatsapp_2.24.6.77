package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.8I4  reason: invalid class name */
public final class AnonymousClass8I4 extends AnonymousClass8I5 {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public AnonymousClass8I4(byte[] bArr, int i, int i2) {
        super(bArr);
        C21674AUx.A00(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    public Object writeReplace() {
        return new AnonymousClass8I5(A06());
    }
}
