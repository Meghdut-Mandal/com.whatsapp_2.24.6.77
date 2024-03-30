package X;

/* renamed from: X.8NB  reason: invalid class name */
public final class AnonymousClass8NB extends AnonymousClass8NN implements C22901AyD {
    public AnonymousClass8NB() {
        super(AnonymousClass8SK.DEFAULT_INSTANCE);
    }

    @Deprecated
    public void A0U(C1887490o r3) {
        AnonymousClass8SK r1 = (AnonymousClass8SK) C90524aI.A0H(this);
        int i = AnonymousClass8SK.INITIATED_BY_ME_FIELD_NUMBER;
        r1.initiator_ = r3.value;
        r1.bitField0_ |= 1;
    }

    public void A0V(AnonymousClass919 r3) {
        AnonymousClass8SK r1 = (AnonymousClass8SK) C90524aI.A0H(this);
        int i = AnonymousClass8SK.INITIATED_BY_ME_FIELD_NUMBER;
        r1.trigger_ = r3.value;
        r1.bitField0_ |= 2;
    }

    public void A0W(boolean z) {
        AnonymousClass8SK r1 = (AnonymousClass8SK) C90524aI.A0H(this);
        int i = AnonymousClass8SK.INITIATED_BY_ME_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.initiatedByMe_ = z;
    }
}
