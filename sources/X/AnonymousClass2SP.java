package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SP  reason: invalid class name */
public final class AnonymousClass2SP extends C20890yK {
    public Double A00;
    public Double A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public AnonymousClass2SP() {
        super(2100, C36441kJ.A0p(1, 10, 1000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(12, this.A06);
        r3.Bpz(10, this.A09);
        r3.Bpz(8, this.A07);
        r3.Bpz(7, this.A08);
        r3.Bpz(6, this.A00);
        r3.Bpz(11, this.A0A);
        r3.Bpz(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0N(C36331k8.A0T(C36331k8.A0O(C36331k8.A0P(C36331k8.A0Q(C36331k8.A0S(C36331k8.A0U(C36331k8.A0L(C36331k8.A0M(C36331k8.A0J(C36361kB.A0j(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A09, A1G), this.A07, A1G), this.A08, A1G), this.A00, A1G), this.A0A, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidBatteryUsage {");
        C20910yM.A00(this.A02, "networkMobileBytesRx", A0u);
        C20910yM.A00(this.A03, "networkMobileBytesTx", A0u);
        C20910yM.A00(this.A04, "networkWifiBytesRx", A0u);
        C20910yM.A00(this.A05, "networkWifiBytesTx", A0u);
        C20910yM.A00(this.A06, "numberPushNotifications", A0u);
        C20910yM.A00(this.A09, "sessionName", A0u);
        C20910yM.A00(this.A07, "sessionUpT", A0u);
        C20910yM.A00(this.A08, "sessionWallclockT", A0u);
        C20910yM.A00(this.A00, "systemCpuTime", A0u);
        C20910yM.A00(this.A0A, "tags", A0u);
        return C36321k7.A0C(this.A01, "userCpuTime", A0u);
    }
}
