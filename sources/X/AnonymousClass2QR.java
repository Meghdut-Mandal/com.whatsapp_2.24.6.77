package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QR  reason: invalid class name */
public final class AnonymousClass2QR extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(2, this.A03);
    }

    public AnonymousClass2QR() {
        super(1676, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0M(C36331k8.A0J(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusDaily {");
        C20910yM.A00(this.A00, "statusAvailableCountDaily", A0u);
        C20910yM.A00(this.A01, "statusAvailableRowsCountDaily", A0u);
        C20910yM.A00(this.A02, "statusViewedCountDaily", A0u);
        return C36321k7.A0C(this.A03, "statusViewedRowsCountDaily", A0u);
    }
}
