package X;

import android.os.SystemClock;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class A1K implements C160337kq {
    public static final long A0C = TimeUnit.SECONDS.toMillis(5);
    public long A00 = SystemClock.uptimeMillis();
    public C21648ATo A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C160897ll A06;
    public final C192219Gd A07;
    public final SortedSet A08 = new TreeSet();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final boolean A0B;

    public static final C139686kL A00(A1K a1k, C192209Gc r9, AnonymousClass00S r10) {
        C192219Gd r0 = a1k.A07;
        int i = r9.A01;
        int i2 = r9.A00;
        int i3 = a1k.A04;
        return new C139686kL(new A1L(a1k, r10), AnonymousClass5TP.LOW, r0.A00, r0.A01, i, i2, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AU0 B8m(int r15, int r16, int r17) {
        /*
            r14 = this;
            X.7ll r4 = r14.A06
            X.AU0 r6 = r4.B9A(r15)
            r3 = 1
            if (r6 == 0) goto L_0x0081
            boolean r0 = r6.A02()
            if (r0 != r3) goto L_0x0081
            java.util.concurrent.atomic.AtomicBoolean r5 = r14.A0A
            boolean r0 = r5.getAndSet(r3)
            if (r0 != 0) goto L_0x005f
            java.util.SortedSet r4 = r14.A08
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0045
            java.util.Iterator r3 = r4.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            X.AnonymousClass00C.A0B(r0)
            int r0 = r0.intValue()
            if (r0 <= r15) goto L_0x0024
            r1 = r2
        L_0x003b:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0045
            java.lang.Object r1 = r4.first()
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0045:
            r4 = 0
            if (r1 == 0) goto L_0x005c
            X.ATo r3 = r14.A01
            if (r3 == 0) goto L_0x0060
            int r2 = r1.intValue()
            int r0 = r3.A00
            if (r0 != r2) goto L_0x0060
            X.AU0 r0 = r3.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0060
        L_0x005c:
            r5.set(r4)
        L_0x005f:
            return r6
        L_0x0060:
            X.9Gd r0 = r14.A07
            int r13 = r1.intValue()
            X.AkU r11 = new X.AkU
            r11.<init>(r14)
            X.Amw r12 = new X.Amw
            r12.<init>(r14, r1)
            X.5TP r8 = X.AnonymousClass5TP.MEDIUM
            X.6NZ r10 = r0.A01
            X.63p r9 = r0.A00
            X.6kK r7 = new X.6kK
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ThreadPoolExecutor r0 = X.C113695fx.A00
            r0.execute(r7)
            return r6
        L_0x0081:
            int r1 = r14.A05
            int r0 = r14.A04
            if (r1 > r0) goto L_0x00d1
            int r0 = r15 % r1
            if (r0 != r3) goto L_0x00d1
        L_0x008b:
            X.ATo r1 = r14.A01
            if (r1 == 0) goto L_0x00a2
            int r0 = r1.A00
            if (r0 != r15) goto L_0x00a2
            X.AU0 r0 = r1.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00a2
            X.ATo r0 = r14.A01
            if (r0 == 0) goto L_0x00db
            X.AU0 r2 = r0.A01
        L_0x00a1:
            return r2
        L_0x00a2:
            r2 = 0
            r0 = -1
            X.0fb r1 = new X.0fb
            r1.<init>(r15, r2, r0)
            X.AnonymousClass00C.A0D(r1, r2)
            X.0tV r0 = new X.0tV
            r0.<init>(r1, r2)
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00a1
            int r0 = X.C36341k9.A0A(r1)
            X.AU0 r2 = r4.B9A(r0)
            if (r2 == 0) goto L_0x00b9
            boolean r0 = r2.A02()
            if (r0 != r3) goto L_0x00b9
            return r2
        L_0x00d1:
            X.AjL r0 = X.C22258AjL.A00
            r2 = r16
            r1 = r17
            r14.Bm8(r0, r2, r1)
            goto L_0x008b
        L_0x00db:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1K.B8m(int, int, int):X.AU0");
    }

    public void Bho() {
        C21648ATo aTo = this.A01;
        if (aTo != null) {
            aTo.close();
        }
        this.A06.clear();
    }

    public void Bm8(AnonymousClass00S r11, int i, int i2) {
        int i3;
        int i4;
        C139686kL r1;
        if (i > 0 && i2 > 0 && (i3 = this.A03) > 0 && (i4 = this.A02) > 0) {
            C160897ll r7 = this.A06;
            if (!r7.BL9()) {
                AtomicBoolean atomicBoolean = this.A09;
                if (!atomicBoolean.get() && SystemClock.uptimeMillis() >= this.A00) {
                    atomicBoolean.set(true);
                    if (this.A0B && (i < i3 || i2 < i4)) {
                        double d = ((double) i3) / ((double) i4);
                        if (i2 > i) {
                            if (i2 > i4) {
                                i2 = i4;
                            }
                            i4 = i2;
                            i3 = (int) (((double) i2) * d);
                        } else {
                            if (i > i3) {
                                i = i3;
                            }
                            i3 = i;
                            i4 = (int) (((double) i) / d);
                        }
                    }
                    C192209Gc r12 = new C192209Gc(i3, i4);
                    AU0 B9A = r7.B9A(0);
                    if (B9A == null || !B9A.A02()) {
                        C192219Gd r0 = this.A07;
                        int i5 = r12.A01;
                        int i6 = r12.A00;
                        r1 = new C139686kL(new A1M(this, r12, r11), AnonymousClass5TP.HIGH, r0.A00, r0.A01, i5, i6, 1);
                    } else {
                        r1 = A00(this, r12, r11);
                    }
                    C113695fx.A00.execute(r1);
                    return;
                }
            }
            r7.BL9();
        }
    }

    public A1K(C160327kp r4, C160897ll r5, C192219Gd r6, int i, boolean z) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0B = z;
        int frameCount = r4.getFrameCount();
        this.A04 = frameCount;
        B3Z b3z = ((A1E) r4).A00.A06;
        this.A03 = b3z.getWidth();
        this.A02 = b3z.getHeight();
        int ceil = (int) ((float) Math.ceil((double) (((float) i) / ((float) (r4.BDi() / frameCount)))));
        this.A05 = ceil < 2 ? 2 : ceil;
    }

    public void Bm9(C161977nn r2, C160897ll r3, C123025vo r4, AnonymousClass00S r5, int i) {
    }
}
