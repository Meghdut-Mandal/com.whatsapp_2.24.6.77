package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2O1  reason: invalid class name */
public final class AnonymousClass2O1 extends C20890yK {
    public Integer A00;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, (Object) null);
        r3.Bpz(1, this.A00);
    }

    public AnonymousClass2O1() {
        super(2908, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 2);
        C36321k7.A1I(C36361kB.A0i(), this.A00, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWaShopsManagement {");
        String str = null;
        AnonymousClass00C.A0D("isShopsProductPreviewVisible", 1);
        Integer num = this.A00;
        if (num != null) {
            str = num.toString();
        }
        return C36321k7.A0C(str, "shopsManagementAction", A0u);
    }
}
