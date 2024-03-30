package X;

/* renamed from: X.8NK  reason: invalid class name */
public final class AnonymousClass8NK extends AnonymousClass8NN implements C22901AyD {
    public AnonymousClass8NK() {
        super(AnonymousClass8SU.DEFAULT_INSTANCE);
    }

    public void A0U() {
        AnonymousClass8SU A0I = AnonymousClass8NN.A0I(this);
        A0I.bitField0_ &= -17;
        A0I.participant_ = AnonymousClass8SU.DEFAULT_INSTANCE.participant_;
    }

    public void A0V(long j) {
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(this);
        A0J.bitField0_ |= 4;
        A0J.messageTimestamp_ = j;
    }

    public void A0W(AnonymousClass8SW r3) {
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(this);
        r3.getClass();
        A0J.key_ = r3;
        A0J.bitField0_ |= 1;
    }

    public void A0X(AnonymousClass91I r3) {
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(this);
        A0J.messageStubType_ = r3.value;
        A0J.bitField0_ |= 16384;
    }

    public void A0Y(String str) {
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(this);
        str.getClass();
        C23122B6c b6c = A0J.messageStubParameters_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            A0J.messageStubParameters_ = b6c;
        }
        b6c.add(str);
    }

    public void A0Z(String str) {
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(this);
        str.getClass();
        A0J.bitField0_ |= 16;
        A0J.participant_ = str;
    }
}
