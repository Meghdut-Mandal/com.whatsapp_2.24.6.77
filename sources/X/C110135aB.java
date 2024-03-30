package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.5aB  reason: invalid class name and case insensitive filesystem */
public class C110135aB implements AnonymousClass7gS {
    public Object A00;
    public Object A01;
    public final int A02;

    public C110135aB(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final InputStream B6T(InputStream inputStream) {
        if (this.A02 != 0) {
            C128746Dl r4 = (C128746Dl) this.A00;
            byte[] bArr = (byte[]) this.A01;
            AnonymousClass00C.A0D(bArr, 1);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(1);
            byte[][] bArr2 = new byte[3][];
            bArr2[0] = allocate.array();
            byte[] bArr3 = r4.A01;
            if (bArr3 != null) {
                bArr2[1] = bArr3;
                bArr2[2] = bArr;
                byte[] A05 = C203239na.A05(bArr2);
                byte[] bArr4 = r4.A07;
                byte[] bArr5 = r4.A06;
                byte[] bArr6 = r4.A01;
                if (bArr6 != null) {
                    byte[] bArr7 = r4.A00;
                    if (bArr7 != null) {
                        byte[] A022 = C201929kj.A02(bArr4, bArr5, bArr6, bArr7, C129926Ja.A01, 1);
                        AnonymousClass00C.A08(A022);
                        return new AnonymousClass5RC(C90524aI.A0P(A05), new C187428xr(inputStream, A022, bArr));
                    }
                    throw AnonymousClass001.A09("Required value was null.");
                }
                throw AnonymousClass001.A09("Required value was null.");
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        return new AnonymousClass5RA(new C144826ss(((C144886sy) this.A00).A00).B5L((byte[]) this.A01), inputStream);
    }
}
