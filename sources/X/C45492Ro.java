package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ro  reason: invalid class name and case insensitive filesystem */
public final class C45492Ro extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C45492Ro() {
        super(2350, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(3, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(4, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0J(C36331k8.A0M(C36331k8.A0K(C36331k8.A0L(C36331k8.A0N(C36381kD.A0n(), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStorageManagement {");
        C20910yM.A00(this.A03, "storageManagementDeletedNumFiles", A0u);
        C20910yM.A00(this.A04, "storageManagementDeletedSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "storageManagementEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "storageManagementEventType", A0u);
        C20910yM.A00(this.A05, "storageManagementOverallSize", A0u);
        C20910yM.A00(this.A06, "storageManagementSessionId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "storageManagementVersion", A0u);
    }
}
