package X;

/* renamed from: X.6gQ  reason: invalid class name and case insensitive filesystem */
public final class C137606gQ implements C160787la {
    public final C94924j1 A00;

    public static final C94924j1 A00(C94924j1 r2) {
        C137846gp r22 = r2.A04.A0G;
        while (true) {
            C137846gp A0A = r22.A0A();
            C137846gp r1 = null;
            if (A0A != null && A0A.A07 != null) {
                C137846gp A0A2 = r22.A0A();
                if (A0A2 != null) {
                    r1 = A0A2.A07;
                }
                AnonymousClass00C.A0B(r1);
                C137846gp A0A3 = r22.A0A();
                AnonymousClass00C.A0B(A0A3);
                r22 = A0A3.A07;
                AnonymousClass00C.A0B(r22);
            }
        }
        return C94744ii.A00(r22);
    }

    public long BHd() {
        C94924j1 r0 = this.A00;
        return C90484aE.A0J(r0.A01, r0.A00);
    }

    public boolean BLA() {
        return this.A00.A04.A0M().A08;
    }

    public AnonymousClass6QC BOQ(C160787la r2, boolean z) {
        return this.A00.A04.BOQ(r2, z);
    }

    public long BOR(C160787la r15, long j) {
        long j2 = j;
        if (r15 instanceof C137606gQ) {
            C94924j1 r2 = ((C137606gQ) r15).A00;
            C94894iy r1 = r2.A04;
            r1.A0Q();
            C94924j1 r9 = this.A00;
            C94924j1 A0N = r9.A04.A0O(r1).A0N();
            if (A0N != null) {
                long A0I = r2.A0I(A0N);
                long A0J = C90484aE.A0J(C14960mT.A01(C133206Xf.A00(j2)), C14960mT.A01(C133206Xf.A01(j2)));
                long A0J2 = C90484aE.A0J(((int) (A0I >> 32)) + ((int) (A0J >> 32)), ((int) (A0I & 4294967295L)) + ((int) (A0J & 4294967295L)));
                long A0I2 = r9.A0I(A0N);
                long A0J3 = C90484aE.A0J(((int) (A0J2 >> 32)) - ((int) (A0I2 >> 32)), ((int) (A0J2 & 4294967295L)) - ((int) (A0I2 & 4294967295L)));
                return C90464aC.A0B((float) ((int) (A0J3 >> 32)), (float) ((int) (A0J3 & 4294967295L)));
            }
            C94924j1 A002 = A00(r2);
            long A0I3 = r2.A0I(A002);
            long j3 = A002.A00;
            long A0J4 = C90484aE.A0J(((int) (A0I3 >> 32)) + ((int) (j3 >> 32)), ((int) (A0I3 & 4294967295L)) + ((int) (j3 & 4294967295L)));
            long A0J5 = C90484aE.A0J(C14960mT.A01(C133206Xf.A00(j2)), C14960mT.A01(C133206Xf.A01(j2)));
            long A0J6 = C90484aE.A0J(((int) (A0J4 >> 32)) + ((int) (A0J5 >> 32)), ((int) (A0J4 & 4294967295L)) + ((int) (A0J5 & 4294967295L)));
            long A0I4 = r9.A0I(A00(r9));
            long j4 = A00(r9).A00;
            long A0J7 = C90484aE.A0J(((int) (A0I4 >> 32)) + ((int) (j4 >> 32)), ((int) (A0I4 & 4294967295L)) + ((int) (j4 & 4294967295L)));
            long A0J8 = C90484aE.A0J(((int) (A0J6 >> 32)) - ((int) (A0J7 >> 32)), ((int) (A0J6 & 4294967295L)) - ((int) (A0J7 & 4294967295L)));
            C94894iy r7 = A00(r9).A04.A06;
            AnonymousClass00C.A0B(r7);
            C94894iy r6 = A002.A04.A06;
            AnonymousClass00C.A0B(r6);
            return r7.BOR(r6, C90464aC.A0B((float) ((int) (A0J8 >> 32)), (float) ((int) (A0J8 & 4294967295L))));
        }
        C94924j1 A003 = A00(this.A00);
        return C133206Xf.A03(BOR(A003.A03, j2), A003.A04.BOR(r15, C133206Xf.A03));
    }

    public long BOS(long j) {
        C94924j1 r0 = this.A00;
        C94894iy r6 = r0.A04;
        C94924j1 A002 = A00(r0);
        C137606gQ r02 = A002.A03;
        long j2 = C133206Xf.A03;
        return r6.BOS(C133206Xf.A03(j, C133206Xf.A02(BOR(r02, j2), r6.BOR(A002.A04, j2))));
    }

    public long BOU(long j) {
        C94924j1 r0 = this.A00;
        C94894iy r6 = r0.A04;
        C94924j1 A002 = A00(r0);
        C137606gQ r02 = A002.A03;
        long j2 = C133206Xf.A03;
        return r6.BOU(C133206Xf.A03(j, C133206Xf.A02(BOR(r02, j2), r6.BOR(A002.A04, j2))));
    }

    public C137606gQ(C94924j1 r1) {
        this.A00 = r1;
    }

    public C160787la BF7() {
        C94924j1 A0N;
        if (BLA()) {
            C94894iy r0 = this.A00.A04.A0G.A0R.A04.A06;
            if (r0 == null || (A0N = r0.A0N()) == null) {
                return null;
            }
            return A0N.A03;
        }
        throw AnonymousClass001.A09("LayoutCoordinate operations are only valid when isAttached is true");
    }
}
