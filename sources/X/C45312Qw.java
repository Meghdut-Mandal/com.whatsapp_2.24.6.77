package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qw  reason: invalid class name and case insensitive filesystem */
public final class C45312Qw extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;

    public C45312Qw() {
        super(3694, C36441kJ.A0p(1, 10, 20), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessageContextMenuActions {");
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A01, "isMultiAction", A0u);
        C20910yM.A00(this.A02, "isOriginalSender", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "messageContextMenuAction", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A04), "messageContextMenuOption", A0u);
    }
}
