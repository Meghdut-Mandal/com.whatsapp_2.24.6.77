package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0AR  reason: invalid class name */
public class AnonymousClass0AR extends AnonymousClass0AC implements AnonymousClass0AP, AnonymousClass0AQ, C023609y {
    public static final AtomicIntegerFieldUpdater A02;
    public static final AtomicReferenceFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public final C023509x A00;
    public final C005102h A01;
    public volatile int _decisionAndIndex = 536870911;
    public volatile Object _parentHandle;
    public volatile Object _state = C12930it.A00;

    static {
        Class<AnonymousClass0AR> cls = AnonymousClass0AR.class;
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public static final Object A00(Object obj, C006302t r4, C16560pR r5, int i) {
        C15210ms r52;
        Object obj2 = obj;
        if ((obj instanceof AnonymousClass0AT) || ((i != 1 && i != 2) || (r4 == null && !(r5 instanceof C15210ms)))) {
            return obj2;
        }
        if (r5 instanceof C15210ms) {
            r52 = (C15210ms) r5;
        } else {
            r52 = null;
        }
        return new C06620Uj(obj2, (Object) null, (Throwable) null, r4, r52);
    }

    public static final AnonymousClass035 A02(Object obj, C006302t r6, AnonymousClass0AR r7) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(r7);
            if (!(obj2 instanceof C16560pR)) {
                return null;
            }
        } while (!AnonymousClass0A8.A00(r7, obj2, A00(obj, r6, (C16560pR) obj2, r7.A00), atomicReferenceFieldUpdater));
        if (!A09(r7)) {
            r7.A0K();
        }
        return AnonymousClass0RW.A00;
    }

    public String A0H() {
        return "CancellableContinuation";
    }

    private final AnonymousClass03l A01() {
        C007403e r3 = (C007403e) this.A01.get(C007403e.A00);
        if (r3 == null) {
            return null;
        }
        AnonymousClass03l BL5 = r3.BL5(new C15260mx(this), true, true);
        AnonymousClass0A8.A00(this, (Object) null, BL5, A03);
        return BL5;
    }

    public static final void A03(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    private final void A04(Object obj, C006302t r5, int i) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C16560pR)) {
                if (obj2 instanceof C15230mu) {
                    C15230mu r1 = (C15230mu) obj2;
                    if (r1.A02()) {
                        if (r5 != null) {
                            A0M(r1.A00, r5);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        } while (!AnonymousClass0A8.A00(this, obj2, A00(obj, r5, (C16560pR) obj2, i), atomicReferenceFieldUpdater));
        if (!A09(this)) {
            A0K();
        }
        A08(this, i);
    }

    public static final void A05(Object obj, AnonymousClass0AR r14) {
        boolean A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(r14);
            if (obj2 instanceof C12930it) {
                A002 = AnonymousClass0A8.A00(r14, obj2, obj, atomicReferenceFieldUpdater);
                continue;
            } else if ((obj2 instanceof C15210ms) || (obj2 instanceof C15460nN)) {
                A03(obj, obj2);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (obj2 instanceof AnonymousClass0AT) {
                AnonymousClass0AT r1 = (AnonymousClass0AT) obj2;
                if (!r1.A01()) {
                    A03(obj, obj2);
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else if (obj2 instanceof C15230mu) {
                    Throwable th = r1.A00;
                    if (obj instanceof C15210ms) {
                        r14.A0N(th, (C15210ms) obj);
                        return;
                    }
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    r14.A06(th, (C15460nN) obj);
                    return;
                } else {
                    return;
                }
            } else if (obj2 instanceof C06620Uj) {
                C06620Uj r2 = (C06620Uj) obj2;
                if (r2.A04 != null) {
                    A03(obj, obj2);
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else if (!(obj instanceof C15460nN)) {
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    C15210ms r7 = (C15210ms) obj;
                    Throwable th2 = r2.A02;
                    if (th2 != null) {
                        r14.A0N(th2, r7);
                        return;
                    }
                    A002 = AnonymousClass0A8.A00(r14, obj2, new C06620Uj(r2.A01, r2.A00, th2, r2.A03, r7), atomicReferenceFieldUpdater);
                    continue;
                } else {
                    return;
                }
            } else if (!(obj instanceof C15460nN)) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                A002 = AnonymousClass0A8.A00(r14, obj2, new C06620Uj(obj2, (Object) null, (Throwable) null, (C006302t) null, (C15210ms) obj), atomicReferenceFieldUpdater);
                continue;
            } else {
                return;
            }
        } while (!A002);
    }

    private final void A06(Throwable th, C15460nN r6) {
        int i = A02.get(this) & 536870911;
        if (i != 536870911) {
            try {
                r6.A06(th, this.A01, i);
            } catch (Throwable th2) {
                C005102h r2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in invokeOnCancellation handler for ");
                sb.append(this);
                C05720Qu.A00(r2, new C13190jT(sb.toString(), th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public static final void A08(AnonymousClass0AR r7, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(r7);
            int i3 = i2 >> 29;
            boolean z = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z2 = true;
                    C023509x r6 = r7.A00;
                    if (i != 4) {
                        z2 = false;
                        if (r6 instanceof AnonymousClass0AD) {
                            boolean z3 = true;
                            if (!(i == 1 || i == 2)) {
                                z3 = false;
                            }
                            int i4 = r7.A00;
                            if (!(i4 == 1 || i4 == 2)) {
                                z = false;
                            }
                            if (z3 == z) {
                                C005502l r2 = ((AnonymousClass0AD) r6).A03;
                                C005102h context = r6.getContext();
                                if (r2.A04(context)) {
                                    r2.A03(r7, context);
                                    return;
                                }
                                AnonymousClass03G A002 = AnonymousClass0AL.A00();
                                long j = A002.A00;
                                if (j >= 4294967296L) {
                                    A002.A07(r7);
                                    return;
                                }
                                A002.A00 = j + 4294967296L;
                                try {
                                    A07(r6, r7, true);
                                    do {
                                    } while (A002.A09());
                                } catch (Throwable th) {
                                    A002.A08(true);
                                    throw th;
                                }
                                A002.A08(true);
                                return;
                            }
                        }
                    }
                    A07(r6, r7, z2);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(r7, i2, 1073741824 + (536870911 & i2)));
    }

    public static final boolean A09(AnonymousClass0AR r2) {
        if (r2.A00 == 2) {
            C023509x r1 = r2.A00;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (AnonymousClass0AD.A04.get(r1) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Object A0B() {
        return A04.get(this);
    }

    public Object A0C(Object obj) {
        if (obj instanceof C06620Uj) {
            return ((C06620Uj) obj).A01;
        }
        return obj;
    }

    public void A0F(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C16560pR) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof AnonymousClass0AT)) {
                Throwable th2 = th;
                if (obj2 instanceof C06620Uj) {
                    C06620Uj r1 = (C06620Uj) obj2;
                    if (r1.A02 != null) {
                        throw new IllegalStateException("Must be called at most once");
                    }
                    Object obj3 = r1.A01;
                    C15210ms r8 = r1.A04;
                    C006302t r7 = r1.A03;
                    if (AnonymousClass0A8.A00(this, obj2, new C06620Uj(obj3, r1.A00, th2, r7, r8), atomicReferenceFieldUpdater)) {
                        if (r8 != null) {
                            A0N(th2, r8);
                        }
                        if (r7 != null) {
                            A0M(th2, r7);
                            return;
                        }
                        return;
                    }
                } else if (AnonymousClass0A8.A00(this, obj2, new C06620Uj(obj2, (Object) null, th2, (C006302t) null, (C15210ms) null), atomicReferenceFieldUpdater)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void A0K() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        AnonymousClass03l r0 = (AnonymousClass03l) atomicReferenceFieldUpdater.get(this);
        if (r0 != null) {
            r0.dispose();
            atomicReferenceFieldUpdater.set(this, C008203n.A00);
        }
    }

    public final void A0L() {
        AnonymousClass035 r0;
        C023509x r4 = this.A00;
        if (r4 instanceof AnonymousClass0AD) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass0AD.A04;
            do {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                r0 = AnonymousClass0AE.A00;
                if (obj != r0) {
                    if (!(obj instanceof Throwable)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inconsistent state ");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    } else if (AnonymousClass0A8.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            A0K();
                            B2T(th);
                            return;
                        }
                        return;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            } while (!AnonymousClass0A8.A00(r4, r0, this, atomicReferenceFieldUpdater));
        }
    }

    public boolean B2T(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof C16560pR)) {
                return false;
            }
            z2 = obj instanceof C15210ms;
            if (z2 || (obj instanceof C15460nN)) {
                z = true;
            }
        } while (!AnonymousClass0A8.A00(this, obj, new C15230mu(th, this, z), atomicReferenceFieldUpdater));
        if (z2) {
            A0N(th, (C15210ms) obj);
        } else if (obj instanceof C15460nN) {
            A06(th, (C15460nN) obj);
        }
        if (!A09(this)) {
            A0K();
        }
        A08(this, this.A00);
        return true;
    }

    public void B3G(Object obj) {
        A08(this, this.A00);
    }

    public void BL1(C006302t r2) {
        if (!(r2 instanceof C15210ms)) {
            r2 = new C15180mp(r2);
        }
        A05(r2, this);
    }

    public void BL2(C15460nN r5, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A05(r5, this);
    }

    public void Bol(C006302t r2, Object obj) {
        A04(obj, r2, this.A00);
    }

    public void Bom(Object obj, C005502l r5) {
        int i;
        AnonymousClass0AD r2;
        C023509x r22 = this.A00;
        C005502l r0 = null;
        if ((r22 instanceof AnonymousClass0AD) && (r2 = (AnonymousClass0AD) r22) != null) {
            r0 = r2.A03;
        }
        if (r0 == r5) {
            i = 4;
        } else {
            i = this.A00;
        }
        A04(obj, (C006302t) null, i);
    }

    public C023609y getCallerFrame() {
        C023509x r1 = this.A00;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A0H());
        sb.append('(');
        sb.append(C05730Qv.A00(this.A00));
        sb.append("){");
        Object obj = A04.get(this);
        if (obj instanceof C16560pR) {
            str = "Active";
        } else if (obj instanceof C15230mu) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public AnonymousClass0AR(int i, C023509x r3) {
        super(i);
        this.A00 = r3;
        this.A01 = r3.getContext();
    }

    public static final void A07(C023509x r3, AnonymousClass0AC r4, boolean z) {
        Object A0C;
        C15510nS r0;
        Object A0B = r4.A0B();
        Throwable A0D = r4.A0D(A0B);
        if (A0D != null) {
            A0C = new AnonymousClass03N(A0D);
        } else {
            A0C = r4.A0C(A0B);
        }
        if (z) {
            AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            AnonymousClass0AD r32 = (AnonymousClass0AD) r3;
            C023509x r1 = r32.A02;
            Object obj = r32.A01;
            C005102h context = r1.getContext();
            Object A002 = AnonymousClass0AF.A00(obj, context);
            if (A002 != AnonymousClass0AF.A01) {
                r0 = AnonymousClass0A3.A02(A002, r1, context);
            } else {
                r0 = null;
            }
            try {
                r1.resumeWith(A0C);
            } finally {
                if (r0 == null || r0.A12()) {
                    AnonymousClass0AF.A01(A002, context);
                }
            }
        } else {
            r3.resumeWith(A0C);
        }
    }

    public Throwable A0D(Object obj) {
        Throwable A0D = super.A0D(obj);
        if (A0D == null) {
            return null;
        }
        return A0D;
    }

    public final Object A0G() {
        int i;
        C007403e r1;
        boolean A09 = A09(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (A09) {
                        A0L();
                    }
                    Object obj = A04.get(this);
                    if (obj instanceof AnonymousClass0AT) {
                        throw ((AnonymousClass0AT) obj).A00;
                    }
                    int i3 = this.A00;
                    if ((i3 != 1 && i3 != 2) || (r1 = (C007403e) this.A01.get(C007403e.A00)) == null || r1.BL7()) {
                        return A0C(obj);
                    }
                    CancellationException B9P = r1.B9P();
                    A0F(obj, B9P);
                    throw B9P;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (A03.get(this) == null) {
            A01();
        }
        if (A09) {
            A0L();
        }
        return AnonymousClass0AO.COROUTINE_SUSPENDED;
    }

    public Throwable A0I(C007403e r2) {
        return r2.B9P();
    }

    public void A0J() {
        AnonymousClass03l A012 = A01();
        if (A012 != null && (!(A04.get(this) instanceof C16560pR))) {
            A012.dispose();
            A03.set(this, C008203n.A00);
        }
    }

    public final void A0M(Throwable th, C006302t r6) {
        try {
            r6.invoke(th);
        } catch (Throwable th2) {
            C005102h r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            C05720Qu.A00(r2, new C13190jT(sb.toString(), th2));
        }
    }

    public final void A0N(Throwable th, C15210ms r6) {
        try {
            r6.A04(th);
        } catch (Throwable th2) {
            C005102h r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            C05720Qu.A00(r2, new C13190jT(sb.toString(), th2));
        }
    }

    public Object BwD(Object obj, Object obj2, C006302t r4) {
        return A02(obj, r4, this);
    }

    public void resumeWith(Object obj) {
        Throwable A002 = AnonymousClass0AK.A00(obj);
        if (A002 != null) {
            obj = new AnonymousClass0AT(A002);
        }
        A04(obj, (C006302t) null, this.A00);
    }

    public final C023509x A0E() {
        return this.A00;
    }

    public C005102h getContext() {
        return this.A01;
    }
}
