package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P5  reason: invalid class name */
public final class AnonymousClass2P5 extends C20890yK {
    public Boolean A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2P5() {
        super(3040, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A00);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0L(C36361kB.A0j(), this.A01, A1G), this.A00, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAdvListTimestampInvalid {");
        C20910yM.A00(this.A01, "advListIncomingTimestampInHours", A0u);
        C20910yM.A00(this.A00, "advListIsExpired", A0u);
        return C36321k7.A0C(this.A02, "advListLocalTimestampInHours", A0u);
    }
}