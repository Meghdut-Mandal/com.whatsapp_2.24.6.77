package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cK  reason: invalid class name and case insensitive filesystem */
public final class C176568cK extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
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

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(21, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(22, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(25, this.A05);
        r3.Bpz(26, this.A06);
        r3.Bpz(27, this.A07);
        r3.Bpz(28, this.A08);
        r3.Bpz(19, this.A09);
        r3.Bpz(20, this.A0A);
        r3.Bpz(24, this.A0B);
        r3.Bpz(23, this.A0C);
    }

    public C176568cK() {
        super(2642, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36341k9.A0b(C36331k8.A0K(C36331k8.A0L(C90474aD.A0X(C36331k8.A0J(21, this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 16);
        C36331k8.A1Q((Object) null, A1G, 17);
        A1G.put(25, this.A05);
        A1G.put(C165597tg.A0d(), this.A06);
        A1G.put(C36331k8.A0U(C36331k8.A0Q(C36331k8.A0N(C36331k8.A0T(C36331k8.A0S(C36331k8.A0P(27, this.A07, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        A1G.put(C36331k8.A0M(C36331k8.A0R(C36331k8.A0O(C36331k8.A0V(28, this.A08, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 18);
        A1G.put(C90484aE.A0d(C90484aE.A0e(C36401kF.A0l(19, this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidInfraHealth {");
        C20910yM.A00(this.A00, "psDailyStartsBgCold", A0u);
        C20910yM.A00(this.A01, "psDailyStartsCold", A0u);
        C20910yM.A00(this.A02, "psDailyStartsFgCold", A0u);
        C20910yM.A00(this.A03, "psDailyStartsLukeWarm", A0u);
        C20910yM.A00(this.A04, "psDailyStartsWarms", A0u);
        C20910yM.A00(this.A05, "psNumberOfChats", A0u);
        C20910yM.A00(this.A06, "psNumberOfChatsHidden", A0u);
        C20910yM.A00(this.A07, "psNumberOfChatsHiddenNull", A0u);
        C20910yM.A00(this.A08, "psNumberOfMessagesOrphan", A0u);
        C20910yM.A00(this.A09, "timeSinceLastColdStartInMin", A0u);
        C20910yM.A00(this.A0A, "timeSinceLastEventInMin", A0u);
        C20910yM.A00(this.A0B, "timeSinceLastLukewarmStartInMin", A0u);
        return C36321k7.A0C(this.A0C, "timeSinceLastWarmStartInMin", A0u);
    }
}
