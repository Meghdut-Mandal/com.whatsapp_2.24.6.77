package X;

import java.nio.ByteBuffer;

/* renamed from: X.957  reason: invalid class name */
public abstract class AnonymousClass957 {
    public static final C197549bt A00(C21070A7h a7h, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a7h.A0k((C23073B3d) null));
        AnonymousClass00C.A0B(allocateDirect);
        a7h.A0n(new C187488xx(allocateDirect));
        allocateDirect.flip();
        return new C197549bt(i, allocateDirect);
    }
}
