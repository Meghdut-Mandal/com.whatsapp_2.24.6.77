package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bt  reason: invalid class name and case insensitive filesystem */
public final class C176298bt extends C20890yK {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C176298bt() {
        super(5140, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwa1pdConversion {");
        C20910yM.A00(C36331k8.A0h(this.A00), "bizPlatform", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "ctwa1pdConversionType", A0u);
        return C36321k7.A0C(this.A02, "ctwaTrackingPayload", A0u);
    }
}
