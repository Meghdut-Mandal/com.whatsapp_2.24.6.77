package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58P  reason: invalid class name */
public final class AnonymousClass58P extends C20890yK {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public AnonymousClass58P() {
        super(2900, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(10, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(5, this.A00);
        r3.Bpz(7, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(4, this.A01);
        r3.Bpz(6, this.A08);
        r3.Bpz(9, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0O(C36331k8.A0M(C36331k8.A0Q(C36331k8.A0J(C36331k8.A0P(C36331k8.A0N(C36331k8.A0K(C36401kF.A0j(), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A01, A1G), this.A08, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamEncryptedBackupsInitial {");
        C20910yM.A00(this.A03, "backupRestoreInSessionRetryCount", A0u);
        C20910yM.A00(this.A04, "reencryptionMediaFilesEncrypted", A0u);
        C20910yM.A00(this.A00, "reencryptionMediaProgress", A0u);
        C20910yM.A00(this.A05, "reencryptionMediaTime", A0u);
        C20910yM.A00(this.A06, "reencryptionOverallFilesEncrypted", A0u);
        C20910yM.A00(this.A07, "reencryptionOverallMibytes", A0u);
        C20910yM.A00(this.A01, "reencryptionOverallProgress", A0u);
        C20910yM.A00(this.A08, "reencryptionOverallTime", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "reencryptionResult", A0u);
    }
}
