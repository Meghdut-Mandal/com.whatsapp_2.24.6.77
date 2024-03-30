package X;

import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.0Z6  reason: invalid class name */
public final class AnonymousClass0Z6 {
    public static final AnonymousClass0V5 A00;
    public static final boolean A01;
    public static final boolean A02;
    public static final Class A03 = Memory.class;
    public static final Unsafe A04;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r1.getDeclaredField("effectiveDirectAddress") == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0115, code lost:
        if (r2 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        if (r2.getType() == java.lang.Long.TYPE) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0127, code lost:
        r0 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
        if (r0 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012b, code lost:
        r0.A08(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    static {
        /*
            java.lang.Class<double[]> r14 = double[].class
            java.lang.Class<float[]> r13 = float[].class
            java.lang.Class<long[]> r12 = long[].class
            java.lang.Class<int[]> r11 = int[].class
            java.lang.Class<boolean[]> r10 = boolean[].class
            sun.misc.Unsafe r3 = A00()
            A04 = r3
            java.lang.Class<libcore.io.Memory> r0 = libcore.io.Memory.class
            A03 = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r2 = A06(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = A06(r0)
            r0 = 0
            if (r3 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x0038
            X.0MC r0 = new X.0MC
            r0.<init>(r3)
        L_0x002a:
            A00 = r0
            java.lang.String r5 = "getLong"
            java.lang.String r6 = "objectFieldOffset"
            r4 = 2
            r3 = 1
            r9 = 0
            if (r0 == 0) goto L_0x006e
            sun.misc.Unsafe r0 = r0.A00
            goto L_0x0040
        L_0x0038:
            if (r1 == 0) goto L_0x002a
            X.0MB r0 = new X.0MB
            r0.<init>(r3)
            goto L_0x002a
        L_0x0040:
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x006a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x006a }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r9] = r0     // Catch:{ all -> 0x006a }
            r2.getMethod(r6, r1)     // Catch:{ all -> 0x006a }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x006a }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1[r9] = r0     // Catch:{ all -> 0x006a }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x006a }
            r1[r3] = r0     // Catch:{ all -> 0x006a }
            r2.getMethod(r5, r1)     // Catch:{ all -> 0x006a }
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x006e
        L_0x0064:
            java.lang.String r0 = "address"
            r1.getDeclaredField(r0)     // Catch:{ all -> 0x006e }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            java.util.logging.Logger.getLogger(X.AnonymousClass0Z6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x006e:
            X.0V5 r0 = A00
            if (r0 == 0) goto L_0x00eb
            sun.misc.Unsafe r0 = r0.A00
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r9] = r0     // Catch:{ all -> 0x00e7 }
            r7.getMethod(r6, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r1[r9] = r2     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "arrayBaseOffset"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            r1[r9] = r2     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "arrayIndexScale"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x00e7 }
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r1[r9] = r8     // Catch:{ all -> 0x00e7 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e7 }
            r1[r3] = r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "getInt"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            r6 = 3
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e7 }
            r1[r9] = r8     // Catch:{ all -> 0x00e7 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e7 }
            r1[r3] = r0     // Catch:{ all -> 0x00e7 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e7 }
            r1[r4] = r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "putInt"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x00e7 }
            r0[r9] = r8     // Catch:{ all -> 0x00e7 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e7 }
            r0[r3] = r2     // Catch:{ all -> 0x00e7 }
            r7.getMethod(r5, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e7 }
            r1[r9] = r8     // Catch:{ all -> 0x00e7 }
            r1[r3] = r2     // Catch:{ all -> 0x00e7 }
            r1[r4] = r2     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "putLong"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x00e7 }
            r1[r9] = r8     // Catch:{ all -> 0x00e7 }
            r1[r3] = r2     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "getObject"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e7 }
            r1[r9] = r8     // Catch:{ all -> 0x00e7 }
            r1[r3] = r2     // Catch:{ all -> 0x00e7 }
            r1[r4] = r8     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "putObject"
            r7.getMethod(r0, r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ed
        L_0x00e7:
            r0 = move-exception
            java.util.logging.Logger.getLogger(X.AnonymousClass0Z6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00eb:
            r0 = 0
            goto L_0x00ee
        L_0x00ed:
            r0 = 1
        L_0x00ee:
            A02 = r0
            java.lang.Class<byte[]> r1 = byte[].class
            if (r0 == 0) goto L_0x00f9
            X.0V5 r0 = A00
            r0.A03(r1)
        L_0x00f9:
            A01(r10)
            A01(r11)
            A01(r12)
            A01(r13)
            A01(r14)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A01(r0)
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x0127
        L_0x0117:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x012e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x012e
        L_0x0127:
            X.0V5 r0 = A00
            if (r0 == 0) goto L_0x012e
            r0.A08(r2)
        L_0x012e:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0137
            r3 = 0
        L_0x0137:
            A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z6.<clinit>():void");
    }

    public static Unsafe A00() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C12100hV());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A01(Class cls) {
        boolean z = A02;
        if (z) {
            A00.A03(cls);
        }
        if (z) {
            A00.A04(cls);
        }
    }

    public static void A02(Class cls) {
        try {
            A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static /* synthetic */ void A03(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        AnonymousClass0V5 r5 = A00;
        int A002 = r5.A00(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        r5.A05(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & A002));
    }

    public static /* synthetic */ void A04(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        AnonymousClass0V5 r5 = A00;
        int A002 = r5.A00(obj, j2);
        int i = (((int) j) & 3) << 3;
        r5.A05(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & A002));
    }

    public static boolean A06(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = A03;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            Class cls4 = Integer.TYPE;
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls4, cls4});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls4, cls4});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A07(Object obj, long j) {
        int A002;
        AnonymousClass0V5 r3 = A00;
        long j2 = -4 & j;
        if (A01) {
            A002 = (r3.A00(obj, j2) >>> ((int) (((~j) & 3) << 3))) & 255;
        } else {
            A002 = (r3.A00(obj, j2) >>> ((int) ((j & 3) << 3))) & 255;
        }
        return AnonymousClass000.A1P((byte) A002);
    }
}
