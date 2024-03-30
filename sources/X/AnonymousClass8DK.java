package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.8DK  reason: invalid class name */
public final class AnonymousClass8DK extends C196249Yh {
    public AnonymousClass8DK(Unsafe unsafe) {
        super(unsafe);
    }

    public final void A07(long j, byte b) {
        Memory.pokeByte((int) (j & -1), b);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
    }
}
