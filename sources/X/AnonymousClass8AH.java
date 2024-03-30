package X;

import java.nio.ByteBuffer;

/* renamed from: X.8AH  reason: invalid class name */
public final class AnonymousClass8AH extends AnonymousClass8AI {
    public final AnonymousClass84B A00;

    public void A07() {
        this.A00.A0C(new C22060Ag7(this));
    }

    public void A08() {
        this.A00.A0C(new C22061Ag8(this));
    }

    public AnonymousClass8AH(AnonymousClass84B r1) {
        super(r1);
        this.A00 = r1;
    }

    public static final byte[] A02(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            AnonymousClass00C.A08(array);
            return array;
        }
        int position = byteBuffer.position();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }
}
