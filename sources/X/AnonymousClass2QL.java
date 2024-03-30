package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QL  reason: invalid class name */
public final class AnonymousClass2QL extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, (Object) null);
        r3.Bpz(2, this.A01);
        r3.Bpz(6, (Object) null);
        r3.Bpz(4, this.A03);
    }

    public AnonymousClass2QL() {
        super(2180, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36361kB.A0i(), this.A02, A1G), this.A00);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36361kB.A0j(), this.A01);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36371kC.A0o(), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdDeviceSyncAck {");
        C20910yM.A00(C36331k8.A0h(this.A02), "chatType", A0u);
        C20910yM.A00(this.A00, "isLid", A0u);
        String str = null;
        AnonymousClass00C.A0D("localAddressingMode", 1);
        C20910yM.A00(this.A01, "revoke", A0u);
        AnonymousClass00C.A0D("serverAddressingMode", 1);
        Integer num = this.A03;
        if (num != null) {
            str = num.toString();
        }
        return C36321k7.A0C(str, "typeOfGroup", A0u);
    }
}
