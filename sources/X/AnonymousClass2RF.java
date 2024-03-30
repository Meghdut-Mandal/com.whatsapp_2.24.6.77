package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RF  reason: invalid class name */
public final class AnonymousClass2RF extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;

    public AnonymousClass2RF() {
        super(4568, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A05);
        r3.Bpz(7, this.A00);
        r3.Bpz(4, this.A02);
        r3.Bpz(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0M(C36331k8.A0P(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A04, A1G), this.A01, A1G), this.A05, A1G), this.A00, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCallUserJourney {");
        C20910yM.A00(this.A04, "appSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "callActionType", A0u);
        C20910yM.A00(this.A05, "callRandomId", A0u);
        C20910yM.A00(this.A00, "isCallConnected", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "subSurface", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "uiSurface", A0u);
    }
}
