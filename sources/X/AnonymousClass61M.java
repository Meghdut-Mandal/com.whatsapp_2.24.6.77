package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.61M  reason: invalid class name */
public final class AnonymousClass61M {
    public final C128736Dk A00;

    public final AnonymousClass5RC A00(InputStream inputStream, byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[][] bArr2 = new byte[3][];
        bArr2[0] = allocate.array();
        C128736Dk r2 = this.A00;
        byte[] bArr3 = r2.A01;
        if (bArr3 != null) {
            C36411kG.A1Q(bArr3, bArr, bArr2, 1);
            byte[] A05 = C203239na.A05(bArr2);
            byte[] bArr4 = r2.A07;
            byte[] bArr5 = r2.A06;
            byte[] bArr6 = r2.A01;
            if (bArr6 != null) {
                byte[] bArr7 = r2.A00;
                if (bArr7 != null) {
                    byte[] A02 = C201929kj.A02(bArr4, bArr5, bArr6, bArr7, AnonymousClass6JZ.A01, 1);
                    AnonymousClass00C.A08(A02);
                    return new AnonymousClass5RC(C90524aI.A0P(A05), new C187428xr(inputStream, A02, bArr));
                }
                throw AnonymousClass001.A09("Required value was null.");
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        throw AnonymousClass001.A09("Required value was null.");
    }

    public AnonymousClass61M(C128736Dk r1) {
        this.A00 = r1;
    }
}
