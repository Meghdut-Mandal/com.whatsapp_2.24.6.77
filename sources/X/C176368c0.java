package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c0  reason: invalid class name and case insensitive filesystem */
public final class C176368c0 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A03);
    }

    public C176368c0() {
        super(4870, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A04);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMetaVerifiedInteraction {");
        C20910yM.A00(this.A04, "businessOwnerJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "metaVerifiedInteractionAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "metaVerifiedInteractionAssetType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "metaVerifiedInteractionReferral", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "metaVerifiedInteractionSurface", A0u);
    }
}
