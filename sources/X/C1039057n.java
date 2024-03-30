package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.57n  reason: invalid class name and case insensitive filesystem */
public final class C1039057n extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C1039057n() {
        super(3580, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A02);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0M(C36371kC.A0n(), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidRootedDeviceCheck {");
        C20910yM.A00(this.A02, "checkLocation", A0u);
        C20910yM.A00(this.A00, "rwPaths", A0u);
        return C36321k7.A0C(this.A01, "suExists", A0u);
    }
}
