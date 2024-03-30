package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58I  reason: invalid class name */
public final class AnonymousClass58I extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public AnonymousClass58I() {
        super(4766, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A00);
        r3.Bpz(1, this.A02);
        r3.Bpz(8, this.A03);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0Q(C36331k8.A0J(C36401kF.A0h(), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A01, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAiStickerLatency {");
        C20910yM.A00(this.A00, "containsAnimated", A0u);
        C20910yM.A00(this.A02, "downloadLatency", A0u);
        C20910yM.A00(this.A03, "downloadLatencyFull", A0u);
        C20910yM.A00(this.A01, "includesUserCreation", A0u);
        C20910yM.A00(this.A04, "responseLatency", A0u);
        C20910yM.A00(this.A05, "serverLlmTime", A0u);
        C20910yM.A00(this.A06, "serverStickerGenTime", A0u);
        return C36321k7.A0C(this.A07, "stickerSessionId", A0u);
    }
}
