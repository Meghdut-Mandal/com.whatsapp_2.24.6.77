package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RZ  reason: invalid class name */
public final class AnonymousClass2RZ extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass2RZ() {
        super(4316, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A03);
        r3.Bpz(1, this.A00);
        r3.Bpz(9, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(6, this.A06);
        r3.Bpz(11, this.A04);
        r3.Bpz(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0R(C36331k8.A0J(C36391kE.A0r(), this.A03, A1G), this.A00, A1G), this.A01, A1G);
        A1G.put(C36331k8.A0O(C36371kC.A0o(), this.A02, A1G), this.A06);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0N(C36421kH.A0U(), this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 10);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChannelOpen {");
        C20910yM.A00(this.A03, "channelDirectorySessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "channelEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "channelEntryPointMetadata", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "channelUserType", A0u);
        C20910yM.A00(this.A06, "cid", A0u);
        C20910yM.A00(this.A04, "similarChannelsSessionId", A0u);
        return C36321k7.A0C(this.A05, "unreadMessages", A0u);
    }
}
