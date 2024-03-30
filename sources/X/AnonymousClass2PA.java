package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PA  reason: invalid class name */
public final class AnonymousClass2PA extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass2PA() {
        super(2170, C36441kJ.A0p(1, SearchActionVerificationClientService.NOTIFICATION_ID, 20000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 11);
        A1G.put(C36361kB.A0i(), this.A02);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0K(C36331k8.A0Q(C36331k8.A0M(C36331k8.A0N(C36331k8.A0P(C36331k8.A0O(C36371kC.A0n(), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidMessageTargetPerf {");
        C20910yM.A00(this.A02, "durationReceiptT", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A00), A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "targetStage", A0u);
    }
}
