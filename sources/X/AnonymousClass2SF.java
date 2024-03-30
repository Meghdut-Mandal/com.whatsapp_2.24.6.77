package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SF  reason: invalid class name */
public final class AnonymousClass2SF extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass2SF() {
        super(4692, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(7, this.A05);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(10, this.A03);
        r3.Bpz(4, this.A08);
        r3.Bpz(9, this.A06);
        r3.Bpz(5, this.A09);
        r3.Bpz(6, this.A04);
        r3.Bpz(13, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0S(C36331k8.A0L(C36331k8.A0K(C36331k8.A0P(C36361kB.A0i(), this.A00, A1G), this.A05, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        C36321k7.A1b(A1G, 12);
        A1G.put(C36331k8.A0V(C36331k8.A0O(C36331k8.A0N(C36331k8.A0R(C36371kC.A0o(), this.A08, A1G), this.A06, A1G), this.A09, A1G), this.A04, A1G), this.A07);
        C36321k7.A1b(A1G, 11);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChannelCoreEvent {");
        C20910yM.A00(C36331k8.A0h(this.A00), "channelCoreEventType", A0u);
        C20910yM.A00(this.A05, "channelDirectorySessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "channelEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "channelEntryPointApp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "channelEntryPointMetadata", A0u);
        C20910yM.A00(this.A08, "cid", A0u);
        C20910yM.A00(this.A06, "directoryChannelIndex", A0u);
        C20910yM.A00(this.A09, "entryPointMetadata", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "eventSurface", A0u);
        return C36321k7.A0C(this.A07, "similarChannelsSessionId", A0u);
    }
}
