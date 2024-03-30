package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58m  reason: invalid class name and case insensitive filesystem */
public final class C1041558m extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
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
    public String A0F;
    public String A0G;

    public C1041558m() {
        super(4660, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(12, this.A0E);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A0F);
        r3.Bpz(6, this.A06);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(9, this.A09);
        r3.Bpz(13, this.A0A);
        r3.Bpz(14, this.A0B);
        r3.Bpz(10, this.A0C);
        r3.Bpz(11, this.A0D);
        r3.Bpz(15, this.A02);
        r3.Bpz(17, this.A0G);
        r3.Bpz(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36351kA.A0s(C36351kA.A0t(C36341k9.A0b(C36331k8.A0T(C36331k8.A0S(C36341k9.A0a(C36331k8.A0V(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0U(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A0E, A1G), this.A01, A1G), this.A0F, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A02, A1G), this.A0G, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSelectParticipantFromPicker {");
        C20910yM.A00(C36331k8.A0h(this.A00), "addParticipantPickerResult", A0u);
        C20910yM.A00(this.A04, "adhocIndex", A0u);
        C20910yM.A00(this.A05, "adhocTotal", A0u);
        C20910yM.A00(this.A0E, "appSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "callParticipantSelectSource", A0u);
        C20910yM.A00(this.A0F, "callRandomId", A0u);
        C20910yM.A00(this.A06, "groupChatIndex", A0u);
        C20910yM.A00(this.A07, "groupChatTotal", A0u);
        C20910yM.A00(this.A08, "lgcIndex", A0u);
        C20910yM.A00(this.A09, "lgcTotal", A0u);
        C20910yM.A00(this.A0A, "oneOnOneIndex", A0u);
        C20910yM.A00(this.A0B, "oneOnOneTotal", A0u);
        C20910yM.A00(this.A0C, "starredIndex", A0u);
        C20910yM.A00(this.A0D, "starredTotal", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "subSurface", A0u);
        C20910yM.A00(this.A0G, "suggestionSessionId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "uiSurface", A0u);
    }
}
