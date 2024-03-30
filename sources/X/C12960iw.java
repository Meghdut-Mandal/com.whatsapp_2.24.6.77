package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0iw  reason: invalid class name and case insensitive filesystem */
public class C12960iw implements C18010sR {
    public static final AtomicLongFieldUpdater A01;
    public static final AtomicLongFieldUpdater A02;
    public static final AtomicLongFieldUpdater A03;
    public static final AtomicLongFieldUpdater A04;
    public static final AtomicReferenceFieldUpdater A05;
    public static final AtomicReferenceFieldUpdater A06;
    public static final AtomicReferenceFieldUpdater A07;
    public static final AtomicReferenceFieldUpdater A08;
    public static final AtomicReferenceFieldUpdater A09;
    public final int A00;
    public volatile Object _closeCause;
    public volatile long bufferEnd;
    public volatile Object bufferEndSegment;
    public volatile Object closeHandler;
    public volatile long completedExpandBuffersAndPauseFlag;
    public volatile Object receiveSegment;
    public volatile long receivers;
    public volatile Object sendSegment;
    public volatile long sendersAndCloseStatus;

    static {
        Class<C12960iw> cls = C12960iw.class;
        A04 = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        A03 = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        A01 = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        A02 = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        A09 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        A08 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        A07 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public C12960iw(int i) {
        long j;
        this.A00 = i;
        if (i >= 0) {
            int i2 = AnonymousClass0SC.A01;
            if (i == 0) {
                j = 0;
            } else if (i != Integer.MAX_VALUE) {
                j = (long) i;
            } else {
                j = Long.MAX_VALUE;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = A01.get(this);
            C15560nX r1 = new C15560nX(this, (C15560nX) null, 3, 0);
            this.sendSegment = r1;
            this.receiveSegment = r1;
            if (A0C()) {
                r1 = AnonymousClass0SC.A02;
                AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = r1;
            this._closeCause = AnonymousClass0SC.A0C;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Invalid channel capacity: ");
        A0u.append(i);
        throw AnonymousClass000.A0c(", should be >=0", A0u);
    }

    public boolean A0L() {
        return false;
    }

    public boolean A0M(Throwable th, boolean z) {
        long j;
        long j2;
        int i;
        Object obj;
        AnonymousClass035 r0;
        long j3;
        long j4;
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                int i2 = AnonymousClass0SC.A01;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 1) << 60) + (1152921504606846975L & j4)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        boolean A002 = AnonymousClass0A8.A00(this, AnonymousClass0SC.A0C, th, atomicReferenceFieldUpdater);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        if (z) {
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, (((long) 3) << 60) + (1152921504606846975L & j3)));
        } else {
            do {
                j = atomicLongFieldUpdater2.get(this);
                int i3 = (int) (j >> 60);
                if (i3 != 0) {
                    if (i3 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    i = 3;
                } else {
                    j2 = j & 1152921504606846975L;
                    i = 2;
                }
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j, (((long) i) << 60) + j2));
        }
        BLP();
        if (A002) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A07;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    r0 = AnonymousClass0SC.A05;
                } else {
                    r0 = AnonymousClass0SC.A06;
                }
            } while (!AnonymousClass0A8.A00(this, obj, r0, atomicReferenceFieldUpdater2));
            if (obj != null) {
                C07710Yz.A03(obj, 1);
                ((C006302t) obj).invoke(atomicReferenceFieldUpdater.get(this));
            }
        }
        return A002;
    }

    public boolean B33(Throwable th) {
        return A0M(th, false);
    }

    public Object Bmy(C023509x r2) {
        return A02(r2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r9 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r0 = r11.A09(r12, r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if (r1 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r10.A08();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7 A[EDGE_INSN: B:54:0x00b7->B:47:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7 A[EDGE_INSN: B:58:0x00a7->B:43:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.lang.Object r9, X.C12960iw r10, X.C15560nX r11, int r12, long r13) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.A00
            int r2 = r12 * 2
            int r4 = r2 + 1
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r6 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            if (r9 == 0) goto L_0x00bd
            boolean r0 = r11.A09(r12, r5, r9)
        L_0x0022:
            if (r0 == 0) goto L_0x0042
            r10.A08()
            X.035 r1 = X.AnonymousClass0SC.A0H
            return r1
        L_0x002a:
            X.035 r0 = X.AnonymousClass0SC.A03
            if (r5 != r0) goto L_0x0042
            X.035 r0 = X.AnonymousClass0SC.A07
            boolean r0 = r11.A09(r12, r5, r0)
        L_0x0034:
            if (r0 == 0) goto L_0x0042
            r10.A08()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.lazySet(r2, r0)
            return r1
        L_0x0042:
            java.lang.Object r6 = r3.get(r4)
            if (r6 == 0) goto L_0x008e
            X.035 r0 = X.AnonymousClass0SC.A0B
            if (r6 == r0) goto L_0x008e
            X.035 r0 = X.AnonymousClass0SC.A03
            if (r6 != r0) goto L_0x0057
            X.035 r0 = X.AnonymousClass0SC.A07
            boolean r0 = r11.A09(r12, r6, r0)
            goto L_0x0034
        L_0x0057:
            X.035 r5 = X.AnonymousClass0SC.A0A
            if (r6 == r5) goto L_0x00ba
            X.035 r0 = X.AnonymousClass0SC.A0E
            if (r6 == r0) goto L_0x00ba
            X.035 r0 = X.AnonymousClass0SC.A04
            if (r6 == r0) goto L_0x00b7
            X.035 r0 = X.AnonymousClass0SC.A0F
            if (r6 == r0) goto L_0x0042
            X.035 r0 = X.AnonymousClass0SC.A0G
            boolean r0 = r11.A09(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
            boolean r1 = r6 instanceof X.C06420Tn
            if (r1 == 0) goto L_0x0077
            X.0Tn r6 = (X.C06420Tn) r6
            X.0AQ r6 = r6.A00
        L_0x0077:
            boolean r0 = r10.A0F(r6, r11, r12)
            if (r0 == 0) goto L_0x00af
            X.035 r0 = X.AnonymousClass0SC.A07
            r3.set(r4, r0)
            r10.A08()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.lazySet(r2, r0)
            return r1
        L_0x008e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r7 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            X.035 r0 = X.AnonymousClass0SC.A0E
            boolean r0 = r11.A09(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
            goto L_0x00b7
        L_0x00a7:
            if (r9 == 0) goto L_0x00bd
            boolean r0 = r11.A09(r12, r6, r9)
            goto L_0x0022
        L_0x00af:
            r3.set(r4, r5)
            r11.A05()
            if (r1 == 0) goto L_0x00ba
        L_0x00b7:
            r10.A08()
        L_0x00ba:
            X.035 r1 = X.AnonymousClass0SC.A08
            return r1
        L_0x00bd:
            X.035 r1 = X.AnonymousClass0SC.A0I
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A01(java.lang.Object, X.0iw, X.0nX, int, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A02(X.C023509x r17, X.C12960iw r18) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.C13730kM
            r8 = r18
            if (r0 == 0) goto L_0x008a
            r13 = r3
            X.0kM r13 = (X.C13730kM) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008a
            int r2 = r2 - r1
            r13.label = r2
        L_0x0016:
            java.lang.Object r1 = r13.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r4 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r4) goto L_0x0090
            X.AnonymousClass0AN.A00(r1)
            X.0X8 r1 = (X.AnonymousClass0X8) r1
            java.lang.Object r1 = r1.A00
        L_0x0028:
            return r1
        L_0x0029:
            X.AnonymousClass0AN.A00(r1)
            r7 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            X.0nX r9 = X.AnonymousClass001.A0K(r8, r0)
        L_0x0033:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r0 = r0.get(r8)
            boolean r0 = A0G(r8, r0, r4)
            if (r0 == 0) goto L_0x0044
            X.0n9 r1 = X.C06340Tf.A00(r8)
            return r1
        L_0x0044:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r11 = r0.getAndIncrement(r8)
            int r0 = X.AnonymousClass0SC.A01
            long r0 = (long) r0
            long r2 = r11 / r0
            long r0 = r11 % r0
            int r10 = (int) r0
            long r0 = r9.A00
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x005f
            X.0nX r0 = A06(r8, r9, r2)
            if (r0 == 0) goto L_0x0033
            r9 = r0
        L_0x005f:
            java.lang.Object r1 = A01(r7, r8, r9, r10, r11)
            X.035 r0 = X.AnonymousClass0SC.A0H
            if (r1 == r0) goto L_0x0099
            X.035 r0 = X.AnonymousClass0SC.A08
            if (r1 != r0) goto L_0x0077
            long r1 = r8.A0H()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r9.A01()
            goto L_0x0033
        L_0x0077:
            X.035 r0 = X.AnonymousClass0SC.A0I
            if (r1 != r0) goto L_0x0095
            r13.label = r4
            r14 = r8
            r15 = r9
            r16 = r10
            r17 = r11
            java.lang.Object r1 = A03(r13, r14, r15, r16, r17)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x008a:
            X.0kM r13 = new X.0kM
            r13.<init>(r3, r8)
            goto L_0x0016
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0095:
            r9.A01()
            return r1
        L_0x0099:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A02(X.09x, X.0iw):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r1 == X.AnonymousClass0SC.A0I) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r12.A01();
        r0 = new X.AnonymousClass0X8(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        throw X.AnonymousClass001.A09("unexpected");
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C023509x r10, X.C12960iw r11, X.C15560nX r12, int r13, long r14) {
        /*
            boolean r0 = r10 instanceof X.C14020kp
            if (r0 == 0) goto L_0x00ce
            r3 = r10
            X.0kp r3 = (X.C14020kp) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ce
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x00d5
            X.AnonymousClass0AN.A00(r2)
        L_0x0020:
            X.0X8 r2 = (X.AnonymousClass0X8) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r2)
            r3.L$0 = r11
            r3.L$1 = r12
            r3.I$0 = r13
            r3.J$0 = r14
            r3.label = r0
            X.09x r0 = X.AnonymousClass0AA.A01(r3)
            X.0AR r4 = X.C05710Qt.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            X.AnonymousClass00C.A0E(r4, r0)     // Catch:{ all -> 0x00e1 }
            X.0iu r10 = new X.0iu     // Catch:{ all -> 0x00e1 }
            r10.<init>(r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00e1 }
            X.035 r6 = X.AnonymousClass0SC.A0H     // Catch:{ all -> 0x00e1 }
            if (r1 == r6) goto L_0x00c4
            X.035 r5 = X.AnonymousClass0SC.A08     // Catch:{ all -> 0x00e1 }
            r8 = 0
            if (r1 != r5) goto L_0x00ab
            long r1 = r11.A0H()     // Catch:{ all -> 0x00e1 }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            r12.A01()     // Catch:{ all -> 0x00e1 }
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08     // Catch:{ all -> 0x00e1 }
            X.0nX r12 = X.AnonymousClass001.A0K(r11, r0)     // Catch:{ all -> 0x00e1 }
        L_0x0062:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04     // Catch:{ all -> 0x00e1 }
            long r0 = r0.get(r11)     // Catch:{ all -> 0x00e1 }
            r2 = 1
            boolean r0 = A0G(r11, r0, r2)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x007c
            X.0n9 r1 = X.C06340Tf.A00(r11)     // Catch:{ all -> 0x00e1 }
            X.0X8 r0 = new X.0X8     // Catch:{ all -> 0x00e1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e1 }
            r4.resumeWith(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00c7
        L_0x007c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x00e1 }
            long r14 = r0.getAndIncrement(r11)     // Catch:{ all -> 0x00e1 }
            int r0 = X.AnonymousClass0SC.A01     // Catch:{ all -> 0x00e1 }
            long r2 = (long) r0     // Catch:{ all -> 0x00e1 }
            long r0 = r14 / r2
            long r2 = r14 % r2
            int r13 = (int) r2     // Catch:{ all -> 0x00e1 }
            long r2 = r12.A00     // Catch:{ all -> 0x00e1 }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0097
            X.0nX r0 = A06(r11, r12, r0)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0062
            r12 = r0
        L_0x0097:
            java.lang.Object r1 = A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00e1 }
            if (r1 == r6) goto L_0x00c4
            if (r1 != r5) goto L_0x00b4
            long r1 = r11.A0H()     // Catch:{ all -> 0x00e1 }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            r12.A01()     // Catch:{ all -> 0x00e1 }
            goto L_0x0062
        L_0x00ab:
            r12.A01()     // Catch:{ all -> 0x00e1 }
            X.0X8 r0 = new X.0X8     // Catch:{ all -> 0x00e1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00c0
        L_0x00b4:
            X.035 r0 = X.AnonymousClass0SC.A0I     // Catch:{ all -> 0x00e1 }
            if (r1 == r0) goto L_0x00da
            r12.A01()     // Catch:{ all -> 0x00e1 }
            X.0X8 r0 = new X.0X8     // Catch:{ all -> 0x00e1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00c0:
            r4.Bol(r8, r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00c7
        L_0x00c4:
            r10.BL2(r12, r13)     // Catch:{ all -> 0x00e1 }
        L_0x00c7:
            java.lang.Object r2 = r4.A0G()
            if (r2 != r7) goto L_0x0020
            return r7
        L_0x00ce:
            X.0kp r3 = new X.0kp
            r3.<init>(r10, r11)
            goto L_0x0012
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00da:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            r4.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A03(X.09x, X.0iw, X.0nX, int, long):java.lang.Object");
    }

    public static final Throwable A04(C12960iw r1) {
        Throwable th = (Throwable) A05.get(r1);
        if (th == null) {
            return new C13380jm();
        }
        return th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r6 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r8.A08(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if ((r6 instanceof java.util.ArrayList) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        r0 = new java.util.ArrayList(4);
        r0.add(r6);
        r0.add(r2);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        r0 = (X.C15560nX) ((X.AnonymousClass0XE) X.AnonymousClass0XE.A01.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C15560nX A05(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r5 = r0.get(r11)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            X.0nX r6 = X.AnonymousClass001.A0K(r11, r0)
            long r3 = r6.A00
            r0 = r5
            X.0nN r0 = (X.C15460nN) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            r5 = r6
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            X.0nX r6 = X.AnonymousClass001.A0K(r11, r0)
            long r3 = r6.A00
            r0 = r5
            X.0nN r0 = (X.C15460nN) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            r5 = r6
        L_0x002a:
            X.0XE r5 = (X.AnonymousClass0XE) r5
        L_0x002c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.AnonymousClass0XE.A00
            java.lang.Object r0 = r2.get(r5)
            X.035 r1 = X.C06980Vw.A00
            if (r0 == r1) goto L_0x0041
            X.0XE r0 = (X.AnonymousClass0XE) r0
            if (r0 != 0) goto L_0x0118
            r0 = 0
            boolean r0 = X.AnonymousClass0A8.A00(r5, r0, r1, r2)
            if (r0 == 0) goto L_0x002c
        L_0x0041:
            X.0nX r5 = (X.C15560nX) r5
            boolean r0 = r11.A0L()
            if (r0 == 0) goto L_0x0062
            r0 = r5
        L_0x004a:
            int r7 = X.AnonymousClass0SC.A01
            r6 = r7
        L_0x004d:
            int r7 = r7 + -1
            r1 = -1
            if (r1 >= r7) goto L_0x010a
            long r1 = r0.A00
            long r3 = (long) r6
            long r1 = r1 * r3
            long r3 = (long) r7
            long r1 = r1 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = A03
            long r8 = r3.get(r11)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00de
        L_0x0062:
            r8 = r5
            r7 = 1
            r6 = 0
        L_0x0065:
            r4 = -1
            if (r8 == 0) goto L_0x011b
            int r10 = X.AnonymousClass0SC.A01
            int r9 = r10 - r7
        L_0x006c:
            if (r4 >= r9) goto L_0x00d3
            long r2 = r8.A00
            long r0 = (long) r10
            long r2 = r2 * r0
            long r0 = (long) r9
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x011b
        L_0x0078:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r8.A00
            int r0 = r9 * 2
            int r0 = r0 + 1
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L_0x00c7
            X.035 r0 = X.AnonymousClass0SC.A0B
            if (r2 == r0) goto L_0x00c7
            boolean r0 = r2 instanceof X.C06420Tn
            if (r0 == 0) goto L_0x00ba
            X.035 r0 = X.AnonymousClass0SC.A04
            boolean r0 = r8.A09(r9, r2, r0)
            if (r0 == 0) goto L_0x0078
            X.0Tn r2 = (X.C06420Tn) r2
            X.0AQ r2 = r2.A00
        L_0x0098:
            if (r6 != 0) goto L_0x00a1
            r6 = r2
        L_0x009b:
            r8.A08(r9, r7)
        L_0x009e:
            int r9 = r9 + -1
            goto L_0x006c
        L_0x00a1:
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00ac
            r0 = r6
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r2)
            goto L_0x009b
        L_0x00ac:
            r1 = 4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r0.add(r6)
            r0.add(r2)
            r6 = r0
            goto L_0x009b
        L_0x00ba:
            boolean r0 = r2 instanceof X.AnonymousClass0AQ
            if (r0 == 0) goto L_0x009e
            X.035 r0 = X.AnonymousClass0SC.A04
            boolean r0 = r8.A09(r9, r2, r0)
            if (r0 == 0) goto L_0x0078
            goto L_0x0098
        L_0x00c7:
            X.035 r0 = X.AnonymousClass0SC.A04
            boolean r0 = r8.A09(r9, r2, r0)
            if (r0 == 0) goto L_0x0078
            r8.A05()
            goto L_0x009e
        L_0x00d3:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass0XE.A01
            java.lang.Object r8 = r0.get(r8)
            X.0XE r8 = (X.AnonymousClass0XE) r8
            X.0nX r8 = (X.C15560nX) r8
            goto L_0x0065
        L_0x00de:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.A00
            int r3 = r7 * 2
            int r3 = r3 + 1
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x00fd
            X.035 r3 = X.AnonymousClass0SC.A0B
            if (r4 == r3) goto L_0x00fd
            X.035 r3 = X.AnonymousClass0SC.A03
            if (r4 != r3) goto L_0x004d
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            r11.A0J(r1)
            goto L_0x0062
        L_0x00fd:
            X.035 r3 = X.AnonymousClass0SC.A04
            boolean r3 = r0.A09(r7, r4, r3)
            if (r3 == 0) goto L_0x00de
            r0.A05()
            goto L_0x004d
        L_0x010a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass0XE.A01
            java.lang.Object r0 = r1.get(r0)
            X.0XE r0 = (X.AnonymousClass0XE) r0
            X.0nX r0 = (X.C15560nX) r0
            if (r0 != 0) goto L_0x004a
            goto L_0x0062
        L_0x0118:
            r5 = r0
            goto L_0x002c
        L_0x011b:
            if (r6 == 0) goto L_0x0126
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x0127
            X.0AQ r6 = (X.AnonymousClass0AQ) r6
            r11.A09(r6, r7)
        L_0x0126:
            return r5
        L_0x0127:
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            int r1 = r6.size()
            int r1 = r1 - r7
        L_0x012e:
            if (r4 >= r1) goto L_0x0126
            java.lang.Object r0 = r6.get(r1)
            X.0AQ r0 = (X.AnonymousClass0AQ) r0
            r11.A09(r0, r7)
            int r1 = r1 + -1
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A05(long):X.0nX");
    }

    public static final C15560nX A06(C12960iw r15, C15560nX r16, long j) {
        Object A002;
        boolean z;
        C12960iw r14;
        long j2;
        long j3;
        C15560nX r5 = r16;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        int i = AnonymousClass0SC.A01;
        C14420lb r10 = C14420lb.A00;
        loop0:
        while (true) {
            A002 = C06980Vw.A00(r10, r5, j);
            z = false;
            if (A002 == C06980Vw.A00) {
                z = true;
            }
            r14 = r15;
            if (z) {
                break;
            }
            C15460nN A003 = AnonymousClass0R6.A00(A002);
            while (true) {
                C15460nN r8 = (C15460nN) atomicReferenceFieldUpdater.get(r15);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A07()) {
                    if (AnonymousClass0A8.A00(r15, r8, A003, atomicReferenceFieldUpdater)) {
                        AnonymousClass000.A1G(r8);
                        break loop0;
                    }
                    AnonymousClass000.A1G(A003);
                }
            }
        }
        if (z) {
            r15.BLP();
            j2 = r5.A00 * ((long) AnonymousClass0SC.A01);
        } else {
            r5 = (C15560nX) AnonymousClass0R6.A00(A002);
            if (!r15.A0C() && j <= A01.get(r15) / ((long) AnonymousClass0SC.A01)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A06;
                while (true) {
                    C15460nN r82 = (C15460nN) atomicReferenceFieldUpdater2.get(r15);
                    if (r82.A00 >= r5.A00 || !r5.A07()) {
                        break;
                    } else if (AnonymousClass0A8.A00(r15, r82, r5, atomicReferenceFieldUpdater2)) {
                        AnonymousClass000.A1G(r82);
                        break;
                    } else {
                        AnonymousClass000.A1G(r5);
                    }
                }
            }
            long j4 = r5.A00;
            if (j4 <= j) {
                return r5;
            }
            j2 = j4 * ((long) AnonymousClass0SC.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            do {
                j3 = atomicLongFieldUpdater.get(r14);
                if (j3 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(r14, j3, j2));
        }
        if (j2 < r14.A0H()) {
            r5.A01();
        }
        return null;
    }

    public static final C15560nX A07(C12960iw r15, C15560nX r16, long j) {
        Object A002;
        boolean z;
        C12960iw r14;
        long j2;
        long j3;
        long j4;
        C15560nX r5 = r16;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        int i = AnonymousClass0SC.A01;
        C14420lb r11 = C14420lb.A00;
        loop0:
        while (true) {
            A002 = C06980Vw.A00(r11, r5, j);
            z = false;
            if (A002 == C06980Vw.A00) {
                z = true;
            }
            r14 = r15;
            if (z) {
                break;
            }
            C15460nN A003 = AnonymousClass0R6.A00(A002);
            while (true) {
                C15460nN r8 = (C15460nN) atomicReferenceFieldUpdater.get(r15);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A07()) {
                    if (AnonymousClass0A8.A00(r15, r8, A003, atomicReferenceFieldUpdater)) {
                        AnonymousClass000.A1G(r8);
                        break loop0;
                    }
                    AnonymousClass000.A1G(A003);
                }
            }
        }
        if (z) {
            r15.BLP();
            j2 = r5.A00 * ((long) AnonymousClass0SC.A01);
        } else {
            r5 = (C15560nX) AnonymousClass0R6.A00(A002);
            long j5 = r5.A00;
            if (j5 <= j) {
                return r5;
            }
            j2 = j5 * ((long) AnonymousClass0SC.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j3 = atomicLongFieldUpdater.get(r14);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(r14, j3, (((long) ((int) (j3 >> 60))) << 60) + j4));
        }
        if (j2 < A03.get(r14)) {
            r5.A01();
        }
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[LOOP:3: B:21:0x006e->B:22:0x0075, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0030 A[EDGE_INSN: B:74:0x0030->B:9:0x0030 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00eb A[SYNTHETIC] */
    private final void A08() {
        /*
            r19 = this;
            r10 = r19
            boolean r0 = r10.A0C()
            if (r0 != 0) goto L_0x0143
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A06
            X.0nX r8 = X.AnonymousClass001.A0K(r10, r9)
        L_0x000e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = A01
            long r17 = r11.getAndIncrement(r10)
            int r0 = X.AnonymousClass0SC.A01
            long r6 = (long) r0
            long r4 = r17 / r6
            long r0 = r10.A0H()
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            long r0 = r8.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x004b
            if (r2 >= 0) goto L_0x0030
            X.0XE r0 = r8.A00()
            if (r0 == 0) goto L_0x0030
            r10.A0B(r8, r4)
        L_0x0030:
            r0 = 1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = A02
            long r1 = r7.addAndGet(r10, r0)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0143
        L_0x0041:
            long r1 = r7.get(r10)
            long r1 = r1 & r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0143
            goto L_0x0041
        L_0x004b:
            if (r2 == 0) goto L_0x00bb
            X.0lb r15 = X.C14420lb.A00
        L_0x004f:
            java.lang.Object r14 = X.C06980Vw.A00(r15, r8, r4)
            X.035 r0 = X.C06980Vw.A00
            if (r14 != r0) goto L_0x0078
            r10.BLP()
            r10.A0B(r8, r4)
        L_0x005d:
            r0 = 1
        L_0x005f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = A02
            long r1 = r7.addAndGet(r10, r0)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x000e
        L_0x006e:
            long r1 = r7.get(r10)
            long r1 = r1 & r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x000e
            goto L_0x006e
        L_0x0078:
            X.0nN r13 = X.AnonymousClass0R6.A00(r14)
        L_0x007c:
            java.lang.Object r12 = r9.get(r10)
            X.0nN r12 = (X.C15460nN) r12
            long r2 = r12.A00
            long r0 = r13.A00
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0099
            boolean r0 = r13.A07()
            if (r0 == 0) goto L_0x004f
            boolean r0 = X.AnonymousClass0A8.A00(r10, r12, r13, r9)
            if (r0 == 0) goto L_0x00b6
            X.AnonymousClass000.A1G(r12)
        L_0x0099:
            X.0nN r3 = X.AnonymousClass0R6.A00(r14)
            X.0nX r3 = (X.C15560nX) r3
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ba
            r2 = 1
            long r4 = r17 + r2
            long r0 = r0 * r6
            r2 = r11
            r3 = r10
            r6 = r0
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L_0x005d
            long r0 = r0 - r17
            goto L_0x005f
        L_0x00b6:
            X.AnonymousClass000.A1G(r13)
            goto L_0x007c
        L_0x00ba:
            r8 = r3
        L_0x00bb:
            long r0 = r17 % r6
            int r4 = (int) r0
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r8.A00
            int r0 = r4 * 2
            int r1 = r0 + 1
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.AnonymousClass0AQ
            if (r0 == 0) goto L_0x00eb
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
        L_0x00d6:
            X.035 r0 = X.AnonymousClass0SC.A0F
            boolean r0 = r8.A09(r4, r2, r0)
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r10.A0F(r2, r8, r4)
            if (r0 == 0) goto L_0x0139
            X.035 r0 = X.AnonymousClass0SC.A03
            r3.set(r1, r0)
            goto L_0x0030
        L_0x00eb:
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.AnonymousClass0AQ
            if (r0 == 0) goto L_0x010d
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            r5 = r2
            X.0AQ r5 = (X.AnonymousClass0AQ) r5
            X.0Tn r0 = new X.0Tn
            r0.<init>(r5)
        L_0x0105:
            boolean r0 = r8.A09(r4, r2, r0)
            if (r0 == 0) goto L_0x00eb
            goto L_0x0030
        L_0x010d:
            X.035 r0 = X.AnonymousClass0SC.A0A
            if (r2 == r0) goto L_0x005d
            if (r2 != 0) goto L_0x0116
            X.035 r0 = X.AnonymousClass0SC.A0B
            goto L_0x0105
        L_0x0116:
            X.035 r0 = X.AnonymousClass0SC.A03
            if (r2 == r0) goto L_0x0030
            X.035 r0 = X.AnonymousClass0SC.A0E
            if (r2 == r0) goto L_0x0030
            X.035 r0 = X.AnonymousClass0SC.A07
            if (r2 == r0) goto L_0x0030
            X.035 r0 = X.AnonymousClass0SC.A09
            if (r2 == r0) goto L_0x0030
            X.035 r0 = X.AnonymousClass0SC.A04
            if (r2 == r0) goto L_0x0030
            X.035 r0 = X.AnonymousClass0SC.A0G
            if (r2 == r0) goto L_0x00eb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected cell state: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)
            throw r0
        L_0x0139:
            X.035 r0 = X.AnonymousClass0SC.A0A
            r3.set(r1, r0)
            r8.A05()
            goto L_0x005d
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A08():void");
    }

    private final void A09(AnonymousClass0AQ r4, boolean z) {
        boolean r0;
        C023509x r42;
        Object r1;
        Throwable A0I;
        if (r4 instanceof AnonymousClass0AP) {
            r42 = (C023509x) r4;
            if (z) {
                A0I = A04(this);
            } else {
                A0I = A0I();
            }
            r1 = AnonymousClass00C.A02(A0I);
        } else if (r4 instanceof C12940iu) {
            r42 = ((C12940iu) r4).A00;
            r1 = new AnonymousClass0X8(C06340Tf.A00(this));
        } else if (r4 instanceof C12950iv) {
            C12950iv r43 = (C12950iv) r4;
            AnonymousClass0AR r2 = r43.A01;
            AnonymousClass00C.A0B(r2);
            r43.A01 = null;
            r43.A00 = AnonymousClass0SC.A04;
            Throwable th = (Throwable) A05.get(r43.A02);
            if (th == null) {
                r0 = false;
            } else {
                r0 = new AnonymousClass03N(th);
            }
            r2.resumeWith(r0);
            return;
        } else if (r4 instanceof C15200mr) {
            C15200mr.A00(this, AnonymousClass0SC.A04, (C15200mr) r4);
            return;
        } else {
            throw AnonymousClass000.A0f(r4, "Unexpected waiter: ", AnonymousClass000.A0u());
        }
        r42.resumeWith(r1);
    }

    public static final void A0A(C12960iw r10, C15200mr r11) {
        C12960iw r6 = r10;
        C15560nX A0K = AnonymousClass001.A0K(r10, A08);
        while (true) {
            C15200mr r5 = r11;
            if (A0G(r6, A04.get(r6), true)) {
                r11.A01 = AnonymousClass0SC.A04;
                return;
            }
            long andIncrement = A03.getAndIncrement(r6);
            long j = (long) AnonymousClass0SC.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (A0K.A00 != j2) {
                C15560nX A062 = A06(r6, A0K, j2);
                if (A062 != null) {
                    A0K = A062;
                } else {
                    continue;
                }
            }
            Object A012 = A01(r5, r6, A0K, i, andIncrement);
            if (A012 == AnonymousClass0SC.A0H) {
                if ((r11 instanceof AnonymousClass0AQ) && r11 != null) {
                    r11.BL2(A0K, i);
                    return;
                }
                return;
            } else if (A012 == AnonymousClass0SC.A08) {
                if (andIncrement < r6.A0H()) {
                    A0K.A01();
                }
            } else if (A012 != AnonymousClass0SC.A0I) {
                A0K.A01();
                r11.A01 = A012;
                return;
            } else {
                throw AnonymousClass001.A09("unexpected");
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=X.0nX, code=X.0nN, for r8v0, types: [X.0nX] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0B(X.C15460nN r8, long r9) {
        /*
            r7 = this;
        L_0x0000:
            long r1 = r8.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            X.0XE r0 = r8.A00()
            X.0nN r0 = (X.C15460nN) r0
            if (r0 == 0) goto L_0x0010
            r8 = r0
            goto L_0x0000
        L_0x0010:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x0020
            X.0XE r0 = r8.A00()
            X.0nN r0 = (X.C15460nN) r0
            if (r0 == 0) goto L_0x0020
            r8 = r0
            goto L_0x0010
        L_0x0020:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A06
        L_0x0022:
            java.lang.Object r5 = r6.get(r7)
            X.0nN r5 = (X.C15460nN) r5
            long r3 = r5.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            boolean r0 = r8.A07()
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass0A8.A00(r7, r5, r8, r6)
            if (r0 == 0) goto L_0x0040
            X.AnonymousClass000.A1G(r5)
        L_0x003f:
            return
        L_0x0040:
            X.AnonymousClass000.A1G(r8)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A0B(X.0nX, long):void");
    }

    private final boolean A0C() {
        long j = A01.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private final boolean A0D(long j) {
        if (j < A01.get(this) || j < A03.get(this) + ((long) this.A00)) {
            return true;
        }
        return false;
    }

    private final boolean A0E(Object obj, Object obj2) {
        AnonymousClass0AR r2;
        if (!(obj instanceof C15200mr)) {
            if (obj instanceof C12940iu) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                r2 = ((C12940iu) obj).A00;
                AnonymousClass0X8 r1 = new AnonymousClass0X8(obj2);
                int i = AnonymousClass0SC.A01;
                if (AnonymousClass0AR.A02(r1, (C006302t) null, r2) == null) {
                    return false;
                }
            } else if (obj instanceof C12950iv) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                C12950iv r5 = (C12950iv) obj;
                r2 = r5.A01;
                AnonymousClass00C.A0B(r2);
                r5.A01 = null;
                r5.A00 = obj2;
                int i2 = AnonymousClass0SC.A01;
                if (AnonymousClass0AR.A02(true, (C006302t) null, r2) == null) {
                    return false;
                }
            } else if (obj instanceof AnonymousClass0AP) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                AnonymousClass0AP r52 = (AnonymousClass0AP) obj;
                int i3 = AnonymousClass0SC.A01;
                Object BwD = r52.BwD(obj2, (Object) null, (C006302t) null);
                if (BwD == null) {
                    return false;
                }
                r52.B3G(BwD);
                return true;
            } else {
                throw AnonymousClass000.A0f(obj, "Unexpected receiver type: ", AnonymousClass000.A0u());
            }
            AnonymousClass0AR.A08(r2, r2.A00);
            return true;
        } else if (C15200mr.A00(this, obj2, (C15200mr) obj) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean A0F(Object obj, C15560nX r7, int i) {
        Integer num;
        if (obj instanceof AnonymousClass0AP) {
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            AnonymousClass0AP r6 = (AnonymousClass0AP) obj;
            AnonymousClass0AJ r1 = AnonymousClass0AJ.A00;
            int i2 = AnonymousClass0SC.A01;
            Object BwD = r6.BwD(r1, (Object) null, (C006302t) null);
            if (BwD == null) {
                return false;
            }
            r6.B3G(BwD);
            return true;
        } else if (obj instanceof C15200mr) {
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int A002 = C15200mr.A00(this, AnonymousClass0AJ.A00, (C15200mr) obj);
            if (A002 == 0) {
                num = C023109s.A00;
            } else if (A002 == 1) {
                num = C023109s.A01;
            } else if (A002 != 2) {
                num = C023109s.A0G;
            } else {
                num = C023109s.A0C;
            }
            if (num == C023109s.A01) {
                r7.A00.lazySet(i * 2, (Object) null);
            }
            if (num == C023109s.A00) {
                return true;
            }
            return false;
        } else {
            throw AnonymousClass000.A0f(obj, "Unexpected waiter: ", AnonymousClass000.A0u());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r0.A00.lazySet(r8 * 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0140, code lost:
        r0 = (X.C15560nX) ((X.AnonymousClass0XE) X.AnonymousClass0XE.A01.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0G(X.C12960iw r16, long r17, boolean r19) {
        /*
            r0 = 60
            long r3 = r17 >> r0
            int r5 = (int) r3
            r6 = 0
            r0 = 1
            if (r5 == 0) goto L_0x0158
            if (r5 == r0) goto L_0x0158
            r0 = 2
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r15 = r16
            if (r5 == r0) goto L_0x00b9
            r0 = 3
            if (r5 != r0) goto L_0x016e
            long r1 = r17 & r3
            X.0nX r0 = r15.A05(r1)
            r14 = 1
            r7 = 0
        L_0x0020:
            int r9 = X.AnonymousClass0SC.A01
            int r8 = r9 - r14
        L_0x0024:
            r5 = -1
            if (r5 >= r8) goto L_0x0140
            long r3 = r0.A00
            long r1 = (long) r9
            long r3 = r3 * r1
            long r1 = (long) r8
            long r3 = r3 + r1
        L_0x002d:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.A00
            int r1 = r8 * 2
            int r1 = r1 + 1
            java.lang.Object r11 = r2.get(r1)
            X.035 r1 = X.AnonymousClass0SC.A07
            if (r11 == r1) goto L_0x014c
            X.035 r1 = X.AnonymousClass0SC.A03
            if (r11 != r1) goto L_0x005f
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = A03
            long r12 = r1.get(r15)
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x014c
            X.035 r1 = X.AnonymousClass0SC.A04
            boolean r1 = r0.A09(r8, r11, r1)
            if (r1 == 0) goto L_0x002d
        L_0x0051:
            r3 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.A00
            int r1 = r8 * 2
            r2.lazySet(r1, r3)
        L_0x0059:
            r0.A05()
        L_0x005c:
            int r8 = r8 + -1
            goto L_0x0024
        L_0x005f:
            X.035 r1 = X.AnonymousClass0SC.A0B
            if (r11 == r1) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            boolean r1 = r11 instanceof X.AnonymousClass0AQ
            if (r1 != 0) goto L_0x0078
            boolean r1 = r11 instanceof X.C06420Tn
            if (r1 != 0) goto L_0x0078
            X.035 r2 = X.AnonymousClass0SC.A0F
            if (r11 == r2) goto L_0x014c
            X.035 r1 = X.AnonymousClass0SC.A0G
            if (r11 == r1) goto L_0x014c
            if (r11 == r2) goto L_0x002d
            goto L_0x005c
        L_0x0078:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = A03
            long r12 = r1.get(r15)
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x014c
            boolean r1 = r11 instanceof X.C06420Tn
            r10 = r11
            if (r1 == 0) goto L_0x008b
            X.0Tn r10 = (X.C06420Tn) r10
            X.0AQ r10 = r10.A00
        L_0x008b:
            X.035 r1 = X.AnonymousClass0SC.A04
            boolean r1 = r0.A09(r8, r11, r1)
            if (r1 == 0) goto L_0x002d
            if (r7 != 0) goto L_0x0097
            r7 = r10
            goto L_0x0051
        L_0x0097:
            boolean r1 = r7 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00a2
            r1 = r7
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            r1.add(r10)
            goto L_0x0051
        L_0x00a2:
            r2 = 4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r1.add(r7)
            r1.add(r10)
            r7 = r1
            goto L_0x0051
        L_0x00b0:
            X.035 r1 = X.AnonymousClass0SC.A04
            boolean r1 = r0.A09(r8, r11, r1)
            if (r1 == 0) goto L_0x002d
            goto L_0x0059
        L_0x00b9:
            long r1 = r17 & r3
            r15.A05(r1)
            if (r19 == 0) goto L_0x0157
        L_0x00c0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A08
            X.0nX r7 = X.AnonymousClass001.A0K(r15, r9)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r14 = A03
            long r16 = r14.get(r15)
            long r1 = r15.A0H()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
            int r0 = X.AnonymousClass0SC.A01
            long r4 = (long) r0
            long r2 = r16 / r4
            long r0 = r7.A00
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x00f2
            X.0nX r7 = A06(r15, r7, r2)
            if (r7 != 0) goto L_0x00f2
            java.lang.Object r0 = r9.get(r15)
            X.0nN r0 = (X.C15460nN) r0
            long r4 = r0.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            goto L_0x0157
        L_0x00f2:
            r7.A01()
            long r0 = r16 % r4
            int r2 = (int) r0
        L_0x00f8:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.A00
            int r0 = r2 * 2
            int r0 = r0 + 1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x012d
            X.035 r0 = X.AnonymousClass0SC.A0B
            if (r1 == r0) goto L_0x012d
            X.035 r0 = X.AnonymousClass0SC.A03
            if (r1 == r0) goto L_0x0158
            X.035 r0 = X.AnonymousClass0SC.A0A
            if (r1 == r0) goto L_0x0138
            X.035 r0 = X.AnonymousClass0SC.A04
            if (r1 == r0) goto L_0x0138
            X.035 r0 = X.AnonymousClass0SC.A07
            if (r1 == r0) goto L_0x0138
            X.035 r0 = X.AnonymousClass0SC.A0E
            if (r1 == r0) goto L_0x0138
            X.035 r0 = X.AnonymousClass0SC.A0F
            if (r1 == r0) goto L_0x0158
            X.035 r0 = X.AnonymousClass0SC.A0G
            if (r1 == r0) goto L_0x0138
            long r1 = r14.get(r15)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0138
            return r6
        L_0x012d:
            X.035 r0 = X.AnonymousClass0SC.A0E
            boolean r0 = r7.A09(r2, r1, r0)
            if (r0 == 0) goto L_0x00f8
            r15.A08()
        L_0x0138:
            r0 = 1
            long r18 = r16 + r0
            r14.compareAndSet(r15, r16, r18)
            goto L_0x00c0
        L_0x0140:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass0XE.A01
            java.lang.Object r0 = r1.get(r0)
            X.0XE r0 = (X.AnonymousClass0XE) r0
            X.0nX r0 = (X.C15560nX) r0
            if (r0 != 0) goto L_0x0020
        L_0x014c:
            if (r7 == 0) goto L_0x0157
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x0159
            X.0AQ r7 = (X.AnonymousClass0AQ) r7
            r15.A09(r7, r6)
        L_0x0157:
            r6 = 1
        L_0x0158:
            return r6
        L_0x0159:
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            int r1 = r7.size()
            int r1 = r1 - r14
        L_0x0160:
            if (r5 >= r1) goto L_0x0157
            java.lang.Object r0 = r7.get(r1)
            X.0AQ r0 = (X.AnonymousClass0AQ) r0
            r15.A09(r0, r6)
            int r1 = r1 + -1
            goto L_0x0160
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected close status: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A0G(X.0iw, long, boolean):boolean");
    }

    public final long A0H() {
        return A04.get(this) & 1152921504606846975L;
    }

    public final Throwable A0I() {
        Throwable th = (Throwable) A05.get(this);
        if (th == null) {
            return new AnonymousClass0OE();
        }
        return th;
    }

    public final void A0J(long j) {
        C15560nX A0K = AnonymousClass001.A0K(this, A08);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.A00) + j2, A01.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    long j3 = (long) AnonymousClass0SC.A01;
                    long j4 = j2 / j3;
                    int i = (int) (j2 % j3);
                    if (A0K.A00 != j4) {
                        C15560nX A062 = A06(this, A0K, j4);
                        if (A062 != null) {
                            A0K = A062;
                        }
                    }
                    if (A01((Object) null, this, A0K, i, j2) != AnonymousClass0SC.A08 || j2 < A0H()) {
                        A0K.A01();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void A0K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (!A0C()) {
            do {
                atomicLongFieldUpdater = A01;
            } while (atomicLongFieldUpdater.get(this) <= j);
            int i = AnonymousClass0SC.A00;
            int i2 = 0;
            while (i2 < i) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (j4 != (A02.get(this) & 4611686018427387903L) || j4 != atomicLongFieldUpdater.get(this)) {
                    i2++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = A02;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                long j6 = atomicLongFieldUpdater2.get(this);
                long j7 = j6 & 4611686018427387903L;
                boolean A1P = AnonymousClass000.A1P(((4611686018427387904L & j6) > 0 ? 1 : ((4611686018427387904L & j6) == 0 ? 0 : -1)));
                if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                    break;
                } else if (!A1P) {
                    atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + j7);
                }
            }
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 0 + (j3 & 4611686018427387903L)));
        }
    }

    public final void B2S(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0M(cancellationException, true);
    }

    public AnonymousClass0T6 BEf() {
        C14450le r3 = C14450le.A00;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C07710Yz.A03(r3, 3);
        C14460lf r1 = C14460lf.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C07710Yz.A03(r1, 3);
        return new AnonymousClass0T6(this, r3, r1);
    }

    public AnonymousClass0T6 BEg() {
        C14470lg r3 = C14470lg.A00;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C07710Yz.A03(r3, 3);
        C14480lh r1 = C14480lh.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C07710Yz.A03(r1, 3);
        return new AnonymousClass0T6(this, r3, r1);
    }

    public void BL3(C006302t r5) {
        AnonymousClass035 r1;
        AnonymousClass035 r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        if (!AnonymousClass0A8.A00(this, (Object) null, r5, atomicReferenceFieldUpdater)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                r1 = AnonymousClass0SC.A05;
                r0 = AnonymousClass0SC.A06;
                if (obj != r1) {
                    if (obj == r0) {
                        throw AnonymousClass001.A09("Another handler was already registered and successfully invoked");
                    }
                    throw AnonymousClass000.A0f(obj, "Another handler is already registered: ", AnonymousClass000.A0u());
                }
            } while (!AnonymousClass0A8.A00(this, r1, r0, atomicReferenceFieldUpdater));
            r5.invoke(A05.get(this));
        }
    }

    public boolean BLP() {
        return A0G(this, A04.get(this), false);
    }

    public C12950iv BNo() {
        return new C12950iv(this);
    }

    public Object Bmx(C023509x r29) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        C15560nX A0K = AnonymousClass001.A0K(this, atomicReferenceFieldUpdater);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            if (!A0G(this, atomicLongFieldUpdater.get(this), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = A03;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j = (long) AnonymousClass0SC.A01;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (A0K.A00 != j2) {
                    C15560nX A062 = A06(this, A0K, j2);
                    if (A062 != null) {
                        A0K = A062;
                    } else {
                        continue;
                    }
                }
                Object A012 = A01((Object) null, this, A0K, i, andIncrement);
                AnonymousClass035 r11 = AnonymousClass0SC.A0H;
                if (A012 != r11) {
                    AnonymousClass035 r10 = AnonymousClass0SC.A08;
                    if (A012 != r10) {
                        AnonymousClass035 r13 = AnonymousClass0SC.A0I;
                        if (A012 == r13) {
                            AnonymousClass0AR A002 = C05710Qt.A00(AnonymousClass0AA.A01(r29));
                            try {
                                Object A013 = A01(A002, this, A0K, i, andIncrement);
                                if (A013 == r11) {
                                    A002.BL2(A0K, i);
                                } else {
                                    AnonymousClass0AR r9 = null;
                                    if (A013 == r10) {
                                        if (andIncrement < A0H()) {
                                            A0K.A01();
                                        }
                                        A0K = AnonymousClass001.A0K(this, atomicReferenceFieldUpdater);
                                        while (true) {
                                            if (A0G(this, atomicLongFieldUpdater.get(this), true)) {
                                                A002.resumeWith(AnonymousClass00C.A02(A04(this)));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                            long j3 = andIncrement2 / j;
                                            int i2 = (int) (andIncrement2 % j);
                                            if (A0K.A00 != j3) {
                                                C15560nX A063 = A06(this, A0K, j3);
                                                if (A063 != null) {
                                                    A0K = A063;
                                                } else {
                                                    continue;
                                                }
                                            }
                                            A013 = A01(A002, this, A0K, i2, andIncrement2);
                                            if (A013 == r11) {
                                                if (A002 instanceof AnonymousClass0AQ) {
                                                    r9 = A002;
                                                }
                                                if (r9 != null) {
                                                    r9.BL2(A0K, i2);
                                                }
                                            } else if (A013 == r10) {
                                                if (andIncrement2 < A0H()) {
                                                    A0K.A01();
                                                }
                                            } else if (A013 == r13) {
                                                throw AnonymousClass001.A09("unexpected");
                                            }
                                        }
                                    }
                                    A0K.A01();
                                    A002.Bol((C006302t) null, A013);
                                }
                                return A002.A0G();
                            } catch (Throwable th) {
                                A002.A0L();
                                throw th;
                            }
                        } else {
                            A0K.A01();
                            return A012;
                        }
                    } else if (andIncrement < A0H()) {
                        A0K.A01();
                    }
                } else {
                    throw AnonymousClass001.A09("unexpected");
                }
            } else {
                Throwable A042 = A04(this);
                StackTraceElement stackTraceElement = C05820Re.A00;
                throw A042;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (r1 != r0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010b, code lost:
        if (r22 < A03.get(r7)) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        r1 = X.AnonymousClass0AA.A02(r27);
        r1.resumeWith(X.AnonymousClass00C.A02(A0I()));
        r1 = r1.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        r0 = X.AnonymousClass0AO.COROUTINE_SUSPENDED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = X.AnonymousClass001.A09("unexpected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r1 == r0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r1 = X.AnonymousClass0AJ.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bpf(java.lang.Object r26, X.C023509x r27) {
        /*
            r25 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = A09
            r7 = r25
            X.0nX r6 = X.AnonymousClass001.A0K(r7, r10)
        L_0x0008:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r15 = A04
            long r0 = r15.getAndIncrement(r7)
            r22 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r22 = r22 & r0
            r2 = 0
            boolean r24 = A0G(r7, r0, r2)
            int r14 = X.AnonymousClass0SC.A01
            long r0 = (long) r14
            long r4 = r22 / r0
            long r2 = r22 % r0
            int r8 = (int) r2
            long r2 = r6.A00
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x004d
            X.0nX r2 = A07(r7, r6, r4)
            if (r2 != 0) goto L_0x004c
            if (r24 == 0) goto L_0x0008
        L_0x0030:
            X.0AR r1 = X.AnonymousClass0AA.A02(r27)
            java.lang.Throwable r0 = r7.A0I()
            X.03N r0 = X.AnonymousClass00C.A02(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.A0G()
        L_0x0043:
            X.0AO r0 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            if (r1 == r0) goto L_0x0049
            X.0AJ r1 = X.AnonymousClass0AJ.A00
        L_0x0049:
            if (r1 != r0) goto L_0x014c
            return r1
        L_0x004c:
            r6 = r2
        L_0x004d:
            r18 = 0
            r17 = r26
            r19 = r7
            r20 = r6
            r21 = r8
            int r3 = A00(r17, r18, r19, r20, r21, r22, r24)
            if (r3 == 0) goto L_0x0149
            r2 = 1
            if (r3 == r2) goto L_0x014c
            r2 = 2
            if (r3 == r2) goto L_0x0133
            r2 = 3
            if (r3 == r2) goto L_0x007b
            r0 = 4
            if (r3 == r0) goto L_0x006d
            r6.A01()
            goto L_0x0008
        L_0x006d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r1 = r0.get(r7)
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            r6.A01()
            goto L_0x0030
        L_0x007b:
            X.09x r2 = X.AnonymousClass0AA.A01(r27)
            X.0AR r9 = X.C05710Qt.A00(r2)
            r24 = 0
            r18 = r9
            int r3 = A00(r17, r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0144 }
            if (r3 == 0) goto L_0x0119
            r13 = 1
            if (r3 == r13) goto L_0x0116
            r12 = 2
            if (r3 == r12) goto L_0x0111
            r11 = 4
            if (r3 == r11) goto L_0x0103
            java.lang.String r16 = "unexpected"
            r2 = 5
            if (r3 != r2) goto L_0x013f
            r6.A01()     // Catch:{ all -> 0x0144 }
            X.0nX r8 = X.AnonymousClass001.A0K(r7, r10)     // Catch:{ all -> 0x0144 }
        L_0x00a2:
            long r2 = r15.getAndIncrement(r7)     // Catch:{ all -> 0x0144 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r22 = r2 & r4
            r4 = 0
            boolean r24 = A0G(r7, r2, r4)     // Catch:{ all -> 0x0144 }
            long r2 = r22 / r0
            long r4 = r22 % r0
            int r10 = (int) r4     // Catch:{ all -> 0x0144 }
            long r4 = r8.A00     // Catch:{ all -> 0x0144 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x00c6
            X.0nX r6 = A07(r7, r8, r2)     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x00c7
            if (r24 == 0) goto L_0x00a2
            goto L_0x0122
        L_0x00c6:
            r6 = r8
        L_0x00c7:
            r20 = r6
            r21 = r10
            int r3 = A00(r17, r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0144 }
            if (r3 == 0) goto L_0x00fd
            if (r3 == r13) goto L_0x00fa
            if (r3 == r12) goto L_0x00ea
            r2 = 3
            if (r3 == r2) goto L_0x013a
            if (r3 == r11) goto L_0x00df
            r6.A01()     // Catch:{ all -> 0x0144 }
            r8 = r6
            goto L_0x00a2
        L_0x00df:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x0144 }
            long r1 = r0.get(r7)     // Catch:{ all -> 0x0144 }
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0122
            goto L_0x010d
        L_0x00ea:
            if (r24 == 0) goto L_0x00ed
            goto L_0x011f
        L_0x00ed:
            boolean r1 = r9 instanceof X.AnonymousClass0AQ     // Catch:{ all -> 0x0144 }
            r0 = 0
            if (r1 == 0) goto L_0x00f3
            r0 = r9
        L_0x00f3:
            if (r0 == 0) goto L_0x012d
            int r10 = r10 + r14
            r0.BL2(r6, r10)     // Catch:{ all -> 0x0144 }
            goto L_0x012d
        L_0x00fa:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0144 }
            goto L_0x012a
        L_0x00fd:
            r6.A01()     // Catch:{ all -> 0x0144 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0144 }
            goto L_0x012a
        L_0x0103:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x0144 }
            long r1 = r0.get(r7)     // Catch:{ all -> 0x0144 }
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0122
        L_0x010d:
            r6.A01()     // Catch:{ all -> 0x0144 }
            goto L_0x0122
        L_0x0111:
            int r8 = r8 + r14
            r9.BL2(r6, r8)     // Catch:{ all -> 0x0144 }
            goto L_0x012d
        L_0x0116:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0144 }
            goto L_0x012a
        L_0x0119:
            r6.A01()     // Catch:{ all -> 0x0144 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0144 }
            goto L_0x012a
        L_0x011f:
            r6.A05()     // Catch:{ all -> 0x0144 }
        L_0x0122:
            java.lang.Throwable r0 = r7.A0I()     // Catch:{ all -> 0x0144 }
            X.03N r0 = X.AnonymousClass00C.A02(r0)     // Catch:{ all -> 0x0144 }
        L_0x012a:
            r9.resumeWith(r0)     // Catch:{ all -> 0x0144 }
        L_0x012d:
            java.lang.Object r1 = r9.A0G()
            goto L_0x0043
        L_0x0133:
            if (r24 == 0) goto L_0x014c
            r6.A05()
            goto L_0x0030
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r16)     // Catch:{ all -> 0x0144 }
            goto L_0x0143
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r16)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            r9.A0L()
            throw r0
        L_0x0149:
            r6.A01()
        L_0x014c:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.Bpf(java.lang.Object, X.09x):java.lang.Object");
    }

    public Object BwC() {
        AnonymousClass0AQ r9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (!A0G(this, j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                AnonymousClass035 r92 = AnonymousClass0SC.A09;
                C15560nX A0K = AnonymousClass001.A0K(this, A08);
                while (!A0G(this, atomicLongFieldUpdater2.get(this), true)) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = (long) AnonymousClass0SC.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (A0K.A00 != j4) {
                        C15560nX A062 = A06(this, A0K, j4);
                        if (A062 != null) {
                            A0K = A062;
                        } else {
                            continue;
                        }
                    }
                    Object A012 = A01(r92, this, A0K, i, andIncrement);
                    if (A012 == AnonymousClass0SC.A0H) {
                        if ((r92 instanceof AnonymousClass0AQ) && (r9 = (AnonymousClass0AQ) r92) != null) {
                            r9.BL2(A0K, i);
                        }
                        A0K(andIncrement);
                        A0K.A05();
                    } else if (A012 == AnonymousClass0SC.A08) {
                        if (andIncrement < A0H()) {
                            A0K.A01();
                        }
                    } else if (A012 != AnonymousClass0SC.A0I) {
                        A0K.A01();
                        return A012;
                    } else {
                        throw AnonymousClass001.A09("unexpected");
                    }
                }
            }
            return AnonymousClass0X8.A01;
        }
        return C06340Tf.A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        return new X.AnonymousClass0n9(A0I());
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BwE(java.lang.Object r17) {
        /*
            r16 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = A04
            r10 = r16
            long r2 = r7.get(r10)
            r6 = 0
            boolean r0 = A0G(r10, r2, r6)
            if (r0 != 0) goto L_0x0020
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            boolean r0 = r10.A0D(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            X.0Tf r0 = X.AnonymousClass0X8.A01
            return r0
        L_0x0020:
            X.035 r9 = X.AnonymousClass0SC.A0A
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            X.0nX r5 = X.AnonymousClass001.A0K(r10, r0)
        L_0x0028:
            long r0 = r7.getAndIncrement(r10)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            boolean r15 = A0G(r10, r0, r6)
            int r4 = X.AnonymousClass0SC.A01
            long r2 = (long) r4
            long r0 = r13 / r2
            long r2 = r13 % r2
            int r12 = (int) r2
            long r2 = r5.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0057
            X.0nX r11 = A07(r10, r5, r0)
            if (r11 != 0) goto L_0x0058
            if (r15 == 0) goto L_0x0028
        L_0x004d:
            java.lang.Throwable r1 = r10.A0I()
            X.0n9 r0 = new X.0n9
            r0.<init>(r1)
            return r0
        L_0x0057:
            r11 = r5
        L_0x0058:
            r8 = r17
            int r1 = A00(r8, r9, r10, r11, r12, r13, r15)
            if (r1 == 0) goto L_0x009c
            r0 = 1
            if (r1 == r0) goto L_0x009f
            r0 = 2
            if (r1 == r0) goto L_0x007f
            r0 = 3
            if (r1 == r0) goto L_0x0095
            r0 = 4
            if (r1 == r0) goto L_0x0071
            r11.A01()
            r5 = r11
            goto L_0x0028
        L_0x0071:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            r11.A01()
            goto L_0x004d
        L_0x007f:
            if (r15 == 0) goto L_0x0085
            r11.A05()
            goto L_0x004d
        L_0x0085:
            boolean r0 = r9 instanceof X.AnonymousClass0AQ
            if (r0 == 0) goto L_0x0091
            X.0AQ r9 = (X.AnonymousClass0AQ) r9
            if (r9 == 0) goto L_0x0091
            int r12 = r12 + r4
            r9.BL2(r11, r12)
        L_0x0091:
            r11.A05()
            goto L_0x001d
        L_0x0095:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x009c:
            r11.A01()
        L_0x009f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.BwE(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        r8 = (X.C15560nX) r8.A00();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            r9 = r16
            long r1 = r0.get(r9)
            r0 = 60
            long r1 = r1 >> r0
            int r0 = (int) r1
            r2 = 3
            r3 = 2
            if (r0 == r3) goto L_0x0074
            if (r0 != r2) goto L_0x001b
            java.lang.String r0 = "cancelled,"
        L_0x0018:
            r6.append(r0)
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "capacity="
            r1.append(r0)
            int r0 = r9.A00
            r1.append(r0)
            r7 = 44
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r7)
            r6.append(r0)
            java.lang.String r0 = "data=["
            r6.append(r0)
            X.0nX[] r2 = new X.C15560nX[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            java.lang.Object r1 = r0.get(r9)
            r0 = 0
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            java.lang.Object r1 = r0.get(r9)
            r0 = 1
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r0 = r0.get(r9)
            r2[r3] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x0062:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            X.0nX r0 = X.AnonymousClass0SC.A02
            if (r1 == r0) goto L_0x0062
            r3.add(r1)
            goto L_0x0062
        L_0x0074:
            java.lang.String r0 = "closed,"
            goto L_0x0018
        L_0x0077:
            java.util.Iterator r10 = r3.iterator()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r8 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a5
            r0 = r8
            X.0nN r0 = (X.C15460nN) r0
            long r4 = r0.A00
        L_0x0090:
            java.lang.Object r3 = r10.next()
            r0 = r3
            X.0nN r0 = (X.C15460nN) r0
            long r1 = r0.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            r8 = r3
            r4 = r1
        L_0x009f:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x0090
        L_0x00a5:
            X.0nX r8 = (X.C15560nX) r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r14 = r0.get(r9)
            long r12 = r9.A0H()
        L_0x00b1:
            int r5 = X.AnonymousClass0SC.A01
            r4 = 0
        L_0x00b4:
            if (r4 >= r5) goto L_0x0189
            long r2 = r8.A00
            long r0 = (long) r5
            long r2 = r2 * r0
            long r0 = (long) r4
            long r2 = r2 + r0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00c4
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0191
        L_0x00c4:
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r8.A00
            int r1 = r4 * 2
            int r0 = r1 + 1
            java.lang.Object r9 = r10.get(r0)
            java.lang.Object r1 = r10.get(r1)
            boolean r0 = r9 instanceof X.AnonymousClass0AP
            if (r0 == 0) goto L_0x010f
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            if (r11 < 0) goto L_0x010c
            java.lang.String r3 = "receive"
        L_0x00de:
            if (r1 == 0) goto L_0x00fe
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r0 = 40
            r2.append(r0)
            r2.append(r3)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = "),"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
        L_0x00f8:
            r6.append(r0)
        L_0x00fb:
            int r4 = r4 + 1
            goto L_0x00b4
        L_0x00fe:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = X.AnonymousClass000.A0t(r0, r7)
            goto L_0x00f8
        L_0x0107:
            if (r11 >= 0) goto L_0x010c
            java.lang.String r3 = "send"
            goto L_0x00de
        L_0x010c:
            java.lang.String r3 = "cont"
            goto L_0x00de
        L_0x010f:
            boolean r0 = r9 instanceof X.C15200mr
            if (r0 == 0) goto L_0x0124
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x011c
            if (r11 < 0) goto L_0x0121
            java.lang.String r3 = "onReceive"
            goto L_0x00de
        L_0x011c:
            if (r11 >= 0) goto L_0x0121
            java.lang.String r3 = "onSend"
            goto L_0x00de
        L_0x0121:
            java.lang.String r3 = "select"
            goto L_0x00de
        L_0x0124:
            boolean r0 = r9 instanceof X.C12940iu
            if (r0 == 0) goto L_0x012b
            java.lang.String r3 = "receiveCatching"
            goto L_0x00de
        L_0x012b:
            boolean r0 = r9 instanceof X.C06420Tn
            if (r0 == 0) goto L_0x013d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EB("
            r2.append(r0)
            java.lang.String r3 = X.AnonymousClass000.A0m(r9, r2)
            goto L_0x00de
        L_0x013d:
            X.035 r0 = X.AnonymousClass0SC.A0G
            boolean r0 = X.AnonymousClass00C.A0J(r9, r0)
            if (r0 != 0) goto L_0x0185
            X.035 r0 = X.AnonymousClass0SC.A0F
            boolean r0 = X.AnonymousClass00C.A0J(r9, r0)
            if (r0 != 0) goto L_0x0185
            if (r9 == 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A0B
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A07
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A0E
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A09
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A0A
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            X.035 r0 = X.AnonymousClass0SC.A04
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r3 = r9.toString()
            goto L_0x00de
        L_0x0185:
            java.lang.String r3 = "resuming_sender"
            goto L_0x00de
        L_0x0189:
            X.0XE r8 = r8.A00()
            X.0nX r8 = (X.C15560nX) r8
            if (r8 != 0) goto L_0x00b1
        L_0x0191:
            int r0 = r6.length()
            if (r0 != 0) goto L_0x019f
            java.lang.String r1 = "Char sequence is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            int r0 = r6.length()
            int r0 = r0 + -1
            char r0 = r6.charAt(r0)
            if (r0 != r7) goto L_0x01b4
            int r1 = r6.length()
            r0 = 1
            int r1 = r1 - r0
            r6.deleteCharAt(r1)
        L_0x01b4:
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r6)
            return r0
        L_0x01bb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.Object r9, java.lang.Object r10, X.C12960iw r11, X.C15560nX r12, int r13, long r14, boolean r16) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r12.A00
            int r6 = r13 * 2
            r4.lazySet(r6, r9)
            if (r16 != 0) goto L_0x0040
            int r3 = r6 + 1
            java.lang.Object r1 = r4.get(r3)
            r2 = 1
            if (r1 != 0) goto L_0x0022
            boolean r0 = r11.A0D(r14)
            r1 = 0
            if (r0 == 0) goto L_0x006b
            X.035 r0 = X.AnonymousClass0SC.A03
            boolean r0 = r12.A09(r13, r1, r0)
            if (r0 == 0) goto L_0x0040
            return r2
        L_0x0022:
            boolean r0 = r1 instanceof X.AnonymousClass0AQ
            if (r0 == 0) goto L_0x0040
            r0 = 0
            r4.lazySet(r6, r0)
            boolean r0 = r11.A0E(r1, r9)
            if (r0 == 0) goto L_0x0037
            X.035 r0 = X.AnonymousClass0SC.A07
            r4.set(r3, r0)
            r8 = 0
            return r8
        L_0x0037:
            X.035 r1 = X.AnonymousClass0SC.A09
            java.lang.Object r0 = r4.getAndSet(r3, r1)
            if (r0 == r1) goto L_0x00bc
            goto L_0x00b9
        L_0x0040:
            int r3 = r6 + 1
            java.lang.Object r5 = r4.get(r3)
            r8 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0077
            boolean r0 = r11.A0D(r14)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            if (r16 != 0) goto L_0x005f
            X.035 r0 = X.AnonymousClass0SC.A03
            boolean r0 = r12.A09(r13, r1, r0)
        L_0x0059:
            if (r0 == 0) goto L_0x0040
            r8 = 1
            return r8
        L_0x005d:
            if (r16 == 0) goto L_0x006b
        L_0x005f:
            X.035 r0 = X.AnonymousClass0SC.A0A
            boolean r0 = r12.A09(r13, r1, r0)
            if (r0 == 0) goto L_0x0040
            r12.A05()
            goto L_0x0095
        L_0x006b:
            if (r10 != 0) goto L_0x006f
            r8 = 3
            return r8
        L_0x006f:
            boolean r0 = r12.A09(r13, r1, r10)
            if (r0 == 0) goto L_0x0040
            r8 = 2
            return r8
        L_0x0077:
            X.035 r0 = X.AnonymousClass0SC.A0B
            if (r5 != r0) goto L_0x0082
            X.035 r0 = X.AnonymousClass0SC.A03
            boolean r0 = r12.A09(r13, r5, r0)
            goto L_0x0059
        L_0x0082:
            X.035 r7 = X.AnonymousClass0SC.A09
            if (r5 == r7) goto L_0x00ae
            X.035 r0 = X.AnonymousClass0SC.A0E
            if (r5 == r0) goto L_0x00ae
            X.035 r1 = X.AnonymousClass0SC.A04
            r0 = 0
            if (r5 != r1) goto L_0x0097
            r4.lazySet(r6, r0)
            r11.BLP()
        L_0x0095:
            r8 = 4
            return r8
        L_0x0097:
            r4.lazySet(r6, r0)
            boolean r0 = r5 instanceof X.C06420Tn
            if (r0 == 0) goto L_0x00a2
            X.0Tn r5 = (X.C06420Tn) r5
            X.0AQ r5 = r5.A00
        L_0x00a2:
            boolean r0 = r11.A0E(r5, r9)
            if (r0 == 0) goto L_0x00b3
            X.035 r0 = X.AnonymousClass0SC.A07
            r4.set(r3, r0)
            return r8
        L_0x00ae:
            r0 = 0
            r4.lazySet(r6, r0)
            goto L_0x00bc
        L_0x00b3:
            java.lang.Object r0 = r4.getAndSet(r3, r7)
            if (r0 == r7) goto L_0x00bc
        L_0x00b9:
            r12.A08(r13, r2)
        L_0x00bc:
            r8 = 5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12960iw.A00(java.lang.Object, java.lang.Object, X.0iw, X.0nX, int, long, boolean):int");
    }
}
