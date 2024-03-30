package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4ig  reason: invalid class name and case insensitive filesystem */
public final class C94724ig extends AnonymousClass6Q4 implements C161687nJ, C161677nI {
    public int A00 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public long A02 = AnonymousClass6TU.A01;
    public Constraints A03;
    public Integer A04 = C023109s.A0C;
    public Object A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public C006302t A0D;
    public boolean A0E;
    public final C1506776e A0F = C1506776e.A02(new C94724ig[16]);
    public final AnonymousClass6Q5 A0G = new C94794in(this);
    public final /* synthetic */ C129056Et A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = r2.A0P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r3 = this;
            r0 = 1
            r3.A09 = r0
            X.6Et r0 = r3.A0H
            X.6gp r0 = r0.A0F
            X.6gp r2 = r0.A0A()
            boolean r0 = r3.A07
            r1 = 0
            if (r0 != 0) goto L_0x003f
            r3.A00()
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x0042
            r2.A0U(r1)
        L_0x001c:
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x003b
            X.6Et r2 = r2.A0P
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x002c
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x003b
        L_0x002c:
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0045
            int r0 = r2.A01
            r3.A00 = r0
            int r0 = r0 + 1
            r2.A01 = r0
        L_0x003b:
            r3.BO2()
            return
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            goto L_0x001c
        L_0x0042:
            r3.A00 = r1
            goto L_0x003b
        L_0x0045:
            java.lang.String r0 = "Place was called on a node which was placed already"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94724ig.A0G():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r8 = r6.A0F;
        r0 = r8.A09();
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BO2() {
        /*
            r10 = this;
            r9 = 1
            r10.A08 = r9
            X.6Q5 r7 = r10.A0G
            r7.A03()
            X.6Et r6 = r10.A0H
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0051
            X.6gp r8 = r6.A0F
            X.76e r0 = r8.A09()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0051
            java.lang.Object[] r4 = r0.A01
            r3 = 0
        L_0x001b:
            r2 = r4[r3]
            X.6gp r2 = (X.C137846gp) r2
            X.6Et r0 = r2.A0P
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x004d
            X.6Et r0 = r2.A0P
            X.4ig r0 = r0.A04
            if (r0 == 0) goto L_0x00a4
            java.lang.Integer r1 = r0.A04
        L_0x002d:
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x004d
            X.6Et r0 = r2.A0P
            X.4ig r2 = r0.A04
            X.AnonymousClass00C.A0B(r2)
            X.4ig r0 = r0.A04
            if (r0 == 0) goto L_0x00a2
            androidx.compose.ui.unit.Constraints r0 = r0.A03
        L_0x003e:
            X.AnonymousClass00C.A0B(r0)
            long r0 = r0.A00
            boolean r0 = r2.A0H(r0)
            if (r0 == 0) goto L_0x004d
            r0 = 0
            r8.A0W(r0, r9)
        L_0x004d:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x001b
        L_0x0051:
            X.4jW r0 = r10.BCj()
            X.4j1 r8 = r0.A00
            X.AnonymousClass00C.A0B(r8)
            boolean r0 = r6.A0C
            r5 = 0
            if (r0 != 0) goto L_0x0067
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0099
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0099
        L_0x0067:
            r6.A0B = r5
            java.lang.Integer r4 = r6.A05
            java.lang.Integer r0 = X.C023109s.A0G
            r6.A05 = r0
            X.6gp r3 = r6.A0F
            X.7mZ r0 = X.C129586Hq.A00(r3)
            r6.A04(r5)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.64f r2 = r0.A0Z
            X.7OR r1 = new X.7OR
            r1.<init>(r10, r6, r8)
            X.6gp r0 = r3.A07
            if (r0 == 0) goto L_0x009f
            X.02t r0 = r2.A04
        L_0x0087:
            r2.A00(r3, r1, r0)
            r6.A05 = r4
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0097
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0097
            r10.requestLayout()
        L_0x0097:
            r6.A0C = r5
        L_0x0099:
            X.AnonymousClass6Q4.A0A(r7)
            r10.A08 = r5
            return
        L_0x009f:
            X.02t r0 = r2.A01
            goto L_0x0087
        L_0x00a2:
            r0 = 0
            goto L_0x003e
        L_0x00a4:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94724ig.BO2():void");
    }

    public C94724ig(C129056Et r3) {
        this.A0H = r3;
        this.A05 = r3.A0G.A08;
    }

    private final void A00() {
        boolean z = this.A07;
        this.A07 = true;
        int i = 0;
        if (!z) {
            C129056Et r1 = this.A0H;
            if (r1.A0D) {
                r1.A0F.A0W(true, true);
            }
        }
        C1506776e A092 = this.A0H.A0F.A09();
        int i2 = A092.A00;
        if (i2 > 0) {
            Object[] objArr = A092.A01;
            do {
                C137846gp r2 = (C137846gp) objArr[i];
                if (r2.A0P.A0G.A03 != Integer.MAX_VALUE) {
                    C129056Et.A00(r2).A00();
                    C137846gp.A07(r2);
                }
                i++;
            } while (i < i2);
        }
    }

    public static final void A01(C94724ig r4) {
        if (r4.A07) {
            int i = 0;
            r4.A07 = false;
            C1506776e A092 = r4.A0H.A0F.A09();
            int i2 = A092.A00;
            if (i2 > 0) {
                Object[] objArr = A092.A01;
                do {
                    A01(C129056Et.A00((C137846gp) objArr[i]));
                    i++;
                } while (i < i2);
            }
        }
    }

    public void A0E(C006302t r8, float f, long j) {
        C006302t r0;
        C129056Et r3 = this.A0H;
        C137846gp r4 = r3.A0F;
        if (!r4.A0H) {
            r3.A05 = C023109s.A0G;
            this.A0B = true;
            this.A09 = false;
            if (j != this.A02) {
                if (r3.A06 || r3.A07) {
                    r3.A0B = true;
                }
                A0F();
            }
            C161327mZ A002 = C129586Hq.A00(r4);
            if (r3.A0B || !this.A07) {
                r3.A03(false);
                this.A0G.A02 = false;
                C1264864f r2 = ((AndroidComposeView) A002).A0Z;
                AnonymousClass7OS r1 = new AnonymousClass7OS(r3, A002, j);
                if (r4.A07 != null) {
                    r0 = r2.A03;
                } else {
                    r0 = r2.A02;
                }
                r2.A00(r4, r1, r0);
            } else {
                C94924j1 A003 = C94744ii.A00(r4);
                long A012 = C109295Xa.A01(j, A003.A02);
                if (A003.A00 != A012) {
                    A003.A00 = A012;
                    C94894iy r12 = A003.A04;
                    C94724ig r02 = r12.A0G.A0P.A04;
                    if (r02 != null) {
                        r02.A0F();
                    }
                    C94744ii.A01(r12);
                }
                A0G();
            }
            this.A02 = j;
            this.A0D = r8;
            r3.A05 = C023109s.A0R;
            return;
        }
        throw AnonymousClass001.A08("place is called on a deactivated node");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0F.A09();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r6 = this;
            X.6Et r1 = r6.A0H
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0034
            X.6gp r0 = r1.A0F
            X.76e r0 = r0.A09()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0034
            java.lang.Object[] r4 = r0.A01
            r3 = 0
        L_0x0013:
            r2 = r4[r3]
            X.6gp r2 = (X.C137846gp) r2
            X.6Et r1 = r2.A0P
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0029
        L_0x0021:
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r2.A0U(r0)
        L_0x0029:
            X.4ig r0 = r1.A04
            if (r0 == 0) goto L_0x0030
            r0.A0F()
        L_0x0030:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94724ig.A0F():void");
    }

    public final boolean A0H(long j) {
        boolean z;
        long A0J;
        C006302t r0;
        Constraints constraints;
        C129056Et r6 = this.A0H;
        C137846gp r5 = r6.A0F;
        if (!r5.A0H) {
            C137846gp A0A2 = r5.A0A();
            if (r5.A0E || (A0A2 != null && A0A2.A0E)) {
                z = true;
            } else {
                z = false;
            }
            r5.A0E = z;
            if (r5.A0P.A0D || (constraints = this.A03) == null || constraints.A00 != j) {
                this.A03 = new Constraints(j);
                A0D(j);
                this.A0G.A03 = false;
                B7X(AnonymousClass7WY.A00);
                if (this.A0E) {
                    A0J = this.A03;
                } else {
                    A0J = C90484aE.A0J(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.A0E = true;
                C94924j1 A0N = r5.A0R.A04.A0N();
                if (A0N != null) {
                    r6.A05 = C023109s.A01;
                    r6.A0D = false;
                    C1264864f r7 = ((AndroidComposeView) C129586Hq.A00(r5)).A0Z;
                    AnonymousClass7NW r1 = new AnonymousClass7NW(r6, j);
                    if (r5.A07 != null) {
                        r0 = r7.A05;
                    } else {
                        r0 = r7.A06;
                    }
                    r7.A00(r5, r1, r0);
                    r6.A0B = true;
                    r6.A0C = true;
                    if (C109265Wx.A00(r5)) {
                        r6.A09 = true;
                        r6.A0A = true;
                    } else {
                        r6.A0E = true;
                    }
                    r6.A05 = C023109s.A0R;
                    long A0J2 = C90484aE.A0J(A0N.A01, A0N.A00);
                    if (this.A03 != A0J2) {
                        this.A03 = A0J2;
                        AnonymousClass6Q4.A09(this);
                    }
                    if (C90494aF.A08(A0J) == A0N.A01 && C90474aD.A03(A0J) == A0N.A00) {
                        return false;
                    }
                    return true;
                }
                throw AnonymousClass001.A09("Lookahead result from lookaheadRemeasure cannot be null");
            }
            C161327mZ r02 = r5.A09;
            if (r02 != null) {
                ((AndroidComposeView) r02).A0Y.A09(r5, true);
            }
            r5.A0O();
            return false;
        }
        throw AnonymousClass001.A08("measure is called on a deactivated node");
    }

    public void B7X(C006302t r5) {
        C1506776e A092 = this.A0H.A0F.A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                r5.invoke(C129056Et.A00((C137846gp) objArr[i2]));
                i2++;
            } while (i2 < i);
        }
    }

    public C94944jW BCj() {
        return this.A0H.A0F.A0R.A06;
    }

    public C161677nI BF3() {
        C129056Et r0;
        C137846gp A0A2 = this.A0H.A0F.A0A();
        if (A0A2 == null || (r0 = A0A2.A0P) == null) {
            return null;
        }
        return r0.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 == X.C023109s.A0G) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6Q4 BPj(long r8) {
        /*
            r7 = this;
            X.6Et r3 = r7.A0H
            X.6gp r5 = r3.A0F
            X.6gp r2 = r5.A0A()
            r1 = 0
            if (r2 == 0) goto L_0x0034
            X.6Et r0 = r2.A0P
            java.lang.Integer r0 = r0.A05
        L_0x000f:
            java.lang.Integer r6 = X.C023109s.A01
            if (r0 == r6) goto L_0x001d
            if (r2 == 0) goto L_0x0019
            X.6Et r0 = r2.A0P
            java.lang.Integer r1 = r0.A05
        L_0x0019:
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0020
        L_0x001d:
            r0 = 0
            r3.A08 = r0
        L_0x0020:
            if (r2 == 0) goto L_0x005b
            java.lang.Integer r0 = r7.A04
            java.lang.Integer r4 = X.C023109s.A0C
            r3 = 1
            if (r0 == r4) goto L_0x0036
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0034:
            r0 = r1
            goto L_0x000f
        L_0x0036:
            X.6Et r0 = r2.A0P
            java.lang.Integer r2 = r0.A05
            int r1 = r2.intValue()
            if (r1 == r3) goto L_0x005f
            r0 = 0
            if (r1 == r0) goto L_0x005f
            r0 = 2
            if (r1 == r0) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r1.append(r0)
            java.lang.String r0 = X.C109255Ww.A00(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x005b:
            java.lang.Integer r6 = X.C023109s.A0C
            r4 = r6
            goto L_0x0061
        L_0x005f:
            java.lang.Integer r6 = X.C023109s.A00
        L_0x0061:
            r7.A04 = r6
            java.lang.Integer r0 = r5.A0D
            if (r0 != r4) goto L_0x006a
            r5.A0E()
        L_0x006a:
            r7.A0H(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94724ig.BPj(long):X.6Q4");
    }

    public void BoL() {
        this.A0H.A0F.A0W(false, true);
    }

    public void requestLayout() {
        this.A0H.A0F.A0U(false);
    }

    public AnonymousClass6Q5 B8S() {
        return this.A0G;
    }

    public boolean BMj() {
        return this.A07;
    }
}
