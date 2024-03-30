package X;

/* renamed from: X.4tw  reason: invalid class name and case insensitive filesystem */
public final class C99774tw extends AnonymousClass8NN implements C22901AyD {
    public C99774tw() {
        super(C100004uJ.DEFAULT_INSTANCE);
    }

    public void A0U(int i) {
        C100004uJ r1 = (C100004uJ) C90524aI.A0H(this);
        int i2 = C100004uJ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.id_ = i;
    }

    public void A0V(long j) {
        C100004uJ r1 = (C100004uJ) C90524aI.A0H(this);
        int i = C100004uJ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 16;
        r1.timestamp_ = j;
    }

    public void A0W(C21674AUx aUx) {
        C100004uJ r1 = (C100004uJ) C90524aI.A0H(this);
        int i = C100004uJ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.privateKey_ = aUx;
    }

    public void A0X(C21674AUx aUx) {
        C100004uJ r1 = (C100004uJ) C90524aI.A0H(this);
        int i = C100004uJ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.publicKey_ = aUx;
    }

    public void A0Y(C21674AUx aUx) {
        C100004uJ r1 = (C100004uJ) C90524aI.A0H(this);
        int i = C100004uJ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.signature_ = aUx;
    }
}
