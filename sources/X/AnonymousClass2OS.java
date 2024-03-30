package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OS  reason: invalid class name */
public final class AnonymousClass2OS extends C20890yK {
    public Integer A00;
    public Long A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A01);
        r3.Bpz(1, this.A00);
    }

    public AnonymousClass2OS() {
        super(1034, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36331k8.A0Q(C36331k8.A0R(C36331k8.A0J(C36331k8.A0S(C36331k8.A0K(C36331k8.A0P(C36331k8.A0M(C36331k8.A0N(C36331k8.A0O(C36371kC.A0n(), this.A01, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamForwardPicker {");
        C20910yM.A00(this.A01, "forwardPickerContactsSelected", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "forwardPickerResult", A0u);
    }
}
