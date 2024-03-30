package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0iv  reason: invalid class name and case insensitive filesystem */
public final class C12950iv implements AnonymousClass0AQ {
    public Object A00 = AnonymousClass0SC.A0D;
    public AnonymousClass0AR A01;
    public final /* synthetic */ C12960iw A02;

    public C12950iv(C12960iw r2) {
        this.A02 = r2;
    }

    public Object A00() {
        Object obj = this.A00;
        AnonymousClass035 r0 = AnonymousClass0SC.A0D;
        if (obj != r0) {
            this.A00 = r0;
            if (obj != AnonymousClass0SC.A04) {
                return obj;
            }
            Throwable A04 = C12960iw.A04(this.A02);
            StackTraceElement stackTraceElement = C05820Re.A00;
            throw A04;
        }
        throw AnonymousClass001.A09("`hasNext()` has not been invoked");
    }

    public Object A01(C023509x r33) {
        boolean z;
        boolean z2;
        boolean r0;
        C12960iw r7 = this.A02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12960iw.A08;
        C15560nX A0K = AnonymousClass001.A0K(r7, atomicReferenceFieldUpdater);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = C12960iw.A04;
            if (C12960iw.A0G(r7, atomicLongFieldUpdater.get(r7), true)) {
                this.A00 = AnonymousClass0SC.A04;
                Throwable th = (Throwable) C12960iw.A05.get(r7);
                if (th == null) {
                    z = false;
                } else {
                    StackTraceElement stackTraceElement = C05820Re.A00;
                    throw th;
                }
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = C12960iw.A03;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r7);
                long j = (long) AnonymousClass0SC.A01;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (A0K.A00 != j2) {
                    C15560nX A06 = C12960iw.A06(r7, A0K, j2);
                    if (A06 != null) {
                        A0K = A06;
                    } else {
                        continue;
                    }
                }
                C12960iw r21 = r7;
                Object A012 = C12960iw.A01((Object) null, r21, A0K, i, andIncrement);
                AnonymousClass035 r11 = AnonymousClass0SC.A0H;
                if (A012 != r11) {
                    AnonymousClass035 r10 = AnonymousClass0SC.A08;
                    if (A012 != r10) {
                        AnonymousClass035 r15 = AnonymousClass0SC.A0I;
                        if (A012 == r15) {
                            AnonymousClass0AR A002 = C05710Qt.A00(AnonymousClass0AA.A01(r33));
                            try {
                                this.A01 = A002;
                                Object A013 = C12960iw.A01(this, r7, A0K, i, andIncrement);
                                if (A013 == r11) {
                                    BL2(A0K, i);
                                } else {
                                    C12950iv r13 = null;
                                    if (A013 == r10) {
                                        if (andIncrement < r7.A0H()) {
                                            A0K.A01();
                                        }
                                        C15560nX A0K2 = AnonymousClass001.A0K(r7, atomicReferenceFieldUpdater);
                                        while (true) {
                                            if (C12960iw.A0G(r7, atomicLongFieldUpdater.get(r7), true)) {
                                                AnonymousClass0AR r2 = this.A01;
                                                AnonymousClass00C.A0B(r2);
                                                this.A01 = null;
                                                this.A00 = AnonymousClass0SC.A04;
                                                Throwable th2 = (Throwable) C12960iw.A05.get(r7);
                                                if (th2 == null) {
                                                    r0 = false;
                                                } else {
                                                    r0 = new AnonymousClass03N(th2);
                                                }
                                                r2.resumeWith(r0);
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(r7);
                                                long j3 = andIncrement2 / j;
                                                int i2 = (int) (andIncrement2 % j);
                                                if (A0K2.A00 != j3) {
                                                    C15560nX A062 = C12960iw.A06(r7, A0K2, j3);
                                                    if (A062 != null) {
                                                        A0K2 = A062;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                Object A014 = C12960iw.A01(this, r21, A0K2, i2, andIncrement2);
                                                if (A014 == r11) {
                                                    if (this instanceof AnonymousClass0AQ) {
                                                        r13 = this;
                                                    }
                                                    if (r13 != null) {
                                                        r13.BL2(A0K2, i2);
                                                    }
                                                } else if (A014 == r10) {
                                                    if (andIncrement2 < r7.A0H()) {
                                                        A0K2.A01();
                                                    }
                                                } else if (A014 != r15) {
                                                    A0K2.A01();
                                                    this.A00 = A014;
                                                    this.A01 = null;
                                                    z2 = true;
                                                } else {
                                                    throw AnonymousClass001.A09("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        A0K.A01();
                                        this.A00 = A013;
                                        this.A01 = null;
                                        z2 = true;
                                    }
                                    A002.Bol((C006302t) null, z2);
                                }
                                return A002.A0G();
                            } catch (Throwable th3) {
                                A002.A0L();
                                throw th3;
                            }
                        } else {
                            A0K.A01();
                            this.A00 = A012;
                            z = true;
                        }
                    } else if (andIncrement < r7.A0H()) {
                        A0K.A01();
                    }
                } else {
                    throw AnonymousClass001.A09("unreachable");
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public void BL2(C15460nN r2, int i) {
        AnonymousClass0AR r0 = this.A01;
        if (r0 != null) {
            r0.BL2(r2, i);
        }
    }
}
