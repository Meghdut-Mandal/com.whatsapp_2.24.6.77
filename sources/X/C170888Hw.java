package X;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.8Hw  reason: invalid class name and case insensitive filesystem */
public abstract class C170888Hw extends C1897795o implements C17880sD {
    public static final AnonymousClass9Y6 A00;
    public static final boolean A01;
    public static final Object A02 = C36441kJ.A11();
    public static final Logger A03;
    public volatile C200879iP listeners;
    public volatile Object value;
    public volatile C200849iL waiters;

    private void A01(C200849iL r6) {
        r6.thread = null;
        while (true) {
            C200849iL r3 = this.waiters;
            if (r3 != C200849iL.A00) {
                C200849iL r2 = null;
                while (r3 != null) {
                    C200849iL r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A03(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public static void A02(C170888Hw r4) {
        C200849iL r1;
        AnonymousClass9Y6 r2;
        C200879iP r12;
        C200879iP r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, C200849iL.A00, r4));
        while (r1 != null) {
            Thread thread = r1.thread;
            if (thread != null) {
                r1.thread = null;
                LockSupport.unpark(thread);
            }
            r1 = r1.next;
        }
        do {
            r12 = r4.listeners;
        } while (!r2.A02(r12, C200879iP.A03, r4));
        while (r12 != null) {
            C200879iP r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            C200879iP r22 = r3.A00;
            Runnable runnable = r3.A01;
            Objects.requireNonNull(runnable);
            Executor executor = r3.A02;
            Objects.requireNonNull(executor);
            A03(runnable, executor);
            r3 = r22;
        }
    }

    static {
        boolean z;
        AnonymousClass9Y6 r5;
        Class<C170888Hw> cls = C170888Hw.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        A01 = z;
        A03 = C165587tf.A0p(cls);
        Throwable th = null;
        try {
            r5 = new C170878Hv();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r5 = new C170858Ht();
        }
        A00 = r5;
        if (th != null) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(Object obj) {
        if (obj instanceof C197449bj) {
            Throwable th = ((C197449bj) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C197389bd) {
            throw new ExecutionException(((C197389bd) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public void A04(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A02(this);
        }
    }

    public void A05(Throwable th) {
        C197389bd r0 = C197389bd.A01;
        Objects.requireNonNull(th);
        if (A00.A04(this, (Object) null, new C197389bd(th))) {
            A02(this);
        }
    }

    public void B0P(Runnable runnable, Executor executor) {
        C200879iP r3;
        C200879iP r2;
        C20740y5.A04(runnable, "Runnable was null.");
        C20740y5.A04(executor, "Executor was null.");
        if (isDone() || (r3 = this.listeners) == (r2 = C200879iP.A03)) {
            A03(runnable, executor);
        }
        C200879iP r1 = new C200879iP(runnable, executor);
        do {
            r1.A00 = r3;
            if (!A00.A02(r3, r1, this)) {
                r3 = this.listeners;
            } else {
                return;
            }
        } while (r3 != r2);
        A03(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C197449bj r1;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A01) {
            C197449bj r0 = C197449bj.A01;
            r1 = new C197449bj(new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                r1 = C197449bj.A02;
            } else {
                r1 = C197449bj.A01;
            }
            Objects.requireNonNull(r1);
        }
        if (!A00.A04(this, obj, r1)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (r4 != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r4 = r18
            long r0 = r4.toNanos(r2)
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L_0x016a
            java.lang.Object r5 = r15.value
            if (r5 == 0) goto L_0x0017
            java.lang.Object r0 = A00(r5)
            return r0
        L_0x0017:
            r13 = 0
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x0022:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x0072
            X.9iL r8 = r15.waiters
            X.9iL r6 = X.C200849iL.A00
            if (r8 == r6) goto L_0x0042
            X.9iL r7 = new X.9iL
            r7.<init>()
        L_0x0033:
            X.9Y6 r5 = A00
            r5.A00(r7, r8)
            boolean r5 = r5.A03(r8, r7, r15)
            if (r5 != 0) goto L_0x004f
            X.9iL r8 = r15.waiters
            if (r8 != r6) goto L_0x0033
        L_0x0042:
            java.lang.Object r0 = r15.value
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x004c:
            r9 = 0
            goto L_0x0022
        L_0x004f:
            r5 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r5)
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0161
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x015c
            long r5 = java.lang.System.nanoTime()
            long r0 = r9 - r5
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r15.A01(r7)
        L_0x0072:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x015c
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0087
            long r5 = java.lang.System.nanoTime()
            long r0 = r9 - r5
            goto L_0x0072
        L_0x0087:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008d:
            java.lang.String r5 = r15.toString()
            java.lang.String r7 = r4.toString()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r6)
            int r6 = X.C90474aD.A05(r9)
            int r6 = r6 + 28
            java.lang.StringBuilder r7 = X.C90524aI.A0h(r6)
            java.lang.String r6 = "Waited "
            r7.append(r6)
            r7.append(r2)
            java.lang.String r8 = " "
            java.lang.String r3 = X.AnonymousClass000.A0p(r8, r9, r7)
            long r6 = r0 + r11
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x012d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = r3.concat(r2)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = r4.convert(r2, r0)
            long r0 = r4.toNanos(r6)
            long r2 = r2 - r0
            int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0109
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r0)
            if (r1 <= 0) goto L_0x0107
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r0 = X.C90474aD.A05(r1)
            int r0 = r0 + 21
            java.lang.StringBuilder r0 = X.C90464aC.A0i(r9, r0)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0p(r8, r9, r0)
            if (r4 == 0) goto L_0x00ff
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = r1.concat(r0)
        L_0x00ff:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r0.concat(r8)
        L_0x0107:
            if (r4 == 0) goto L_0x0123
        L_0x0109:
            java.lang.String r4 = java.lang.String.valueOf(r10)
            int r0 = X.C90474aD.A05(r4)
            int r0 = r0 + 33
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0123:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = r1.concat(r0)
        L_0x012d:
            boolean r0 = r15.isDone()
            if (r0 == 0) goto L_0x0143
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0143:
            int r0 = X.C90474aD.A05(r3)
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = X.C90464aC.A0i(r5, r0)
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x0161:
            r15.A01(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x016a:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170888Hw.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.value instanceof C197449bj;
    }

    public boolean isDone() {
        return true & AnonymousClass000.A1V(this.value);
    }

    public static void A03(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 57);
            A0i.append("RuntimeException while executing runnable ");
            A0i.append(valueOf);
            logger.log(level, AnonymousClass000.A0p(" with executor ", valueOf2, A0i), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.Class r3 = r7.getClass()
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "com.google.common.util.concurrent."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r3.getSimpleName()
            r2.append(r0)
        L_0x001b:
            r0 = 64
            r2.append(r0)
            int r0 = java.lang.System.identityHashCode(r7)
            X.C90504aG.A0z(r0, r2)
            java.lang.String r0 = "[status="
            r2.append(r0)
            boolean r0 = r7.isCancelled()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "CANCELLED"
        L_0x0034:
            r2.append(r0)
        L_0x0037:
            java.lang.String r0 = X.C90474aD.A0g(r2)
            return r0
        L_0x003c:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x00a3
            int r4 = r2.length()
            java.lang.String r0 = "PENDING"
            r2.append(r0)
            java.lang.String r5 = "]"
            boolean r0 = r7 instanceof java.util.concurrent.ScheduledFuture     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            r1 = 0
            if (r0 == 0) goto L_0x006f
            r1 = r7
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            long r0 = r1.getDelay(r0)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            r3 = 41
            java.lang.StringBuilder r6 = X.C90524aI.A0h(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            java.lang.String r3 = "remaining delay=["
            r6.append(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            r6.append(r0)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            java.lang.String r0 = " ms]"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r6)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
        L_0x006f:
            boolean r0 = X.AnonymousClass6RR.A00(r1)     // Catch:{ RuntimeException | StackOverflowError -> 0x0076 }
            if (r0 == 0) goto L_0x008f
            goto L_0x0096
        L_0x0076:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r0 = X.C90474aD.A05(r3)
            int r0 = r0 + 38
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Exception thrown from implementation: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
        L_0x008f:
            if (r1 == 0) goto L_0x0096
            java.lang.String r0 = ", info=["
            X.AnonymousClass000.A1D(r0, r1, r5, r2)
        L_0x0096:
            boolean r0 = r7.isDone()
            if (r0 == 0) goto L_0x0037
            int r0 = r2.length()
            r2.delete(r4, r0)
        L_0x00a3:
            java.lang.String r4 = "]"
            r3 = 0
        L_0x00a6:
            java.lang.Object r1 = r7.get()     // Catch:{ InterruptedException -> 0x00ab, all -> 0x00de }
            goto L_0x00ad
        L_0x00ab:
            r3 = 1
            goto L_0x00a6
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            X.C90484aE.A0z()     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
        L_0x00b2:
            java.lang.String r0 = "SUCCESS, result=["
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            if (r1 != 0) goto L_0x00ba
            goto L_0x00d4
        L_0x00ba:
            if (r1 != r7) goto L_0x00bf
            java.lang.String r0 = "this future"
            goto L_0x00d6
        L_0x00bf:
            java.lang.String r0 = X.AnonymousClass000.A0k(r1)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            java.lang.String r0 = "@"
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            int r0 = java.lang.System.identityHashCode(r1)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r0 = "null"
        L_0x00d6:
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            r2.append(r4)     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
            goto L_0x0037
        L_0x00de:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e4
            X.C90484aE.A0z()     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
        L_0x00e4:
            throw r0     // Catch:{ ExecutionException -> 0x00fa, CancellationException -> 0x00f6, RuntimeException -> 0x00e5 }
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            r2.append(r0)
            java.lang.String r0 = " thrown from get()]"
            goto L_0x0034
        L_0x00f6:
            java.lang.String r0 = "CANCELLED"
            goto L_0x0034
        L_0x00fa:
            r1 = move-exception
            java.lang.String r0 = "FAILURE, cause=["
            r2.append(r0)
            java.lang.Throwable r0 = r1.getCause()
            r2.append(r0)
            r2.append(r4)
            goto L_0x0037
        L_0x010c:
            r2.append(r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170888Hw.toString():java.lang.String");
    }

    public Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C200849iL r3 = this.waiters;
                C200849iL r2 = C200849iL.A00;
                if (r3 != r2) {
                    C200849iL r1 = new C200849iL();
                    while (true) {
                        AnonymousClass9Y6 r0 = A00;
                        r0.A00(r1, r3);
                        if (!r0.A03(r3, r1, this)) {
                            r3 = this.waiters;
                            if (r3 == r2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A01(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                    Objects.requireNonNull(obj);
                }
            }
            return A00(obj);
        }
        throw new InterruptedException();
    }
}
