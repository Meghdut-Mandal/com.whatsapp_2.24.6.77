package X;

import java.io.DataInputStream;

/* renamed from: X.7N7  reason: invalid class name */
public final class AnonymousClass7N7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ DataInputStream $dataStream;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7N7(DataInputStream dataInputStream) {
        super(0);
        this.$dataStream = dataInputStream;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        DataInputStream dataInputStream = this.$dataStream;
        AnonymousClass00C.A0D(dataInputStream, 0);
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if (read == -1 || read2 == -1) {
            return null;
        }
        return Short.valueOf((short) (((read2 & 255) << 8) | (read & 255)));
    }
}
