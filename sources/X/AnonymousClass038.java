package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.038  reason: invalid class name */
public final class AnonymousClass038 {
    public static final AtomicLongFieldUpdater A04;
    public static final AnonymousClass035 A05 = new AnonymousClass035("REMOVE_FROZEN");
    public static final AtomicReferenceFieldUpdater A06;
    public final int A00;
    public final int A01;
    public final AtomicReferenceArray A02;
    public final boolean A03;
    public volatile Object _next;
    public volatile long _state;

    static {
        Class<AnonymousClass038> cls = AnonymousClass038.class;
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        A04 = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public static final long A00(AnonymousClass038 r13) {
        AnonymousClass038 r8;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        do {
            r8 = r13;
            j = atomicLongFieldUpdater.get(r13);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(r8, j, j2));
        return j2;
    }

    public static final AnonymousClass038 A01(AnonymousClass038 r8, long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        while (true) {
            AnonymousClass038 r0 = (AnonymousClass038) atomicReferenceFieldUpdater.get(r8);
            if (r0 != null) {
                return r0;
            }
            AnonymousClass038 r5 = new AnonymousClass038(r8.A00 * 2, r8.A03);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = r8.A01;
                if ((i & i3) == (i2 & i3)) {
                    break;
                }
                Object obj = r8.A02.get(i3 & i);
                if (obj == null) {
                    obj = new AnonymousClass0SU(i);
                }
                r5.A02.set(r5.A01 & i, obj);
                i++;
            }
            A04.set(r5, j & (~1152921504606846976L));
            AnonymousClass0A8.A00(r8, (Object) null, r5, atomicReferenceFieldUpdater);
        }
    }

    public final int A02(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        while (true) {
            AnonymousClass038 r11 = this;
            long j = atomicLongFieldUpdater.get(r11);
            if ((3458764513820540928L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = (int) ((1152921503533105152L & j) >> 30);
                int i3 = r11.A01;
                if (((i2 + 2) & i3) != (i & i3)) {
                    if (!r11.A03 && r11.A02.get(i2 & i3) != null) {
                        int i4 = r11.A00;
                        if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                            break;
                        }
                    } else if (atomicLongFieldUpdater.compareAndSet(r11, j, (j & (~1152921503533105152L)) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                        int i5 = i2 & i3;
                        Object obj2 = obj;
                        r11.A02.set(i5, obj2);
                        while ((atomicLongFieldUpdater.get(r11) & 1152921504606846976L) != 0) {
                            r11 = A01(r11, A00(r11));
                            AtomicReferenceArray atomicReferenceArray = r11.A02;
                            int i6 = r11.A01 & i2;
                            Object obj3 = atomicReferenceArray.get(i6);
                            if (!(obj3 instanceof AnonymousClass0SU) || ((AnonymousClass0SU) obj3).A00 != i2) {
                                break;
                            }
                            atomicReferenceArray.set(i6, obj2);
                        }
                        return 0;
                    }
                } else {
                    break;
                }
            } else if ((j & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final Object A03() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        while (true) {
            AnonymousClass038 r14 = this;
            long j = atomicLongFieldUpdater.get(r14);
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = r14.A01;
                int i3 = i & i2;
                if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                    AtomicReferenceArray atomicReferenceArray = r14.A02;
                    Object obj = atomicReferenceArray.get(i3);
                    if (obj != null) {
                        if (obj instanceof AnonymousClass0SU) {
                            break;
                        }
                        long j2 = ~1073741823;
                        long j3 = ((long) ((i + 1) & 1073741823)) << 0;
                        if (atomicLongFieldUpdater.compareAndSet(r14, j, (j & j2) | j3)) {
                            atomicReferenceArray.set(i3, (Object) null);
                            return obj;
                        } else if (r14.A03) {
                            while (true) {
                                long j4 = atomicLongFieldUpdater.get(r14);
                                int i4 = (int) ((1073741823 & j4) >> 0);
                                if ((1152921504606846976L & j4) != 0) {
                                    r14 = A01(r14, A00(r14));
                                } else if (atomicLongFieldUpdater.compareAndSet(r14, j4, (j4 & j2) | j3)) {
                                    r14.A02.set(r14.A01 & i4, (Object) null);
                                    return obj;
                                }
                            }
                        }
                    } else if (r14.A03) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return A05;
            }
        }
        return null;
    }

    public final boolean A04() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                break;
            } else if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public AnonymousClass038(int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        int i2 = i - 1;
        this.A01 = i2;
        this.A02 = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.");
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
