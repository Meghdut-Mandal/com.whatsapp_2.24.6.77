package X;

import com.google.protobuf.UnsafeUtil;
import sun.misc.Unsafe;

/* renamed from: X.8Sf  reason: invalid class name and case insensitive filesystem */
public final class C173578Sf extends AnonymousClass9Yj {
    public byte A01(long j) {
        return this.A00.getByte(j);
    }

    public byte A02(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public double A03(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public float A04(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public void A0B(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public void A0C(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public void A0D(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public void A0H(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public void A0I(byte[] bArr, long j, long j2, long j3) {
        long j4 = j;
        this.A00.copyMemory((Object) null, j4, bArr, UnsafeUtil.A01 + 0, j3);
    }

    public boolean A0K() {
        if (!super.A0K()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("putByte", new Class[]{C165597tg.A0b(cls, "getByte", new Class[1], 0), Byte.TYPE});
            C165587tf.A1F(cls);
            Class A0b = C165597tg.A0b(cls, "getLong", new Class[1], 0);
            cls.getMethod("putLong", new Class[]{A0b, A0b});
            cls.getMethod("copyMemory", new Class[]{A0b, A0b, A0b});
            Class<Object> cls2 = Object.class;
            cls.getMethod("copyMemory", new Class[]{cls2, A0b, cls2, A0b, A0b});
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A08(th);
            return false;
        }
    }

    public boolean A0L(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public boolean A0J() {
        if (!super.A0J()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class<Object> cls2 = Object.class;
            Class cls3 = Long.TYPE;
            cls.getMethod("getByte", new Class[]{cls2, cls3});
            Class[] A1Y = C165597tg.A1Y(cls3, 3);
            A1Y[2] = Byte.TYPE;
            cls.getMethod("putByte", A1Y);
            Class[] clsArr = new Class[2];
            clsArr[0] = cls2;
            Class[] A1Y2 = C165597tg.A1Y(C165597tg.A0b(cls, "getBoolean", clsArr, 1), 3);
            A1Y2[2] = Boolean.TYPE;
            cls.getMethod("putBoolean", A1Y2);
            Class[] clsArr2 = new Class[2];
            clsArr2[0] = cls2;
            Class[] A1Y3 = C165597tg.A1Y(C165597tg.A0b(cls, "getFloat", clsArr2, 1), 3);
            A1Y3[2] = Float.TYPE;
            cls.getMethod("putFloat", A1Y3);
            Class[] clsArr3 = new Class[2];
            clsArr3[0] = cls2;
            Class[] A1Y4 = C165597tg.A1Y(C165597tg.A0b(cls, "getDouble", clsArr3, 1), 3);
            A1Y4[2] = Double.TYPE;
            cls.getMethod("putDouble", A1Y4);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A08(th);
            return false;
        }
    }

    public C173578Sf(Unsafe unsafe) {
        super(unsafe);
    }
}
