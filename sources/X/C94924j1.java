package X;

import java.util.Map;

/* renamed from: X.4j1  reason: invalid class name and case insensitive filesystem */
public abstract class C94924j1 extends C94744ii implements C161687nJ {
    public long A00 = AnonymousClass6TU.A01;
    public C160287kl A01;
    public Map A02;
    public final C137606gQ A03 = new C137606gQ(this);
    public final C94894iy A04;
    public final Map A05 = C36431kI.A1G();

    public static final void A02(C160287kl r5, C94924j1 r6) {
        long j;
        Map map;
        if (r5 != null) {
            j = C90484aE.A0J(r5.getWidth(), r5.getHeight());
        } else {
            j = 0;
        }
        if (r6.A03 != j) {
            r6.A03 = j;
            AnonymousClass6Q4.A09(r6);
        }
        if (!AnonymousClass00C.A0J(r6.A01, r5) && r5 != null && (((map = r6.A02) != null && !map.isEmpty()) || (!r5.B8T().isEmpty()))) {
            Map B8T = r5.B8T();
            if (!AnonymousClass00C.A0J(B8T, r6.A02)) {
                C129056Et.A00(r6.A04.A0G).A0G.A02();
                Map map2 = r6.A02;
                if (map2 == null) {
                    map2 = C36431kI.A1G();
                    r6.A02 = map2;
                }
                map2.clear();
                map2.putAll(B8T);
            }
        }
        r6.A01 = r5;
    }

    public final void A0E(C006302t r4, float f, long j) {
        if (this.A00 != j) {
            this.A00 = j;
            C94894iy r1 = this.A04;
            C94724ig r0 = r1.A0G.A0P.A04;
            if (r0 != null) {
                r0.A0F();
            }
            C94744ii.A01(r1);
        }
        if (this.A01) {
            return;
        }
        if (this instanceof C94914j0) {
            C129056Et.A00(this.A04.A0G).A0G();
        } else {
            A0H().Bld();
        }
    }

    public final long A0I(C94924j1 r6) {
        long j = AnonymousClass6TU.A01;
        C94924j1 r4 = this;
        while (!AnonymousClass00C.A0J(r4, r6)) {
            j = C109295Xa.A01(j, r4.A00);
            C94894iy r0 = r4.A04.A06;
            AnonymousClass00C.A0B(r0);
            r4 = r0.A0N();
            AnonymousClass00C.A0B(r4);
        }
        return j;
    }

    public float BAy() {
        return this.A04.BAy();
    }

    public float BC0() {
        return this.A04.BC0();
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A04.A0G.A0C;
    }

    public C94924j1(C94894iy r3) {
        this.A04 = r3;
    }
}
