package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.57q  reason: invalid class name and case insensitive filesystem */
public final class C1039357q extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public C1039357q() {
        super(4418, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSearchExpressionsSessionStarted {");
        C20910yM.A00(C36331k8.A0h(this.A00), "expressionsSearchScreen", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "expressionsSearchSendOrigin", A0u);
        return C36321k7.A0C(this.A02, "searchExpressionSessionStartedTimestamp", A0u);
    }
}
