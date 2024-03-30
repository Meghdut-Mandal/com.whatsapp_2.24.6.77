package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* renamed from: X.4ih  reason: invalid class name and case insensitive filesystem */
public final class C94734ih extends AnonymousClass6Q4 implements C161687nJ, C161677nI {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public long A05;
    public long A06;
    public Integer A07 = C023109s.A0C;
    public Object A08;
    public C006302t A09;
    public C006302t A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnonymousClass6Q5 A0K;
    public final C1506776e A0L;
    public final AnonymousClass00S A0M;
    public final AnonymousClass00S A0N;
    public final /* synthetic */ C129056Et A0O;

    public void A0E(C006302t r5, float f, long j) {
        this.A0D = true;
        if (j != this.A05) {
            C129056Et r1 = this.A0O;
            if (r1.A06 || r1.A07) {
                r1.A09 = true;
            }
            A0G();
        }
        C129056Et r3 = this.A0O;
        C137846gp r12 = r3.A0F;
        if (C109265Wx.A00(r12)) {
            C94894iy r0 = r12.A0R.A04.A06;
            if (r0 == null || r0.A02 == null) {
                C129586Hq.A00(r12).getPlacementScope();
            }
            C94724ig r2 = r3.A04;
            AnonymousClass00C.A0B(r2);
            C137846gp A0A2 = r12.A0A();
            if (A0A2 != null) {
                A0A2.A0P.A01 = 0;
            }
            r2.A00 = Integer.MAX_VALUE;
            AnonymousClass6WO.A01(r2, C90494aF.A08(j), C90474aD.A03(j));
        }
        C94724ig r02 = r3.A04;
        if (r02 == null || r02.A0B) {
            A02(this, r5, f, j);
            return;
        }
        throw AnonymousClass001.A08("Error: Placement happened before lookahead.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r5 = this;
            r0 = 1
            r5.A0G = r0
            X.6Et r0 = r5.A0O
            X.6gp r1 = r0.A0F
            X.6gp r4 = r1.A0A()
            X.4jW r0 = r5.BCj()
            float r3 = r0.A00
            X.6XQ r0 = r1.A0R
            X.4iy r2 = r0.A04
            X.4jW r1 = r0.A06
        L_0x0017:
            if (r2 == r1) goto L_0x0024
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.AnonymousClass00C.A0E(r2, r0)
            float r0 = r2.A00
            float r3 = r3 + r0
            X.4iy r2 = r2.A05
            goto L_0x0017
        L_0x0024:
            float r0 = r5.A02
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            r5.A02 = r3
            if (r4 == 0) goto L_0x0035
            r4.A0L()
            r4.A0G()
        L_0x0035:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x003e
            r4.A0G()
        L_0x003e:
            r5.A00()
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x006c
            r4.A0V(r1)
        L_0x004a:
            boolean r0 = r5.A0J
            if (r0 != 0) goto L_0x0065
            X.6Et r2 = r4.A0P
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0065
            int r1 = r5.A03
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x006f
            int r0 = r2.A02
            r5.A03 = r0
            int r0 = r0 + 1
            r2.A02 = r0
        L_0x0065:
            r5.BO2()
            return
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x004a
        L_0x006c:
            r5.A03 = r1
            goto L_0x0065
        L_0x006f:
            java.lang.String r0 = "Place was called on a node which was placed already"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94734ih.A0H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r8 = r6.A0F;
        r0 = r8.A09();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BO2() {
        /*
            r10 = this;
            r0 = 1
            r10.A0E = r0
            X.6Q5 r7 = r10.A0K
            r7.A03()
            X.6Et r6 = r10.A0O
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x004b
            X.6gp r8 = r6.A0F
            X.76e r0 = r8.A09()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x004b
            java.lang.Object[] r4 = r0.A01
            r3 = 0
        L_0x001b:
            r9 = r4[r3]
            X.6gp r9 = (X.C137846gp) r9
            X.6Et r0 = r9.A0P
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0047
            X.6Et r0 = r9.A0P
            X.4ih r0 = r0.A0G
            java.lang.Integer r1 = r0.A07
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x0047
            X.6Et r0 = r9.A0P
            X.4ih r1 = r0.A0G
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0091
            long r1 = r1.A04
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r0.<init>(r1)
        L_0x003e:
            boolean r0 = r9.A0Y(r0)
            if (r0 == 0) goto L_0x0047
            X.C137846gp.A03(r8)
        L_0x0047:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x001b
        L_0x004b:
            boolean r0 = r6.A0A
            r5 = 0
            if (r0 != 0) goto L_0x005c
            X.4jW r0 = r10.BCj()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x008b
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x008b
        L_0x005c:
            r6.A09 = r5
            java.lang.Integer r4 = r6.A05
            java.lang.Integer r0 = X.C023109s.A0C
            r6.A05 = r0
            r6.A04(r5)
            X.6gp r3 = r6.A0F
            X.7mZ r0 = X.C129586Hq.A00(r3)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.64f r2 = r0.A0Z
            X.00S r1 = r10.A0M
            X.02t r0 = r2.A01
            r2.A00(r3, r1, r0)
            r6.A05 = r4
            X.4jW r0 = r10.BCj()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0089
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0089
            r10.requestLayout()
        L_0x0089:
            r6.A0A = r5
        L_0x008b:
            X.AnonymousClass6Q4.A0A(r7)
            r10.A0E = r5
            return
        L_0x0091:
            r0 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94734ih.BO2():void");
    }

    public C94734ih(C129056Et r5) {
        this.A0O = r5;
        long j = AnonymousClass6TU.A01;
        this.A05 = j;
        this.A0H = true;
        this.A0K = new C94784im(this);
        this.A0L = C1506776e.A02(new C94734ih[16]);
        this.A0B = true;
        this.A0M = new AnonymousClass7J7(this);
        this.A06 = j;
        this.A0N = new AnonymousClass7NV(this, r5);
    }

    private final void A00() {
        boolean z = this.A0C;
        this.A0C = true;
        C137846gp r3 = this.A0O.A0F;
        int i = 0;
        if (!z) {
            C129056Et r1 = r3.A0P;
            if (r1.A0E) {
                r3.A0X(true, true);
            } else if (r1.A0D) {
                r3.A0W(true, true);
            }
        }
        AnonymousClass6XQ r0 = r3.A0R;
        C94894iy r2 = r0.A04;
        C94894iy r12 = r0.A06.A05;
        while (!AnonymousClass00C.A0J(r2, r12) && r2 != null) {
            if (r2.A0B) {
                r2.A0P();
            }
            r2 = r2.A05;
        }
        C1506776e A092 = r3.A09();
        int i2 = A092.A00;
        if (i2 > 0) {
            Object[] objArr = A092.A01;
            do {
                C137846gp r22 = (C137846gp) objArr[i];
                if (r22.A0P.A0G.A03 != Integer.MAX_VALUE) {
                    r22.A0P.A0G.A00();
                    C137846gp.A07(r22);
                }
                i++;
            } while (i < i2);
        }
    }

    public static final void A01(C94734ih r4) {
        if (r4.A0C) {
            int i = 0;
            r4.A0C = false;
            C1506776e A092 = r4.A0O.A0F.A09();
            int i2 = A092.A00;
            if (i2 > 0) {
                Object[] objArr = A092.A01;
                do {
                    A01(((C137846gp) objArr[i]).A0P.A0G);
                    i++;
                } while (i < i2);
            }
        }
    }

    public static final void A02(C94734ih r5, C006302t r6, float f, long j) {
        C129056Et r3 = r5.A0O;
        C137846gp r4 = r3.A0F;
        if (!r4.A0H) {
            r3.A05 = C023109s.A0C;
            r5.A05 = j;
            r5.A00 = f;
            r5.A09 = r6;
            r5.A0I = true;
            r5.A0G = false;
            C161327mZ A002 = C129586Hq.A00(r4);
            if (r3.A09 || !r5.A0C) {
                r5.A0K.A02 = false;
                r3.A03(false);
                r5.A0A = r6;
                r5.A06 = j;
                r5.A01 = f;
                C1264864f r2 = ((AndroidComposeView) A002).A0Z;
                r2.A00(r4, r5.A0N, r2.A02);
                r5.A0A = null;
            } else {
                C94894iy r22 = r4.A0R.A04;
                C94894iy.A07(r22, r6, f, C109295Xa.A01(j, r22.A02));
                r5.A0H();
            }
            r3.A05 = C023109s.A0R;
            return;
        }
        throw AnonymousClass001.A08("place is called on a deactivated node");
    }

    public final List A0F() {
        C137846gp r8 = this.A0O.A0F;
        r8.A0P();
        if (!this.A0B) {
            return this.A0L.A05();
        }
        C1506776e r7 = this.A0L;
        C1506776e A092 = r8.A09();
        int i = A092.A00;
        if (i > 0) {
            Object[] objArr = A092.A01;
            int i2 = 0;
            do {
                int i3 = r7.A00;
                C94734ih r1 = ((C137846gp) objArr[i2]).A0P.A0G;
                if (i3 <= i2) {
                    r7.A0D(r1);
                } else {
                    r7.A01[i2] = r1;
                }
                i2++;
            } while (i2 < i);
        }
        r7.A08(C1506776e.A00(r8.A09()), r7.A00);
        this.A0B = false;
        return r7.A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0F.A09();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r6 = this;
            X.6Et r1 = r6.A0O
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0032
            X.6gp r0 = r1.A0F
            X.76e r0 = r0.A09()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0032
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
            r2.A0V(r0)
        L_0x0029:
            X.4ih r0 = r1.A0G
            r0.A0G()
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94734ih.A0G():void");
    }

    public final boolean A0I(long j) {
        boolean z;
        C129056Et r9 = this.A0O;
        C137846gp r10 = r9.A0F;
        boolean z2 = true;
        if (!r10.A0H) {
            C161327mZ A002 = C129586Hq.A00(r10);
            C137846gp A0A2 = r10.A0A();
            if (r10.A0E || (A0A2 != null && A0A2.A0E)) {
                z = true;
            } else {
                z = false;
            }
            r10.A0E = z;
            if (r10.A0P.A0E || this.A04 != j) {
                this.A0K.A03 = false;
                B7X(C155437Wb.A00);
                this.A0F = true;
                AnonymousClass6XQ r8 = r10.A0R;
                long j2 = r8.A04.A03;
                A0D(j);
                Integer num = r9.A05;
                Integer num2 = C023109s.A0R;
                if (num == num2) {
                    Integer num3 = C023109s.A00;
                    r9.A05 = num3;
                    r9.A0E = false;
                    r9.A03 = j;
                    C1264864f r2 = ((AndroidComposeView) C129586Hq.A00(r10)).A0Z;
                    r2.A00(r10, r9.A0H, r2.A06);
                    if (r9.A05 == num3) {
                        r9.A09 = true;
                        r9.A0A = true;
                        r9.A05 = num2;
                    }
                    C94894iy r6 = r8.A04;
                    if (r6.A03 == j2 && r6.A01 == this.A01 && r6.A00 == this.A00) {
                        z2 = false;
                    }
                    long A0J2 = C90484aE.A0J(r6.A01, r6.A00);
                    if (this.A03 != A0J2) {
                        this.A03 = A0J2;
                        AnonymousClass6Q4.A09(this);
                    }
                    return z2;
                }
                throw AnonymousClass001.A09("layout state is not idle before measure starts");
            }
            ((AndroidComposeView) A002).A0Y.A09(r10, false);
            r10.A0O();
            return false;
        }
        throw AnonymousClass001.A08("measure is called on a deactivated node");
    }

    public void B7X(C006302t r5) {
        C1506776e A092 = this.A0O.A0F.A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                r5.invoke(((C137846gp) objArr[i2]).A0P.A0G);
                i2++;
            } while (i2 < i);
        }
    }

    public C94944jW BCj() {
        return this.A0O.A0F.A0R.A06;
    }

    public C161677nI BF3() {
        C129056Et r0;
        C137846gp A0A2 = this.A0O.A0F.A0A();
        if (A0A2 == null || (r0 = A0A2.A0P) == null) {
            return null;
        }
        return r0.A0G;
    }

    public AnonymousClass6Q4 BPj(long j) {
        C129056Et r1 = this.A0O;
        C137846gp r4 = r1.A0F;
        Integer num = r4.A0D;
        Integer num2 = C023109s.A0C;
        if (num == num2) {
            r4.A0E();
        }
        if (C109265Wx.A00(r4)) {
            C94724ig r0 = r1.A04;
            AnonymousClass00C.A0B(r0);
            r0.A04 = num2;
            r0.BPj(j);
        }
        C137846gp A0A2 = r4.A0A();
        if (A0A2 != null) {
            if (this.A07 == num2 || r4.A0E) {
                Integer num3 = A0A2.A0P.A05;
                int intValue = num3.intValue();
                if (intValue == 0) {
                    num2 = C023109s.A00;
                } else if (intValue == 2) {
                    num2 = C023109s.A01;
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    throw AnonymousClass000.A0g(C109255Ww.A00(num3), A0u);
                }
            } else {
                throw AnonymousClass001.A09("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
        }
        this.A07 = num2;
        A0I(j);
        return this;
    }

    public void BoL() {
        C137846gp.A03(this.A0O.A0F);
    }

    public void requestLayout() {
        this.A0O.A0F.A0V(false);
    }

    public AnonymousClass6Q5 B8S() {
        return this.A0K;
    }

    public boolean BMj() {
        return this.A0C;
    }
}
