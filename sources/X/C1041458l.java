package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58l  reason: invalid class name and case insensitive filesystem */
public final class C1041458l extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;

    public C1041458l() {
        super(486, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A02);
        r3.Bpz(19, this.A0B);
        r3.Bpz(5, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A0C);
        r3.Bpz(12, this.A03);
        r3.Bpz(9, this.A04);
        r3.Bpz(22, this.A09);
        r3.Bpz(13, this.A05);
        r3.Bpz(1, this.A0A);
        r3.Bpz(6, this.A0D);
        r3.Bpz(7, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(10, this.A08);
        r3.Bpz(23, this.A0E);
        r3.Bpz(14, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 16);
        A1G.put(C36331k8.A0U(C36331k8.A0L(C36331k8.A0K(C36331k8.A0N(C36381kD.A0o(C36391kE.A0r(), this.A02, A1G), this.A0B, A1G), this.A00, A1G), this.A01, A1G), this.A0C, A1G), this.A03);
        C36321k7.A1b(A1G, 20);
        A1G.put(C36331k8.A0J(C36331k8.A0V(C90474aD.A0X(C36401kF.A0i(), this.A04, A1G), this.A09, A1G), this.A05, A1G), this.A0A);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0S(C36331k8.A0T(C36331k8.A0P(C36381kD.A0n(), this.A0D, A1G), this.A06, A1G), this.A07, A1G), this.A08);
        C36331k8.A1Q(C36341k9.A0c(A1G, 21), A1G, 17);
        A1G.put(C36341k9.A0a(23, this.A0E, A1G), this.A0F);
        C36321k7.A1b(A1G, 15);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamRestore {");
        C20910yM.A00(this.A02, "backupRestoreChatdbSize", A0u);
        C20910yM.A00(this.A0B, "backupRestoreEncryptionVersion", A0u);
        C20910yM.A00(this.A00, "backupRestoreIncludeVideos", A0u);
        C20910yM.A00(this.A01, "backupRestoreIsFull", A0u);
        C20910yM.A00(this.A0C, "backupRestoreIsWifi", A0u);
        C20910yM.A00(this.A03, "backupRestoreMediaFileCount", A0u);
        C20910yM.A00(this.A04, "backupRestoreMediaSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "backupRestoreMode", A0u);
        C20910yM.A00(this.A05, "backupRestoreNetworkRequestCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "backupRestoreResult", A0u);
        C20910yM.A00(this.A0D, "backupRestoreT", A0u);
        C20910yM.A00(this.A06, "backupRestoreTotalSize", A0u);
        C20910yM.A00(this.A07, "backupRestoreTransferFailedSize", A0u);
        C20910yM.A00(this.A08, "backupRestoreTransferSize", A0u);
        C20910yM.A00(this.A0E, "incrementalBackupRestoreFileCount", A0u);
        return C36321k7.A0C(this.A0F, "restoreConcurrentReadsCount", A0u);
    }
}
