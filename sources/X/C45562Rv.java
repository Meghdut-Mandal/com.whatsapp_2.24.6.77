package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rv  reason: invalid class name and case insensitive filesystem */
public final class C45562Rv extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C45562Rv() {
        super(3508, C36441kJ.A0p(1, 1000, 2000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(9, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A06);
        r3.Bpz(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0R(C36331k8.A0K(C36331k8.A0J(C36401kF.A0h(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G);
        A1G.put(C36331k8.A0Q(C36331k8.A0O(C36331k8.A0N(C36371kC.A0o(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamIqSend {");
        C20910yM.A00(C36331k8.A0h(this.A00), "iqSendResult", A0u);
        C20910yM.A00(this.A01, "iqTimeToGetResponse", A0u);
        C20910yM.A00(this.A02, "iqTimeToProcess", A0u);
        C20910yM.A00(this.A03, "iqTimeToProcessTotal", A0u);
        C20910yM.A00(this.A04, "iqTimeToSend", A0u);
        C20910yM.A00(this.A05, "iqTotalTime", A0u);
        C20910yM.A00(this.A06, "iqType", A0u);
        return C36321k7.A0C(this.A07, "serverErrorCode", A0u);
    }
}
