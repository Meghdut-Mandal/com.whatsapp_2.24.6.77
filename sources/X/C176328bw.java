package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bw  reason: invalid class name and case insensitive filesystem */
public final class C176328bw extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A03);
    }

    public C176328bw() {
        super(3266, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A02, A1G), this.A01, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsPhoneNumberHyperlink {");
        C20910yM.A00(this.A00, "isPhoneNumHyperlinkOwner", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "phoneNumHyperlinkAction", A0u);
        C20910yM.A00(this.A01, "phoneNumberStatusOnWa", A0u);
        return C36321k7.A0C(this.A03, "sequenceNumber", A0u);
    }
}
