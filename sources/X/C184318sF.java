package X;

/* renamed from: X.8sF  reason: invalid class name and case insensitive filesystem */
public final class C184318sF extends C118095nK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C184318sF(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "fx-detail");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        Long A0b = C165587tf.A0b();
        C203539oF r1 = C203379ns.A00;
        this.A00 = (String) r1.A0Z(r2, cls, A0Y, A0b, (Object) null, new String[]{"base-amount"}, false);
        this.A02 = (String) r1.A0Z(r2, cls, A0Y, A0b, (Object) null, new String[]{"currency-fx"}, false);
        this.A03 = (String) r1.A0Z(r2, cls, A0Y, A0b, (Object) null, new String[]{"currency-markup"}, false);
        this.A01 = (String) r1.A0Z(r2, cls, A0Y, A0b, (Object) null, new String[]{"base-currency"}, false);
        this.A00 = r10;
    }
}
