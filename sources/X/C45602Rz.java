package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rz  reason: invalid class name and case insensitive filesystem */
public final class C45602Rz extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public C45602Rz() {
        super(2130, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(3, this.A08);
        r3.Bpz(6, this.A00);
        r3.Bpz(8, this.A01);
        r3.Bpz(7, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(9, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0K(C36331k8.A0J(C36331k8.A0P(C36331k8.A0Q(C36331k8.A0O(C36331k8.A0L(C36331k8.A0N(C36371kC.A0o(), this.A05, A1G), this.A06, A1G), this.A08, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidInviteEvent {");
        C20910yM.A00(this.A05, "inviteAddressbookSize", A0u);
        C20910yM.A00(this.A06, "inviteAddressbookWhatsappSize", A0u);
        C20910yM.A00(this.A08, "inviteAppName", A0u);
        C20910yM.A00(this.A00, "inviteContactPermissionDisabled", A0u);
        C20910yM.A00(this.A01, "inviteContactWithMultiplePhoneNumbersClicked", A0u);
        C20910yM.A00(this.A02, "inviteContactWithMultiplePhoneNumbersExists", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "inviteEventType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "inviteSource", A0u);
        return C36321k7.A0C(this.A07, "totalUniqueInvitesCount", A0u);
    }
}
