package X;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class A6T implements C17880sD {
    public static final boolean A00 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final AnonymousClass9Y4 A01;
    public static final Object A02 = C36441kJ.A11();
    public static final Logger A03;
    public volatile C197829cR listeners;
    public volatile Object value;
    public volatile C200839iK waiters;

    private void A02(C200839iK r6) {
        r6.thread = null;
        while (true) {
            C200839iK r3 = this.waiters;
            if (r3 != C200839iK.A00) {
                C200839iK r2 = null;
                while (r3 != null) {
                    C200839iK r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A01.A01(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public static void A03(A6T a6t) {
        C197829cR r1;
        C197829cR r4 = null;
        while (true) {
            C200839iK r2 = a6t.waiters;
            AnonymousClass9Y4 r3 = A01;
            if (r3.A01(r2, C200839iK.A00, a6t)) {
                while (r2 != null) {
                    Thread thread = r2.thread;
                    if (thread != null) {
                        r2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r2 = r2.next;
                }
                do {
                    r1 = a6t.listeners;
                } while (!r3.A00(r1, C197829cR.A03, a6t));
                while (r1 != null) {
                    C197829cR r0 = r1.A00;
                    r1.A00 = r4;
                    r4 = r1;
                    r1 = r0;
                }
                while (true) {
                    C197829cR r22 = r4;
                    if (r4 != null) {
                        r4 = r4.A00;
                        Runnable runnable = r22.A01;
                        if (AnonymousClass75C.A01(runnable)) {
                            AnonymousClass75C r12 = (AnonymousClass75C) runnable;
                            a6t = (A6T) r12.A01;
                            if (a6t.value == r12 && r3.A02(a6t, r12, A00((C17880sD) r12.A00))) {
                                break;
                            }
                        } else {
                            A04(runnable, r22.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static {
        AnonymousClass9Y4 r4;
        Class<A6T> cls = A6T.class;
        A03 = C165587tf.A0p(cls);
        Class<C200839iK> cls2 = C200839iK.class;
        try {
            r4 = new C1684280o(AtomicReferenceFieldUpdater.newUpdater(cls2, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls2, "next"), AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls, C197829cR.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new C1684180n();
        }
        A01 = r4;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(C17880sD r5) {
        Object obj;
        if (r5 instanceof A6T) {
            Object obj2 = ((A6T) r5).value;
            if (!(obj2 instanceof C197699cE)) {
                return obj2;
            }
            C197699cE r1 = (C197699cE) obj2;
            if (!r1.A01) {
                return obj2;
            }
            Throwable th = r1.A00;
            if (th != null) {
                return new C197699cE(th, false);
            }
        } else {
            boolean isCancelled = r5.isCancelled();
            if (!(!A00) || !isCancelled) {
                boolean z = false;
                while (true) {
                    try {
                        obj = r5.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException e) {
                        C197279bQ r0 = C197279bQ.A01;
                        th = e.getCause();
                        return new C197279bQ(th);
                    } catch (CancellationException e2) {
                        if (isCancelled) {
                            return new C197699cE(e2, false);
                        }
                        C197279bQ r02 = C197279bQ.A01;
                        th = new IllegalArgumentException(AnonymousClass000.A0l(r5, "get() threw CancellationException, despite reporting isCancelled() == false: ", AnonymousClass000.A0u()), e2);
                        return new C197279bQ(th);
                    } catch (Throwable th2) {
                        th = th2;
                        return new C197279bQ(th);
                    }
                }
                if (z) {
                    C90484aE.A0z();
                }
                if (obj == null) {
                    return A02;
                }
                return obj;
            }
        }
        return C197699cE.A02;
    }

    public static Object A01(Object obj) {
        if (obj instanceof C197699cE) {
            Throwable th = ((C197699cE) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C197279bQ) {
            throw new ExecutionException(((C197279bQ) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public void A06(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (A01.A02(this, (Object) null, obj)) {
            A03(this);
        }
    }

    public void A07(Throwable th) {
        C197279bQ r0 = C197279bQ.A01;
        Objects.requireNonNull(th);
        if (A01.A02(this, (Object) null, new C197279bQ(th))) {
            A03(this);
        }
    }

    public final boolean cancel(boolean z) {
        C197699cE r3;
        Object obj = this.value;
        if (!AnonymousClass000.A1W(obj) && !AnonymousClass75C.A01(obj)) {
            return false;
        }
        if (A00) {
            C197699cE r0 = C197699cE.A02;
            r3 = new C197699cE(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            r3 = C197699cE.A03;
        } else {
            r3 = C197699cE.A02;
        }
        boolean z2 = false;
        A6T a6t = this;
        while (true) {
            if (A01.A02(a6t, obj, r3)) {
                A03(a6t);
                if (!AnonymousClass75C.A01(obj)) {
                    break;
                }
                C17880sD r2 = (C17880sD) ((AnonymousClass75C) obj).A00;
                if (!(r2 instanceof A6T)) {
                    r2.cancel(z);
                    break;
                }
                a6t = (A6T) r2;
                obj = a6t.value;
                if (!AnonymousClass000.A1W(obj) && !AnonymousClass75C.A01(obj)) {
                    break;
                }
                z2 = true;
            } else {
                obj = a6t.value;
                if (!AnonymousClass75C.A01(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        if (r4 != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            r18 = this;
            r2 = r19
            r4 = r21
            long r0 = r4.toNanos(r2)
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L_0x0162
            r8 = r18
            java.lang.Object r7 = r8.value
            boolean r6 = X.AnonymousClass000.A1V(r7)
            boolean r5 = X.AnonymousClass75C.A01(r7)
            r5 = r5 ^ 1
            r6 = r6 & r5
            if (r6 == 0) goto L_0x0024
            java.lang.Object r0 = A01(r7)
            return r0
        L_0x0024:
            r16 = 0
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 + r0
        L_0x002f:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x008a
            X.9iK r10 = r8.waiters
            X.9iK r9 = X.C200839iK.A00
            if (r10 == r9) goto L_0x0052
            X.9iK r7 = new X.9iK
            r7.<init>()
        L_0x0040:
            X.9Y4 r6 = A01
            boolean r5 = r6 instanceof X.C1684180n
            if (r5 == 0) goto L_0x0059
            r7.next = r10
        L_0x0048:
            boolean r5 = r6.A01(r10, r7, r8)
            if (r5 != 0) goto L_0x0065
            X.9iK r10 = r8.waiters
            if (r10 != r9) goto L_0x0040
        L_0x0052:
            java.lang.Object r0 = r8.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x0059:
            r5 = r6
            X.80o r5 = (X.C1684280o) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = r5.A02
            r5.lazySet(r7, r10)
            goto L_0x0048
        L_0x0062:
            r14 = 0
            goto L_0x002f
        L_0x0065:
            java.util.concurrent.locks.LockSupport.parkNanos(r8, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0159
            java.lang.Object r5 = r8.value
            boolean r1 = X.AnonymousClass000.A1V(r5)
            boolean r0 = X.AnonymousClass75C.A01(r5)
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0154
            long r5 = java.lang.System.nanoTime()
            long r0 = r14 - r5
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x0065
            r8.A02(r7)
        L_0x008a:
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            java.lang.Object r5 = r8.value
            boolean r1 = X.AnonymousClass000.A1V(r5)
            boolean r0 = X.AnonymousClass75C.A01(r5)
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0154
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x00aa
            long r5 = java.lang.System.nanoTime()
            long r0 = r14 - r5
            goto L_0x008a
        L_0x00aa:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00b0:
            java.lang.String r5 = r8.toString()
            java.lang.String r7 = r4.toString()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r10 = r7.toLowerCase(r6)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "Waited "
            r7.append(r6)
            r7.append(r2)
            java.lang.String r9 = " "
            java.lang.String r3 = X.AnonymousClass000.A0p(r9, r10, r7)
            long r6 = r0 + r12
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x012c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r11 = X.AnonymousClass000.A0q(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = r4.convert(r2, r0)
            long r0 = r4.toNanos(r6)
            long r2 = r2 - r0
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r0)
            if (r1 <= 0) goto L_0x0113
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r11)
            r0.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0p(r9, r10, r0)
            if (r4 == 0) goto L_0x010f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x010f:
            java.lang.String r11 = X.C36321k7.A0D(r0, r9)
        L_0x0113:
            if (r4 == 0) goto L_0x0122
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r11)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r11 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0122:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r11)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)
        L_0x012c:
            boolean r0 = r8.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x0145
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0145:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            java.lang.Object r0 = A01(r5)
            return r0
        L_0x0159:
            r8.A02(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0162:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6T.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C197699cE;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!AnonymousClass75C.A01(obj)) & AnonymousClass000.A1V(obj);
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RuntimeException while executing runnable ");
            A0u.append(runnable);
            logger.log(level, AnonymousClass000.A0l(executor, " with executor ", A0u), e);
        }
    }

    public void A05(C17880sD r6) {
        AnonymousClass75C r3;
        AnonymousClass9Y4 r2;
        C197279bQ r0;
        Objects.requireNonNull(r6);
        Object obj = this.value;
        if (obj == null) {
            if (r6.isDone()) {
                if (A01.A02(this, (Object) null, A00(r6))) {
                    A03(this);
                    return;
                }
                return;
            }
            r3 = new AnonymousClass75C((Object) r6, (Object) this, 21);
            r2 = A01;
            if (r2.A02(this, (Object) null, r3)) {
                try {
                    r6.B0P(r3, AnonymousClass5UO.A01);
                    return;
                } catch (Throwable unused) {
                    r0 = C197279bQ.A01;
                }
            } else {
                obj = this.value;
            }
        }
        if (obj instanceof C197699cE) {
            r6.cancel(((C197699cE) obj).A01);
            return;
        }
        return;
        r2.A02(this, r3, r0);
    }

    public final void B0P(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        C197829cR r3 = this.listeners;
        C197829cR r2 = C197829cR.A03;
        if (r3 != r2) {
            C197829cR r1 = new C197829cR(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A01.A00(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A04(runnable, executor);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        String valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        A0u.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    Object obj2 = this.value;
                    if (AnonymousClass75C.A01(obj2)) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("setFuture=[");
                        C17880sD r0 = (C17880sD) ((AnonymousClass75C) obj2).A00;
                        if (r0 == this) {
                            valueOf = "this future";
                        } else {
                            valueOf = String.valueOf(r0);
                        }
                        str3 = AnonymousClass000.A0p(valueOf, "]", A0u2);
                    } else if (this instanceof ScheduledFuture) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("remaining delay=[");
                        A0u3.append(((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
                        str3 = AnonymousClass000.A0q(" ms]", A0u3);
                    } else {
                        str3 = null;
                    }
                } catch (RuntimeException e) {
                    str3 = C165567td.A0W(e, "Exception thrown from implementation: ", AnonymousClass000.A0u());
                }
                if (str3 != null && !str3.isEmpty()) {
                    AnonymousClass000.A1D("PENDING, info=[", str3, "]", A0u);
                    return AnonymousClass000.A0q("]", A0u);
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e2) {
                    A0u.append("FAILURE, cause=[");
                    A0u.append(e2.getCause());
                    A0u.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e3) {
                    A0u.append("UNKNOWN, cause=[");
                    A0u.append(e3.getClass());
                    str = " thrown from get()]";
                } catch (Throwable th) {
                    if (z) {
                        C90484aE.A0z();
                    }
                    throw th;
                }
            }
            if (z) {
                C90484aE.A0z();
            }
            A0u.append("SUCCESS, result=[");
            if (obj == this) {
                str2 = "this future";
            } else {
                str2 = String.valueOf(obj);
            }
            A0u.append(str2);
            A0u.append("]");
            return AnonymousClass000.A0q("]", A0u);
        }
        A0u.append(str);
        return AnonymousClass000.A0q("]", A0u);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (!AnonymousClass000.A1V(obj) || !(!AnonymousClass75C.A01(obj))) {
                C200839iK r4 = this.waiters;
                C200839iK r3 = C200839iK.A00;
                if (r4 != r3) {
                    C200839iK r2 = new C200839iK();
                    while (true) {
                        AnonymousClass9Y4 r1 = A01;
                        if (r1 instanceof C1684180n) {
                            r2.next = r4;
                        } else {
                            ((C1684280o) r1).A02.lazySet(r2, r4);
                        }
                        if (!r1.A01(r4, r2, this)) {
                            r4 = this.waiters;
                            if (r4 == r3) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A02(r2);
                                    throw new InterruptedException();
                                }
                            } while (!(AnonymousClass000.A1V(obj) & (!AnonymousClass75C.A01(obj))));
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
