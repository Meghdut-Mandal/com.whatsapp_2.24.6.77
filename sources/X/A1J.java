package X;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class A1J implements C160337kq {
    public int A00;
    public C202539m8 A01;
    public final int A02;
    public final String A03 = String.valueOf(hashCode());
    public final int A04;
    public final int A05;
    public final C160327kp A06;
    public final C192189Ga A07;
    public final C197669c8 A08;
    public final C1263563p A09;
    public final boolean A0A;

    private final C192199Gb A00(int i, int i2) {
        if (!this.A0A) {
            return new C192199Gb(this.A05, this.A04);
        }
        int i3 = this.A05;
        int i4 = this.A04;
        if (i < i3 || i2 < i4) {
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
        return new C192199Gb(i3, i4);
    }

    public static final C202539m8 A01(A1J a1j) {
        C202539m8 r5 = a1j.A01;
        if (r5 == null) {
            C197669c8 r52 = a1j.A08;
            String str = a1j.A03;
            C1263563p r4 = a1j.A09;
            C160327kp r3 = a1j.A06;
            C36321k7.A0v(str, 0, r3);
            ConcurrentHashMap concurrentHashMap = C197669c8.A02;
            synchronized (concurrentHashMap) {
                C192239Gf r0 = (C192239Gf) concurrentHashMap.get(str);
                if (r0 != null) {
                    concurrentHashMap.remove(str);
                    r5 = r0.A00;
                } else {
                    r5 = new C202539m8(r3, new AnonymousClass60E(r52.A00), r4, r52.A01);
                }
            }
            a1j.A01 = r5;
        }
        return r5;
    }

    public void Bm8(AnonymousClass00S r5, int i, int i2) {
        if (i > 0 && i2 > 0 && this.A05 > 0 && this.A04 > 0) {
            C192199Gb A002 = A00(i, i2);
            C202539m8 A012 = A01(this);
            int i3 = A002.A01;
            AnonymousClass00C.A0D(C22259AjM.A00, 2);
            C202539m8.A03(A012, i3, i3);
        }
    }

    public A1J(C160327kp r8, C197669c8 r9, C1263563p r10, boolean z) {
        this.A06 = r8;
        this.A09 = r10;
        this.A08 = r9;
        this.A0A = z;
        B3Z b3z = ((A1E) r8).A00.A06;
        this.A05 = b3z.getWidth();
        this.A04 = b3z.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (r8.BDi() / r8.getFrameCount()));
        int i = (int) (millis < 1 ? 1 : millis);
        this.A02 = i;
        this.A00 = i;
        this.A07 = new C192189Ga(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AU0 B8m(int r12, int r13, int r14) {
        /*
            r11 = this;
            X.9Gb r0 = r11.A00(r13, r14)
            X.9m8 r5 = A01(r11)
            int r7 = r0.A01
            int r6 = r0.A00
            java.util.Map r0 = r5.A02
            java.lang.Object r2 = X.C36371kC.A0r(r0, r12)
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 0
            if (r2 == 0) goto L_0x00cf
            int r8 = r2.intValue()
            r5.A00 = r8
            java.util.concurrent.ConcurrentHashMap r0 = r5.A09
            java.lang.Object r0 = r0.get(r2)
            X.AU0 r0 = (X.AU0) r0
            if (r0 == 0) goto L_0x00bf
            X.AU0 r4 = r0.A00()
            if (r4 == 0) goto L_0x00bf
            X.9CE r3 = r5.A06
            java.util.List r0 = r5.A01
            boolean r0 = r0.isEmpty()
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x00af
            int r0 = r5.A04
            float r0 = (float) r0
            float r0 = r0 * r1
            int r10 = (int) r0
        L_0x003e:
            int r1 = r5.A04
            r0 = 0
            X.0mZ r1 = X.C15040mb.A05(r0, r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x008d
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008d
        L_0x0052:
            X.8yj r0 = X.C187908yj.SUCCESS
            X.9Ge r5 = new X.9Ge
            r5.<init>(r4, r0)
        L_0x0059:
            X.9Ga r4 = r11.A07
            java.util.concurrent.atomic.AtomicInteger r0 = X.C197109b9.A05
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            java.util.concurrent.ConcurrentHashMap r2 = X.C197109b9.A02
            boolean r0 = r2.contains(r4)
            if (r0 != 0) goto L_0x0074
            int r0 = r4.A00
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            X.C36341k9.A1K(r4, r2, r0)
        L_0x0074:
            X.8yj r0 = r5.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x008a
            r0 = 1
            if (r1 == r0) goto L_0x0087
            java.util.concurrent.atomic.AtomicInteger r0 = X.C197109b9.A03
        L_0x0081:
            r0.incrementAndGet()
            X.AU0 r0 = r5.A00
            return r0
        L_0x0087:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C197109b9.A04
            goto L_0x0081
        L_0x008a:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C197109b9.A05
            goto L_0x0081
        L_0x008d:
            java.util.Iterator r9 = r1.iterator()
        L_0x0091:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0052
            int r2 = X.C165617ti.A05(r9)
            int r2 = r2 + r10
            int r1 = r3.A00
            int r2 = r2 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00ad
        L_0x00a7:
            if (r2 != r8) goto L_0x0091
            X.C202539m8.A03(r5, r7, r6)
            goto L_0x0052
        L_0x00ad:
            int r2 = r2 + r1
            goto L_0x00a7
        L_0x00af:
            java.util.List r0 = r5.A01
            int r0 = r0.size()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            java.util.List r0 = r5.A01
            int r10 = X.C36351kA.A06(r0, r1)
            goto L_0x003e
        L_0x00bf:
            X.C202539m8.A03(r5, r7, r6)
            X.ATp r0 = X.C202539m8.A02(r5, r8)
            if (r0 == 0) goto L_0x00e8
            X.AU0 r0 = r0.A01
            X.AU0 r1 = r0.A00()
            goto L_0x00dd
        L_0x00cf:
            X.ATp r0 = X.C202539m8.A02(r5, r12)
            if (r0 == 0) goto L_0x00db
            X.AU0 r0 = r0.A01
            X.AU0 r1 = r0.A00()
        L_0x00db:
            r5.A00 = r12
        L_0x00dd:
            if (r1 == 0) goto L_0x00e8
            X.8yj r0 = X.C187908yj.NEAREST
        L_0x00e1:
            X.9Ge r5 = new X.9Ge
            r5.<init>(r1, r0)
            goto L_0x0059
        L_0x00e8:
            X.8yj r0 = X.C187908yj.MISSING
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1J.B8m(int, int, int):X.AU0");
    }

    public void Bho() {
        Integer num;
        C202539m8 A012 = A01(this);
        C21649ATp A022 = C202539m8.A02(A012, A012.A00);
        ConcurrentHashMap concurrentHashMap = A012.A09;
        Set keySet = concurrentHashMap.keySet();
        AnonymousClass00C.A08(keySet);
        if (A022 != null) {
            num = Integer.valueOf(A022.A00);
        } else {
            num = null;
        }
        for (Object next : C007103b.A0V(C13640kC.A06(num, keySet))) {
            AU0 au0 = (AU0) concurrentHashMap.get(next);
            if (au0 != null) {
                au0.close();
            }
            concurrentHashMap.remove(next);
        }
        C202539m8 A013 = A01(this);
        String str = this.A03;
        AnonymousClass00C.A0D(str, 0);
        C197669c8.A02.put(str, new C192239Gf(A013, new Date()));
        this.A01 = null;
    }

    public void Bm9(C161977nn r2, C160897ll r3, C123025vo r4, AnonymousClass00S r5, int i) {
    }
}
