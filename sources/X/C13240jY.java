package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.0jY  reason: invalid class name and case insensitive filesystem */
public final class C13240jY extends Thread {
    public static final AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(C13240jY.class, "workerCtl");
    public int A00 = AnonymousClass0XG.A01.A00();
    public long A01;
    public long A02;
    public Integer A03 = C023109s.A0G;
    public boolean A04;
    public final C10810fG A05 = new C10810fG();
    public final AnonymousClass0Y3 A06 = new AnonymousClass0Y3();
    public final /* synthetic */ AnonymousClass034 A07;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker = AnonymousClass034.A0A;
    public volatile int workerCtl;

    public void run() {
        Integer num;
        long j;
        int i;
        loop0:
        while (true) {
            boolean z = false;
            while (true) {
                AnonymousClass034 r6 = this.A07;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass034.A07;
                if (atomicIntegerFieldUpdater.get(r6) != 0 || this.A03 == (num = C023109s.A0R)) {
                    A04(C023109s.A0R);
                } else {
                    AnonymousClass0AB A022 = A02(this.A04);
                    if (A022 != null) {
                        this.A01 = 0;
                        int i2 = A022.A01.A00;
                        this.A02 = 0;
                        if (this.A03 == C023109s.A0C) {
                            this.A03 = C023109s.A01;
                        }
                        if (i2 != 0 && A04(C023109s.A01) && !AnonymousClass034.A02(r6) && !AnonymousClass034.A03(r6, AnonymousClass034.A08.get(r6))) {
                            AnonymousClass034.A02(r6);
                        }
                        AnonymousClass034.A01(A022);
                        if (i2 != 0) {
                            AnonymousClass034.A08.addAndGet(r6, -2097152);
                            if (this.A03 != num) {
                                this.A03 = C023109s.A0G;
                            }
                        }
                    } else {
                        this.A04 = false;
                        if (this.A01 != 0) {
                            if (z) {
                                A04(C023109s.A0C);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.A01);
                                this.A01 = 0;
                                break;
                            }
                            z = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            AnonymousClass035 r11 = AnonymousClass034.A0A;
                            if (obj != r11) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = A08;
                                atomicIntegerFieldUpdater2.set(this, -1);
                                while (this.nextParkedWorker != r11 && atomicIntegerFieldUpdater2.get(this) == -1 && atomicIntegerFieldUpdater.get(r6) == 0 && this.A03 != num) {
                                    A04(C023109s.A0C);
                                    Thread.interrupted();
                                    if (this.A02 == 0) {
                                        this.A02 = System.nanoTime() + r6.A02;
                                    }
                                    LockSupport.parkNanos(r6.A02);
                                    if (System.nanoTime() - this.A02 >= 0) {
                                        this.A02 = 0;
                                        AnonymousClass039 r2 = r6.A04;
                                        synchronized (r2) {
                                            if (atomicIntegerFieldUpdater.get(r6) == 0) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = AnonymousClass034.A08;
                                                if (((int) (atomicLongFieldUpdater.get(r6) & 2097151)) > r6.A00 && atomicIntegerFieldUpdater2.compareAndSet(this, -1, 1)) {
                                                    int i3 = this.indexInArray;
                                                    A03(0);
                                                    r6.A05(this, i3, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(r6) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object A002 = r2.A00(andDecrement);
                                                        AnonymousClass00C.A0B(A002);
                                                        C13240jY r0 = (C13240jY) A002;
                                                        r2.A01(i3, r0);
                                                        r0.A03(i3);
                                                        r6.A05(r0, andDecrement, i3);
                                                    }
                                                    r2.A01(andDecrement, (Object) null);
                                                    this.A03 = num;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (this.nextParkedWorker == r11) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = AnonymousClass034.A09;
                                do {
                                    j = atomicLongFieldUpdater2.get(r6);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = r6.A04.A00((int) (2097151 & j));
                                } while (!atomicLongFieldUpdater2.compareAndSet(r6, j, ((long) i) | ((2097152 + j) & -2097152)));
                            }
                        }
                    }
                }
            }
        }
        A04(C023109s.A0R);
    }

    public C13240jY(AnonymousClass034 r2, int i) {
        this.A07 = r2;
        setDaemon(true);
        A03(i);
    }

    private final AnonymousClass0AB A00() {
        AnonymousClass037 r0;
        int i = this.A00;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >> 17);
        int i4 = i3 ^ (i3 << 5);
        this.A00 = i4;
        int i5 = i4 & 1;
        AnonymousClass034 r1 = this.A07;
        if (i5 == 0) {
            AnonymousClass0AB r02 = (AnonymousClass0AB) r1.A06.A01();
            if (r02 != null) {
                return r02;
            }
            r0 = r1.A05;
        } else {
            AnonymousClass0AB r03 = (AnonymousClass0AB) r1.A05.A01();
            if (r03 != null) {
                return r03;
            }
            r0 = r1.A06;
        }
        return (AnonymousClass0AB) r0.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00af A[EDGE_INSN: B:67:0x00af->B:40:0x00af ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass0AB A01(int r22) {
        /*
            r21 = this;
            r9 = r21
            X.034 r10 = r9.A07
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass034.A08
            long r2 = r0.get(r10)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r0
            int r8 = (int) r2
            r7 = 0
            r0 = 2
            if (r8 < r0) goto L_0x00f4
            int r6 = r9.A00
            int r0 = r6 << 13
            r6 = r6 ^ r0
            int r0 = r6 >> 17
            r6 = r6 ^ r0
            int r0 = r6 << 5
            r6 = r6 ^ r0
            r9.A00 = r6
            int r1 = r8 + -1
            r0 = r1 & r8
            if (r0 != 0) goto L_0x00e5
            r6 = r6 & r1
        L_0x0027:
            r11 = 0
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0032:
            r17 = 0
            if (r11 >= r8) goto L_0x00ec
            int r6 = r6 + 1
            if (r6 <= r8) goto L_0x003b
            r6 = 1
        L_0x003b:
            X.039 r0 = r10.A04
            java.lang.Object r0 = r0.A00(r6)
            X.0jY r0 = (X.C13240jY) r0
            if (r0 == 0) goto L_0x00af
            if (r0 == r9) goto L_0x00af
            X.0Y3 r5 = r0.A06
            X.0fG r4 = r9.A05
            r1 = 3
            r0 = r22
            if (r0 != r1) goto L_0x005f
            X.0AB r1 = X.AnonymousClass0Y3.A00(r5)
            if (r1 == 0) goto L_0x007b
        L_0x0056:
            r4.element = r1
        L_0x0058:
            java.lang.Object r0 = r4.element
            X.0AB r0 = (X.AnonymousClass0AB) r0
            r4.element = r7
            return r0
        L_0x005f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A02
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A03
            int r14 = r0.get(r5)
            boolean r13 = X.AnonymousClass000.A1O(r22)
        L_0x006f:
            if (r1 == r14) goto L_0x007b
            if (r13 == 0) goto L_0x00bb
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A01
            int r0 = r0.get(r5)
            if (r0 != 0) goto L_0x00bb
        L_0x007b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = X.AnonymousClass0Y3.A04
            java.lang.Object r12 = r13.get(r5)
            X.0AB r12 = (X.AnonymousClass0AB) r12
            if (r12 == 0) goto L_0x00af
            X.033 r0 = r12.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x008d
            r0 = 2
        L_0x008d:
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00af
            int r0 = X.C006902z.A01
            long r15 = java.lang.System.nanoTime()
            long r0 = r12.A00
            long r15 = r15 - r0
            long r0 = X.C006902z.A04
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x00b2
            long r0 = r0 - r15
            r12 = -1
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0058
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x00af
            long r2 = java.lang.Math.min(r2, r0)
        L_0x00af:
            int r11 = r11 + 1
            goto L_0x0032
        L_0x00b2:
            boolean r0 = X.AnonymousClass0A8.A00(r5, r12, r7, r13)
            if (r0 == 0) goto L_0x007b
            r4.element = r12
            goto L_0x0058
        L_0x00bb:
            int r16 = r1 + 1
            r15 = r1 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r5.A00
            java.lang.Object r1 = r12.get(r15)
            X.0AB r1 = (X.AnonymousClass0AB) r1
            if (r1 == 0) goto L_0x00e2
            X.033 r0 = r1.A01
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 != r13) goto L_0x00e2
            boolean r0 = r12.compareAndSet(r15, r1, r7)
            if (r0 == 0) goto L_0x00e2
            if (r13 == 0) goto L_0x0056
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A01
            r0.decrementAndGet(r5)
            goto L_0x0056
        L_0x00e2:
            r1 = r16
            goto L_0x006f
        L_0x00e5:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r0
            int r6 = r6 % r8
            goto L_0x0027
        L_0x00ec:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00f2
            r2 = 0
        L_0x00f2:
            r9.A01 = r2
        L_0x00f4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13240jY.A01(int):X.0AB");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r3 == false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0AB A02(boolean r16) {
        /*
            r15 = this;
            java.lang.Integer r0 = r15.A03
            java.lang.Integer r3 = X.C023109s.A00
            if (r0 == r3) goto L_0x0087
            X.034 r10 = r15.A07
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = X.AnonymousClass034.A08
        L_0x000a:
            long r11 = r9.get(r10)
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r11
            r2 = 42
            long r0 = r0 >> r2
            int r2 = (int) r0
            if (r2 != 0) goto L_0x0078
            X.0Y3 r6 = r15.A06
            r5 = 1
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass0Y3.A04
            java.lang.Object r8 = r1.get(r6)
            X.0AB r8 = (X.AnonymousClass0AB) r8
            r7 = 0
            if (r8 == 0) goto L_0x0035
            X.033 r0 = r8.A01
            int r0 = r0.A00
            if (r0 != r5) goto L_0x0035
            boolean r0 = X.AnonymousClass0A8.A00(r6, r8, r7, r1)
            if (r0 == 0) goto L_0x001d
        L_0x0034:
            return r8
        L_0x0035:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A02
            int r9 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0Y3.A03
            int r4 = r0.get(r6)
        L_0x0041:
            if (r9 == r4) goto L_0x0069
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.AnonymousClass0Y3.A01
            int r0 = r3.get(r6)
            if (r0 == 0) goto L_0x0069
            int r4 = r4 + -1
            r2 = r4 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.A00
            java.lang.Object r8 = r1.get(r2)
            X.0AB r8 = (X.AnonymousClass0AB) r8
            if (r8 == 0) goto L_0x0041
            X.033 r0 = r8.A01
            int r0 = r0.A00
            if (r0 != r5) goto L_0x0041
            boolean r0 = r1.compareAndSet(r2, r8, r7)
            if (r0 == 0) goto L_0x0041
            r3.decrementAndGet(r6)
            return r8
        L_0x0069:
            X.037 r0 = r10.A05
            java.lang.Object r8 = r0.A01()
            X.0AB r8 = (X.AnonymousClass0AB) r8
            if (r8 != 0) goto L_0x0034
            X.0AB r8 = r15.A01(r5)
            return r8
        L_0x0078:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r13 = r11 - r0
            boolean r0 = r9.compareAndSet(r10, r11, r13)
            if (r0 == 0) goto L_0x000a
            r15.A03 = r3
        L_0x0087:
            if (r16 == 0) goto L_0x00c9
            X.034 r0 = r15.A07
            int r0 = r0.A00
            int r3 = r0 * 2
            int r2 = r15.A00
            int r0 = r2 << 13
            r2 = r2 ^ r0
            int r0 = r2 >> 17
            r2 = r2 ^ r0
            int r0 = r2 << 5
            r2 = r2 ^ r0
            r15.A00 = r2
            int r1 = r3 + -1
            r0 = r1 & r3
            if (r0 != 0) goto L_0x00ae
            r2 = r2 & r1
        L_0x00a3:
            r3 = 0
            if (r2 != 0) goto L_0x00b4
            r3 = 1
            X.0AB r8 = r15.A00()
            if (r8 == 0) goto L_0x00b4
            return r8
        L_0x00ae:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r3
            goto L_0x00a3
        L_0x00b4:
            X.0Y3 r2 = r15.A06
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass0Y3.A04
            r0 = 0
            java.lang.Object r8 = r1.getAndSet(r2, r0)
            X.0AB r8 = (X.AnonymousClass0AB) r8
            if (r8 != 0) goto L_0x0034
            X.0AB r8 = X.AnonymousClass0Y3.A00(r2)
            if (r8 != 0) goto L_0x0034
            if (r3 != 0) goto L_0x00d0
        L_0x00c9:
            X.0AB r8 = r15.A00()
            if (r8 == 0) goto L_0x00d0
            return r8
        L_0x00d0:
            r0 = 3
            X.0AB r8 = r15.A01(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13240jY.A02(boolean):X.0AB");
    }

    public final boolean A04(Integer num) {
        Integer num2 = this.A03;
        boolean z = false;
        if (num2 == C023109s.A00) {
            z = true;
            AnonymousClass034.A08.addAndGet(this.A07, 4398046511104L);
        }
        if (num2 != num) {
            this.A03 = num;
        }
        return z;
    }

    public final void A03(int i) {
        String valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A07.A03);
        A0u.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(AnonymousClass000.A0q(valueOf, A0u));
        this.indexInArray = i;
    }
}
