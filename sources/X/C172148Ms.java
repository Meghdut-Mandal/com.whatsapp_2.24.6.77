package X;

/* renamed from: X.8Ms  reason: invalid class name and case insensitive filesystem */
public final class C172148Ms extends AnonymousClass8NN implements C22901AyD {
    public C172148Ms() {
        super(AnonymousClass8Q7.DEFAULT_INSTANCE);
    }

    public void A0U(C172158Mt r5) {
        AnonymousClass8Q7 r3 = (AnonymousClass8Q7) C90524aI.A0H(this);
        C170918Hz A0R = r5.A0R();
        int i = AnonymousClass8Q7.PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER;
        A0R.getClass();
        C23122B6c b6c = r3.peerDataOperationResult_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r3.peerDataOperationResult_ = b6c;
        }
        b6c.add(A0R);
    }
}
