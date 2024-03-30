package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.B7g  reason: case insensitive filesystem */
public class C23146B7g implements C22959AzB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23146B7g(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void BVV(C175798b4 r13, C202059ky r14, ArrayList arrayList, boolean z) {
        AnonymousClass9YB A012;
        C200609hi r6;
        C175798b4 r3 = r13;
        ArrayList arrayList2 = arrayList;
        boolean z2 = z;
        if (this.A02 != 0) {
            C179158jJ r4 = (C179158jJ) this.A00;
            AnonymousClass6C8 r2 = (AnonymousClass6C8) this.A01;
            HashMap A0J = AnonymousClass001.A0J();
            if (r14 != null) {
                C165597tg.A1M(A0J, r14.A00);
                r2.A01("on_failure", A0J);
                return;
            }
            A0J.put("verified_state", C165617ti.A0Y(z2 ? 1 : 0));
            if (z) {
                A012 = r4.A0F.A01();
                r6 = new C200609hi(r2, r3, r4, A0J, 2);
            } else if (r13 == null || arrayList == null || arrayList.isEmpty()) {
                C179158jJ.A0j(r2, (Map) null, -233);
                return;
            } else {
                A012 = r4.A0F.A01();
                r6 = new C200609hi(A0J, arrayList2, r4, r2, 1);
            }
            A012.A04(r6, r13);
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
        AnonymousClass6C8 r5 = (AnonymousClass6C8) this.A01;
        if (r14 != null) {
            C179158jJ.A0j(r5, (Map) null, r14.A00);
        } else {
            brazilPayBloksActivity.A0F.A01().A04(new AAL(r5, r13, brazilPayBloksActivity, arrayList2, z2), r13);
        }
    }
}
