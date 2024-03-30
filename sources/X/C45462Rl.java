package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rl  reason: invalid class name and case insensitive filesystem */
public final class C45462Rl extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C45462Rl() {
        super(3676, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(6, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0O(C36331k8.A0J(C36391kE.A0r(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        C36321k7.A1b(A1G, 7);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPollsActions {");
        C20910yM.A00(C36331k8.A0h(this.A02), "chatType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "groupSizeBucket", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A01, "isAdmin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "pollAction", A0u);
        C20910yM.A00(this.A05, "pollCreationDs", A0u);
        return C36321k7.A0C(this.A06, "pollOptionsCount", A0u);
    }
}
