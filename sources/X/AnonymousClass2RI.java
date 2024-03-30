package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RI  reason: invalid class name */
public final class AnonymousClass2RI extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass2RI() {
        super(3138, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A05);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(1, this.A04);
        r3.Bpz(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A05, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0J(C36331k8.A0R(C36331k8.A0Q(C36371kC.A0p(), this.A02, A1G), (Object) null, A1G), (Object) null, A1G), this.A04);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36381kD.A0n(), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamConversationsNuxUiAction {");
        C20910yM.A00(this.A05, "contactPosition", A0u);
        C20910yM.A00(this.A00, "favorited", A0u);
        C20910yM.A00(this.A01, "frequentlyContacted", A0u);
        C20910yM.A00(this.A02, "presence", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "uiActionSource", A0u);
        return C36321k7.A0C(this.A03, "withProfilePic", A0u);
    }
}
