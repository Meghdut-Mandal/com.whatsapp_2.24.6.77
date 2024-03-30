package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sc  reason: invalid class name and case insensitive filesystem */
public final class C45632Sc extends C20890yK {
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

    public C45632Sc() {
        super(3126, new C18950u5(1, 1, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(6, this.A03);
        r3.Bpz(7, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(12, this.A07);
        r3.Bpz(15, this.A08);
        r3.Bpz(17, this.A09);
        r3.Bpz(18, this.A0A);
        r3.Bpz(20, this.A0B);
        r3.Bpz(21, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A00, A1G), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36381kD.A0n(), this.A03, A1G), this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36361kB.A0i(), this.A06, A1G), (Object) null, A1G), (Object) null, A1G), this.A07, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 14);
        A1G.put(C36421kH.A0W(), this.A08);
        C36321k7.A1b(A1G, 16);
        A1G.put(C36371kC.A0q(C36431kI.A13(), this.A09, A1G), this.A0A);
        C36321k7.A1b(A1G, 19);
        A1G.put(C36411kG.A0s(20, this.A0B, A1G), this.A0C);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamGroupInfo {");
        C20910yM.A00(this.A00, "exitGroup", A0u);
        C20910yM.A00(this.A01, "groupAddParticipants", A0u);
        C20910yM.A00(this.A02, "groupAudioCall", A0u);
        C20910yM.A00(this.A03, "groupDescription", A0u);
        C20910yM.A00(this.A04, "groupDisappearingMessages", A0u);
        C20910yM.A00(this.A05, "groupEncryption", A0u);
        C20910yM.A00(this.A06, "groupInfoVisit", A0u);
        C20910yM.A00(this.A07, "groupMuteClick", A0u);
        C20910yM.A00(this.A08, "groupSearch", A0u);
        C20910yM.A00(this.A09, "groupStarredMessages", A0u);
        C20910yM.A00(this.A0A, "groupVideoCall", A0u);
        C20910yM.A00(this.A0B, "inviteToGroupViaLink", A0u);
        return C36321k7.A0C(this.A0C, "reportGroup", A0u);
    }
}
