package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QO  reason: invalid class name */
public final class AnonymousClass2QO extends C20890yK {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass2QO() {
        super(4724, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamNuxFacepileInfo {");
        C20910yM.A00(this.A00, "favoritedList", A0u);
        C20910yM.A00(this.A01, "frequentlyContactedList", A0u);
        C20910yM.A00(this.A02, "presenceList", A0u);
        return C36321k7.A0C(this.A03, "withProfilePicList", A0u);
    }
}
