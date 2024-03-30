package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sj  reason: invalid class name and case insensitive filesystem */
public final class C45702Sj extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;

    public C45702Sj() {
        super(3124, new C18950u5(1, 1, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(11, this.A06);
        r3.Bpz(12, this.A07);
        r3.Bpz(13, this.A08);
        r3.Bpz(14, this.A09);
        r3.Bpz(15, this.A0A);
        r3.Bpz(16, this.A0B);
        r3.Bpz(17, this.A0C);
        r3.Bpz(18, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36361kB.A0j(), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0J(C36371kC.A0p(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D);
        C36321k7.A1b(A1G, 19);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamContactInfo {");
        C20910yM.A00(this.A00, "avatar", A0u);
        C20910yM.A00(this.A01, "blockContact", A0u);
        C20910yM.A00(this.A02, "contactDetails", A0u);
        C20910yM.A00(this.A03, "contactInfoVisit", A0u);
        C20910yM.A00(this.A04, "disappearingMessages", A0u);
        C20910yM.A00(this.A05, "encryption", A0u);
        C20910yM.A00(this.A06, "mute", A0u);
        C20910yM.A00(this.A07, "payments", A0u);
        C20910yM.A00(this.A08, "reportContact", A0u);
        C20910yM.A00(this.A09, "search", A0u);
        C20910yM.A00(this.A0A, "shareContact", A0u);
        C20910yM.A00(this.A0B, "starredMessages", A0u);
        C20910yM.A00(this.A0C, "videoCall", A0u);
        return C36321k7.A0C(this.A0D, "voiceCall", A0u);
    }
}
