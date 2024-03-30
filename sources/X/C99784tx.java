package X;

/* renamed from: X.4tx  reason: invalid class name and case insensitive filesystem */
public final class C99784tx extends AnonymousClass8NN implements C22901AyD {
    public C99784tx() {
        super(C100064uP.DEFAULT_INSTANCE);
    }

    public void A0U(int i) {
        C100064uP r1 = (C100064uP) C90524aI.A0H(this);
        int i2 = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.chunkOrder_ = i;
    }

    public void A0V(int i) {
        C100064uP r1 = (C100064uP) C90524aI.A0H(this);
        int i2 = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.progress_ = i;
    }

    public void A0W(C99764tv r5) {
        C100064uP r3 = (C100064uP) C90524aI.A0H(this);
        C170918Hz A0R = r5.A0R();
        int i = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        A0R.getClass();
        C23122B6c b6c = r3.conversations_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r3.conversations_ = b6c;
        }
        b6c.add(A0R);
    }

    public void A0X(C100104uT r4) {
        C100064uP r2 = (C100064uP) C90524aI.A0H(this);
        int i = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r4.getClass();
        C23122B6c b6c = r2.conversations_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r2.conversations_ = b6c;
        }
        b6c.add(r4);
    }

    public void A0Y(AnonymousClass5UH r3) {
        C100064uP r1 = (C100064uP) C90524aI.A0H(this);
        int i = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.syncType_ = r3.value;
        r1.bitField0_ |= 1;
    }

    public void A0Z(Iterable iterable) {
        C100064uP r2 = (C100064uP) C90524aI.A0H(this);
        int i = C100064uP.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        C23122B6c b6c = r2.phoneNumberToLidMappings_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r2.phoneNumberToLidMappings_ = b6c;
        }
        C21071A7i.A0O(iterable, b6c);
    }
}
