package X;

/* renamed from: X.8NA  reason: invalid class name */
public final class AnonymousClass8NA extends AnonymousClass8NN implements C22901AyD {
    public static C172778Pd A00(C201119iu r1, AnonymousClass8NA r2, byte[] bArr, int i) {
        r2.A0V(C21674AUx.A01(bArr, 0, i));
        r2.A0U(r1.A00);
        return (C172778Pd) r2.A0R();
    }

    public AnonymousClass8NA() {
        super(C172778Pd.DEFAULT_INSTANCE);
    }

    public void A0U(int i) {
        C172778Pd r1 = (C172778Pd) C90524aI.A0H(this);
        int i2 = C172778Pd.INDEX_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.index_ = i;
    }

    public void A0V(C21674AUx aUx) {
        C172778Pd r1 = (C172778Pd) C90524aI.A0H(this);
        int i = C172778Pd.INDEX_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.key_ = aUx;
    }
}
