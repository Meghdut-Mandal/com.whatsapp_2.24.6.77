package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rh  reason: invalid class name and case insensitive filesystem */
public final class C45422Rh extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C45422Rh() {
        super(3904, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A06);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A00);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36371kC.A0p(), this.A03, A1G), this.A04, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamNonMessagePeerDataOperationResponse {");
        C20910yM.A00(this.A01, "peerDataErrorCount", A0u);
        C20910yM.A00(this.A02, "peerDataNotFoundCount", A0u);
        C20910yM.A00(this.A06, "peerDataRequestSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "peerDataRequestType", A0u);
        C20910yM.A00(this.A03, "peerDataResponseCount", A0u);
        C20910yM.A00(this.A04, "peerDataSuccessProcessCount", A0u);
        return C36321k7.A0C(this.A05, "peerDataSuccessResponseCount", A0u);
    }
}
