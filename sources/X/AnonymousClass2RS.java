package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RS  reason: invalid class name */
public final class AnonymousClass2RS extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2RS() {
        super(3656, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamRevokeMessageSend {");
        C20910yM.A00(this.A00, "messageSendResultIsTerminal", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "messageType", A0u);
        C20910yM.A00(this.A03, "resendCount", A0u);
        C20910yM.A00(this.A04, "retryCount", A0u);
        C20910yM.A00(this.A05, "revokeDuration", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "revokeType", A0u);
    }
}
