package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: X.9od  reason: invalid class name and case insensitive filesystem */
public final class C203729od {
    public static final C196219Ye A00;
    public static final Class A01 = C196949an.A00;
    public static final Unsafe A02;
    public static final boolean A03 = C36361kB.A1a(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final boolean A04;
    public static final boolean A05;
    public static final long A06;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014c A[SYNTHETIC, Splitter:B:44:0x014c] */
    static {
        /*
            java.lang.Class<double[]> r18 = double[].class
            java.lang.Class<float[]> r17 = float[].class
            java.lang.Class<long[]> r16 = long[].class
            java.lang.Class<int[]> r15 = int[].class
            java.lang.Class<boolean[]> r14 = boolean[].class
            sun.misc.Unsafe r3 = A05()
            A02 = r3
            java.lang.Class r0 = X.C196949an.A00
            A01 = r0
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            boolean r0 = X.C196949an.A00()
            r5 = 0
            if (r0 != 0) goto L_0x005b
            r2 = 0
        L_0x0020:
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r0 = X.C196949an.A00()
            if (r0 != 0) goto L_0x0052
            r1 = 0
        L_0x0029:
            r7 = 0
            if (r3 == 0) goto L_0x0039
            boolean r0 = X.C196949an.A00()
            if (r0 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x0044
            X.8Ed r7 = new X.8Ed
            r7.<init>(r3)
        L_0x0039:
            A00 = r7
            java.lang.String r9 = "copyMemory"
            java.lang.String r8 = "getLong"
            sun.misc.Unsafe r0 = A02
            if (r0 == 0) goto L_0x00f9
            goto L_0x0064
        L_0x0044:
            if (r1 == 0) goto L_0x0039
            X.8Eb r7 = new X.8Eb
            r7.<init>(r3)
            goto L_0x0039
        L_0x004c:
            X.8Ec r7 = new X.8Ec
            r7.<init>(r3)
            goto L_0x0039
        L_0x0052:
            java.lang.Class r0 = A01     // Catch:{ all -> 0x0059 }
            boolean r1 = X.C165567td.A1b(r0, r6)     // Catch:{ all -> 0x0059 }
            goto L_0x0029
        L_0x0059:
            r1 = 0
            goto L_0x0029
        L_0x005b:
            java.lang.Class r0 = A01     // Catch:{ all -> 0x0062 }
            boolean r2 = X.C165567td.A1b(r0, r1)     // Catch:{ all -> 0x0062 }
            goto L_0x0020
        L_0x0062:
            r2 = 0
            goto L_0x0020
        L_0x0064:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "objectFieldOffset"
            r11 = 1
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r5] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00d3 }
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r1[r5] = r12     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d3 }
            r1[r11] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.reflect.Field r0 = A04()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00f9
            boolean r0 = X.C196949an.A00()     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x00fb
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = X.C165597tg.A0b(r4, r1, r0, r5)     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            r1[r5] = r0     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00d3 }
            r1[r11] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00d3 }
            X.C165587tf.A1F(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class r3 = X.C165597tg.A0b(r4, r8, r0, r5)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            r0[r5] = r3     // Catch:{ all -> 0x00d3 }
            r0[r11] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00d3 }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00d3 }
            r0[r5] = r3     // Catch:{ all -> 0x00d3 }
            r0[r11] = r3     // Catch:{ all -> 0x00d3 }
            r0[r10] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00d3 }
            r0 = 5
            java.lang.Class[] r1 = X.C165597tg.A1Y(r3, r0)     // Catch:{ all -> 0x00d3 }
            r1[r10] = r12     // Catch:{ all -> 0x00d3 }
            r1[r2] = r3     // Catch:{ all -> 0x00d3 }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r9, r1)     // Catch:{ all -> 0x00d3 }
            goto L_0x00fb
        L_0x00d3:
            r1 = move-exception
            java.lang.Class<X.9od> r0 = X.C203729od.class
            java.util.logging.Logger r4 = X.C165587tf.A0p(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00fc
        L_0x00f9:
            r0 = 0
            goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            A04 = r0
            sun.misc.Unsafe r0 = A02
            if (r0 != 0) goto L_0x014c
            r0 = 0
        L_0x0103:
            A05 = r0
            int r0 = A01(r13)
            long r0 = (long) r0
            A06 = r0
            A01(r14)
            A06(r14)
            A01(r15)
            A06(r15)
            A01(r16)
            A06(r16)
            A01(r17)
            A06(r17)
            A01(r18)
            A06(r18)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A01(r0)
            A06(r0)
            java.lang.reflect.Field r1 = A04()
            if (r1 == 0) goto L_0x013f
            if (r7 == 0) goto L_0x013f
            sun.misc.Unsafe r0 = r7.A00
            r0.objectFieldOffset(r1)
        L_0x013f:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.C36361kB.A1a(r1, r0)
            A03 = r0
            return
        L_0x014c:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x01f5 }
            r10 = 1
            X.C165567td.A1I(r4)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f5 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r0[r5] = r2     // Catch:{ all -> 0x01f5 }
            java.lang.Class r0 = X.C165597tg.A0b(r4, r1, r0, r10)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "putInt"
            r9 = 3
            java.lang.Class[] r0 = X.C165597tg.A1Y(r0, r9)     // Catch:{ all -> 0x01f5 }
            r0[r3] = r6     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f5 }
            r0[r5] = r2     // Catch:{ all -> 0x01f5 }
            java.lang.Class r5 = X.C165597tg.A0b(r4, r8, r0, r10)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            r0[r3] = r5     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            r0[r3] = r2     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            boolean r0 = X.C196949an.A00()     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x01f2
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01f5 }
            r1[r3] = r0     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01f5 }
            r1[r3] = r0     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01f5 }
            r1[r3] = r0     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.C165597tg.A1Y(r5, r3)     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.C165597tg.A1Y(r5, r9)     // Catch:{ all -> 0x01f5 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01f5 }
            r1[r3] = r0     // Catch:{ all -> 0x01f5 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f5 }
        L_0x01f2:
            r0 = 1
            goto L_0x0103
        L_0x01f5:
            r1 = move-exception
            java.lang.Class<X.9od> r0 = X.C203729od.class
            java.util.logging.Logger r4 = X.C165587tf.A0p(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203729od.<clinit>():void");
    }

    public static byte A00(byte[] bArr, long j) {
        return A00.A01(bArr, A06 + j);
    }

    public static int A01(Class cls) {
        if (A05) {
            return A00.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object A03(Object obj, long j) {
        return A00.A00.getObject(obj, j);
    }

    public static Unsafe A05() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AXE());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A06(Class cls) {
        if (A05) {
            A00.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C196219Ye r4 = A00;
        r4.A09(obj, j2, C165577te.A02(~((int) j), r4.A04(obj, j2), b));
    }

    public static void A08(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C196219Ye r4 = A00;
        r4.A09(obj, j2, C165577te.A02((int) j, r4.A04(obj, j2), b));
    }

    public static void A09(Object obj, long j, Object obj2) {
        A00.A00.putObject(obj, j, obj2);
    }

    public static void A0A(byte[] bArr, long j, byte b) {
        A00.A06(bArr, A06 + j, b);
    }

    public static Field A04() {
        Field field;
        Field field2;
        if (C196949an.A00()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }
}
