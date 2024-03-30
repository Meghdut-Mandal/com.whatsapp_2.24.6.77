package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P1  reason: invalid class name */
public final class AnonymousClass2P1 extends C20890yK {
    public Long A00;
    public Long A01;

    public AnonymousClass2P1() {
        super(4358, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWamDroppedEvent {");
        C20910yM.A00(this.A00, "droppedEventCode", A0u);
        return C36321k7.A0C(this.A01, "droppedEventCount", A0u);
    }
}
