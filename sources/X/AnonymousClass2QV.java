package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QV  reason: invalid class name */
public final class AnonymousClass2QV extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A03);
    }

    public AnonymousClass2QV() {
        super(2588, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0M(C36331k8.A0J(C36361kB.A0j(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamThirdPartyPackImport {");
        C20910yM.A00(this.A00, "animated", A0u);
        C20910yM.A00(this.A01, "importSuccess", A0u);
        C20910yM.A00(this.A02, "stickerCount", A0u);
        return C36321k7.A0C(this.A03, "totalSizeIn10Kb", A0u);
    }
}
