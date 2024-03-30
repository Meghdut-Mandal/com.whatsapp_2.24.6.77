package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AEh  reason: case insensitive filesystem */
public class C21251AEh implements B1P {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6C8 A01;
    public final /* synthetic */ BrazilPayBloksActivity A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C21251AEh(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str, String str2, Map map, int i) {
        this.A02 = brazilPayBloksActivity;
        this.A04 = str;
        this.A01 = r1;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = map;
    }

    public void BZW(C202059ky r6) {
        int i;
        int i2 = r6.A00;
        if (i2 != 1448 || (i = this.A00) >= 1) {
            C179158jJ.A0j(this.A01, (Map) null, i2);
            return;
        }
        BrazilPayBloksActivity.A0J(this.A01, this.A02, this.A05, i + 1);
    }

    public void BZX(C207139uc r7) {
        String str;
        boolean equals = "COMPLETED".equals(r7.A02);
        if (equals) {
            BrazilPayBloksActivity brazilPayBloksActivity = this.A02;
            brazilPayBloksActivity.A0F.A02("p2p_context").A0B("kyc");
            brazilPayBloksActivity.A0F.A02("p2m_context").A0B("kyc");
            brazilPayBloksActivity.A0A.A0N("pending");
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = this.A02;
        if (brazilPayBloksActivity2.A0D.A0E(2928) && "p2m_context".equals(this.A04)) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("kyc_status", "COMPLETED");
            brazilPayBloksActivity2.A3l(this.A01);
            AbstractMap A0h = C179158jJ.A0h(brazilPayBloksActivity2);
            if (A0h != null) {
                str = C90504aG.A0l("fds_resource_id", A0h);
            } else {
                str = null;
            }
            brazilPayBloksActivity2.A3n(str, this.A03, A0J);
        } else if (equals) {
            this.A01.A00("on_success");
        }
    }
}
