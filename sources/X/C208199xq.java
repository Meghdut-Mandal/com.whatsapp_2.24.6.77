package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9xq  reason: invalid class name and case insensitive filesystem */
public abstract class C208199xq implements C157127bs {
    public C22770Avg A00;
    public Object A01;
    public final AnonymousClass9YC A02;
    public final List A03 = AnonymousClass001.A0I();
    public final List A04 = AnonymousClass001.A0I();

    public static final void A00(C22770Avg avg, C208199xq r9, Object obj) {
        List list = r9.A04;
        if (!list.isEmpty() && avg != null) {
            if (obj == null || r9.A02(obj)) {
                C208209xr r8 = (C208209xr) avg;
                synchronized (r8.A01) {
                    B0S b0s = r8.A00;
                    if (b0s != null) {
                        b0s.BR3(list);
                    }
                }
                return;
            }
            C208209xr r82 = (C208209xr) avg;
            synchronized (r82.A01) {
                ArrayList<AnonymousClass6QA> A0I = AnonymousClass001.A0I();
                for (Object next : list) {
                    if (r82.A00(((AnonymousClass6QA) next).A0J)) {
                        A0I.add(next);
                    }
                }
                for (AnonymousClass6QA A0l : A0I) {
                    AnonymousClass6VD.A00().A04(AnonymousClass98H.A00, AnonymousClass000.A0l(A0l, "Constraints met for ", AnonymousClass000.A0u()));
                }
                B0S b0s2 = r82.A00;
                if (b0s2 != null) {
                    b0s2.BR2(A0I);
                }
            }
        }
    }

    public boolean A01(AnonymousClass6QA r3) {
        if (this instanceof C1683280e) {
            AnonymousClass00C.A0D(r3, 0);
            return r3.A09.A07;
        } else if (this instanceof C1683480g) {
            AnonymousClass00C.A0D(r3, 0);
            return C36361kB.A1a(r3.A09.A02, C023109s.A0G);
        } else if (this instanceof C1683380f) {
            AnonymousClass00C.A0D(r3, 0);
            return C36361kB.A1a(r3.A09.A02, C023109s.A0R);
        } else if (this instanceof C1683080c) {
            AnonymousClass00C.A0D(r3, 0);
            return C36361kB.A1a(r3.A09.A02, C023109s.A01);
        } else {
            boolean z = this instanceof C1682980b;
            AnonymousClass00C.A0D(r3, 0);
            C132316Tb r0 = r3.A09;
            if (z) {
                return r0.A04;
            }
            return r0.A05;
        }
    }

    public boolean A02(Object obj) {
        if (this instanceof C1683280e) {
            return !AnonymousClass000.A1X(obj);
        }
        if (!(this instanceof C1683180d)) {
            return !AnonymousClass000.A1X(obj);
        }
        AnonymousClass9WR r3 = (AnonymousClass9WR) obj;
        AnonymousClass00C.A0D(r3, 0);
        if (!r3.A00 || r3.A01) {
            return true;
        }
        return false;
    }

    public C208199xq(AnonymousClass9YC r2) {
        this.A02 = r2;
    }
}
