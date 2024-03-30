package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.03I  reason: invalid class name */
public abstract class AnonymousClass03I extends AnonymousClass03H implements C005702n {
    public static final AtomicIntegerFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public volatile Object _delayed;
    public volatile int _isCompleted = 0;
    public volatile Object _queue;

    static {
        Class<AnonymousClass03I> cls = AnonymousClass03I.class;
        Class<Object> cls2 = Object.class;
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        A00 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.0hU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.0hU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.0hU} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if ((r0 - r2) > 0) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C12090hU r13, long r14) {
        /*
            r12 = this;
            r0 = r14
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = A00
            int r2 = r7.get(r12)
            if (r2 != 0) goto L_0x00f1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = A01
            java.lang.Object r4 = r5.get(r12)
            X.0nY r4 = (X.C15570nY) r4
            if (r4 != 0) goto L_0x0025
            r3 = 0
            X.0nY r2 = new X.0nY
            r2.<init>(r14)
            X.AnonymousClass0A8.A00(r12, r3, r2, r5)
            java.lang.Object r4 = r5.get(r12)
            X.AnonymousClass00C.A0B(r4)
            X.0nY r4 = (X.C15570nY) r4
        L_0x0025:
            monitor-enter(r13)
            java.lang.Object r2 = r13._heap     // Catch:{ all -> 0x00ee }
            X.035 r6 = X.C05950Rs.A01     // Catch:{ all -> 0x00ee }
            if (r2 != r6) goto L_0x002e
            goto L_0x00b6
        L_0x002e:
            monitor-enter(r4)     // Catch:{ all -> 0x00ee }
            X.0pS[] r3 = r4.A00     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x003f
            r2 = 0
            r3 = r3[r2]     // Catch:{ all -> 0x00eb }
        L_0x0036:
            X.0hU r3 = (X.C12090hU) r3     // Catch:{ all -> 0x00eb }
            int r2 = r7.get(r12)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x0044
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0036
        L_0x0041:
            r1 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            goto L_0x00b7
        L_0x0044:
            r10 = 0
            if (r3 == 0) goto L_0x0059
            long r2 = r3.A01     // Catch:{ all -> 0x00eb }
            long r8 = r2 - r14
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0051
            r0 = r2
        L_0x0051:
            long r2 = r4.A00     // Catch:{ all -> 0x00eb }
            long r8 = r0 - r2
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x005c
        L_0x0059:
            r4.A00 = r0     // Catch:{ all -> 0x00eb }
            r2 = r0
        L_0x005c:
            long r0 = r13.A01     // Catch:{ all -> 0x00eb }
            long r0 = r0 - r2
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0065
            r13.A01 = r2     // Catch:{ all -> 0x00eb }
        L_0x0065:
            java.lang.Object r0 = r13._heap     // Catch:{ all -> 0x00eb }
            if (r0 == r6) goto L_0x00e3
            r13._heap = r4     // Catch:{ all -> 0x00eb }
            X.0pS[] r0 = r4.A00     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x0084
            r0 = 4
            X.0pS[] r0 = new X.C16570pS[r0]     // Catch:{ all -> 0x00eb }
        L_0x0072:
            r4.A00 = r0     // Catch:{ all -> 0x00eb }
        L_0x0074:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.AnonymousClass0YX.A01     // Catch:{ all -> 0x00eb }
            int r3 = r2.get(r4)     // Catch:{ all -> 0x00eb }
            int r1 = r3 + 1
            r2.set(r4, r1)     // Catch:{ all -> 0x00eb }
            r0[r3] = r13     // Catch:{ all -> 0x00eb }
            r13.A00 = r3     // Catch:{ all -> 0x00eb }
            goto L_0x009d
        L_0x0084:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.AnonymousClass0YX.A01     // Catch:{ all -> 0x00eb }
            int r2 = r3.get(r4)     // Catch:{ all -> 0x00eb }
            int r1 = r0.length     // Catch:{ all -> 0x00eb }
            if (r2 < r1) goto L_0x0074
            int r1 = r3.get(r4)     // Catch:{ all -> 0x00eb }
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x00eb }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00eb }
            X.0pS[] r0 = (X.C16570pS[]) r0     // Catch:{ all -> 0x00eb }
            goto L_0x0072
        L_0x009d:
            if (r3 <= 0) goto L_0x00b3
            X.0pS[] r2 = r4.A00     // Catch:{ all -> 0x00eb }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x00eb }
            int r0 = r3 + -1
            int r1 = r0 / 2
            int r0 = X.AnonymousClass0YX.A00(r2, r1, r3)     // Catch:{ all -> 0x00eb }
            if (r0 <= 0) goto L_0x00b3
            X.AnonymousClass0YX.A01(r4, r3, r1)     // Catch:{ all -> 0x00eb }
            r3 = r1
            goto L_0x009d
        L_0x00b3:
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            r1 = 0
            goto L_0x00b7
        L_0x00b6:
            r1 = 2
        L_0x00b7:
            monitor-exit(r13)
            if (r1 == 0) goto L_0x00be
            r0 = 1
            if (r1 == r0) goto L_0x00f1
            return
        L_0x00be:
            java.lang.Object r2 = r5.get(r12)
            X.0YX r2 = (X.AnonymousClass0YX) r2
            if (r2 == 0) goto L_0x00f4
            monitor-enter(r2)
            X.0pS[] r1 = r2.A00     // Catch:{ all -> 0x00e0 }
            r0 = 0
            if (r1 == 0) goto L_0x00cf
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00e0 }
        L_0x00cf:
            monitor-exit(r2)
            if (r0 != r13) goto L_0x00f4
            java.lang.Thread r1 = r12.A0A()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L_0x00f4
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00e3:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00eb }
            r0.<init>(r1)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00f1:
            r12.A0B(r13, r14)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03I.A0D(X.0hU, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0002:
            java.lang.Object r5 = r4.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A00
            int r1 = r0.get(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 != 0) goto L_0x004f
            r3 = 1
            if (r5 != 0) goto L_0x001e
            r0 = 0
            boolean r0 = X.AnonymousClass0A8.A00(r6, r0, r7, r4)
        L_0x001b:
            if (r0 == 0) goto L_0x0002
        L_0x001d:
            return r3
        L_0x001e:
            boolean r0 = r5 instanceof X.AnonymousClass038
            if (r0 == 0) goto L_0x0039
            r2 = r5
            X.038 r2 = (X.AnonymousClass038) r2
            int r0 = r2.A02(r7)
            if (r0 == 0) goto L_0x001d
            if (r0 != r3) goto L_0x004f
            long r0 = X.AnonymousClass038.A00(r2)
            X.038 r0 = X.AnonymousClass038.A01(r2, r0)
            X.AnonymousClass0A8.A00(r6, r5, r0, r4)
            goto L_0x0002
        L_0x0039:
            X.035 r0 = X.C05950Rs.A00
            if (r5 == r0) goto L_0x004f
            r1 = 8
            X.038 r0 = new X.038
            r0.<init>(r1, r3)
            r0.A02(r5)
            r0.A02(r7)
            boolean r0 = X.AnonymousClass0A8.A00(r6, r5, r0, r4)
            goto L_0x001b
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03I.A00(java.lang.Runnable):boolean");
    }

    public void A06() {
        C16570pS r0;
        boolean A002;
        AnonymousClass0AL.A00.set((Object) null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof AnonymousClass038)) {
                    if (obj == C05950Rs.A00) {
                        break;
                    }
                    AnonymousClass038 r02 = new AnonymousClass038(8, true);
                    r02.A02(obj);
                    A002 = AnonymousClass0A8.A00(this, obj, r02, atomicReferenceFieldUpdater);
                    continue;
                } else {
                    ((AnonymousClass038) obj).A04();
                    break;
                }
            } else {
                A002 = AnonymousClass0A8.A00(this, (Object) null, C05950Rs.A00, atomicReferenceFieldUpdater);
                continue;
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A05() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            AnonymousClass0YX r4 = (AnonymousClass0YX) A01.get(this);
            if (r4 != null) {
                synchronized (r4) {
                    r0 = null;
                    if (AnonymousClass0YX.A01.get(r4) > 0) {
                        r0 = r4.A02(0);
                    }
                }
                C12090hU r03 = (C12090hU) r0;
                if (r03 != null) {
                    A0B(r03, nanoTime);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public boolean A0E() {
        boolean z;
        Object obj;
        C005002g r0 = this.A01;
        if (r0 != null) {
            z = r0.isEmpty();
        } else {
            z = true;
        }
        if (z && ((obj = A01.get(this)) == null || AnonymousClass0YX.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 == null) {
                return true;
            }
            if (obj2 instanceof AnonymousClass038) {
                long j = AnonymousClass038.A04.get(obj2);
                if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            } else if (obj2 == C05950Rs.A00) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass03l BL6(Runnable runnable, C005102h r3, long j) {
        return AnonymousClass03F.A00.BL6(runnable, r3, j);
    }

    public void BpP(AnonymousClass0AP r7, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = SearchActionVerificationClientService.MS_TO_NS * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        C15250mw r3 = new C15250mw(r7, this, j2 + nanoTime);
        A0D(r3, nanoTime);
        AnonymousClass0AR.A05(new C15170mo(r3), (AnonymousClass0AR) r7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0080 A[EDGE_INSN: B:76:0x0080->B:42:0x0080 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05() {
        /*
            r13 = this;
            boolean r0 = r13.A09()
            r11 = 0
            if (r0 != 0) goto L_0x00df
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = A01
            java.lang.Object r9 = r10.get(r13)
            X.0YX r9 = (X.AnonymousClass0YX) r9
            if (r9 == 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0YX.A01
            int r0 = r0.get(r9)
            if (r0 == 0) goto L_0x0043
            long r7 = java.lang.System.nanoTime()
        L_0x001e:
            monitor-enter(r9)
            X.0pS[] r1 = r9.A00     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0027
            r0 = 0
            r6 = r1[r0]     // Catch:{ all -> 0x007d }
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            r5 = 0
            if (r6 == 0) goto L_0x0040
            X.0hU r6 = (X.C12090hU) r6     // Catch:{ all -> 0x007d }
            long r3 = r6.A01     // Catch:{ all -> 0x007d }
            long r1 = r7 - r3
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0040
            r1 = 0
            boolean r0 = r13.A00(r6)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0040
            X.0pS r5 = r9.A02(r1)     // Catch:{ all -> 0x007d }
        L_0x0040:
            monitor-exit(r9)
            if (r5 != 0) goto L_0x001e
        L_0x0043:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0045:
            java.lang.Object r3 = r4.get(r13)
            r1 = 0
            if (r3 == 0) goto L_0x0080
            boolean r0 = r3 instanceof X.AnonymousClass038
            if (r0 == 0) goto L_0x006f
            r2 = r3
            X.038 r2 = (X.AnonymousClass038) r2
            java.lang.Object r1 = r2.A03()
            X.035 r0 = X.AnonymousClass038.A05
            if (r1 == r0) goto L_0x0063
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L_0x005d:
            if (r1 == 0) goto L_0x0080
            r1.run()
            return r11
        L_0x0063:
            long r0 = X.AnonymousClass038.A00(r2)
            X.038 r0 = X.AnonymousClass038.A01(r2, r0)
            X.AnonymousClass0A8.A00(r13, r3, r0, r4)
            goto L_0x0045
        L_0x006f:
            X.035 r0 = X.C05950Rs.A00
            if (r3 == r0) goto L_0x0080
            boolean r0 = X.AnonymousClass0A8.A00(r13, r3, r1, r4)
            if (r0 == 0) goto L_0x0045
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r1 = r3
            goto L_0x005d
        L_0x007d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0080:
            X.02g r0 = r13.A01
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d2
        L_0x008a:
            java.lang.Object r1 = r4.get(r13)
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1 instanceof X.AnonymousClass038
            if (r0 == 0) goto L_0x00d5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass038.A04
            long r2 = r0.get(r1)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r0 = 0
            long r5 = r5 >> r0
            int r4 = (int) r5
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r2 = r2 & r0
            r0 = 30
            long r2 = r2 >> r0
            int r0 = (int) r2
            if (r4 != r0) goto L_0x00d2
        L_0x00ad:
            java.lang.Object r2 = r10.get(r13)
            X.0YX r2 = (X.AnonymousClass0YX) r2
            if (r2 == 0) goto L_0x00d9
            monitor-enter(r2)
            X.0pS[] r1 = r2.A00     // Catch:{ all -> 0x00bf }
            r0 = 0
            if (r1 == 0) goto L_0x00c2
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00c2:
            monitor-exit(r2)
            X.0hU r0 = (X.C12090hU) r0
            if (r0 == 0) goto L_0x00d9
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00de
        L_0x00d2:
            r2 = 0
            return r2
        L_0x00d5:
            X.035 r0 = X.C05950Rs.A00
            if (r1 != r0) goto L_0x00d2
        L_0x00d9:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00de:
            return r2
        L_0x00df:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03I.A05():long");
    }

    public void A0C(Runnable runnable) {
        if (A00(runnable)) {
            Thread A0A = A0A();
            if (Thread.currentThread() != A0A) {
                LockSupport.unpark(A0A);
                return;
            }
            return;
        }
        AnonymousClass03J.A00.A0C(runnable);
    }

    public final void A03(Runnable runnable, C005102h r2) {
        A0C(runnable);
    }
}
