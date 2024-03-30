package X;

/* renamed from: X.4j0  reason: invalid class name and case insensitive filesystem */
public final class C94914j0 extends C94924j1 {
    public final /* synthetic */ C94944jW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94914j0(C94944jW r1) {
        super(r1);
        this.A00 = r1;
    }

    public AnonymousClass6Q4 BPj(long j) {
        A0D(j);
        C137846gp r5 = this.A04.A0G;
        C1506776e A09 = r5.A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A09.A01;
            do {
                C129056Et.A00((C137846gp) objArr[i2]).A04 = C023109s.A0C;
                i2++;
            } while (i2 < i);
        }
        C94924j1.A02(r5.A06.BPh(this, r5.A0D(), j), this);
        return this;
    }
}
