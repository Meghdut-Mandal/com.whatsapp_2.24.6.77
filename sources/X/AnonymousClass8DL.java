package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.8DL  reason: invalid class name */
public final class AnonymousClass8DL extends C196249Yh {
    public AnonymousClass8DL(Unsafe unsafe) {
        super(unsafe);
    }

    public final void A07(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
