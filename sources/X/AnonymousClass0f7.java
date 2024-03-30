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

/* renamed from: X.0f7  reason: invalid class name */
public abstract class AnonymousClass0f7 implements C17880sD {
    public static final boolean A00 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final C06720Uu A01;
    public static final Object A02 = new Object();
    public static final Logger A03;
    public volatile C07020Wa listeners;
    public volatile Object value;
    public volatile AnonymousClass0Xz waiters;

    private void A01(AnonymousClass0Xz r6) {
        r6.thread = null;
        while (true) {
            AnonymousClass0Xz r3 = this.waiters;
            if (r3 != AnonymousClass0Xz.A00) {
                AnonymousClass0Xz r2 = null;
                while (r3 != null) {
                    AnonymousClass0Xz r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A01.A03(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public static void A02(AnonymousClass0f7 r4) {
        AnonymousClass0Xz r1;
        C06720Uu r2;
        C07020Wa r12;
        C07020Wa r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A01;
        } while (!r2.A03(r1, AnonymousClass0Xz.A00, r4));
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
        } while (!r2.A02(r12, C07020Wa.A03, r4));
        while (r12 != null) {
            C07020Wa r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            C07020Wa r22 = r3.A00;
            A03(r3.A01, r3.A02);
            r3 = r22;
        }
    }

    static {
        C06720Uu r4;
        Class<AnonymousClass0f7> cls = AnonymousClass0f7.class;
        A03 = Logger.getLogger(cls.getName());
        Class<AnonymousClass0Xz> cls2 = AnonymousClass0Xz.class;
        try {
            r4 = new AnonymousClass0GD(AtomicReferenceFieldUpdater.newUpdater(cls2, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls2, "next"), AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls, C07020Wa.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new AnonymousClass0GC();
        }
        A01 = r4;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(Object obj) {
        if (obj instanceof AnonymousClass0WN) {
            Throwable th = ((AnonymousClass0WN) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof AnonymousClass0WM) {
            throw new ExecutionException(((AnonymousClass0WM) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public String A04() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("remaining delay=[");
        A0u.append(((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
        return AnonymousClass000.A0q(" ms]", A0u);
    }

    public void A05(Throwable th) {
        AnonymousClass0WM r0 = AnonymousClass0WM.A01;
        Objects.requireNonNull(th);
        if (A01.A04(this, (Object) null, new AnonymousClass0WM(th))) {
            A02(this);
        }
    }

    public boolean A06(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (!A01.A04(this, (Object) null, obj)) {
            return false;
        }
        A02(this);
        return true;
    }

    public final boolean cancel(boolean z) {
        AnonymousClass0WN r1;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A00) {
            AnonymousClass0WN r0 = AnonymousClass0WN.A01;
            r1 = new AnonymousClass0WN(new CancellationException("Future.cancel() was called."));
        } else if (z) {
            r1 = AnonymousClass0WN.A02;
        } else {
            r1 = AnonymousClass0WN.A01;
        }
        if (!A01.A04(this, obj, r1)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        if (r7 != false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r7 = r18
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0137
            java.lang.Object r4 = r15.value
            if (r4 == 0) goto L_0x0017
            java.lang.Object r0 = A00(r4)
            return r0
        L_0x0017:
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0049
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x0022:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0066
            X.0Xz r8 = r15.waiters
            X.0Xz r5 = X.AnonymousClass0Xz.A00
            if (r8 == r5) goto L_0x0042
            X.0Xz r6 = new X.0Xz
            r6.<init>()
        L_0x0033:
            X.0Uu r4 = A01
            r4.A00(r6, r8)
            boolean r4 = r4.A03(r8, r6, r15)
            if (r4 != 0) goto L_0x004c
            X.0Xz r8 = r15.waiters
            if (r8 != r5) goto L_0x0033
        L_0x0042:
            java.lang.Object r0 = r15.value
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x0049:
            r9 = 0
            goto L_0x0022
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0129
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            r15.A01(r6)
        L_0x0066:
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0081
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0129
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x007b
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            goto L_0x0066
        L_0x007b:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0081:
            java.lang.String r4 = r15.toString()
            java.lang.String r6 = r7.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r9 = r6.toLowerCase(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "Waited "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r8 = " "
            java.lang.String r3 = X.AnonymousClass000.A0p(r8, r9, r6)
            long r5 = r0 + r11
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0101
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = X.AnonymousClass000.A0q(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r7.convert(r2, r0)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00ea
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r7 = X.AnonymousClass000.A1R(r0)
            if (r1 <= 0) goto L_0x00e8
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r10)
            r0.append(r5)
            java.lang.String r1 = X.AnonymousClass000.A0p(r8, r9, r0)
            if (r7 == 0) goto L_0x00e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = ","
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
        L_0x00e0:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r10 = X.AnonymousClass000.A0p(r1, r8, r0)
        L_0x00e8:
            if (r7 == 0) goto L_0x00f7
        L_0x00ea:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r10)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r1)
        L_0x00f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0101:
            boolean r0 = r15.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x011a
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x011a:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0129:
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x012e:
            r15.A01(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0137:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0f7.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof AnonymousClass0WN;
    }

    public final boolean isDone() {
        return true & AnonymousClass000.A1V(this.value);
    }

    public static void A03(Runnable runnable, Executor executor) {
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

    public final void B0P(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        C07020Wa r3 = this.listeners;
        C07020Wa r2 = C07020Wa.A03;
        if (r3 != r2) {
            C07020Wa r1 = new C07020Wa(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A01.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A03(runnable, executor);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        A0u.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str3 = A04();
                } catch (RuntimeException e) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Exception thrown from implementation: ");
                    str3 = AnonymousClass000.A0o(e.getClass(), A0u2);
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
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
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
            if (obj == null) {
                AnonymousClass0Xz r3 = this.waiters;
                AnonymousClass0Xz r2 = AnonymousClass0Xz.A00;
                if (r3 != r2) {
                    AnonymousClass0Xz r1 = new AnonymousClass0Xz();
                    while (true) {
                        C06720Uu r0 = A01;
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
                }
            }
            return A00(obj);
        }
        throw new InterruptedException();
    }
}
