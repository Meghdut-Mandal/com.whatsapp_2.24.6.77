package X;

/* renamed from: X.6gl  reason: invalid class name and case insensitive filesystem */
public final class C137806gl implements C159877k4 {
    public final /* synthetic */ C136906fE A00;
    public final /* synthetic */ Object A01;

    public C137806gl(C136906fE r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public int BFx() {
        C137846gp r0 = (C137846gp) this.A00.A0B.get(this.A01);
        if (r0 != null) {
            return C1506776e.A00(r0.A09());
        }
        return 0;
    }

    public void Bm3(int i, long j) {
        C136906fE r4 = this.A00;
        C137846gp r3 = (C137846gp) r4.A0B.get(this.A01);
        if (r3 != null && r3.A09 != null) {
            int A002 = C1506776e.A00(r3.A09());
            if (i < 0 || i >= A002) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Index (");
                A0u.append(i);
                A0u.append(") is out of bound of [0, ");
                throw new IndexOutOfBoundsException(C36321k7.A0G(A0u, A002));
            } else if (!r3.A0P.A0G.A0C) {
                C137846gp r2 = r4.A09;
                r2.A0F = true;
                C129586Hq.A00(r3).BPl((C137846gp) r3.A09().A05().get(i), j);
                r2.A0F = false;
            } else {
                throw AnonymousClass001.A08("Pre-measure called on node that is not placed");
            }
        }
    }

    public void dispose() {
        C136906fE r5 = this.A00;
        r5.A04();
        Object remove = r5.A0B.remove(this.A01);
        if (remove == null) {
            return;
        }
        if (r5.A02 > 0) {
            C137846gp r4 = r5.A09;
            C1506776e r3 = r4.A0Q.A00;
            int indexOf = r3.A05().indexOf(remove);
            int A002 = C1506776e.A00(r3);
            int i = r5.A02;
            if (indexOf >= A002 - i) {
                r5.A03++;
                r5.A02 = i - 1;
                int A003 = (C1506776e.A00(r3) - r5.A02) - r5.A03;
                r4.A0F = true;
                r4.A0R(indexOf, A003, 1);
                r4.A0F = false;
                r5.A05(A003);
                return;
            }
            throw AnonymousClass001.A09("Item is not in pre-composed item range");
        }
        throw AnonymousClass001.A09("No pre-composed items to dispose");
    }
}
