package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Px  reason: invalid class name and case insensitive filesystem */
public final class C45062Px extends C20890yK {
    public Double A00;
    public String A01;
    public String A02;

    public C45062Px() {
        super(2128, new C18950u5(1, 1, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSuperpackDecompressionFailure {");
        C20910yM.A00(this.A01, "assetName", A0u);
        C20910yM.A00(this.A02, "exceptionMessage", A0u);
        return C36321k7.A0C(this.A00, "freeSpaceAvailable", A0u);
    }
}
