package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.9ib  reason: invalid class name and case insensitive filesystem */
public final class C200999ib {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass88A A03;
    public C198109cv A04;
    public C006302t A05;
    public C007403e A06;
    public boolean A07;
    public final double A08;
    public final double A09;
    public final double A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final String A0H;
    public final String A0I;
    public final AnonymousClass00T A0J = C36431kI.A1I(new C22044Afr(this));
    public final AnonymousClass00T A0K = C36431kI.A1I(new C22045Afs(this));

    public C200999ib(AnonymousClass88A r3, C198109cv r4, String str, String str2, C006302t r7, double d, double d2, double d3, int i, int i2, int i3, int i4, int i5, long j) {
        AnonymousClass00C.A0D(str, 7);
        AnonymousClass00C.A0D(str2, 8);
        AnonymousClass00C.A0D(r7, 14);
        this.A03 = r3;
        this.A0G = j;
        this.A08 = d;
        this.A0D = i;
        this.A0F = i2;
        this.A0C = i3;
        this.A0I = str;
        this.A0H = str2;
        this.A0A = d2;
        this.A0E = i4;
        this.A09 = d3;
        this.A0B = i5;
        this.A04 = r4;
        this.A05 = r7;
    }

    public static final AnonymousClass88A A00(AnonymousClass9YO r5, C200999ib r6, int i) {
        Object obj;
        int i2 = i;
        AnonymousClass00T r2 = r5.A00;
        Iterator it = C90524aI.A0q(r2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass88B) obj).A04.A00 <= i) {
                break;
            }
        }
        AnonymousClass88B r4 = (AnonymousClass88B) obj;
        if (r4 == null) {
            r4 = (AnonymousClass88B) C007103b.A0N(C90524aI.A0q(r2));
        }
        int i3 = r4.A04.A00;
        if (i < i3) {
            i2 = i3;
        }
        C200159gk r22 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Using Rung: ");
        A0u.append(r4);
        r22.A03("sup:BaseBitrateLadderProvider", AnonymousClass000.A0r(" and bitrate ", A0u, i2));
        AnonymousClass88A A002 = AnonymousClass95E.A00(r4, r5.A04(), i2);
        r6.A00 = r5.A01(i);
        r22.A03("sup:FrameRateAdaptiveVideoConfigHandler", AnonymousClass000.A0l(A002, "checkConfig - Adjusted Video Format = ", AnonymousClass000.A0u()));
        int i4 = A002.A01;
        int i5 = r6.A03.A01;
        if (i4 > i5) {
            r6.A02 += i4 - i5;
        }
        return A002;
    }

    public static final void A01(C200999ib r2) {
        C007403e r1 = r2.A06;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
            r2.A06 = null;
        }
        r2.A00 = ((AnonymousClass9YO) r2.A0J.getValue()).A01(r2.A03.A00);
        r2.A01 = 0;
        r2.A02 = 0;
        C198109cv r22 = r2.A04;
        r22.A00 = 0;
        r22.A02 = Long.MAX_VALUE;
        r22.A01 = Long.MAX_VALUE;
        r22.A06.set(false);
    }
}
