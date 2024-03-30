package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58J  reason: invalid class name */
public final class AnonymousClass58J extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public AnonymousClass58J() {
        super(1368, new C18950u5(1, 1, 5, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A04);
        r3.Bpz(6, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(7, this.A02);
        r3.Bpz(8, this.A07);
        r3.Bpz(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 5);
        A1G.put(C36331k8.A0L(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0R(C36331k8.A0J(C36331k8.A0K(C36331k8.A0O(C36371kC.A0o(), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A02, A1G), this.A07, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidEmojiDictionaryFetch {");
        C20910yM.A00(this.A04, "currentLanguages", A0u);
        C20910yM.A00(this.A00, "doNetworkFetch", A0u);
        C20910yM.A00(this.A01, "isFirstAttempt", A0u);
        C20910yM.A00(this.A05, "requestedLanguages", A0u);
        C20910yM.A00(this.A06, "result", A0u);
        C20910yM.A00(this.A02, "resultHttpCode", A0u);
        C20910yM.A00(this.A07, "resultLanguages", A0u);
        return C36321k7.A0C(this.A03, "timeSinceLastRequestMsT", A0u);
    }
}
