package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PH  reason: invalid class name */
public final class AnonymousClass2PH extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass2PH() {
        super(3426, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(4, this.A00);
    }

    public static AnonymousClass2PH A00(C62813Hq r2) {
        AnonymousClass2PH r1 = new AnonymousClass2PH();
        r1.A01 = Integer.valueOf(r2.A00);
        return r1;
    }

    public static void A01(C62813Hq r1, AnonymousClass2PH r2, int i) {
        r2.A02 = Integer.valueOf(i);
        r2.A00 = false;
        r1.A01.Bly(r2);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCadminDemote {");
        C20910yM.A00(C36331k8.A0h(this.A01), "cadminDemoteOrigin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "cadminDemoteResult", A0u);
        return C36321k7.A0C(this.A00, "isLastCadminOrCreator", A0u);
    }
}
