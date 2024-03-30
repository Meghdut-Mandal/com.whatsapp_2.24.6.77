package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sv  reason: invalid class name and case insensitive filesystem */
public final class C45822Sv extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public C45822Sv() {
        super(976, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(17, this.A05);
        r3.Bpz(4, this.A04);
        r3.Bpz(1, this.A06);
        r3.Bpz(2, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(12, this.A00);
        r3.Bpz(10, this.A0C);
        r3.Bpz(18, this.A0D);
        r3.Bpz(19, this.A0E);
        r3.Bpz(13, this.A01);
        r3.Bpz(3, this.A09);
        r3.Bpz(14, this.A0A);
        r3.Bpz(9, this.A0F);
        r3.Bpz(15, this.A02);
        r3.Bpz(5, this.A0B);
        r3.Bpz(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36431kI.A13(), this.A05);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0V(C36381kD.A0o(C36371kC.A0q(C36331k8.A0S(C36331k8.A0U(C36331k8.A0O(C36331k8.A0K(C36331k8.A0J(C36371kC.A0o(), this.A04, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A00, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A01);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36351kA.A0s(C36331k8.A0N(C36341k9.A0b(C36331k8.A0R(C36341k9.A0a(C36371kC.A0n(), this.A09, A1G), this.A0A, A1G), this.A0F, A1G), this.A02, A1G), this.A0B, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatDatabaseBackupEvent {");
        C20910yM.A00(C36331k8.A0h(this.A05), "backupType", A0u);
        C20910yM.A00(this.A04, "compressionRatio", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "databaseBackupOverallResult", A0u);
        C20910yM.A00(this.A07, "databaseBackupVersion", A0u);
        C20910yM.A00(this.A08, "freeDiskSpace", A0u);
        C20910yM.A00(this.A00, "ftsCleaned", A0u);
        C20910yM.A00(this.A0C, "genericBackupFailureReason", A0u);
        C20910yM.A00(this.A0D, "incrementalBackupFailedSystemMsgTypes", A0u);
        C20910yM.A00(this.A0E, "incrementalBackupFailedUsrMsgTypes", A0u);
        C20910yM.A00(this.A01, "indexesCleaned", A0u);
        C20910yM.A00(this.A09, "msgstoreBackupSize", A0u);
        C20910yM.A00(this.A0A, "savingsPercentageFromCleaning", A0u);
        C20910yM.A00(this.A0F, "sqliteVersion", A0u);
        C20910yM.A00(this.A02, "thumbnailsCleaned", A0u);
        C20910yM.A00(this.A0B, "totalBackupT", A0u);
        return C36321k7.A0C(this.A03, "vacuumed", A0u);
    }
}
