package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RA  reason: invalid class name */
public final class AnonymousClass2RA extends C20890yK {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public AnonymousClass2RA() {
        super(3982, C36441kJ.A0p(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(C36371kC.A0p(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamXappCommunicationDetection {");
        C20910yM.A00(this.A00, "buildId", A0u);
        C20910yM.A00(this.A01, "uriAuthority", A0u);
        C20910yM.A00(this.A02, "xappCommunicationOperation", A0u);
        C20910yM.A00(this.A03, "xappCommunicationScope", A0u);
        return C36321k7.A0C(this.A04, "xappContext", A0u);
    }
}
