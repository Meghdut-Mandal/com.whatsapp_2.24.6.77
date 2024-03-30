package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qm  reason: invalid class name and case insensitive filesystem */
public final class C45212Qm extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public C45212Qm() {
        super(4080, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(7, this.A03);
        r3.Bpz(3, this.A02);
        r3.Bpz(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0P(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02, A1G), (Object) null, A1G), (Object) null, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamClientExpiry {");
        C20910yM.A00(C36331k8.A0h(this.A00), "clientExpiryActionType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "clientExpiryButtonName", A0u);
        C20910yM.A00(this.A03, "clientExpiryExpirationTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "clientExpiryScreenType", A0u);
        return C36321k7.A0C(this.A04, "numDaysToExpiry", A0u);
    }
}
