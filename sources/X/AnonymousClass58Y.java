package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58Y  reason: invalid class name */
public final class AnonymousClass58Y extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public AnonymousClass58Y() {
        super(494, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A03);
        r3.Bpz(14, this.A00);
        r3.Bpz(9, this.A04);
        r3.Bpz(17, this.A05);
        r3.Bpz(3, this.A06);
        r3.Bpz(5, this.A02);
        r3.Bpz(2, this.A07);
        r3.Bpz(6, this.A01);
        r3.Bpz(15, this.A08);
        r3.Bpz(16, this.A09);
        r3.Bpz(13, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(C36351kA.A0s(C36341k9.A0b(C36331k8.A0O(C36331k8.A0K(C36331k8.A0N(C36331k8.A0L(C36351kA.A0t(C36331k8.A0R(C36341k9.A0a(C36391kE.A0r(), this.A03, A1G), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A02, A1G), this.A07, A1G), this.A01, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCrashLog {");
        C20910yM.A00(this.A03, "androidAppStateMetadata", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "androidApplicationState", A0u);
        C20910yM.A00(this.A04, "androidCrashedBuildVersion", A0u);
        C20910yM.A00(this.A05, "androidExitReasonDescription", A0u);
        C20910yM.A00(this.A06, "crashContext", A0u);
        C20910yM.A00(this.A02, "crashCount", A0u);
        C20910yM.A00(this.A07, "crashReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "crashType", A0u);
        C20910yM.A00(this.A08, "lastSurface", A0u);
        C20910yM.A00(this.A09, "runningTasks", A0u);
        return C36321k7.A0C(this.A0A, "secondaryProcessName", A0u);
    }
}
