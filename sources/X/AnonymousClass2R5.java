package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R5  reason: invalid class name */
public final class AnonymousClass2R5 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A00);
        r3.Bpz(6, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(1, this.A04);
    }

    public AnonymousClass2R5() {
        super(1180, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0K(C36331k8.A0L(C36331k8.A0O(C36371kC.A0o(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusReply {");
        C20910yM.A00(this.A00, "isPosterBiz", A0u);
        C20910yM.A00(this.A01, "isPosterInAddressBook", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "statusReplyMessageType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "statusReplyResult", A0u);
        return C36321k7.A0C(this.A04, "statusSessionId", A0u);
    }
}
