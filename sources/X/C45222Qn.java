package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qn  reason: invalid class name and case insensitive filesystem */
public final class C45222Qn extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(6, this.A03);
        r3.Bpz(7, this.A02);
    }

    public C45222Qn() {
        super(5204, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A04, A1G), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCoexPrivacySysMsg {");
        C20910yM.A00(this.A04, "coexSysMsgBusinessId", A0u);
        C20910yM.A00(this.A00, "coexSysMsgInsertionSuccess", A0u);
        C20910yM.A00(this.A01, "coexSysMsgIsSelf", A0u);
        C20910yM.A00(this.A03, "coexSysMsgMultiDeviceId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "coexSysMsgStateTransitionAttempt", A0u);
    }
}
