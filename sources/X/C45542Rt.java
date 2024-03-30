package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rt  reason: invalid class name and case insensitive filesystem */
public final class C45542Rt extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C45542Rt() {
        super(3892, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A07);
        r3.Bpz(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A05, A1G), this.A07, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamEphemeralOutOfSyncInfo {");
        C20910yM.A00(C36331k8.A0h(this.A02), "groupSizeBucket", A0u);
        C20910yM.A00(this.A03, "incomingMessageEphemeralityDuration", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A01, "isNewThreadForUser", A0u);
        C20910yM.A00(this.A04, "otherDefaultModeDuration", A0u);
        C20910yM.A00(this.A05, "threadEphemeralityDuration", A0u);
        C20910yM.A00(this.A07, "threadId", A0u);
        return C36321k7.A0C(this.A06, "userDefaultModeDuration", A0u);
    }
}
