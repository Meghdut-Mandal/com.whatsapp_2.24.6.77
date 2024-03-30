package X;

import sun.misc.Unsafe;

/* renamed from: X.8DM  reason: invalid class name */
public final class AnonymousClass8DM extends C196249Yh {
    public AnonymousClass8DM(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte A01(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A02(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A03(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A07(long j, byte b) {
        this.A00.putByte(j, b);
    }

    public final void A08(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A09(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A0A(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0D(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final boolean A0F(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        this.A00.copyMemory(bArr, C203609oO.A00 + j, (Object) null, j2, j3);
    }
}
