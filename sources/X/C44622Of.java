package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Of  reason: invalid class name and case insensitive filesystem */
public final class C44622Of extends C20890yK {
    public String A00;
    public String A01;

    public C44622Of() {
        super(4606, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMuteGroupIntegrityContext {");
        C20910yM.A00(this.A00, "groupAdderJid", A0u);
        return C36321k7.A0C(this.A01, "mutedGroupJid", A0u);
    }
}
