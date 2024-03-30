package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Wu  reason: invalid class name and case insensitive filesystem */
public class C07220Wu {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicLongFieldUpdater A02;
    public static final AtomicLongFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public static final AtomicReferenceFieldUpdater A05;
    public final C006302t A00 = new C14670m0(this);
    public volatile int _availablePermits = 1;
    public volatile long deqIdx;
    public volatile long enqIdx;
    public volatile Object head;
    public volatile Object tail;

    static {
        Class<C07220Wu> cls = C07220Wu.class;
        Class<Object> cls2 = Object.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        A02 = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        A03 = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public C07220Wu() {
        C15550nW r0 = new C15550nW((C15550nW) null, 2, 0);
        this.head = r0;
        this.tail = r0;
    }

    public void A00() {
        int i;
        Object A002;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1 || atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw AnonymousClass001.A09(AnonymousClass000.A0r("The number of released permits cannot be greater than ", AnonymousClass000.A0u(), 1));
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
                C15460nN r13 = (C15460nN) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = A02.getAndIncrement(this);
                long j = (long) AnonymousClass0S6.A01;
                long j2 = andIncrement2 / j;
                C14440ld r17 = C14440ld.A00;
                while (true) {
                    A002 = C06980Vw.A00(r17, r13, j2);
                    if (A002 == C06980Vw.A00) {
                        break;
                    }
                    C15460nN A003 = AnonymousClass0R6.A00(A002);
                    while (true) {
                        C15460nN r6 = (C15460nN) atomicReferenceFieldUpdater.get(this);
                        if (r6.A00 >= A003.A00) {
                            break;
                        } else if (A003.A07()) {
                            if (AnonymousClass0A8.A00(this, r6, A003, atomicReferenceFieldUpdater)) {
                                AnonymousClass000.A1G(r6);
                                break;
                            }
                            AnonymousClass000.A1G(A003);
                        }
                    }
                }
                C15550nW r1 = (C15550nW) AnonymousClass0R6.A00(A002);
                r1.A01();
                if (r1.A00 <= j2) {
                    int i2 = (int) (andIncrement2 % j);
                    AnonymousClass035 r5 = AnonymousClass0S6.A04;
                    AtomicReferenceArray atomicReferenceArray = r1.A00;
                    Object andSet = atomicReferenceArray.getAndSet(i2, r5);
                    if (andSet == null) {
                        int i3 = AnonymousClass0S6.A00;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (atomicReferenceArray.get(i2) != AnonymousClass0S6.A05) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        if (!atomicReferenceArray.compareAndSet(i2, r5, AnonymousClass0S6.A02)) {
                            return;
                        }
                    } else if (andSet == AnonymousClass0S6.A03) {
                        continue;
                    } else if (andSet instanceof AnonymousClass0AP) {
                        AnonymousClass0AP r3 = (AnonymousClass0AP) andSet;
                        Object BwD = r3.BwD(AnonymousClass0AJ.A00, (Object) null, this.A00);
                        if (BwD != null) {
                            r3.B3G(BwD);
                            return;
                        }
                    } else if (andSet instanceof C15200mr) {
                        if (C15200mr.A00(this, AnonymousClass0AJ.A00, (C15200mr) andSet) == 0) {
                            return;
                        }
                    } else {
                        throw AnonymousClass000.A0f(andSet, "unexpected: ", AnonymousClass000.A0u());
                    }
                }
            } else {
                return;
            }
        }
    }
}
