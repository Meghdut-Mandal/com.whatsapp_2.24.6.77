package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SB  reason: invalid class name */
public final class AnonymousClass2SB extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public AnonymousClass2SB() {
        super(3680, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(9, this.A00);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A06);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0R(C36361kB.A0i(), this.A01, A1G), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36391kE.A0r(), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPollsDailyStats {");
        C20910yM.A00(C36331k8.A0h(this.A01), "groupSizeBucket", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A02, "optionsCount", A0u);
        C20910yM.A00(this.A03, "pollCreationDs", A0u);
        C20910yM.A00(this.A04, "pollId", A0u);
        C20910yM.A00(this.A05, "pollVoteDeletes", A0u);
        C20910yM.A00(this.A06, "pollVotes", A0u);
        C20910yM.A00(this.A07, "pollVotesChanged", A0u);
        return C36321k7.A0C(this.A08, "usersParticipated", A0u);
    }
}
