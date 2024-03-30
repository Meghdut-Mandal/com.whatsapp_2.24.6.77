package X;

public class ACC implements C22940Ayq {
    public final C19700wN A00;

    public void BxG(AnonymousClass9YL r5, AnonymousClass3T1 r6) {
        String str = r5.A0J;
        String str2 = r5.A0L;
        if ("poll".equals(str) && "vote".equals(str2) && r6 != null && !(r6 instanceof C180858mX)) {
            if (!(r6 instanceof AnonymousClass2bK) || ((AnonymousClass2bK) r6).A00 != 67) {
                C19700wN r3 = this.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("type=");
                A0u.append(str);
                A0u.append(" media_wa_type=");
                r3.A0E("MessageUtils/buildFMessage message type does not correspond to an encoded message", C36381kD.A10(A0u, r6.A1I), false);
                throw C165617ti.A0S(76, "poll_update_message_stanza_invalid");
            }
        }
    }

    public ACC(C19700wN r1) {
        this.A00 = r1;
    }
}
