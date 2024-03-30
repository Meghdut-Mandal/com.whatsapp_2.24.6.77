package X;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.82T  reason: invalid class name */
public final class AnonymousClass82T extends C208989zH {
    public int[] A00;
    public int[] A01;

    public void Bmg(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A02 = A02(((limit - position) / this.A00.A00) * this.A06.A00);
        while (position < limit) {
            for (int i : iArr) {
                A02.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A02.flip();
    }
}
