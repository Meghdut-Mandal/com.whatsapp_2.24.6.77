package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qv  reason: invalid class name and case insensitive filesystem */
public final class C45302Qv extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C45302Qv() {
        super(2576, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A01);
        r3.Bpz(6, this.A02);
        r3.Bpz(4, this.A00);
        r3.Bpz(1, this.A04);
        r3.Bpz(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0O(C36391kE.A0r(), this.A01, A1G), this.A02, A1G), this.A00);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0P(C36361kB.A0i(), this.A04, A1G), this.A03);
        C36321k7.A1b(A1G, 5);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdLinkDeviceCompanion {");
        C20910yM.A00(this.A01, "mdDurationS", A0u);
        C20910yM.A00(this.A02, "mdLinkDeviceCompanionErrorCode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mdLinkDeviceCompanionStage", A0u);
        C20910yM.A00(this.A04, "mdSessionId", A0u);
        return C36321k7.A0C(this.A03, "mdTimestampS", A0u);
    }
}
