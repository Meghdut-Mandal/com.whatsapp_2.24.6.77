package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0na  reason: invalid class name and case insensitive filesystem */
public class C15590na extends C07220Wu implements C17170qq {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C15590na.class, Object.class, "owner");
    public final C019408g A00 = new C14870mK(this);
    public volatile Object owner = C05830Rf.A00;

    public Object BOV(Object obj, C023509x r24) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean z;
        Object A002;
        while (true) {
            atomicIntegerFieldUpdater = C07220Wu.A01;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 <= 1) {
                z = false;
                if (i2 <= 0) {
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 0)) {
                    A01.set(this, (Object) null);
                    z = true;
                    break;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            }
        }
        if (!z) {
            AnonymousClass0AR A003 = C05710Qt.A00(AnonymousClass0AA.A01(r24));
            try {
                C12860im r10 = new C12860im(A003, this);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            r10.Bol(this.A00, AnonymousClass0AJ.A00);
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C07220Wu.A05;
                        C15550nW r8 = (C15550nW) atomicReferenceFieldUpdater.get(this);
                        long andIncrement = C07220Wu.A03.getAndIncrement(this);
                        C14430lc r20 = C14430lc.A00;
                        long j = (long) AnonymousClass0S6.A01;
                        long j2 = andIncrement / j;
                        while (true) {
                            A002 = C06980Vw.A00(r20, r8, j2);
                            if (A002 == C06980Vw.A00) {
                                break;
                            }
                            C15460nN A004 = AnonymousClass0R6.A00(A002);
                            while (true) {
                                C15460nN r14 = (C15460nN) atomicReferenceFieldUpdater.get(this);
                                if (r14.A00 >= A004.A00) {
                                    break;
                                } else if (A004.A07()) {
                                    if (AnonymousClass0A8.A00(this, r14, A004, atomicReferenceFieldUpdater)) {
                                        AnonymousClass000.A1G(r14);
                                        break;
                                    }
                                    AnonymousClass000.A1G(A004);
                                }
                            }
                        }
                        C15550nW r1 = (C15550nW) AnonymousClass0R6.A00(A002);
                        int i3 = (int) (andIncrement % j);
                        AtomicReferenceArray atomicReferenceArray = r1.A00;
                        if (atomicReferenceArray.compareAndSet(i3, (Object) null, r10)) {
                            r10.BL2(r1, i3);
                            break;
                        } else if (atomicReferenceArray.compareAndSet(i3, AnonymousClass0S6.A04, AnonymousClass0S6.A05)) {
                            r10.Bol(this.A00, AnonymousClass0AJ.A00);
                            break;
                        }
                    }
                }
                Object A0G = A003.A0G();
                AnonymousClass0AO r0 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                if (A0G != r0) {
                    A0G = AnonymousClass0AJ.A00;
                }
                if (A0G == r0) {
                    return A0G;
                }
            } catch (Throwable th) {
                A003.A0L();
                throw th;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public void BwJ(Object obj) {
        while (Math.max(C07220Wu.A01.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            AnonymousClass035 r0 = C05830Rf.A00;
            if (obj2 != r0) {
                if (obj2 != obj && obj != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("This mutex is locked by ");
                    A0u.append(obj2);
                    A0u.append(", but ");
                    A0u.append(obj);
                    throw AnonymousClass000.A0g(" is expected", A0u);
                } else if (AnonymousClass0A8.A00(this, obj2, r0, atomicReferenceFieldUpdater)) {
                    A00();
                    return;
                }
            }
        }
        throw AnonymousClass001.A09("This mutex is not locked");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Mutex@");
        AnonymousClass000.A1B(this, A0u);
        A0u.append("[isLocked=");
        A0u.append(AnonymousClass000.A1Q(Math.max(C07220Wu.A01.get(this), 0)));
        A0u.append(",owner=");
        return AnonymousClass000.A0n(A01.get(this), A0u);
    }
}
