package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SO  reason: invalid class name */
public final class AnonymousClass2SO extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass2SO() {
        super(3690, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A08);
        r3.Bpz(6, this.A09);
        r3.Bpz(7, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A07);
        r3.Bpz(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A08, A1G), this.A09, A1G), this.A04, A1G), this.A05, A1G), this.A07, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusViewerTrafficActions {");
        C20910yM.A00(this.A00, "fullStatusViewed", A0u);
        C20910yM.A00(this.A01, "isFirstViewOfStatus", A0u);
        C20910yM.A00(this.A02, "isPosterBiz", A0u);
        C20910yM.A00(this.A03, "isPosterInAddressBook", A0u);
        C20910yM.A00(this.A08, "statusId", A0u);
        C20910yM.A00(this.A09, "statusPosterJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "statusReplyMessageType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "statusViewEntryPoint", A0u);
        C20910yM.A00(this.A07, "statusViewerSessionId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A06), "statusViewerTrafficActionType", A0u);
    }
}
