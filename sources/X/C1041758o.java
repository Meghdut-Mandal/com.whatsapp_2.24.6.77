package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58o  reason: invalid class name and case insensitive filesystem */
public final class C1041758o extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;

    public C1041758o() {
        super(1006, new C18950u5(1, 20, 100, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(20, this.A05);
        r3.Bpz(10, this.A06);
        r3.Bpz(19, this.A07);
        r3.Bpz(22, this.A08);
        r3.Bpz(14, this.A09);
        r3.Bpz(16, this.A0A);
        r3.Bpz(17, this.A0B);
        r3.Bpz(12, this.A00);
        r3.Bpz(21, this.A0C);
        r3.Bpz(6, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(15, this.A0D);
        r3.Bpz(7, this.A0E);
        r3.Bpz(8, this.A03);
        r3.Bpz(11, this.A0F);
        r3.Bpz(13, this.A0G);
        r3.Bpz(18, this.A0H);
        r3.Bpz(9, this.A04);
        r3.Bpz(1, this.A0I);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0L(C36331k8.A0M(C36331k8.A0J(C36331k8.A0R(C36371kC.A0q(C36331k8.A0V(C36331k8.A0T(C36331k8.A0Q(C36331k8.A0P(C36341k9.A0b(C36331k8.A0N(C36331k8.A0O(C36411kG.A0s(C36331k8.A0U(C36351kA.A0t(C36351kA.A0s(C36341k9.A0a(C90474aD.A0X(C36381kD.A0o(C36331k8.A0S(20, this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A00, A1G), this.A0C, A1G), this.A01, A1G), this.A02, A1G), this.A0D, A1G), this.A0E, A1G), this.A03, A1G), this.A0F, A1G), this.A0G, A1G), this.A0H, A1G), this.A04, A1G), this.A0I, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamContactSyncEvent {");
        C20910yM.A00(this.A05, "contactSyncBusinessResponseNew", A0u);
        C20910yM.A00(this.A06, "contactSyncChangedVersionRowCount", A0u);
        C20910yM.A00(this.A07, "contactSyncDeviceResponseNew", A0u);
        C20910yM.A00(this.A08, "contactSyncDisappearingModeResponseNew", A0u);
        C20910yM.A00(this.A09, "contactSyncErrorCode", A0u);
        C20910yM.A00(this.A0A, "contactSyncFailureProtocol", A0u);
        C20910yM.A00(this.A0B, "contactSyncLatency", A0u);
        C20910yM.A00(this.A00, "contactSyncNoop", A0u);
        C20910yM.A00(this.A0C, "contactSyncPayResponseNew", A0u);
        C20910yM.A00(this.A01, "contactSyncRequestClearWaSyncData", A0u);
        C20910yM.A00(this.A02, "contactSyncRequestIsUrgent", A0u);
        C20910yM.A00(this.A0D, "contactSyncRequestProtocol", A0u);
        C20910yM.A00(this.A0E, "contactSyncRequestRetryCount", A0u);
        C20910yM.A00(this.A03, "contactSyncRequestShouldRetry", A0u);
        C20910yM.A00(this.A0F, "contactSyncRequestedCount", A0u);
        C20910yM.A00(this.A0G, "contactSyncResponseCount", A0u);
        C20910yM.A00(this.A0H, "contactSyncStatusResponseNew", A0u);
        C20910yM.A00(this.A04, "contactSyncSuccess", A0u);
        return C36321k7.A0C(this.A0I, "contactSyncType", A0u);
    }
}
