package X;

/* renamed from: X.8sM  reason: invalid class name and case insensitive filesystem */
public final class C184388sM extends C118095nK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C203399nx A04;
    public final C203399nx A05;

    public C184388sM(C203399nx r21) {
        C203399nx r6 = r21;
        C203399nx.A0A(r6, "colors");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A02 = (String) C203539oF.A07(r6, cls, A0P, A0Q, (Object) null, new String[]{"light", "background"}, false);
        this.A03 = (String) C203539oF.A07(r6, cls, A0P, A0Q, (Object) null, new String[]{"light", "highlight"}, false);
        this.A00 = (String) C203539oF.A07(r6, cls, A0P, A0Q, (Object) null, new String[]{"dark", "background"}, false);
        this.A01 = (String) C203539oF.A07(r6, cls, A0P, A0Q, (Object) null, new String[]{"dark", "highlight"}, false);
        String[] A1b = C165607th.A1b(r6, this, "dark");
        C21585ARd aRd = C21585ARd.A00;
        AnonymousClass00C.A0D(r6, 0);
        C203399nx r13 = r6;
        this.A04 = (C203399nx) C203539oF.A09(r13, aRd, A1b, 1, 1).get(0);
        this.A05 = (C203399nx) C203539oF.A09(r13, C21586ARe.A00, new String[]{"light"}, 1, 1).get(0);
    }
}
