package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.9Yh  reason: invalid class name and case insensitive filesystem */
public abstract class C196249Yh {
    public Unsafe A00;

    public C196249Yh(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final long A06(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public abstract void A07(long j, byte b);

    public final void A0B(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0C(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public abstract void A0E(byte[] bArr, long j, long j2, long j3);

    public static int A00(Object obj, long j) {
        return C203609oO.A02.A00.getInt(obj, -4 & j);
    }

    public byte A01(Object obj, long j) {
        int A01;
        boolean z = this instanceof AnonymousClass8DL;
        boolean z2 = C203609oO.A08;
        if (z) {
            if (z2) {
                A01 = C165567td.A01(~j, A00(obj, j));
            } else {
                A01 = C165567td.A01(j, A00(obj, j));
            }
        } else if (z2) {
            A01 = C165567td.A01(~j, A00(obj, j));
        } else {
            A01 = C165567td.A01(j, A00(obj, j));
        }
        return (byte) A01;
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public void A08(Object obj, long j, byte b) {
        if (C203609oO.A08) {
            C203609oO.A05(obj, j, b);
        } else {
            C203609oO.A06(obj, j, b);
        }
    }

    public void A0D(Object obj, long j, boolean z) {
        boolean z2 = C203609oO.A08;
        byte b = z ? (byte) 1 : 0;
        if (z2) {
            C203609oO.A05(obj, j, b);
        } else {
            C203609oO.A06(obj, j, b);
        }
    }

    public boolean A0F(Object obj, long j) {
        int A01;
        int A012;
        boolean z = this instanceof AnonymousClass8DL;
        boolean z2 = C203609oO.A08;
        if (z) {
            if (z2) {
                A012 = C165567td.A01(~j, A00(obj, j));
            } else {
                A012 = C165567td.A01(j, A00(obj, j));
            }
            return AnonymousClass000.A1P((byte) A012);
        }
        if (z2) {
            A01 = C165567td.A01(~j, A00(obj, j));
        } else {
            A01 = C165567td.A01(j, A00(obj, j));
        }
        return AnonymousClass000.A1P((byte) A01);
    }

    public void A09(Object obj, long j, double d) {
        A0C(obj, j, Double.doubleToLongBits(d));
    }

    public void A0A(Object obj, long j, float f) {
        A0B(obj, j, Float.floatToIntBits(f));
    }
}
