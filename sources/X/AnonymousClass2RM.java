package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RM  reason: invalid class name */
public final class AnonymousClass2RM extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass2RM() {
        super(3534, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(6, this.A02);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0O(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A00, A1G), this.A03, A1G), this.A05, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamLocalBackup {");
        C20910yM.A00(C36331k8.A0h(this.A01), "backupSchedule", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "backupType", A0u);
        C20910yM.A00(this.A00, "localBackupGoogleBackupScheduled", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "localBackupResult", A0u);
        C20910yM.A00(this.A05, "localBackupStartTimestamp", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A04), "localBackupTriggerType", A0u);
    }
}