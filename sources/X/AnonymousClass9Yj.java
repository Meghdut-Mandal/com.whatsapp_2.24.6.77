package X;

import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.9Yj  reason: invalid class name */
public abstract class AnonymousClass9Yj {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return UnsafeUtil.A02.A00.getObject(obj, j);
    }

    public byte A01(long j) {
        if (this instanceof C173568Se) {
            throw AnonymousClass001.A0D();
        }
        throw AnonymousClass001.A0D();
    }

    public byte A02(Object obj, long j) {
        int A01;
        boolean z = this instanceof C173568Se;
        boolean z2 = UnsafeUtil.A09;
        if (z) {
            long j2 = -4 & j;
            AnonymousClass9Yj r0 = UnsafeUtil.A02;
            if (z2) {
                A01 = C165567td.A01(~j, r0.A06(obj, j2));
            } else {
                A01 = C165567td.A01(j, r0.A06(obj, j2));
            }
        } else {
            long j3 = -4 & j;
            AnonymousClass9Yj r02 = UnsafeUtil.A02;
            if (z2) {
                A01 = C165567td.A01(~j, r02.A06(obj, j3));
            } else {
                A01 = C165567td.A01(j, r02.A06(obj, j3));
            }
        }
        return (byte) (A01 & 255);
    }

    public double A03(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A04(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A05(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A06(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A07(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final long A08(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public final Object A09(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A0A(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A0B(Object obj, long j, byte b) {
        if (UnsafeUtil.A09) {
            UnsafeUtil.A04(obj, j, b);
        } else {
            UnsafeUtil.A05(obj, j, b);
        }
    }

    public final void A0E(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0F(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0G(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0H(Object obj, long j, boolean z) {
        boolean z2 = UnsafeUtil.A09;
        byte b = z ? (byte) 1 : 0;
        if (z2) {
            UnsafeUtil.A04(obj, j, b);
        } else {
            UnsafeUtil.A05(obj, j, b);
        }
    }

    public void A0I(byte[] bArr, long j, long j2, long j3) {
        if (this instanceof C173568Se) {
            throw AnonymousClass001.A0D();
        }
        throw AnonymousClass001.A0D();
    }

    public boolean A0J() {
        try {
            Class<?> cls = this.A00.getClass();
            C165567td.A1I(cls);
            Class[] clsArr = new Class[2];
            Class<Object> cls2 = Object.class;
            clsArr[0] = cls2;
            Class[] A1Y = C165597tg.A1Y(C165597tg.A0b(cls, "getInt", clsArr, 1), 3);
            A1Y[2] = Integer.TYPE;
            cls.getMethod("putInt", A1Y);
            Class[] clsArr2 = new Class[2];
            clsArr2[0] = cls2;
            Class A0b = C165597tg.A0b(cls, "getLong", clsArr2, 1);
            Class[] A1Y2 = C165597tg.A1Y(A0b, 3);
            A1Y2[2] = A0b;
            cls.getMethod("putLong", A1Y2);
            cls.getMethod("getObject", C165597tg.A1Y(A0b, 2));
            Class[] A1Y3 = C165597tg.A1Y(A0b, 3);
            A1Y3[2] = cls2;
            cls.getMethod("putObject", A1Y3);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A08(th);
            return false;
        }
    }

    public boolean A0K() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (UnsafeUtil.A01() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A08(th);
            return false;
        }
    }

    public boolean A0L(Object obj, long j) {
        int A01;
        int A012;
        boolean z = this instanceof C173568Se;
        boolean z2 = UnsafeUtil.A09;
        if (z) {
            long j2 = -4 & j;
            AnonymousClass9Yj r0 = UnsafeUtil.A02;
            if (z2) {
                A012 = C165567td.A01(~j, r0.A06(obj, j2));
            } else {
                A012 = C165567td.A01(j, r0.A06(obj, j2));
            }
            return AnonymousClass000.A1P((byte) (A012 & 255));
        }
        long j3 = -4 & j;
        AnonymousClass9Yj r02 = UnsafeUtil.A02;
        if (z2) {
            A01 = C165567td.A01(~j, r02.A06(obj, j3));
        } else {
            A01 = C165567td.A01(j, r02.A06(obj, j3));
        }
        return AnonymousClass000.A1P((byte) (A01 & 255));
    }

    public AnonymousClass9Yj(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0C(Object obj, long j, double d) {
        A0F(obj, j, Double.doubleToLongBits(d));
    }

    public void A0D(Object obj, long j, float f) {
        A0E(obj, j, Float.floatToIntBits(f));
    }
}
