package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2NK  reason: invalid class name */
public final class AnonymousClass2NK extends C20890yK {
    public Integer A00;

    public AnonymousClass2NK() {
        super(4726, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChannelDyi {");
        return C36321k7.A0C(C36331k8.A0h(this.A00), "channelDyiEventType", A0u);
    }
}
