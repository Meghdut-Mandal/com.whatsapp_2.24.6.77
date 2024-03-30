package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RD  reason: invalid class name */
public final class AnonymousClass2RD extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;

    public AnonymousClass2RD() {
        super(4288, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBlockEventsFs {");
        C20910yM.A00(C36331k8.A0h(this.A03), "blockEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "blockEventActionType", A0u);
        C20910yM.A00(this.A00, "blockEventIsSuspicious", A0u);
        C20910yM.A00(this.A01, "blockEventIsUnsub", A0u);
        C20910yM.A00(this.A02, "pastCall", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "pastCallResult", A0u);
    }
}
