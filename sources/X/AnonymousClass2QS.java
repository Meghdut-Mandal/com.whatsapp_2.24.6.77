package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QS  reason: invalid class name */
public final class AnonymousClass2QS extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A02);
        r3.Bpz(1, this.A00);
    }

    public AnonymousClass2QS() {
        super(2740, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A01, A1G), this.A03, A1G), this.A02, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerCommonQueryToStaticServer {");
        C20910yM.A00(this.A01, "httpResponseCode", A0u);
        C20910yM.A00(this.A03, "params", A0u);
        C20910yM.A00(this.A02, "queryLatencyMs", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "queryType", A0u);
    }
}
