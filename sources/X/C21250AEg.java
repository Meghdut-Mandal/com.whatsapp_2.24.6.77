package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AEg  reason: case insensitive filesystem */
public class C21250AEg implements B1P {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ C179158jJ A01;

    public C21250AEg(AnonymousClass6C8 r1, C179158jJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BZW(C202059ky r4) {
        C179158jJ.A0j(this.A00, (Map) null, r4.A00);
    }

    public void BZX(C207139uc r5) {
        String str = r5.A02;
        if ("COMPLETED".equals(str)) {
            C179158jJ r2 = this.A01;
            r2.A07.A0B("kyc");
            r2.A0A.A0N("pending");
        }
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("kyc_status", str);
        this.A00.A01("on_success", A0J);
    }
}
