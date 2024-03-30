package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QT  reason: invalid class name */
public final class AnonymousClass2QT extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;

    public AnonymousClass2QT() {
        super(2796, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A03);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerContextualSuggestionDailyCount {");
        C20910yM.A00(this.A00, "numClicked", A0u);
        C20910yM.A00(this.A01, "numStickersSent", A0u);
        C20910yM.A00(this.A03, "numStickersSuggestionsArray", A0u);
        return C36321k7.A0C(this.A02, "numTriggered", A0u);
    }
}
