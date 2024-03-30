package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R1  reason: invalid class name */
public final class AnonymousClass2R1 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass2R1() {
        super(4746, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(C36381kD.A0n(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsChannelPostForward {");
        C20910yM.A00(C36331k8.A0h(this.A00), "channelForwardContentType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "channelForwardGroupType", A0u);
        C20910yM.A00(this.A03, "cid", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A02), A0u);
        return C36321k7.A0C(this.A04, "postId", A0u);
    }
}
