package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.584  reason: invalid class name */
public final class AnonymousClass584 extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass584() {
        super(4510, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(7, this.A00);
        r3.Bpz(6, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(5, this.A02);
    }

    public static void A00(AnonymousClass6TO r1, AnonymousClass584 r2) {
        r2.A04 = Long.valueOf((long) (r1.A05.A09.A0I() + 1));
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36331k8.A0O(C36331k8.A0P(C36361kB.A0i(), this.A01, A1G), this.A00, A1G), this.A03, A1G), this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36371kC.A0p(), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAccountSwitchingEvent {");
        C20910yM.A00(C36331k8.A0h(this.A01), "accountSwitchingAction", A0u);
        C20910yM.A00(this.A00, "accountSwitchingIsCompanionFlow", A0u);
        C20910yM.A00(this.A03, "accountSwitchingLatencyMs", A0u);
        C20910yM.A00(this.A04, "accountSwitchingNumAccounts", A0u);
        C20910yM.A00(this.A05, "accountSwitchingNumPendingMessageNotifs", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "accountSwitchingSource", A0u);
    }
}
