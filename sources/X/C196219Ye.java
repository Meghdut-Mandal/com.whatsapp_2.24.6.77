package X;

import sun.misc.Unsafe;

/* renamed from: X.9Ye  reason: invalid class name and case insensitive filesystem */
public abstract class C196219Ye {
    public Unsafe A00;

    public static int A00(Object obj, long j) {
        return C203729od.A00.A00.getInt(obj, -4 & j);
    }

    public byte A01(Object obj, long j) {
        int A01;
        boolean z = this instanceof C170618Ed;
        boolean z2 = C203729od.A03;
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

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public void A06(Object obj, long j, byte b) {
        if (C203729od.A03) {
            C203729od.A07(obj, j, b);
        } else {
            C203729od.A08(obj, j, b);
        }
    }

    public final void A09(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0A(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public void A0B(Object obj, long j, boolean z) {
        boolean z2 = C203729od.A03;
        byte b = z ? (byte) 1 : 0;
        if (z2) {
            C203729od.A07(obj, j, b);
        } else {
            C203729od.A08(obj, j, b);
        }
    }

    public boolean A0C(Object obj, long j) {
        int A01;
        int A012;
        boolean z = this instanceof C170618Ed;
        boolean z2 = C203729od.A03;
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

    public C196219Ye(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A07(Object obj, long j, double d) {
        A0A(obj, j, Double.doubleToLongBits(d));
    }

    public void A08(Object obj, long j, float f) {
        A09(obj, j, Float.floatToIntBits(f));
    }
}
