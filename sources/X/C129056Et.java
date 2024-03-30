package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Et  reason: invalid class name and case insensitive filesystem */
public final class C129056Et {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = Constraints.A01.A01(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public C94724ig A04;
    public Integer A05 = C023109s.A0R;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C137846gp A0F;
    public final C94734ih A0G = new C94734ih(this);
    public final AnonymousClass00S A0H = new AnonymousClass7J8(this);

    public static C94724ig A00(C137846gp r0) {
        C94724ig r02 = r0.A0P.A04;
        AnonymousClass00C.A0B(r02);
        return r02;
    }

    public final void A01() {
        C94734ih r1 = this.A0G;
        if (!(r1.A08 == null && r1.A0O.A0F.A0R.A04.BF4() == null) && r1.A0H) {
            r1.A0H = false;
            r1.A08 = r1.A0O.A0F.A0R.A04.BF4();
            C137846gp A0A2 = this.A0F.A0A();
            if (A0A2 != null) {
                A0A2.A0X(false, true);
            }
        }
        C94724ig r12 = this.A04;
        if (r12 == null) {
            return;
        }
        if (!(r12.A05 == null && C94744ii.A00(r12.A0H.A0F).BF4() == null) && r12.A0A) {
            r12.A0A = false;
            r12.A05 = C94744ii.A00(r12.A0H.A0F).BF4();
            C137846gp r0 = this.A0F;
            boolean A002 = C109265Wx.A00(r0);
            C137846gp A0A3 = r0.A0A();
            if (A002) {
                if (A0A3 != null) {
                    A0A3.A0X(false, true);
                }
            } else if (A0A3 != null) {
                A0A3.A0W(false, true);
            }
        }
    }

    public final void A02(int i) {
        C137846gp A0A2;
        C129056Et r1;
        int i2;
        int i3 = this.A00;
        this.A00 = i;
        boolean z = false;
        boolean A1Q = AnonymousClass000.A1Q(i3);
        if (i == 0) {
            z = true;
        }
        if (A1Q != z && (A0A2 = this.A0F.A0A()) != null && (r1 = A0A2.A0P) != null) {
            int i4 = r1.A00;
            if (i == 0) {
                i2 = i4 - 1;
            } else {
                i2 = i4 + 1;
            }
            r1.A02(i2);
        }
    }

    public final void A03(boolean z) {
        int i;
        if (this.A06 != z) {
            this.A06 = z;
            boolean z2 = this.A07;
            if (z) {
                if (!z2) {
                    i = this.A00 + 1;
                } else {
                    return;
                }
            } else if (!z2) {
                i = this.A00 - 1;
            } else {
                return;
            }
            A02(i);
        }
    }

    public final void A04(boolean z) {
        int i;
        if (this.A07 != z) {
            this.A07 = z;
            boolean z2 = this.A06;
            if (z) {
                if (!z2) {
                    i = this.A00 + 1;
                } else {
                    return;
                }
            } else if (!z2) {
                i = this.A00 - 1;
            } else {
                return;
            }
            A02(i);
        }
    }

    public C129056Et(C137846gp r4) {
        this.A0F = r4;
    }
}
