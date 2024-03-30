package X;

import java.nio.ByteBuffer;

/* renamed from: X.9PP  reason: invalid class name */
public class AnonymousClass9PP {
    public final C192439Gz A00 = new C192439Gz();

    public void A00(int i, int i2, ByteBuffer byteBuffer, int i3) {
        if (byteBuffer == null) {
            throw AnonymousClass001.A08("Null image data supplied.");
        } else if (byteBuffer.capacity() < i * i2) {
            throw AnonymousClass001.A08("Invalid image data size.");
        } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
            C192439Gz r0 = this.A00;
            r0.A00 = byteBuffer;
            AnonymousClass9MP r02 = r0.A01;
            r02.A00 = i;
            r02.A01 = i2;
        } else {
            throw AnonymousClass000.A0d("Unsupported image format: ", C90524aI.A0h(37), i3);
        }
    }
}
