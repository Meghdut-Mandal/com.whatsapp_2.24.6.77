package X;

/* renamed from: X.8vR  reason: invalid class name and case insensitive filesystem */
public final class C186118vR extends AnonymousClass5PS {
    public final C184018rl A00;
    public final C203399nx A01;
    public final C184828t4 A02;

    public C186118vR(C203399nx r20, C186018vH r21) {
        C203399nx r5 = r20;
        C203399nx A0e = C90514aH.A0e(r5, r21);
        C203539oF.A07(r5, Long.class, C90474aD.A0Y(), C165567td.A0Q(), (Object) null, new String[]{"error", "backoff"}, false);
        this.A02 = (C184828t4) C203539oF.A02(r5, C23213B9v.A00(A0e, 7), 0);
        C22993Azj[] azjArr = new C22993Azj[3];
        azjArr[0] = C21520AOq.A00;
        azjArr[1] = C21521AOr.A00;
        this.A00 = (C184018rl) C203379ns.A06(r5, "IQErrorRateOverlimit|IQErrorInternalServerError|IQErrorServiceUnavailable", C165567td.A0d(C21522AOs.A00, azjArr, 2), new String[]{"error"});
        String[] A1b = C165607th.A1b(r5, this, "error");
        C21523AOt aOt = C21523AOt.A00;
        AnonymousClass00C.A0D(r5, 0);
        this.A01 = (C203399nx) C203539oF.A09(r5, aOt, A1b, 1, 1).get(0);
    }
}
