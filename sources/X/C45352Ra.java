package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ra  reason: invalid class name and case insensitive filesystem */
public final class C45352Ra extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C45352Ra() {
        super(2280, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(1, this.A05);
        r3.Bpz(6, this.A03);
        r3.Bpz(2, this.A06);
        r3.Bpz(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0K(C36331k8.A0O(C36331k8.A0J(C36331k8.A0M(C36331k8.A0N(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A05, A1G), this.A03, A1G), this.A06, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatMute {");
        C20910yM.A00(C36331k8.A0h(this.A00), "actionConducted", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "chatMuteNotificationChoice", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "muteChatType", A0u);
        C20910yM.A00(this.A05, "muteDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "muteEntryPoint", A0u);
        C20910yM.A00(this.A06, "muteGroupSize", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A04), "waOfficialAccountName", A0u);
    }
}
