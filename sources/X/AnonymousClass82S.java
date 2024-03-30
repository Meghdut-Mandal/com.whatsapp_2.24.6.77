package X;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.82S  reason: invalid class name */
public final class AnonymousClass82S extends C208989zH {
    public final C209409zx A00;

    public AnonymousClass82S(C209409zx r1) {
        Objects.requireNonNull(r1);
        this.A00 = r1;
    }

    public void Bmg(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            C209409zx r4 = this.A00;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            ByteBuffer allocate = ByteBuffer.allocate(asReadOnlyBuffer.limit() - asReadOnlyBuffer.position());
            allocate.put(asReadOnlyBuffer);
            allocate.flip();
            r4.A01.A0o.BbV(allocate.array());
            ByteBuffer A02 = A02(remaining);
            A02.put(byteBuffer);
            A02.flip();
        }
    }
}
