package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Re  reason: invalid class name and case insensitive filesystem */
public final class C45392Re extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C45392Re() {
        super(3488, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A02);
        r3.Bpz(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A00, A1G), this.A04, A1G), this.A01, A1G), this.A05, A1G), this.A02, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamKeepInChatPerf {");
        C20910yM.A00(this.A03, "chatEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "kicErrorCode", A0u);
        C20910yM.A00(this.A04, "kicMessageEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "kicRequestType", A0u);
        C20910yM.A00(this.A05, "requestSendTime", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A0u);
        return C36321k7.A0C(this.A06, "threadId", A0u);
    }
}
