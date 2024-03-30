package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T5  reason: invalid class name */
public final class AnonymousClass2T5 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;

    public AnonymousClass2T5() {
        super(932, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(14, this.A0D);
        r3.Bpz(26, this.A0A);
        r3.Bpz(11, this.A0B);
        r3.Bpz(22, this.A00);
        r3.Bpz(2, this.A0E);
        r3.Bpz(10, this.A0F);
        r3.Bpz(5, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(1, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(12, this.A0C);
        r3.Bpz(6, this.A06);
        r3.Bpz(9, this.A07);
        r3.Bpz(20, this.A0M);
        r3.Bpz(7, this.A08);
        r3.Bpz(23, this.A0G);
        r3.Bpz(29, this.A0H);
        r3.Bpz(27, this.A0I);
        r3.Bpz(28, this.A0J);
        r3.Bpz(24, this.A0K);
        r3.Bpz(13, this.A0L);
        r3.Bpz(25, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 16);
        A1G.put(C36401kF.A0k(), this.A0D);
        A1G.put(C36331k8.A0T(26, this.A0A, A1G), this.A0B);
        C36321k7.A1b(A1G, 17);
        A1G.put(22, this.A00);
        C36321k7.A1b(A1G, 19);
        A1G.put(C36331k8.A0P(C36401kF.A0l(C36331k8.A0R(C36331k8.A0O(C36331k8.A0U(C36331k8.A0Q(C36331k8.A0J(C36331k8.A0L(C36331k8.A0M(C36331k8.A0N(C36331k8.A0S(C36361kB.A0j(), this.A0E, A1G), this.A0F, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A0C, A1G), this.A06, A1G), this.A07, A1G), this.A0M, A1G), this.A08);
        C36321k7.A1b(A1G, 18);
        A1G.put(23, this.A0G);
        A1G.put(29, this.A0H);
        A1G.put(27, this.A0I);
        A1G.put(28, this.A0J);
        A1G.put(C36331k8.A0V(24, this.A0K, A1G), this.A0L);
        C36321k7.A1b(A1G, 15);
        A1G.put(C36431kI.A14(), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatDatabaseRestoreEvent {");
        C20910yM.A00(this.A0D, "backupFileIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "backupRestoreMode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "backupRestoreStatusOfBackupFoundAtRestoreTime", A0u);
        C20910yM.A00(this.A00, "cleanedBackup", A0u);
        C20910yM.A00(this.A0E, "databaseBackupVersion", A0u);
        C20910yM.A00(this.A0F, "databaseDumpAndRestoreRecoveryPercentage", A0u);
        C20910yM.A00(this.A01, "databaseRepairEnabled", A0u);
        C20910yM.A00(this.A02, "databaseRestoreCorrectJid", A0u);
        C20910yM.A00(this.A03, "databaseRestoreFileIntegrityCheck", A0u);
        C20910yM.A00(this.A04, "databaseRestoreOverallResult", A0u);
        C20910yM.A00(this.A05, "databaseRestoreReindexingResult", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0C), "databaseRestoreResultDetails", A0u);
        C20910yM.A00(this.A06, "databaseRestoreSqliteIntegrityCheckResult", A0u);
        C20910yM.A00(this.A07, "dbDumpAndRestoreResult", A0u);
        C20910yM.A00(this.A0M, "genericFailureReason", A0u);
        C20910yM.A00(this.A08, "hasOnlyIndexErrors", A0u);
        C20910yM.A00(this.A0G, "restoreChatDbTimeSec", A0u);
        C20910yM.A00(this.A0H, "restoreFailedIncrementIndex", A0u);
        C20910yM.A00(this.A0I, "restoreIncrementFileCount", A0u);
        C20910yM.A00(this.A0J, "restoreIncrementsTimeSec", A0u);
        C20910yM.A00(this.A0K, "restoreIndexesTimeSec", A0u);
        C20910yM.A00(this.A0L, "restoreTimeBackupFilesCount", A0u);
        return C36321k7.A0C(this.A09, "restoredIndexes", A0u);
    }
}
