package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qs  reason: invalid class name and case insensitive filesystem */
public final class C45272Qs extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C45272Qs() {
        super(3578, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A04, A1G), this.A02, A1G), this.A00, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamE2eRetryReject {");
        C20910yM.A00(C36331k8.A0h(this.A01), "messageType", A0u);
        C20910yM.A00(this.A04, "msgRetryCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "retryRejectReason", A0u);
        C20910yM.A00(this.A00, "retryRevoke", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "senderDeviceType", A0u);
    }
}
