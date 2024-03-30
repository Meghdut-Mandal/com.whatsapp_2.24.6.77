package X;

import sun.misc.Unsafe;

/* renamed from: X.8Hv  reason: invalid class name and case insensitive filesystem */
public final class C170878Hv extends AnonymousClass9Y6 {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    public boolean A04(C170888Hw r8, Object obj, Object obj2) {
        Unsafe unsafe = A05;
        long j = A01;
        while (!unsafe.compareAndSwapObject(r8, j, (Object) null, obj2)) {
            if (unsafe.getObject(r8, j) != null) {
                return false;
            }
        }
        return true;
    }

    public void A00(C200849iL r4, C200849iL r5) {
        A05.putObject(r4, A03, r5);
    }

    public void A01(C200849iL r4, Thread thread) {
        A05.putObject(r4, A04, thread);
    }

    public boolean A02(C200879iP r8, C200879iP r9, C170888Hw r10) {
        Unsafe unsafe = A05;
        long j = A00;
        do {
            if (unsafe.compareAndSwapObject(r10, j, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j) == r8);
        return false;
    }

    public boolean A03(C200849iL r8, C200849iL r9, C170888Hw r10) {
        Unsafe unsafe = A05;
        long j = A02;
        do {
            if (unsafe.compareAndSwapObject(r10, j, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j) == r8);
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    static {
        /*
            sun.misc.Unsafe r3 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            goto L_0x0010
        L_0x0005:
            X.AXG r0 = new X.AXG     // Catch:{ PrivilegedActionException -> 0x0067 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0067 }
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0067 }
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch:{ PrivilegedActionException -> 0x0067 }
        L_0x0010:
            java.lang.Class<X.8Hw> r2 = X.C170888Hw.class
            java.lang.String r0 = "waiters"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A02 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "listeners"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A00 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "value"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A01 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.Class<X.9iL> r2 = X.C200849iL.class
            java.lang.String r0 = "thread"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A04 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "next"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A03 = r0     // Catch:{ Exception -> 0x0053 }
            A05 = r3     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r1 = move-exception
            java.lang.Object r0 = X.C113905gK.A00
            java.util.Objects.requireNonNull(r1)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0066
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0066
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r1)
            throw r0
        L_0x0066:
            throw r1
        L_0x0067:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            java.lang.String r0 = "Could not initialize intrinsics"
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170878Hv.<clinit>():void");
    }
}
