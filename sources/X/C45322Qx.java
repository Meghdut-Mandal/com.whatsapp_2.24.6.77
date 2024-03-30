package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qx  reason: invalid class name and case insensitive filesystem */
public final class C45322Qx extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public C45322Qx() {
        super(3626, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
        r3.Bpz(6, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0O(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessageDeleteActions {");
        C20910yM.A00(C36331k8.A0h(this.A01), "deleteActionType", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A02), A0u);
        C20910yM.A00(this.A03, "messagesDeleted", A0u);
        return C36321k7.A0C(this.A04, "threadId", A0u);
    }
}
