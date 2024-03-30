package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cM  reason: invalid class name and case insensitive filesystem */
public final class C176588cM extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C176588cM() {
        super(3112, new C18950u5(1, 20, 1000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(17, this.A03);
        r3.Bpz(18, this.A04);
        r3.Bpz(19, this.A05);
        r3.Bpz(2, this.A00);
        r3.Bpz(13, this.A01);
        r3.Bpz(3, this.A06);
        r3.Bpz(14, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(7, this.A09);
        r3.Bpz(8, this.A0A);
        r3.Bpz(20, this.A0B);
        r3.Bpz(9, this.A0C);
        r3.Bpz(21, this.A02);
        r3.Bpz(12, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(35, (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 23);
        A1G.put(C36331k8.A0V(C36331k8.A0K(C36381kD.A0o(C36371kC.A0q(C36431kI.A13(), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 22);
        A1G.put(C36331k8.A0T(C36341k9.A0b(C36331k8.A0S(C36411kG.A0s(C36331k8.A0R(C36401kF.A0l(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C90484aE.A0e(C36331k8.A0M(C36341k9.A0a(C36371kC.A0n(), this.A06, A1G), this.A07, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A02, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 25);
        C36331k8.A1Q((Object) null, A1G, 26);
        C36331k8.A1Q((Object) null, A1G, 27);
        C36331k8.A1Q((Object) null, A1G, 28);
        C36331k8.A1Q((Object) null, A1G, 29);
        C36331k8.A1Q((Object) null, A1G, 30);
        C36331k8.A1Q((Object) null, A1G, 31);
        C36331k8.A1Q((Object) null, A1G, 32);
        A1G.put(C36331k8.A0U(33, (Object) null, A1G), this.A0D);
        C36321k7.A1b(A1G, 34);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamOfflineResume {");
        C20910yM.A00(this.A03, "expectedOfflineMessageCount", A0u);
        C20910yM.A00(this.A04, "expectedOfflineNotificationCount", A0u);
        C20910yM.A00(this.A05, "expectedOfflineReceiptCount", A0u);
        C20910yM.A00(this.A00, "isOfflineCompleteMissed", A0u);
        C20910yM.A00(this.A01, "isResumeInForeground", A0u);
        C20910yM.A00(this.A06, "lastStanzaT", A0u);
        C20910yM.A00(this.A07, "mailboxAge", A0u);
        C20910yM.A00(this.A08, "offlineMessageCount", A0u);
        C20910yM.A00(this.A09, "offlineNotificationCount", A0u);
        C20910yM.A00(this.A0A, "offlinePreviewT", A0u);
        C20910yM.A00(this.A0B, "offlineProcessingT", A0u);
        C20910yM.A00(this.A0C, "offlineReceiptCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "offlineResumeResult", A0u);
        return C36321k7.A0C(this.A0D, "socketConnectT", A0u);
    }
}
