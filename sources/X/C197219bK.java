package X;

import org.json.JSONObject;

/* renamed from: X.9bK  reason: invalid class name and case insensitive filesystem */
public class C197219bK {
    public C207119ua A00;

    public C197219bK(AnonymousClass16T r4, C184308sE r5) {
        C199449fK r2 = new C199449fK();
        r2.A02 = r4.A01(r5.A01);
        r2.A01 = Long.parseLong(r5.A03);
        r2.A00 = Integer.parseInt(r5.A02);
        this.A00 = r2.A01();
    }

    public C197219bK(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        C199449fK r1 = new C199449fK();
        r1.A02 = AnonymousClass16W.A06;
        r1.A01();
        this.A00 = new C199449fK(C36441kJ.A1C(A1C.getString("min_amount"))).A01();
    }
}
