package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R9  reason: invalid class name */
public final class AnonymousClass2R9 extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public AnonymousClass2R9() {
        super(3944, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0N(C36331k8.A0K(C36361kB.A0i(), this.A04, A1G), this.A01, A1G), this.A02, A1G), this.A00, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWaFsGroupJoinRequestAction {");
        C20910yM.A00(this.A04, "groupJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "groupJoinRequestAction", A0u);
        C20910yM.A00(this.A02, "groupJoinRequestGroupsInCommon", A0u);
        C20910yM.A00(this.A00, "isSuccessful", A0u);
        return C36321k7.A0C(this.A03, "serverResponseTime", A0u);
    }
}
