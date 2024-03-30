package X;

import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.9oO  reason: invalid class name and case insensitive filesystem */
public final class C203609oO {
    public static final long A00;
    public static final long A01;
    public static final C196249Yh A02;
    public static final Class A03;
    public static final Logger A04 = C165587tf.A0p(C203609oO.class);
    public static final Unsafe A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08 = C36361kB.A1a(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    public static int A00(Class cls) {
        if (A06) {
            return A02.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A01(Object obj, long j) {
        return A02.A00.getObject(obj, j);
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AXD());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Class cls) {
        if (A06) {
            A02.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, Object obj2) {
        A02.A00.putObject(obj, j, obj2);
    }

    public static void A08(byte[] bArr, long j, byte b) {
        A02.A08(bArr, A00 + j, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e A[SYNTHETIC, Splitter:B:52:0x014e] */
    static {
        /*
            java.lang.Class<double[]> r18 = double[].class
            java.lang.Class<float[]> r17 = float[].class
            java.lang.Class<long[]> r16 = long[].class
            java.lang.Class<int[]> r15 = int[].class
            java.lang.Class<boolean[]> r14 = boolean[].class
            java.lang.Class<X.9oO> r0 = X.C203609oO.class
            java.util.logging.Logger r0 = X.C165587tf.A0p(r0)
            A04 = r0
            sun.misc.Unsafe r4 = A03()
            A05 = r4
            java.lang.Class r6 = X.C196939am.A00
            A03 = r6
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            if (r6 == 0) goto L_0x002b
            boolean r0 = X.C196939am.A01
            if (r0 != 0) goto L_0x002b
            boolean r3 = X.C165567td.A1b(r6, r1)     // Catch:{ all -> 0x002d }
            goto L_0x002e
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r6 == 0) goto L_0x003d
            boolean r0 = X.C196939am.A01
            if (r0 != 0) goto L_0x003d
            java.lang.Class r0 = A03     // Catch:{ all -> 0x003f }
            boolean r2 = X.C165567td.A1b(r0, r5)     // Catch:{ all -> 0x003f }
            goto L_0x0040
        L_0x003d:
            r2 = 0
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r1 = 0
            if (r4 == 0) goto L_0x0050
            if (r6 == 0) goto L_0x0064
            boolean r0 = X.C196939am.A01
            if (r0 != 0) goto L_0x0064
            if (r3 == 0) goto L_0x005c
            X.8DL r1 = new X.8DL
            r1.<init>(r4)
        L_0x0050:
            A02 = r1
            java.lang.String r9 = "copyMemory"
            java.lang.String r8 = "getLong"
            sun.misc.Unsafe r0 = A05
            r7 = 0
            if (r0 == 0) goto L_0x00fc
            goto L_0x006a
        L_0x005c:
            if (r2 == 0) goto L_0x0050
            X.8DK r1 = new X.8DK
            r1.<init>(r4)
            goto L_0x0050
        L_0x0064:
            X.8DM r1 = new X.8DM
            r1.<init>(r4)
            goto L_0x0050
        L_0x006a:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "objectFieldOffset"
            r11 = 1
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ all -> 0x00da }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r7] = r0     // Catch:{ all -> 0x00da }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00da }
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00da }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r1[r7] = r12     // Catch:{ all -> 0x00da }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00da }
            r1[r11] = r0     // Catch:{ all -> 0x00da }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00da }
            java.lang.reflect.Field r0 = A02()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00fc
            if (r6 == 0) goto L_0x0095
            boolean r0 = X.C196939am.A01     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x0095
            goto L_0x00fe
        L_0x0095:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00da }
            java.lang.Class r0 = X.C165597tg.A0b(r4, r1, r0, r7)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00da }
            r1[r7] = r0     // Catch:{ all -> 0x00da }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00da }
            r1[r11] = r0     // Catch:{ all -> 0x00da }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00da }
            X.C165587tf.A1F(r4)     // Catch:{ all -> 0x00da }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00da }
            java.lang.Class r3 = X.C165597tg.A0b(r4, r8, r0, r7)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ all -> 0x00da }
            r0[r7] = r3     // Catch:{ all -> 0x00da }
            r0[r11] = r3     // Catch:{ all -> 0x00da }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00da }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00da }
            r0[r7] = r3     // Catch:{ all -> 0x00da }
            r0[r11] = r3     // Catch:{ all -> 0x00da }
            r0[r10] = r3     // Catch:{ all -> 0x00da }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00da }
            r0 = 5
            java.lang.Class[] r1 = X.C165597tg.A1Y(r3, r0)     // Catch:{ all -> 0x00da }
            r1[r10] = r12     // Catch:{ all -> 0x00da }
            r1[r2] = r3     // Catch:{ all -> 0x00da }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00da }
            r4.getMethod(r9, r1)     // Catch:{ all -> 0x00da }
            goto L_0x00fe
        L_0x00da:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00ff
        L_0x00fc:
            r0 = 0
            goto L_0x00ff
        L_0x00fe:
            r0 = 1
        L_0x00ff:
            A07 = r0
            sun.misc.Unsafe r0 = A05
            if (r0 != 0) goto L_0x014e
            r0 = 0
        L_0x0106:
            A06 = r0
            int r0 = A00(r13)
            long r0 = (long) r0
            A00 = r0
            A00(r14)
            A04(r14)
            A00(r15)
            A04(r15)
            A00(r16)
            A04(r16)
            A00(r17)
            A04(r17)
            A00(r18)
            A04(r18)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A00(r0)
            A04(r0)
            java.lang.reflect.Field r1 = A02()
            if (r1 == 0) goto L_0x014b
            X.9Yh r0 = A02
            if (r0 == 0) goto L_0x014b
            long r0 = r0.A06(r1)
        L_0x0143:
            A01 = r0
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "value"
            goto L_0x021b
        L_0x014b:
            r0 = -1
            goto L_0x0143
        L_0x014e:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x01f8 }
            r10 = 1
            X.C165567td.A1I(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f8 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r0[r7] = r2     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = X.C165597tg.A0b(r4, r1, r0, r10)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "putInt"
            r9 = 3
            java.lang.Class[] r0 = X.C165597tg.A1Y(r0, r9)     // Catch:{ all -> 0x01f8 }
            r0[r3] = r5     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f8 }
            r0[r7] = r2     // Catch:{ all -> 0x01f8 }
            java.lang.Class r5 = X.C165597tg.A0b(r4, r8, r0, r10)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            r0[r3] = r5     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            r0[r3] = r2     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            if (r6 == 0) goto L_0x019d
            boolean r0 = X.C196939am.A01     // Catch:{ all -> 0x01f8 }
            if (r0 != 0) goto L_0x019d
            goto L_0x01f5
        L_0x019d:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01f8 }
            r1[r3] = r0     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01f8 }
            r1[r3] = r0     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01f8 }
            r1[r3] = r0     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01f8 }
            r1[r3] = r0     // Catch:{ all -> 0x01f8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f8 }
        L_0x01f5:
            r0 = 1
            goto L_0x0106
        L_0x01f8:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x0106
        L_0x021b:
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0232 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0232 }
            java.lang.Class r1 = r2.getType()
            java.lang.Class<char[]> r0 = char[].class
            if (r1 != r0) goto L_0x0232
            X.9Yh r0 = A02
            if (r0 == 0) goto L_0x0232
            r0.A06(r2)
        L_0x0232:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.C36361kB.A1a(r1, r0)
            A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203609oO.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.C196939am.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.C196939am.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C196939am.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x001d
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0019 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            return r2
        L_0x001d:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0036
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0036
            return r2
        L_0x0036:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203609oO.A02():java.lang.reflect.Field");
    }

    public static void A05(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C196249Yh r4 = A02;
        r4.A0B(obj, j2, C165577te.A02(~((int) j), r4.A04(obj, j2), b));
    }

    public static void A06(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C196249Yh r4 = A02;
        r4.A0B(obj, j2, C165577te.A02((int) j, r4.A04(obj, j2), b));
    }
}
