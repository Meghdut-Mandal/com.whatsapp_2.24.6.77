package X;

/* renamed from: X.8N4  reason: invalid class name */
public final class AnonymousClass8N4 extends AnonymousClass8NN implements C22901AyD {
    public AnonymousClass8N4() {
        super(AnonymousClass8PE.DEFAULT_INSTANCE);
    }

    public void A0U(C21674AUx aUx) {
        AnonymousClass8PE r1 = (AnonymousClass8PE) C90524aI.A0H(this);
        int i = AnonymousClass8PE.AXOLOTL_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.axolotlSenderKeyDistributionMessage_ = aUx;
    }

    public void A0V(String str) {
        AnonymousClass8PE r1 = (AnonymousClass8PE) C90524aI.A0H(this);
        int i = AnonymousClass8PE.AXOLOTL_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 1;
        r1.groupId_ = str;
    }
}
