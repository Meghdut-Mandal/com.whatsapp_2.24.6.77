package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PV  reason: invalid class name */
public final class AnonymousClass2PV extends C20890yK {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass2PV() {
        super(4796, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A01);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0L(C36361kB.A0j(), this.A02, A1G), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDeviceBackupSetting {");
        C20910yM.A00(this.A02, "deviceBackupSettingError", A0u);
        C20910yM.A00(this.A01, "deviceBackupSettingGoogleAccountCount", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "deviceBackupSettingStatus", A0u);
    }
}
