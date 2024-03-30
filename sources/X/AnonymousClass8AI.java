package X;

import java.nio.ByteBuffer;

/* renamed from: X.8AI  reason: invalid class name */
public abstract class AnonymousClass8AI extends AnonymousClass84C {
    public final AnonymousClass84B A00;

    public void A07() {
        this.A00.A0C(new C22058Ag5(this));
    }

    public void A08() {
        this.A00.A0C(new C22059Ag6(this));
    }

    public AnonymousClass8AI(AnonymousClass84B r1) {
        super(r1);
        this.A00 = r1;
    }

    public static final ByteBuffer A03(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity() + byteBuffer2.capacity());
        byteBuffer.flip();
        allocateDirect.put(byteBuffer);
        allocateDirect.put(byteBuffer2);
        return allocateDirect;
    }
}
