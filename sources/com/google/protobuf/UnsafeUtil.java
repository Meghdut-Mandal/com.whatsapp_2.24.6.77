package com.google.protobuf;

import X.AXH;
import X.AnonymousClass000;
import X.AnonymousClass9Yj;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173558Sd;
import X.C173568Se;
import X.C173578Sf;
import X.C196959aq;
import X.C36361kB;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class UnsafeUtil {
    public static final long A00;
    public static final long A01;
    public static final AnonymousClass9Yj A02;
    public static final Class A03;
    public static final Unsafe A04 = A02();
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final boolean A09 = C36361kB.A1a(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    static {
        boolean z;
        boolean z2;
        boolean A0K;
        boolean A0J;
        int i;
        long j;
        AnonymousClass9Yj r0;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        Class cls6 = C196959aq.A00;
        A03 = cls6;
        Class cls7 = Long.TYPE;
        Class<byte[]> cls8 = byte[].class;
        if (cls6 == null || C196959aq.A01) {
            z = false;
        } else {
            try {
                z = C165567td.A1b(cls6, cls7);
            } catch (Throwable unused) {
                z = false;
            }
        }
        A08 = z;
        Class cls9 = Integer.TYPE;
        if (cls6 == null || C196959aq.A01) {
            z2 = false;
        } else {
            try {
                z2 = C165567td.A1b(A03, cls9);
            } catch (Throwable unused2) {
                z2 = false;
            }
        }
        A07 = z2;
        Unsafe unsafe = A04;
        AnonymousClass9Yj r1 = null;
        if (unsafe != null) {
            if (cls6 == null || C196959aq.A01) {
                r1 = new C173578Sf(unsafe);
            } else if (A08) {
                r1 = new C173568Se(unsafe);
            } else if (z2) {
                r1 = new C173558Sd(unsafe);
            }
        }
        A02 = r1;
        if (r1 == null) {
            A0K = false;
        } else {
            A0K = r1.A0K();
        }
        A06 = A0K;
        AnonymousClass9Yj r02 = A02;
        if (r02 == null) {
            A0J = false;
        } else {
            A0J = r02.A0J();
        }
        A05 = A0J;
        if (A0J) {
            i = A02.A05(cls8);
        } else {
            i = -1;
        }
        A01 = (long) i;
        A03(cls5);
        A03(cls4);
        A03(cls3);
        A03(cls2);
        A03(cls);
        A03(Object[].class);
        Field A012 = A01();
        if (A012 == null || (r0 = A02) == null) {
            j = -1;
        } else {
            j = r0.A08(A012);
        }
        A00 = j;
    }

    public static Object A00(Class cls) {
        try {
            return A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.C196959aq.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A01() {
        /*
            java.lang.Class r0 = X.C196959aq.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C196959aq.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0019
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x002e
            return r2
        L_0x002e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A01():java.lang.reflect.Field");
    }

    public static Unsafe A02() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AXH());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A03(Class cls) {
        boolean z = A05;
        if (z) {
            A02.A05(cls);
        }
        if (z) {
            A02.A0A(cls);
        }
    }

    public static void A04(Object obj, long j, byte b) {
        long j2 = -4 & j;
        A06(obj, j2, C165577te.A02(~((int) j), A02.A06(obj, j2), b));
    }

    public static void A05(Object obj, long j, byte b) {
        long j2 = -4 & j;
        A06(obj, j2, C165577te.A02((int) j, A02.A06(obj, j2), b));
    }

    public static void A06(Object obj, long j, int i) {
        A02.A0E(obj, j, i);
    }

    public static void A07(Object obj, long j, Object obj2) {
        A02.A0G(obj, j, obj2);
    }

    public static void A08(Throwable th) {
        C165587tf.A0p(UnsafeUtil.class).log(Level.WARNING, AnonymousClass000.A0l(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass000.A0u()));
    }

    public static void A09(byte[] bArr, long j, byte b) {
        A02.A0B(bArr, A01 + j, b);
    }
}
