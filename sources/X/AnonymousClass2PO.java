package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PO  reason: invalid class name */
public final class AnonymousClass2PO extends C20890yK {
    public Integer A00;
    public String A01;
    public String A02;

    public AnonymousClass2PO() {
        super(3574, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0N(C36331k8.A0M(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatPsaRead {");
        C20910yM.A00(C36331k8.A0h(this.A00), "messageMediaType", A0u);
        C20910yM.A00(this.A01, "psaCampaignId", A0u);
        return C36321k7.A0C(this.A02, "psaMsgId", A0u);
    }
}
