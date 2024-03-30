package X;

/* renamed from: X.5WN  reason: invalid class name */
public abstract class AnonymousClass5WN {
    public static final boolean A00(C161647nF r7, long j) {
        if (!((C137856gq) r7).A03.A08) {
            return false;
        }
        C94944jW r2 = AnonymousClass6VZ.A02(r7).A0R.A06;
        if (!r2.A0M().A08) {
            return false;
        }
        long j2 = r2.A03;
        int A08 = C90494aF.A08(j2);
        int A03 = C90474aD.A03(j2);
        long BOS = r2.BOS(C133206Xf.A03);
        float A00 = C133206Xf.A00(BOS);
        float A01 = C133206Xf.A01(BOS);
        float f = ((float) A08) + A00;
        float f2 = ((float) A03) + A01;
        float A002 = C133206Xf.A00(j);
        if (A00 > A002 || A002 > f) {
            return false;
        }
        float A012 = C133206Xf.A01(j);
        if (A01 > A012 || A012 > f2) {
            return false;
        }
        return true;
    }
}
