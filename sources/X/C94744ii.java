package X;

import java.util.Map;

/* renamed from: X.4ii  reason: invalid class name and case insensitive filesystem */
public abstract class C94744ii extends AnonymousClass6Q4 implements C161717nM {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass6WO A02 = new C94704ie(this);

    public final int A0G(AnonymousClass5h8 r4) {
        boolean A1V;
        int A0F;
        if (this instanceof C94894iy) {
            A1V = AnonymousClass000.A1V(((C94894iy) this).A03);
        } else {
            A1V = AnonymousClass000.A1V(((C94924j1) this).A01);
        }
        if (!A1V || (A0F = A0F(r4)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return A0F + C90474aD.A03(this.A02);
    }

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvh(long j) {
        return AnonymousClass6GH.A00(this, j);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    public static C94924j1 A00(C137846gp r0) {
        C94924j1 A0N = r0.A0R.A04.A0N();
        AnonymousClass00C.A0B(A0N);
        return A0N;
    }

    public static final void A01(C94894iy r2) {
        C137846gp r1;
        AnonymousClass6Q5 B8S;
        C94894iy r0 = r2.A05;
        if (r0 != null) {
            r1 = r0.A0G;
        } else {
            r1 = null;
        }
        C137846gp r02 = r2.A0G;
        boolean A0J = AnonymousClass00C.A0J(r1, r02);
        C94734ih r03 = r02.A0P.A0G;
        if (!A0J) {
            B8S = r03.A0K;
        } else {
            C161677nI BF3 = r03.BF3();
            if (BF3 == null || (B8S = BF3.B8S()) == null) {
                return;
            }
        }
        B8S.A02();
    }

    public int A0F(AnonymousClass5h8 r8) {
        int i;
        Integer valueOf;
        Map map;
        Number A0b;
        if (this instanceof C94934jV) {
            C94934jV r1 = (C94934jV) this;
            C94924j1 r0 = r1.A01;
            if (r0 == null) {
                return C109235Wu.A00(r8, r1);
            }
            A0b = C90524aI.A0b(r8, r0.A05);
            if (A0b == null) {
                return Integer.MIN_VALUE;
            }
        } else if (this instanceof C94944jW) {
            C94944jW r12 = (C94944jW) this;
            C94924j1 r02 = r12.A00;
            if (r02 != null) {
                return r02.A0F(r8);
            }
            C94734ih r5 = r12.A0G.A0P.A0G;
            C129056Et r4 = r5.A0O;
            Integer num = r4.A05;
            Integer num2 = C023109s.A00;
            AnonymousClass6Q5 r2 = r5.A0K;
            if (num == num2) {
                r2.A03 = true;
                if (r2.A01) {
                    r4.A09 = true;
                    r4.A0A = true;
                }
            } else {
                r2.A02 = true;
            }
            C94944jW BCj = r5.BCj();
            BCj.A00 = true;
            r5.BO2();
            BCj.A00 = false;
            A0b = C90524aI.A0b(r8, r2.A05);
            if (A0b == null) {
                return Integer.MIN_VALUE;
            }
        } else {
            if (this instanceof C94904iz) {
                C94924j1 r03 = (C94924j1) this;
                i = C109235Wu.A00(r8, r03);
                valueOf = Integer.valueOf(i);
                map = r03.A05;
            } else {
                C94924j1 r42 = (C94924j1) this;
                C94724ig A002 = C129056Et.A00(r42.A04.A0G);
                C129056Et r52 = A002.A0H;
                Integer num3 = r52.A05;
                Integer num4 = C023109s.A01;
                AnonymousClass6Q5 r3 = A002.A0G;
                if (num3 == num4) {
                    r3.A03 = true;
                    if (r3.A01) {
                        r52.A0B = true;
                        r52.A0C = true;
                    }
                } else {
                    r3.A02 = true;
                }
                C94944jW BCj2 = A002.BCj();
                C94924j1 r13 = BCj2.A00;
                if (r13 != null) {
                    r13.A00 = true;
                }
                A002.BO2();
                C94924j1 r14 = BCj2.A00;
                if (r14 != null) {
                    r14.A00 = false;
                }
                Number A0b2 = C90524aI.A0b(r8, r3.A05);
                if (A0b2 != null) {
                    i = A0b2.intValue();
                } else {
                    i = Integer.MIN_VALUE;
                }
                valueOf = Integer.valueOf(i);
                map = r42.A05;
            }
            map.put(r8, valueOf);
            return i;
        }
        return A0b.intValue();
    }

    public C160287kl A0H() {
        C160287kl r0;
        if (this instanceof C94894iy) {
            r0 = ((C94894iy) this).A03;
            if (r0 == null) {
                throw AnonymousClass001.A09("Asking for measurement result of unmeasured layout modifier");
            }
        } else {
            r0 = ((C94924j1) this).A01;
            if (r0 == null) {
                throw AnonymousClass001.A09("LookaheadDelegate has not been measured yet when measureResult is requested.");
            }
        }
        return r0;
    }

    public boolean BMI() {
        if (this instanceof C94924j1) {
            return true;
        }
        return false;
    }

    public C160287kl BO0(Map map, C006302t r4, int i, int i2) {
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new C137726gc(this, map, r4, i, i2);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Size(");
        A0u.append(i);
        A0u.append(" x ");
        A0u.append(i2);
        throw AnonymousClass000.A0g(") is out of range. Each dimension must be between 0 and 16777215.", A0u);
    }

    public /* synthetic */ float Bvi(float f) {
        return f / BAy();
    }

    public /* synthetic */ float Bvq(float f) {
        return f * BAy();
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6GH.A01(this, f / BAy());
    }
}
