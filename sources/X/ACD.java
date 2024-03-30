package X;

public class ACD implements C22940Ayq {
    public final C19700wN A00;

    public void BxG(AnonymousClass9YL r5, AnonymousClass3T1 r6) {
        String str = r5.A0J;
        if ("reaction".equals(str) && r6 != null && !(r6 instanceof C180868mY)) {
            C19700wN r3 = this.A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("type=");
            A0u.append(str);
            A0u.append(" media_wa_type=");
            r3.A0E("MessageUtils/buildFMessage message type does not correspond to an encoded message", C36381kD.A10(A0u, r6.A1I), false);
            throw C165567td.A0J(76);
        }
    }

    public ACD(C19700wN r1) {
        this.A00 = r1;
    }
}
