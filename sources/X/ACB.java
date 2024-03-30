package X;

public final class ACB implements C22940Ayq {
    public final C19700wN A00;

    public ACB(C19700wN r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BxG(AnonymousClass9YL r6, AnonymousClass3T1 r7) {
        C36331k8.A1I(r7, r6);
        int i = r6.A01;
        if (2 == i && !(r7 instanceof AnonymousClass5J2)) {
            if (!(r7 instanceof AnonymousClass2bK) || ((AnonymousClass2bK) r7).A00 != 79) {
                C19700wN r2 = this.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("edit=");
                A0u.append(i);
                A0u.append(" media_wa_type=");
                A0u.append(r7);
                r2.A0E("MessageUtils/buildFMessage message type does not correspond to an encoded message", AnonymousClass000.A0q(".messageType", A0u), false);
                throw C165617ti.A0S(76, "pin_in_chat_message_stanza_invalid");
            }
        }
    }
}
