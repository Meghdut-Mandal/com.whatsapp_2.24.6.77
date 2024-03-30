package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Py  reason: invalid class name and case insensitive filesystem */
public final class C45072Py extends C20890yK {
    public Boolean A00;
    public Long A01;
    public String A02;

    public C45072Py() {
        super(2126, C36441kJ.A0p(1, 20, 200), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSuperpackDecompressionSuccess {");
        C20910yM.A00(this.A02, "assetName", A0u);
        C20910yM.A00(this.A01, "decompressionT", A0u);
        return C36321k7.A0C(this.A00, "isMainThread", A0u);
    }
}
