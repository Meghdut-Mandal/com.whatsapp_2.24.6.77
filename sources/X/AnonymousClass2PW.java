package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PW  reason: invalid class name */
public final class AnonymousClass2PW extends C20890yK {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass2PW() {
        super(2880, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(32, (Object) null);
        r3.Bpz(28, this.A01);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        Object A0c = C36341k9.A0c(A1G, 14);
        C36331k8.A1Q(A0c, A1G, 13);
        C36331k8.A1Q(A0c, A1G, 16);
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0T(C36331k8.A0U(C36331k8.A0R(C36331k8.A0S(C36331k8.A0P(C36331k8.A0Q(C36421kH.A0W(), A0c, A1G), A0c, A1G), A0c, A1G), A0c, A1G), A0c, A1G), A0c, A1G), A0c, A1G), A0c, A1G), A0c);
        C36331k8.A1Q(A0c, A1G, 29);
        C36331k8.A1Q(A0c, A1G, 30);
        C36331k8.A1Q(A0c, A1G, 31);
        C36331k8.A1Q(A0c, A1G, 26);
        A1G.put(C36331k8.A0K(27, A0c, A1G), this.A00);
        A1G.put(C36331k8.A0O(32, (Object) null, A1G), (Object) null);
        A1G.put(28, this.A01);
        A1G.put(C36331k8.A0N(C36331k8.A0J(33, C36341k9.A0c(A1G, 24), A1G), this.A02, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 25);
        C36331k8.A1Q((Object) null, A1G, 18);
        C36331k8.A1Q((Object) null, A1G, 19);
        C36331k8.A1Q((Object) null, A1G, 20);
        C36331k8.A1Q((Object) null, A1G, 21);
        C36331k8.A1Q((Object) null, A1G, 22);
        C36331k8.A1Q((Object) null, A1G, 23);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDirectoryBusinessOnboardingSmbClient {");
        C20910yM.A00(C36331k8.A0h(this.A00), "directoryEntryPoint", A0u);
        AnonymousClass00C.A0D("directoryEntrypointVersion", 1);
        C20910yM.A00(this.A01, "directoryOnboardingLoggingVersion", A0u);
        return C36321k7.A0C(this.A02, "directorySessionId", A0u);
    }
}
