package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RT  reason: invalid class name */
public final class AnonymousClass2RT extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A00);
        r3.Bpz(1, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A01);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A05);
    }

    public AnonymousClass2RT() {
        super(1174, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36331k8.A0N(C36331k8.A0M(C36331k8.A0J(C36381kD.A0n(), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A01, A1G), this.A04, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusTabClose {");
        C20910yM.A00(C36331k8.A0h(this.A00), "statusSessionFbShareError", A0u);
        C20910yM.A00(this.A02, "statusSessionId", A0u);
        C20910yM.A00(this.A03, "statusSessionReplyCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "statusSessionShareStatusCtaTap", A0u);
        C20910yM.A00(this.A04, "statusSessionTimeSpent", A0u);
        return C36321k7.A0C(this.A05, "statusSessionViewCount", A0u);
    }
}
