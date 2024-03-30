package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pk  reason: invalid class name and case insensitive filesystem */
public final class C44932Pk extends C20890yK {
    public Boolean A00;
    public String A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
    }

    public C44932Pk() {
        super(4984, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsIdHashHandshake {");
        C20910yM.A00(this.A00, "isDummyHashReturned", A0u);
        C20910yM.A00(this.A01, "thirdPartyAppPackageName", A0u);
        return C36321k7.A0C(this.A02, "thirdPartyAppSignatureHashes", A0u);
    }
}
