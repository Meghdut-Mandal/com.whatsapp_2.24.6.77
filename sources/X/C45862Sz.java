package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sz  reason: invalid class name and case insensitive filesystem */
public final class C45862Sz extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public C45862Sz() {
        super(3790, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A06);
        r3.Bpz(10, this.A09);
        r3.Bpz(2, this.A07);
        r3.Bpz(14, this.A0B);
        r3.Bpz(15, this.A00);
        r3.Bpz(16, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(11, this.A0A);
        r3.Bpz(17, this.A0C);
        r3.Bpz(7, this.A0D);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A08);
        r3.Bpz(12, this.A0E);
        r3.Bpz(9, this.A05);
        r3.Bpz(8, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(C36331k8.A0T(C36331k8.A0L(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0K(C36331k8.A0S(C36361kB.A0i(), this.A06, A1G), this.A09, A1G), this.A07, A1G), this.A0B, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A0A, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 18);
        C36331k8.A1Q((Object) null, A1G, 19);
        A1G.put(C36331k8.A0Q(C36331k8.A0R(C36331k8.A0U(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0P(C36431kI.A13(), this.A0C, A1G), this.A0D, A1G), this.A03, A1G), this.A04, A1G), this.A08, A1G), this.A0E, A1G), this.A05, A1G), this.A0F);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQbmIncomingMessage {");
        C20910yM.A00(C36331k8.A0h(this.A06), "chatsFolderType", A0u);
        C20910yM.A00(this.A09, "companionDevices", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "contactType", A0u);
        C20910yM.A00(this.A0B, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A02, "keepChatsArchivedEnabled", A0u);
        C20910yM.A00(this.A0A, "lastOutgoingMessageDeltaTime", A0u);
        C20910yM.A00(this.A0C, "messageIdHmac", A0u);
        C20910yM.A00(this.A0D, "messageTypeStr", A0u);
        C20910yM.A00(this.A03, "muted", A0u);
        C20910yM.A00(this.A04, "notificationEnabled", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "qbmFlag", A0u);
        C20910yM.A00(this.A0E, "qbmFlagStr", A0u);
        C20910yM.A00(this.A05, "readReceiptsEnabled", A0u);
        return C36321k7.A0C(this.A0F, "threadIdHmac", A0u);
    }
}