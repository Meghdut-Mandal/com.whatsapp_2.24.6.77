package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.03f  reason: invalid class name and case insensitive filesystem */
public class C007503f implements C007403e {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public volatile Object _parentHandle;
    public volatile Object _state;

    static {
        Class<C007503f> cls = C007503f.class;
        Class<Object> cls2 = Object.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        A0M(r4, r2.BDY());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A02(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            r5 = r4
        L_0x0002:
            java.lang.Object r3 = r6.A0X()
            boolean r0 = r3 instanceof X.C12920is
            if (r0 == 0) goto L_0x000c
            monitor-enter(r3)
            goto L_0x003c
        L_0x000c:
            boolean r0 = r3 instanceof X.C007903j
            if (r0 == 0) goto L_0x008b
            if (r5 != 0) goto L_0x0016
            java.lang.Throwable r5 = r6.A0A(r7)
        L_0x0016:
            r1 = r3
            X.03j r1 = (X.C007903j) r1
            boolean r0 = r1.BL7()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r6.A0V(r5, r1)
            if (r0 == 0) goto L_0x0002
            goto L_0x006f
        L_0x0026:
            X.0AT r0 = new X.0AT
            r0.<init>(r5)
            java.lang.Object r1 = r6.A03(r3, r0)
            X.035 r0 = X.C007803i.A03
            if (r1 == r0) goto L_0x0074
            X.035 r0 = X.C007803i.A04
            if (r1 == r0) goto L_0x0002
            return r1
        L_0x003c:
            r2 = r3
            X.0is r2 = (X.C12920is) r2     // Catch:{ all -> 0x0061 }
            boolean r0 = r2.A0A()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004b
            X.035 r0 = X.C007803i.A06     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)
            return r0
        L_0x004b:
            boolean r0 = r2.A08()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0055
            java.lang.Throwable r5 = r6.A0A(r7)     // Catch:{ all -> 0x0061 }
        L_0x0055:
            r2.A06(r5)     // Catch:{ all -> 0x0061 }
            java.lang.Throwable r1 = r2.A03()     // Catch:{ all -> 0x0061 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0065
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0064:
            r4 = r1
        L_0x0065:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x006f
            X.0nO r0 = r2.BDY()
            r6.A0M(r4, r0)
        L_0x006f:
            X.035 r0 = X.C007803i.A03
            return r0
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot happen in "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            X.035 r0 = X.C007803i.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007503f.A02(java.lang.Object):java.lang.Object");
    }

    private final boolean A0S(Object obj, C007903j r6) {
        if (!AnonymousClass0A8.A00(this, r6, C007803i.A00(obj), A01)) {
            return false;
        }
        A0i(obj);
        A0K(obj, r6);
        return true;
    }

    private final boolean A0V(Throwable th, C007903j r7) {
        C15470nO A0H = A0H(r7);
        if (A0H == null || !AnonymousClass0A8.A00(this, r7, new C12920is(th, A0H), A01)) {
            return false;
        }
        A0M(th, A0H);
        return true;
    }

    public String A0b() {
        return "Job was cancelled";
    }

    public void A0g() {
    }

    public void A0h(Object obj) {
    }

    public void A0i(Object obj) {
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r() {
        return false;
    }

    public boolean A0s() {
        return false;
    }

    public boolean A0w(Throwable th) {
        return false;
    }

    public final C18650tV B9e() {
        return new C18650tV(new C14080kw((C023509x) null, this), 1);
    }

    public final AnonymousClass03l BL4(C006302t r3) {
        return BL5(r3, false, true);
    }

    public Object fold(Object obj, C009003v r3) {
        AnonymousClass00C.A0D(r3, 2);
        return r3.invoke(obj, this);
    }

    private final int A00(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        if (obj instanceof C008003k) {
            if (!((C008003k) obj).A00) {
                atomicReferenceFieldUpdater = A01;
                obj2 = C007803i.A01;
            }
            return 0;
        }
        if (obj instanceof C12910ir) {
            atomicReferenceFieldUpdater = A01;
            obj2 = ((C12910ir) obj).A00;
        }
        return 0;
        if (!AnonymousClass0A8.A00(this, obj, obj2, atomicReferenceFieldUpdater)) {
            return -1;
        }
        A0g();
        return 1;
    }

    private final Object A03(Object obj, Object obj2) {
        if (!(obj instanceof C007903j)) {
            return C007803i.A03;
        }
        if ((!(obj instanceof C008003k) && !(obj instanceof C008503q)) || (obj instanceof C008703s) || (obj2 instanceof AnonymousClass0AT)) {
            return A04(obj2, (C007903j) obj);
        }
        if (A0S(obj2, (C007903j) obj)) {
            return obj2;
        }
        return C007803i.A04;
    }

    private final Object A05(Object obj, C12920is r5) {
        Throwable A0C;
        AnonymousClass0AT r0;
        Throwable th = null;
        if ((obj instanceof AnonymousClass0AT) && (r0 = (AnonymousClass0AT) obj) != null) {
            th = r0.A00;
        }
        synchronized (r5) {
            r5.A08();
            ArrayList A04 = r5.A04(th);
            A0C = A0C(A04, r5);
            if (A0C != null) {
                A0L(A0C, A04);
            }
        }
        if (A0C != null) {
            if (A0C != th) {
                obj = new AnonymousClass0AT(A0C);
            }
            if (A0U(A0C) || A0w(A0C)) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((AnonymousClass0AT) obj).A01();
            }
        }
        A0i(obj);
        AnonymousClass0A8.A00(this, r5, C007803i.A00(obj), A01);
        A0K(obj, r5);
        return obj;
    }

    private final Object A06(C023509x r4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        C15220mt r2 = new C15220mt(AnonymousClass0AA.A01(r4), this);
        r2.A0J();
        AnonymousClass0AR.A05(new C15170mo(BL4(new C15300n1(r2))), r2);
        return r2.A0G();
    }

    private final Object A07(C023509x r4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r2 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r4));
        r2.A0J();
        AnonymousClass0AR.A05(new C15170mo(BL4(new C15310n2(r2))), r2);
        Object A0G = r2.A0G();
        if (A0G == AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return A0G;
        }
        return AnonymousClass0AJ.A00;
    }

    public static final String A08(Object obj) {
        if (obj instanceof C12920is) {
            C12920is r2 = (C12920is) obj;
            if (r2.A08()) {
                return "Cancelling";
            }
            if (r2.A09()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C007903j) {
            if (!((C007903j) obj).BL7()) {
                return "New";
            }
            return "Active";
        } else if (obj instanceof AnonymousClass0AT) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final Throwable A0A(Object obj) {
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C13420jq(A0b(), (Throwable) null, this);
            }
            return th;
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C007503f) obj).A0d();
    }

    public static final Throwable A0B(Object obj) {
        AnonymousClass0AT r2;
        if (!(obj instanceof AnonymousClass0AT) || (r2 = (AnonymousClass0AT) obj) == null) {
            return null;
        }
        return r2.A00;
    }

    private final C008703s A0E(C007903j r3) {
        C008703s r0;
        if ((r3 instanceof C008703s) && (r0 = (C008703s) r3) != null) {
            return r0;
        }
        C15470nO BDY = r3.BDY();
        if (BDY != null) {
            return A0F(BDY);
        }
        return null;
    }

    private final C008503q A0G(C006302t r2, boolean z) {
        C008503q r0;
        if (z) {
            if (!(r2 instanceof C008603r) || (r0 = (C008503q) r2) == null) {
                r0 = new C15270my(r2);
            }
        } else if (!(r2 instanceof C008503q) || (r0 = (C008503q) r2) == null) {
            r0 = new C15290n0(r2);
        }
        r0.A00 = this;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.0ir] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0O(X.C008003k r3) {
        /*
            r2 = this;
            X.0nO r1 = new X.0nO
            r1.<init>()
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x000f
            X.0ir r0 = new X.0ir
            r0.<init>(r1)
            r1 = r0
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            X.AnonymousClass0A8.A00(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007503f.A0O(X.03k):void");
    }

    private final void A0P(C008503q r4) {
        C15470nO r2 = new C15470nO();
        C008303o.A01.lazySet(r2, r4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C008303o.A00;
        atomicReferenceFieldUpdater.lazySet(r2, r4);
        while (true) {
            if (r4.A02() == r4) {
                if (AnonymousClass0A8.A00(r4, r4, r2, atomicReferenceFieldUpdater)) {
                    C008303o.A01(r2, r4);
                    break;
                }
            } else {
                break;
            }
        }
        AnonymousClass0A8.A00(this, r4, r4.A03(), A01);
    }

    private final boolean A0R(Object obj, C008703s r6, C12920is r7) {
        while (r6.A00.BL5(new C15320n3(obj, r6, r7, this), false, false) == C008203n.A00) {
            r6 = A0F(r6);
            if (r6 == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean A0T(Object obj, C008503q r6, C15470nO r7) {
        C008303o A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C15440nL r3 = new C15440nL(obj, this, r6);
        do {
            A002 = C008303o.A00(r7);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C008303o.A01;
                Object obj2 = atomicReferenceFieldUpdater2.get(r7);
                while (true) {
                    A002 = (C008303o) obj2;
                    if (!A002.A04()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater2.get(A002);
                }
            }
            C008303o.A01.lazySet(r6, A002);
            atomicReferenceFieldUpdater = C008303o.A00;
            atomicReferenceFieldUpdater.lazySet(r6, r7);
            r3.A00 = r7;
        } while (!AnonymousClass0A8.A00(A002, r7, r3, atomicReferenceFieldUpdater));
        if (r3.A00(A002) == null) {
            return true;
        }
        return false;
    }

    public final Object A0X() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AnonymousClass0A7)) {
                return obj;
            }
            ((AnonymousClass0A7) obj).A00(this);
        }
    }

    public final String A0c() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0a());
        sb.append('{');
        sb.append(A08(A0X()));
        sb.append('}');
        return sb.toString();
    }

    public final CancellationException A0e(String str, Throwable th) {
        CancellationException cancellationException;
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        if (str == null) {
            str = A0b();
        }
        return new C13420jq(str, th, this);
    }

    public final C008103m A0f() {
        return (C008103m) A00.get(this);
    }

    public final void A0m(C008103m r2) {
        A00.set(this, r2);
    }

    public final void A0n(C007403e r3) {
        if (r3 != null) {
            r3.BuM();
            C008103m B1U = r3.B1U(this);
            A0m(B1U);
            if (BLQ()) {
                B1U.dispose();
            } else {
                return;
            }
        }
        A0m(C008203n.A00);
    }

    public boolean A0v(Throwable th) {
        if ((th instanceof CancellationException) || (A0t(th) && A0q())) {
            return true;
        }
        return false;
    }

    public final C008103m B1U(C007503f r3) {
        AnonymousClass03l BL5 = BL5(new C008703s(r3), true, true);
        AnonymousClass00C.A0E(BL5, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C008103m) BL5;
    }

    public void B2S(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C13420jq(A0b(), (Throwable) null, this);
        }
        A0j(cancellationException);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0c());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public C007503f(boolean z) {
        C008003k A03;
        if (z) {
            A03 = C007803i.A01;
        } else {
            A03 = C007803i.A02;
        }
        this._state = A03;
    }

    private final Object A01(Object obj) {
        Object A03;
        do {
            Object A0X = A0X();
            if (!(A0X instanceof C007903j) || ((A0X instanceof C12920is) && ((C12920is) A0X).A09())) {
                return C007803i.A03;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AT.A01;
            A03 = A03(A0X, new AnonymousClass0AT(A0A(obj)));
        } while (A03 == C007803i.A04);
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r4 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        A0M(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r0 = A0E(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (A0R(r8, r0, r3) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        return X.C007803i.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007c, code lost:
        return A05(r8, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A04(java.lang.Object r8, X.C007903j r9) {
        /*
            r7 = this;
            X.0nO r5 = r7.A0H(r9)
            if (r5 != 0) goto L_0x000b
            X.035 r0 = X.C007803i.A04
            return r0
        L_0x000b:
            boolean r0 = r9 instanceof X.C12920is
            r4 = 0
            if (r0 == 0) goto L_0x001d
            r3 = r9
            X.0is r3 = (X.C12920is) r3
        L_0x0013:
            r6 = 0
            if (r3 != 0) goto L_0x001b
            X.0is r3 = new X.0is
            r3.<init>(r4, r5)
        L_0x001b:
            monitor-enter(r3)
            goto L_0x001f
        L_0x001d:
            r3 = r4
            goto L_0x0013
        L_0x001f:
            boolean r0 = r3.A09()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x002a
            X.035 r0 = X.C007803i.A03     // Catch:{ all -> 0x007d }
            goto L_0x003b
        L_0x002a:
            r3.A05()     // Catch:{ all -> 0x007d }
            if (r3 == r9) goto L_0x003d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x007d }
            boolean r0 = X.AnonymousClass0A8.A00(r7, r9, r3, r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x003d
            X.035 r0 = X.C007803i.A04     // Catch:{ all -> 0x007d }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            boolean r2 = r3.A08()     // Catch:{ all -> 0x007d }
            boolean r0 = r8 instanceof X.AnonymousClass0AT     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0049
            r0 = r8
            X.0AT r0 = (X.AnonymousClass0AT) r0     // Catch:{ all -> 0x007d }
            goto L_0x004a
        L_0x0049:
            r0 = r4
        L_0x004a:
            if (r0 == 0) goto L_0x0051
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x007d }
            r3.A06(r0)     // Catch:{ all -> 0x007d }
        L_0x0051:
            java.lang.Throwable r1 = r3.A03()     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x0058
            r6 = 1
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x007d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0063
            r4 = r1
        L_0x0063:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0069
            r7.A0M(r4, r5)
        L_0x0069:
            X.03s r0 = r7.A0E(r9)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x0078
            X.035 r0 = X.C007803i.A00
            return r0
        L_0x0078:
            java.lang.Object r0 = r7.A05(r8, r3)
            return r0
        L_0x007d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007503f.A04(java.lang.Object, X.03j):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable A0C(java.util.List r6, X.C12920is r7) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = r5.A0b()
            X.0jq r0 = new X.0jq
            r0.<init>(r1, r4, r5)
            return r0
        L_0x0017:
            java.util.Iterator r2 = r6.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x002b:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0032
            return r1
        L_0x0030:
            r1 = r4
            goto L_0x002b
        L_0x0032:
            r0 = 0
            java.lang.Object r3 = r6.get(r0)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r0 = r3 instanceof X.C13390jn
            if (r0 == 0) goto L_0x0057
            java.util.Iterator r2 = r6.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r2.next()
            if (r1 == r3) goto L_0x0041
            boolean r0 = r1 instanceof X.C13390jn
            if (r0 == 0) goto L_0x0041
            r4 = r1
        L_0x0052:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L_0x0057
        L_0x0056:
            return r4
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007503f.A0C(java.util.List, X.0is):java.lang.Throwable");
    }

    public static final C008703s A0F(C008303o r3) {
        while (r3.A04()) {
            C008303o A002 = C008303o.A00(r3);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C008303o.A01;
                Object obj = atomicReferenceFieldUpdater.get(r3);
                while (true) {
                    A002 = (C008303o) obj;
                    if (!A002.A04()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(A002);
                }
            }
            r3 = A002;
        }
        while (true) {
            r3 = r3.A03();
            if (!r3.A04()) {
                if (r3 instanceof C008703s) {
                    return (C008703s) r3;
                }
                if (r3 instanceof C15470nO) {
                    return null;
                }
            }
        }
    }

    private final C15470nO A0H(C007903j r3) {
        C15470nO BDY = r3.BDY();
        if (BDY != null) {
            return BDY;
        }
        if (r3 instanceof C008003k) {
            return new C15470nO();
        }
        if (r3 instanceof C008503q) {
            A0P((C008503q) r3);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public final void A0I(Object obj, C008703s r3, C12920is r4) {
        C008703s A0F = A0F(r3);
        if (A0F == null || !A0R(obj, A0F, r4)) {
            A0h(A05(obj, r4));
        }
    }

    private final void A0K(Object obj, C007903j r5) {
        AnonymousClass0AT r4;
        C008103m A0f = A0f();
        if (A0f != null) {
            A0f.dispose();
            A0m(C008203n.A00);
        }
        Throwable th = null;
        if ((obj instanceof AnonymousClass0AT) && (r4 = (AnonymousClass0AT) obj) != null) {
            th = r4.A00;
        }
        if (r5 instanceof C008503q) {
            try {
                ((C008503q) r5).A05(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(r5);
                sb.append(" for ");
                sb.append(this);
                A0k(new C13190jT(sb.toString(), th2));
            }
        } else {
            C15470nO BDY = r5.BDY();
            if (BDY != null) {
                A0N(th, BDY);
            }
        }
    }

    public static final void A0L(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    AnonymousClass0VY.A01(th, th2);
                }
            }
        }
    }

    private final void A0M(Throwable th, C15470nO r7) {
        Object A02 = r7.A02();
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C13190jT r1 = null;
        for (C008303o r4 = (C008303o) A02; !AnonymousClass00C.A0J(r4, r7); r4 = r4.A03()) {
            if (r4 instanceof C008603r) {
                C008403p r3 = (C008403p) r4;
                try {
                    r3.A05(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        AnonymousClass0VY.A01(r1, th2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(r3);
                        sb.append(" for ");
                        sb.append(this);
                        r1 = new C13190jT(sb.toString(), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0k(r1);
        }
        A0U(th);
    }

    private final void A0N(Throwable th, C15470nO r7) {
        Object A02 = r7.A02();
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C13190jT r1 = null;
        for (C008303o r4 = (C008303o) A02; !AnonymousClass00C.A0J(r4, r7); r4 = r4.A03()) {
            if (r4 instanceof C008503q) {
                C008403p r3 = (C008403p) r4;
                try {
                    r3.A05(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        AnonymousClass0VY.A01(r1, th2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(r3);
                        sb.append(" for ");
                        sb.append(this);
                        r1 = new C13190jT(sb.toString(), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0k(r1);
        }
    }

    private final boolean A0Q() {
        Object A0X;
        do {
            A0X = A0X();
            if (!(A0X instanceof C007903j)) {
                return false;
            }
        } while (A00(A0X) < 0);
        return true;
    }

    private final boolean A0U(Throwable th) {
        if (A0s()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C008103m A0f = A0f();
        if (A0f == null || A0f == C008203n.A00) {
            return z;
        }
        if (A0f.B2n(th) || z) {
            return true;
        }
        return false;
    }

    public final Object A0W() {
        Object A0X = A0X();
        if (!(!(A0X instanceof C007903j))) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(A0X instanceof AnonymousClass0AT)) {
            return C007803i.A01(A0X);
        } else {
            throw ((AnonymousClass0AT) A0X).A00;
        }
    }

    public final Object A0Y(Object obj) {
        Object A03;
        do {
            A03 = A03(A0X(), obj);
            if (A03 == C007803i.A03) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), A0B(obj));
            }
        } while (A03 == C007803i.A04);
        return A03;
    }

    public final Object A0Z(C023509x r3) {
        Object A0X;
        do {
            A0X = A0X();
            if (!(A0X instanceof C007903j)) {
                if (!(A0X instanceof AnonymousClass0AT)) {
                    return C007803i.A01(A0X);
                }
                throw ((AnonymousClass0AT) A0X).A00;
            }
        } while (A00(A0X) < 0);
        return A06(r3);
    }

    public String A0a() {
        return getClass().getSimpleName();
    }

    public CancellationException A0d() {
        CancellationException cancellationException;
        Object A0X = A0X();
        Throwable th = null;
        if (A0X instanceof C12920is) {
            th = ((C12920is) A0X).A03();
        } else if (A0X instanceof AnonymousClass0AT) {
            th = ((AnonymousClass0AT) A0X).A00;
        } else if (A0X instanceof C007903j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(A0X);
            throw new IllegalStateException(sb.toString());
        }
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(A08(A0X));
        return new C13420jq(sb2.toString(), th, this);
    }

    public final void A0o(C008503q r5) {
        Object A0X;
        Object A02;
        C008303o r2;
        Object obj;
        do {
            A0X = A0X();
            if (A0X instanceof C008503q) {
                if (A0X == r5) {
                } else {
                    return;
                }
            } else if ((A0X instanceof C007903j) && ((C007903j) A0X).BDY() != null) {
                do {
                    A02 = r5.A02();
                    if (!(A02 instanceof C06430To) && A02 != r5) {
                        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        r2 = (C008303o) A02;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C008303o.A02;
                        obj = atomicReferenceFieldUpdater.get(r2);
                        if (obj == null) {
                            obj = new C06430To(r2);
                            atomicReferenceFieldUpdater.lazySet(r2, obj);
                        }
                    } else {
                        return;
                    }
                } while (!AnonymousClass0A8.A00(r5, A02, obj, C008303o.A00));
                C008303o.A00(r2);
                return;
            } else {
                return;
            }
        } while (!AnonymousClass0A8.A00(this, A0X, C007803i.A01, A01));
    }

    public final boolean A0t(Object obj) {
        Object A04 = C007803i.A03;
        Object obj2 = A04;
        if (!A0r() || (A04 = A01(obj)) != C007803i.A00) {
            if (A04 == obj2) {
                A04 = A02(obj);
            }
            if (!(A04 == obj2 || A04 == C007803i.A00)) {
                if (A04 == C007803i.A06) {
                    return false;
                }
                A0h(A04);
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0u(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.A0X()
            java.lang.Object r2 = r3.A03(r0, r4)
            X.035 r0 = X.C007803i.A03
            if (r2 != r0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            X.035 r0 = X.C007803i.A00
            r1 = 1
            if (r2 == r0) goto L_0x001e
            X.035 r0 = X.C007803i.A04
            if (r2 == r0) goto L_0x0000
            r3.A0h(r2)
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007503f.A0u(java.lang.Object):boolean");
    }

    public final CancellationException B9P() {
        Object A0X = A0X();
        if (A0X instanceof C12920is) {
            Throwable A03 = ((C12920is) A0X).A03();
            if (A03 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" is cancelling");
                return A0e(sb.toString(), A03);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString());
        } else if (A0X instanceof C007903j) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append(this);
            throw new IllegalStateException(sb3.toString());
        } else if (A0X instanceof AnonymousClass0AT) {
            return A0e((String) null, ((AnonymousClass0AT) A0X).A00);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(getClass().getSimpleName());
            sb4.append(" has completed normally");
            return new C13420jq(sb4.toString(), (Throwable) null, this);
        }
    }

    public final Throwable B9x() {
        Object A0X = A0X();
        if (!(A0X instanceof C007903j)) {
            return A0B(A0X);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public C007403e BF2() {
        C008103m A0f = A0f();
        if (A0f != null) {
            return A0f.BF2();
        }
        return null;
    }

    public final AnonymousClass03l BL5(C006302t r8, boolean z, boolean z2) {
        AnonymousClass0AT r5;
        AnonymousClass03l r3;
        boolean A0T;
        Throwable A03;
        C008503q A0G = A0G(r8, z);
        while (true) {
            Object A0X = A0X();
            if (A0X instanceof C008003k) {
                C008003k r1 = (C008003k) A0X;
                if (r1.A00) {
                    A0T = AnonymousClass0A8.A00(this, A0X, A0G, A01);
                } else {
                    A0O(r1);
                }
            } else {
                Throwable th = null;
                if (A0X instanceof C007903j) {
                    C15470nO BDY = ((C007903j) A0X).BDY();
                    if (BDY != null) {
                        r3 = C008203n.A00;
                        if (z && (A0X instanceof C12920is)) {
                            synchronized (A0X) {
                                C12920is r2 = (C12920is) A0X;
                                A03 = r2.A03();
                                if (A03 != null && (!(r8 instanceof C008703s) || r2.A09())) {
                                    break;
                                } else if (A0T(A0X, A0G, BDY)) {
                                    if (A03 == null) {
                                        return A0G;
                                    }
                                    r3 = A0G;
                                }
                            }
                        } else {
                            A0T = A0T(A0X, A0G, BDY);
                        }
                    } else {
                        AnonymousClass00C.A0E(A0X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A0P((C008503q) A0X);
                    }
                } else {
                    if (z2) {
                        if ((A0X instanceof AnonymousClass0AT) && (r5 = (AnonymousClass0AT) A0X) != null) {
                            th = r5.A00;
                        }
                        r8.invoke(th);
                    }
                    return C008203n.A00;
                }
            }
            if (A0T) {
                return A0G;
            }
        }
        if (z2) {
            r8.invoke(A03);
        }
        return r3;
    }

    public boolean BL7() {
        Object A0X = A0X();
        if (!(A0X instanceof C007903j) || !((C007903j) A0X).BL7()) {
            return false;
        }
        return true;
    }

    public final boolean BLQ() {
        return !(A0X() instanceof C007903j);
    }

    public final Object BNp(C023509x r3) {
        if (!A0Q()) {
            C07570Yj.A04(r3.getContext());
        } else {
            Object A07 = A07(r3);
            if (A07 == AnonymousClass0AO.COROUTINE_SUSPENDED) {
                return A07;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public final boolean BuM() {
        int A002;
        do {
            A002 = A00(A0X());
            if (A002 == 0) {
                return false;
            }
        } while (A002 != 1);
        return true;
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public final boolean isCancelled() {
        Object A0X = A0X();
        if (A0X instanceof AnonymousClass0AT) {
            return true;
        }
        if (!(A0X instanceof C12920is) || !((C12920is) A0X).A08()) {
            return false;
        }
        return true;
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }

    public void A0j(Throwable th) {
        A0t(th);
    }

    public void A0k(Throwable th) {
        throw th;
    }

    public final void A0l(Throwable th) {
        A0t(th);
    }

    public final void A0p(C007503f r1) {
        A0t(r1);
    }

    public final C005902p getKey() {
        return C007403e.A00;
    }
}
