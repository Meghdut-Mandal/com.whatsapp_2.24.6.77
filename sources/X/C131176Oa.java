package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.6Oa  reason: invalid class name and case insensitive filesystem */
public final class C131176Oa {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public C007403e A0G;
    public boolean A0H;
    public boolean A0I;
    public final C128896Ea A0J;
    public final C128896Ea A0K;
    public final C128896Ea A0L;
    public final C128896Ea A0M;
    public final C128896Ea A0N;
    public final C128896Ea A0O;
    public final C005502l A0P;
    public final C005502l A0Q;

    public static final void A00(C131176Oa r5) {
        r5.A0L.A01();
        r5.A0M.A01();
        r5.A0N.A01();
        r5.A0C = 0;
        r5.A0D = 0;
        r5.A0B = 0;
        r5.A0A = 0;
        r5.A0E = 0;
        C007403e r2 = r5.A0G;
        if (r2 != null && r2.BL7()) {
            r2.B2S((CancellationException) null);
        }
        r5.A0G = null;
        r5.A08 = 0;
        r5.A0H = false;
        r5.A0F = 0;
        r5.A0O.A01();
        r5.A06 = 0;
        r5.A07 = 0;
        r5.A02 = 0;
        r5.A04 = 0;
        r5.A09 = 0;
        r5.A0I = false;
        r5.A00 = 0;
        r5.A01 = 0;
        r5.A03 = 0;
    }

    public final void A01(int i) {
        int i2;
        if (i == -100) {
            i2 = 4;
        } else if (i == -1) {
            i2 = 1;
        } else if (i == 670007) {
            i2 = 16;
        } else if (i != -14) {
            i2 = 2;
            if (i != -13) {
                i2 = 128;
            }
        } else {
            i2 = 8;
        }
        this.A02 |= i2;
        this.A04 = i2;
    }

    public C131176Oa(C128896Ea r1, C128896Ea r2, C128896Ea r3, C128896Ea r4, C128896Ea r5, C128896Ea r6, C005502l r7, C005502l r8) {
        C36321k7.A1B(r7, r1, r2, r8, r3);
        C36321k7.A13(r4, r5, r6);
        this.A0Q = r7;
        this.A0N = r1;
        this.A0K = r2;
        this.A0P = r8;
        this.A0M = r3;
        this.A0L = r4;
        this.A0O = r5;
        this.A0J = r6;
    }
}
