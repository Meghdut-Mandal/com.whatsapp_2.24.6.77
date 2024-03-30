package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sr  reason: invalid class name and case insensitive filesystem */
public final class C45782Sr extends C20890yK {
    public Boolean A00;
    public Integer A01;
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
    public String A0E;

    public C45782Sr() {
        super(3796, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A0E);
        r3.Bpz(16, this.A04);
        r3.Bpz(17, this.A05);
        r3.Bpz(6, this.A06);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(10, this.A09);
        r3.Bpz(11, this.A0A);
        r3.Bpz(12, this.A0B);
        r3.Bpz(14, this.A0C);
        r3.Bpz(15, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A01, A1G), this.A02, A1G), this.A00);
        C36321k7.A1b(A1G, 18);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36351kA.A0t(C36351kA.A0s(C36371kC.A0p(), this.A0E, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0U(C36331k8.A0T(C36401kF.A0j(), this.A09, A1G), this.A0A, A1G), this.A0B);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36341k9.A0b(C36401kF.A0k(), this.A0C, A1G), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamNotificationEngagement {");
        C20910yM.A00(this.A03, "avgNotifEngagementT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "groupSizeBucket", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "groupTypeClient", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A0E, "threadId", A0u);
        C20910yM.A00(this.A04, "totalMessageReminderNotifShown", A0u);
        C20910yM.A00(this.A05, "totalMessageReminderNotifTapToOpen", A0u);
        C20910yM.A00(this.A06, "totalNotifMarkAsRead", A0u);
        C20910yM.A00(this.A07, "totalNotifMissedCallVoipCallback", A0u);
        C20910yM.A00(this.A08, "totalNotifMissedCallVoipMessage", A0u);
        C20910yM.A00(this.A09, "totalNotifReply", A0u);
        C20910yM.A00(this.A0A, "totalNotifRtcVoipAccept", A0u);
        C20910yM.A00(this.A0B, "totalNotifRtcVoipDecline", A0u);
        C20910yM.A00(this.A0C, "totalNotifShown", A0u);
        return C36321k7.A0C(this.A0D, "totalNotifTapToOpen", A0u);
    }
}
